package com.itlizesession.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

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

    @OneToMany(mappedBy = "product", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<ProjectProduct> productList = new HashSet<ProjectProduct>(){};


    public Product() {

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

    public Set<ProjectProduct> getProject_product_list() { return productList; }

    public void setProject_product_list(Set<ProjectProduct> productList) {
        this.productList = productList;
    }
}

