package com.zb.service;

import com.zb.entity.User;

public interface UserService {
    public User findUserLogin(String uname , String upwd);
}
