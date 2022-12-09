package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.User;
import com.itlizesession.Repositories.UserRepository;
import com.itlizesession.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImplements implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return repository.findAll();
    }

    @Override
    public User updateUser(User user, int userId) {
        User existingUser = repository.findById(userId).orElse(null);

        // asserting as these operations will take place only when its not null
        assert existingUser != null;


        existingUser.setUserName(user.getUserName());
        existingUser.setUserPassword(user.getUserPassword());
        existingUser.setUser_type(user.getUser_type());
        existingUser.setEmail(user.getEmail());

        //adding for address too as even that is defined
        existingUser.setAddress(user.getAddress());
        return repository.save(existingUser);
    }

    @Override
    public void deleteUserById(int userId) {
        repository.deleteById(userId);
    }
}
