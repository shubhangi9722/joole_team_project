package com.itlizesession.Controllers;


import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import com.itlizesession.Services.ProjectProductService;
import com.itlizesession.Services.ProjectService;
import com.itlizesession.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/ProjectController")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectProductService projectProductService;


    @GetMapping("/allProjects")
    public List<Project> list() {
        return projectService.findAll();
    }

    @PostMapping("/create")
    public Project createAllProjects(@RequestParam("id") User users,
                                      @RequestParam("project_id") Integer proj_id ) {
        Project allProjs = new Project();
        User allUsers = userService.saveUser(users);
        allProjs.setProjectId(allUsers.getId());
        return projectService.save(allProjs);
    }


    @GetMapping("/projectsById")
    public Project findProjectsById(@RequestParam("id") Project projId) {
        return (Project) projectService.findProjectsByIdContaining(projId);
    }

    @PutMapping("/Projects/update")
    public Project updateProjUsers (@RequestParam("user") User userId) {
        Project projectUpdate = (Project) projectService.findProjectsByUserId(userId);
        projectUpdate.setUser(userId);
        return projectService.save(projectUpdate);
    }

    @DeleteMapping("/Projects/delete")
    public Project delProj (@RequestParam("id") Integer proDel){
        return (Project) projectService.delProject(proDel);
    }


}
