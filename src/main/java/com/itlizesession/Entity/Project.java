package com.itlizesession.Entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int projectId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = User.class)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "project", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<ProjectProduct> projectList = new HashSet<ProjectProduct>(){};

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<ProjectProduct> getProjectList() {
        return projectList;
    }

    public void setProjectList(Set<ProjectProduct> projectList) {
        this.projectList = projectList;
    }
}

