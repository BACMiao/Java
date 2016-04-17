package com.ssh.registration.service;

import com.ssh.registration.model.User;

import java.util.List;

/**
 * Created by King on 2016/2/25.
 */
public interface UserManager {
    public abstract boolean exists(User u) throws Exception;
    public abstract void add(User u) throws Exception;
    public abstract List<User> getUsers() throws Exception;
    public abstract User getUserById(int id);
}
