package com.itlizesession.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.itlizesession.Entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
