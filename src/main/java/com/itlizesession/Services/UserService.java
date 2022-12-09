package com.itlizesession.Services;

import com.itlizesession.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    // save operation
    User saveUser(User user);

    // read operation
    List<User> fetchUserList();

    // update operation
    User updateUser(User user, int userId);

    // delete operation
    void deleteUserById(int userId);

}
