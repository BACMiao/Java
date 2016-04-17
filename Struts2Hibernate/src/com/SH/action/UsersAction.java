package com.SH.action;

import com.SH.model.Users;
import com.SH.service.UsersDAO;
import com.SH.service_impl.UsersDAOImpl;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.validation.SkipValidation;

/**
 * Created by King on 2016/2/20.
 */
public class UsersAction extends SuperAction implements ModelDriven<Users> {

    private static final long serialVersionUID = 1L;
    private Users users = new Users();
    //用户登录方法
    public String login(){
        UsersDAO udao = new UsersDAOImpl();
        if (udao.usersLogin(users)){
            //在session中保存登陆成功的用户名
            session.setAttribute("loginUserName", users.getUsername());
            return "login_success";
        }
        else {
            return "login_failure";
        }
    }

    @SkipValidation //该注解能够保证在进行注销的时候不进行表单验证
    //用户注销方法
    public String logout(){
        if (session.getAttribute("loginUserName")!= null){
            session.removeAttribute("loginUserName");
        }
        return "logout_success";
    }

    //支持表单验证，在使用validate()方法时，要在struts.xml中加上<result name="input">/users/Users_login.jsp</result>
    @Override
    public void validate() {
        //用户名不能为空
        if ("".equals(users.getUsername().trim())){
            this.addFieldError("usernameError", "用户名不能为空");
        }
        if (users.getPassword().length()< 6){
            this.addFieldError("passwordError", "密码不能少于6位");
        }
    }

    @Override
    public Users getModel() {
        return this.users;
    }
}
