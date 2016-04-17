package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by King on 2016/2/23.
 */
//@Aspect
public class LogInterceptor {
//    @Before("execution(public void com.impl.UserDAOImpl.save(com.model.User))")
    public void before(){
        System.out.println("method start");
    }
}
