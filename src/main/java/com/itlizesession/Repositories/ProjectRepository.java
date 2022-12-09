package com.itlizesession.Repositories;

import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository <Project, Integer> {
    Optional<Project> findProjectById (Integer id);

    Optional<List<Project>> findProjectByUserId(Integer userId);

    Optional<HashSet<Project>> findProjectsByUser (User user);

    Optional<List<Project>> findProjectsByUserContaining (String user_address);

    Optional<List<Project>> findProjectsByIdContaining (User user_id);

}
