package com.ssh.registration.dao;

import com.ssh.registration.model.User;

import java.util.List;

/**
 * Created by King on 2016/2/25.
 */
public interface UserDAO {
    public void save(User u);
    public boolean checkUserExistsWithName(String username);
    public List<User> queryAllUsers();
    public User loadById(int id);
}
