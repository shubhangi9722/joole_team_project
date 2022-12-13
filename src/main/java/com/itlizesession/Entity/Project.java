package com.itlizesession.Entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "project", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<ProjectProduct> projectList = new HashSet<ProjectProduct>(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

