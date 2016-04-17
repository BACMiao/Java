package com.SH.service;

import com.SH.model.Users;

/**
 * Created by King on 2016/2/20.
 */
//用户业务逻辑接口
public interface UsersDAO {
    public boolean usersLogin(Users u);
}
