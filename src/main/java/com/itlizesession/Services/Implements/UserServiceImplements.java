package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.User;
import com.itlizesession.Repositories.UserRepository;
import com.itlizesession.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public User createUserEntity(User user){
        User userEntity = new User();
        userEntity.setId(user.getId());
        userEntity.setUserName(user.getUserName());
        userEntity.setUserPassword(user.getUserPassword());
        userEntity.setEmail(user.getEmail());
        userEntity.setUser_type(user.getUser_type());
        return userEntity;
    }

    @Override
    public User updateUser(User user, int userId) {
        User existingUser = repository.findById(userId).orElse(null);
        existingUser.setUserName(user.getUserName());
        existingUser.setUserPassword(user.getUserPassword());
        existingUser.setUser_type(user.getUser_type());
        existingUser.setEmail(user.getEmail());
        return repository.save(existingUser);
    }

    @Override
    public void deleteUserById(int userId) {
        repository.deleteById(userId);
    }
}
