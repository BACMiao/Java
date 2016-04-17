package com.SH.action;


import com.SH.model.Students;
import com.SH.service.StudentDAO;
import com.SH.service_impl.StudentDAOImpl;
import org.hibernate.Session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by King on 2016/2/20.
 */
public class StudentsAction extends SuperAction {
    private static final long serialVersionUID = 1L;

    //查询所有学生
    public String query(){
        StudentDAO sdao = new StudentDAOImpl();
        List<Students> list = sdao.queryAllStudents();
        //放进session中
        if (list != null && list.size()>0){
            session.setAttribute("students_list",list);
        }
        return "query_success";
    }

    //删除学生信息
    public String delete(){
        StudentDAO sdao = new StudentDAOImpl();
        String sid = request.getParameter("sid");
        sdao.deleteStudents(sid);
        return "delete_success";
    }

    //添加学生信息
    public String add(){
        Students s = new Students();
        s.setSname(request.getParameter("sname"));
        s.setGender(request.getParameter("gender"));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            s.setBirthday(sdf.parse(request.getParameter("birthday")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        s.setAddress(request.getParameter("address"));
        StudentDAO sdao = new StudentDAOImpl();
        sdao.addStudents(s);
        return "add_success";
    }

    //修改学生信息
    public String modify(){
        //获得传递过来的学生编号
        String sid = request.getParameter("sid");
        StudentDAO sdao = new StudentDAOImpl();
        Students s = sdao.queryStudentsBySid(sid);
        //保存在会话中
        session.setAttribute("modify_students", s);
        return "modify_success";
    }

    //查询学生信息
    public String find(){
        //获得传递过来的学生编号
        String sname = request.getParameter("sname");
        StudentDAO sdao = new StudentDAOImpl();
        List<Students> s = sdao.queryStudentsBySname(sname);
        System.out.println(s);
        //保存在会话中
        if (s != null && s.size()>0) {
            session.setAttribute("find_students", s);
        }
        return "find_success";
    }

    //保存修改后的学生动作
    public String save(){
        Students s = new Students();
        s.setSid(request.getParameter("sid"));
        s.setSname(request.getParameter("sname"));
        s.setGender(request.getParameter("gender"));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            s.setBirthday(sdf.parse(request.getParameter("birthday")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        s.setAddress(request.getParameter("address"));
        StudentDAO sdao = new StudentDAOImpl();
        sdao.updateStudents(s);
        return "save_success";
    }
}
