package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by King on 2016/2/7.
 */
public class UserAction extends ActionSupport{
    private int type;
    private String r;

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String execute() throws Exception {
        if (1 == type){
            r = "/Hello.jsp";
        }
        else if (2 == type){
            r = "/Error.jsp";
        }
        return SUCCESS;
    }
}
