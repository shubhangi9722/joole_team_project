package com.itlizesession.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 Created by Zehui Lu
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_brand")
    private String productBrand;

    @Column(name = "certification")
    private String certification;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.LAZY)
    private ProductType productType;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.LAZY)
    private TechnicalDetail technicalDetail;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.LAZY)
    private Description description;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<ProjectProduct> project_product_list = new HashSet<>(){};

    public Product() {

    }

    public Product(String productBrand, String certification, ProductType productType, TechnicalDetail technicalDetail, Description description) {
        this.productBrand = productBrand;
        this.certification = certification;
        this.productType = productType;
        this.technicalDetail = technicalDetail;
        this.description = description;
    }

    public int getProductId() { return id; }

    public void setProductId(int productId) {
        this.id = productId;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public TechnicalDetail getTechnicalDetail() {
        return technicalDetail;
    }

    public void setTechnicalDetail(TechnicalDetail technicalDetail) {
        this.technicalDetail = technicalDetail;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Set<ProjectProduct> getProject_product_list() { return project_product_list; }

    public void setProject_product_list(Set<ProjectProduct> project_product_list) {
        this.project_product_list = project_product_list;
    }
}

