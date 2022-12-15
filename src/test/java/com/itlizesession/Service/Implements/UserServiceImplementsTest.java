package com.itlizesession.Service.Implements;

import com.itlizesession.Entity.User;
import com.itlizesession.Repository.UserRepository;
import com.itlizesession.Service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceImplementsTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository repo;

    @Test
    void saveUser() {
        User user = new User();
        user.setUserName("defgwerg");
        user.setEmail("defgwerg@gmail.com");
        user.setPassword("dfhskdg");
        user.setUserType("customer");
        User savedUser = userService.saveUser(user);
        Assertions.assertEquals("defgwerg",savedUser.getUserName());
    }

    @Test
    void listAll() {
        Iterable<User> users = userService.listAll();
        assertThat(users).hasSizeGreaterThan(0);

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    void updateUser() {
        User user = repo.getById(8);
        user.setUserType("Consumer");
        repo.save(user);
        Assertions.assertEquals("Consumer",user.getUserType());
    }

    @Test
    void deleteUserById() {
        Optional<User> user;
        user = repo.findByEmail("gfh@gmail.com");
        userService.deleteUserById(user.orElseThrow().getId());
    }
}