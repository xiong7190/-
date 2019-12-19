package com.xiong.service;


import com.xiong.domain.User;

public interface UserService {
    User Login(String u_name, String u_password) throws Exception;


}

