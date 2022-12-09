package com.itlizesession.joolewebdev.joole_web_development.Entity;

import javax.persistence.*;
import java.util.List;

/**
 Created by Zehui Lu
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_brand")
    private String productBrand;

    @Column(name = "certification")
    private String certification;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "technical_detail_id")
    private TechnicalDetail technicalDetail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id")
    private Description description;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JoinColumn(name = "project_product_id")
    private List<ProjectProduct> projectProductList;


    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public List<ProjectProduct> getProjectProductList() {
        return projectProductList;
    }

    public void setProjectProductList(List<ProjectProduct> projectProductList) {
        this.projectProductList = projectProductList;
    }
}

