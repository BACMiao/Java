package com.ssh.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.registration.model.User;
import com.ssh.registration.service.UserManager;
import com.ssh.registration.serviceImpl.UserManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by King on 2016/2/25.
 */
public class UserAction extends ActionSupport {
    private int id;
    private String username;
    private String password;
    private String password2;
    private User u;

    private List<User> users;

    private UserManager userManager;

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        if (userManager.exists(u)){
            return "fail";
        }
        userManager.add(u);
        return "success";
    }

    public String list()throws Exception{
         this.users = userManager.getUsers();
        return "list";
    }

    public String load(){
        u = userManager.getUserById(id);
        return "load";
    }
}
