package com.itlizesession.Service;

import com.itlizesession.Entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("skjiao");
        user.setEmail("skjiao@gmail.com");
        user.setPassword("chaojiniu");
        user.setUser_type("customer");
        User savedUser = userService.saveUser(user);
        Assertions.assertEquals("skjiao",user.getUserName());
    }

    @Test
    private void getUsers() {
        Iterable<User> users = userService.getAllUser();


        for (User user : users) {
            System.out.println(user);
        }
    }
}
