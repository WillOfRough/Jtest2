package com.test.dao;

import com.test.dto.UserDto;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public UserDto selectUser();
    public UserDto selectUser2();
}
