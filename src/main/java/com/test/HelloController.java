package com.test;

import com.test.dto.UserDto;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/")
    public UserDto test() {
        UserDto userDto = userService.selectNow();
        return userDto;
    }
}
