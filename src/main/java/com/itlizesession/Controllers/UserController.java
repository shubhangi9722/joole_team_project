package com.itlizesession.Controllers;

import com.itlizesession.Entity.User;
import com.itlizesession.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

//    @PostMapping("/addUsers")
//    public List<User> addUsers(@RequestBody List<User> users) {
//        return service.saveUsers(users);
//    }

    @GetMapping("/users")
    public List<User> findAllUsers() {
        return service.fetchUserList();
    }

//    @GetMapping("/user/{id}")
//    public User findUserById(int id) {
//        return service.(id);
//    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user, int id) {
        return service.updateUser(user, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(int id) {
        service.deleteUserById(id);
    }
}

