package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by King on 2016/2/14.
 */
public class TimerAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        for (int i=0; i<10000; i++){
            System.out.println("welcome struts2!");
        }
        return SUCCESS;
    }
}
