package com.itlizesession.Repositories;

import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    // getAllUser
    // updateUser
    // deleteUser

    Optional<User> findByUserName(User user);

    Optional<User> findUsersByProjectList(Project project);

    Optional<User> findByEmail(String email);

    Optional<User> findById(int userId);

    void deleteById(int userId);
}
