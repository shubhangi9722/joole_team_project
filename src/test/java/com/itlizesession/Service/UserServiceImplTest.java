package com.itlizesession.Service;

import com.itlizesession.Entity.User;
import com.itlizesession.Services.UserService;
//import org.junit.Assert;
//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("qsl333i");
        user.setUserPassword("12345678");
        userService.saveUser(user);
        System.out.println(user);
        Assertions.assertEquals("qsli",user.getUserName());

    }

    @Test
    public void findByUsername() {
    }

    @Test
    public void create() {
    }
}
