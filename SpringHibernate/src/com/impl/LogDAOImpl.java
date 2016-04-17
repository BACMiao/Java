package com.impl;

import com.dao.LogDAO;
import com.dao.UserDAO;
import com.model.Log;
import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;


public class LogDAOImpl implements LogDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void save(Log log) {

        hibernateTemplate.save(log);
		System.out.println("user log save!");
	}

}
