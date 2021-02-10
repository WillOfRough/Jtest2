package com.test.service;

import com.test.dao.UserDao;
import com.test.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDto selectNow() {
        return userDao.selectUser();
    }
}
