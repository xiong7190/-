package com.xiong.service.impl;

import com.xiong.dao.UserDao;
import com.xiong.domain.User;
import com.xiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User Login(String u_name, String u_password) throws Exception {
        return userDao.Login(u_name, u_password);
    }

}

