package com.itlizesession.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 15, nullable = false, name = "user_type")
    private String user_type;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(length = 15, nullable = false)
    private String password;

    @Column(length = 15, nullable = false, name = "user_name")
    private String userName;

    @OneToMany(mappedBy = "user", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<Project> projectList = new HashSet<Project>(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(Set<Project> projectList) {
        this.projectList = projectList;
    }
}
