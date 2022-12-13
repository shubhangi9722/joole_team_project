package com.itlizesession.Controller;


import com.itlizesession.Entity.User;
import com.itlizesession.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<User> users = service.getAllUser();
        model.addAllAttributes(users);
        return "users";
    }
}
