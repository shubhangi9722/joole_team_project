package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.Project;
import com.itlizesession.Entity.User;
import com.itlizesession.Repositories.ProjectRepository;
import com.itlizesession.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProjectServiceImplenets implements ProjectService {

    @Autowired
    private ProjectRepository repository;

    @Override
    public Project createProject(Integer proj_id) {
        return repository.findProjectById(proj_id).orElse(null);}

    @Override
    public Project saveProject(Project project) {
        return repository.save(project);
    }

    @Override
    public void createProjs() {
        Project proj = new Project();
        proj.setProjectId(proj.getProjectId());
        repository.save(proj);
    }

    @Override
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    public Project updateProjects(Project project) {
        Project updateProj = repository.findProjectById(project.getProjectId()).orElse(null);
        assert updateProj != null;
        updateProj.setProjectId(project.getProjectId());
        updateProj.setProjectList(project.getProjectList());
        return repository.save(updateProj);
    }

    @Override
    public List<Project> findProjectsByUserId(User user) {
        return repository.findProjectByUserId(user.getId()).orElse(null);
    }

    @Override
    public Set<Project> findProjectsByUser(User user) {
        return repository.findProjectsByUser(user).orElse(null);
    }

    @Override
    public List<Project> findProjectsByUserContaining(User user) {
        return repository.findProjectsByUserContaining(user.getAddress()).orElse(null);
    }


    @Override
    public void delProject(Project project) {
        Project delProj = repository.findProjectById(project.getProjectId()).orElse(null);
        assert delProj != null;
        repository.deleteById(delProj.getProjectId());
    }

    @Override
    public Project save(Project project) {
        return repository.save(project);
    }

    @Override
    public List<Project> findProjectsByIdContaining(Project project) {
        return repository.findProjectsByIdContaining(project.getUser()).orElse(null);
    }

}