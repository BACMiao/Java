package com.ssh.registration.serviceImpl;

import com.ssh.registration.dao.UserDAO;
import com.ssh.registration.daoImpl.UserDAOImpl;
import com.ssh.registration.model.User;
import com.ssh.registration.service.UserManager;

import java.util.List;

/**
 * Created by King on 2016/2/25.
 */
public class UserManagerImpl implements UserManager {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean exists(User u) throws Exception {
        return userDAO.checkUserExistsWithName(u.getUsername());
    }

    @Override
    public void add(User u) throws Exception {
        userDAO.save(u);
    }

    @Override
    public List<User> getUsers() {
        return userDAO.queryAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.loadById(id);
    }
}
