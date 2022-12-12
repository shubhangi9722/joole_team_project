package com.itlizesession.Entity;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Column;


import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "project")
public class Project{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;

    /*@OneToMany(fetch=FetchType.LAZY, mappedBy = "project",
            cascade = CascadeType.ALL)*/
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = User.class)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_project_id")
    private Project project;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project() {

    }

    public Integer getProjectId() {
        return id;
    }

    public void setProjectId(Integer id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Project.class)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<Project> projectList = new ArrayList<>(){};

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

}

