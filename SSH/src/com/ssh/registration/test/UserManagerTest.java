package com.ssh.registration.test;

import com.ssh.registration.dao.UserDAO;

import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-config.xml")
public class UserManagerTest extends AbstractJUnit4SpringContextTests{

    @Resource(name = "userDAO")
    private UserDAO userDAO;

    @Test
    public void testSave(){
        this.userDAO.loadById(4);
    }

}
