package com.itlizesession.Services;

import com.itlizesession.Entity.User;


import java.util.List;


public interface UserService {

    // save operation
    User saveUser(User user);

    User createUserEntity(User user);

    // read operation
    List<User> fetchUserList();

    // update operation
    User updateUser(User user, int userId);

    // delete operation
    void deleteUserById(int userId);

}
