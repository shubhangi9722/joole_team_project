package com.itlizesession.Services;

import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import com.itlizesession.Repositories.ProjectRepository;

import java.util.List;
import java.util.Set;

public interface ProjectService {
    Project createProject(Integer proj_id);

    Project saveProject(Project project);

    void createProjs();

    List<Project> findAll();

    Project updateProjects(Integer integer);

    List<Project> findProjectsByUserId(User user);

    Set<Project> findProjectsByUser (User user);

    List<Project> findProjectsByUserContaining(User user);

    List<Project> findProjectsByIdContaining(Project project);

    ProjectRepository delProject(Integer delId);

    Project save(Project project);

}
