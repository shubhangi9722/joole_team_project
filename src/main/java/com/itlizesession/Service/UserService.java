package com.itlizesession.Service;


import java.util.List;
import com.itlizesession.Entity.User;

public interface UserService {

    // save operation
    User saveUser(User user);

    // read operation
    List<User> getAllUser();

    // update operation
    User updateUser(User user, int userId);

    // delete operation
    void deleteUserById(int userId);

}
