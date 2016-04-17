package com.SH.service;

import com.SH.model.Students;

import java.util.List;

/**
 * Created by King on 2016/2/20.
 */

//学生业务的逻辑接口
public interface StudentDAO {
    //查询所有学生资料
    public List<Students> queryAllStudents();

    //按学号查询所有学生资料
    public Students queryStudentsBySid(String sid);

    //按姓名查询所有学生资料
    public List<Students> queryStudentsBySname(String sname);

    //添加学生资料
    public boolean addStudents(Students s);

    //修改学生资料
    public boolean updateStudents(Students s);

    //删除学生资料
    public boolean deleteStudents(String sid);
}
