package com.ssh.registration.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by King on 2016/2/25.
 */
public class MyHibernateSessionFactory {
    private static SessionFactory sessionFactory;

    public MyHibernateSessionFactory() {
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            Configuration config = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionFactory = config.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }
        else {
            return sessionFactory;
        }
    }
}
