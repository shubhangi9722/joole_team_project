package com.itlizesession.Entity;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Column;


import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

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

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Project.class)
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Set<Project> projectList = new HashSet<Project>(){};

    public Set<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(Set<Project> projectList) {
        this.projectList = projectList;
    }

}

