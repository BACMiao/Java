package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;


/**
 * Created by King on 2016/2/5.
 */
public class IndexAction extends ActionSupport {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String add() {
        System.out.println("name =" + name);
        System.out.println("age =" + age);
        if (name == null || !name.equals("admin"))
        {
            this.addFieldError("name","name is error");//struts2中特有的返回错误机制，“name”为错误信息名字，后面是错误的详细信息
            return SUCCESS;
        }
        return "path";
    }
}
