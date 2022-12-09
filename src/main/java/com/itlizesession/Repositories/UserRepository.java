package com.itlizesession.Repositories;

import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Integer> {

    // getAllUser
    // updateUser
    // deleteUser

    Optional<User> findByUserName(User user);

    //Optional<User> findUsersByProjectList(Project project);

    // changed the argument type to Set<> as that's what you are using in the User class for projectList
    Optional<User> findUserByProjectList (Set<Project> projectList);

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long userId);

    // we use only findBy in repositories
    //void deleteById(int userId);
}
