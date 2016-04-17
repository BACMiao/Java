package com.ssh.registration.daoImpl;

import com.ssh.registration.dao.UserDAO;
import com.ssh.registration.model.User;
import com.ssh.registration.util.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by King on 2016/2/25.
 */
public class UserDAOImpl implements UserDAO{
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(User u) {
        hibernateTemplate.save(u);
    }

    @Override
    public boolean checkUserExistsWithName(String username) {
        List<User> users = (List<User>) hibernateTemplate.find("from User u where u.username = '" + username + "'");
        if(users != null && users.size() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<User> queryAllUsers() {
        return (List<User>)hibernateTemplate.find("from User");
    }

    @Override
    public User loadById(int id) {
        return hibernateTemplate.load(User.class, id);
    }
}
