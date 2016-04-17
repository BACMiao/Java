package com.SH.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by King on 2016/2/20.
 */
public class MyHibernateSessionFactory {
    private static SessionFactory sessionFactory;

    //构造方法私有化，保证单例模式
    private MyHibernateSessionFactory(){

    }

    //公有静态方法，获得会话工厂对象
    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){
            Configuration config = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionFactory = config.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }
        else{
            return sessionFactory;
        }
    }
}