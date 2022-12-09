package com.itlizesession.Entity;

import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_type")
    private String user_type;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "user", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<Project> projectList = new HashSet<Project>(){};

    public User(Integer userId, String user_type, String userName, String userPassword, String email, String address) {
        this.userId = userId;
        this.user_type = user_type;
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
        this.address = address;
    }

    public User() {
    }

    public Integer getId() {
        return userId;
    }

    public void setId(Integer userId) {
        this.userId = userId;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = this.address; }

    public Set<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(Set<Project> projectList) {
        this.projectList = projectList;
    }
}

