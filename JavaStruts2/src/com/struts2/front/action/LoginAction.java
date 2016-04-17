package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by King on 2016/2/7.
 */
public class LoginAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
    private Map<String, Object> request;
    private Map<String, Object> session;
    private Map<String, Object> application;

    @Override
    public String execute() throws Exception {
        request.put("r1","r1");
        session.put("s1","s1");
        application.put("a1","a1");
        return SUCCESS;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
