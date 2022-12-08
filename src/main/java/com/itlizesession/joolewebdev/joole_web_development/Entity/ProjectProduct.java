package com.itlizesession.joolewebdev.joole_web_development.Entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "project_product")
public class ProjectProduct {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;
    private int project_id;
    private int product_id;
    private List<Project> projectId;
    private List<Product> productId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "project_product")
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "project_product")
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public ProjectProduct() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Following are the Projects " + project_id + "with all the Products " + product_id + ".";
    }

    public List<Project> addingProjects(){
        return projectId;
    }

    public List<Product> addingProducts(){
        return productId;
    }

    public void lstOfAllProjects(List<Project> projectId){
        this.projectId = projectId;
    }

    public void lstOfAllProducts(List<Product> productId){
        this.productId = productId;
    }

    public void add(Collection<? extends Project> allProjects, Collection<? extends Product> allProducts) {

        if (projectId == null || productId == null) {
            projectId = new ArrayList<>();
            productId = new ArrayList<>();
        }

        projectId.addAll(allProjects);
        productId.addAll(allProducts);

        ((Project) allProjects).setProjectId(id);
        ((Product) allProducts).setProductId(id);
    }

}
