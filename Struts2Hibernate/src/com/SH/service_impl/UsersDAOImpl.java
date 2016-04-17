package com.SH.service_impl;

import com.SH.db.MyHibernateSessionFactory;
import com.SH.model.Users;
import com.SH.service.UsersDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


/**
 * Created by King on 2016/2/20.
 */
public class UsersDAOImpl implements UsersDAO{
    @Override
    public boolean usersLogin(Users u) {
        //事物对象
        Transaction tx = null;
        String hql = "";
        try {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            hql = "from Users where username = ? and password = ?";
            Query query = session.createQuery(hql);
            query.setParameter(0, u.getUsername());
            query.setParameter(1, u.getPassword());
            List list = query.list();
            tx.commit();
            if (list.size()>0){
                return true;
            }else
            {
                return false;
            }

        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        finally {
            if(tx != null){
                tx = null;
            }
        }
    }
}
