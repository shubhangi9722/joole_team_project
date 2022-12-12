package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import com.itlizesession.Services.ProjectService;
import com.itlizesession.Services.UserService;
//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectServiceImplenetsTest {

    @Autowired
    ProjectService projectService;

    @Autowired
    UserService userService;

    @Test
    public void createProject() {
        //User toAddUsers = userService.createUserEntity(new User(1, "officer", "Jolly", "pass123",
                //"123 St, NY"));
        Project toAddProjects = new Project();
        toAddProjects = projectService.createProject(1);
        Project isTestSuccessful = toAddProjects;
        assertTrue((BooleanSupplier) isTestSuccessful);
    }

//    @Test
//    void saveProject() {
//    }

//    @Test
//    void createProjs() {
//    }

//    @Test
//    void findAll() {
//
//    }

    @Test
    public void updateProjects(Project projects) {
        Project update = (Project) projectService.findProjectsByIdContaining(projects);
        Project isUpdateSuccessful = projectService.updateProjects(10);
        Assertions.assertTrue((BooleanSupplier) isUpdateSuccessful);
    }

    @Test
    void findProjectsByUserId() {
    }

    @Test
    void findProjectsByUser() {
    }

    @Test
    void findProjectsByUserContaining() {
    }

    @Test
    public void delProject() {
        Project isDelSuccessful = (Project) projectService.delProject(12);
        Assertions.assertTrue((BooleanSupplier) isDelSuccessful);
    }

    @Test
    void save() {
    }

    @Test
    void findProjectsByIdContaining() {
    }
}