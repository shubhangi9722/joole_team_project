
package com.itlizesession.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "technical_detail_id")
    private TechnicalDetail technicalDetail;

    @OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "description_id")
    private Description description;

    @OneToMany(mappedBy = "product", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<ProjectProduct> productList = new HashSet<ProjectProduct>(){};


    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Set<ProjectProduct> getProductList() {
        return productList;
    }

    public void setProductList(Set<ProjectProduct> productList) {
        this.productList = productList;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productBrand='" + productBrand + '\'' +
                ", certification='" + certification + '\'' +
                ", productType=" + productType +
                ", technicalDetail=" + technicalDetail +
                ", description=" + description +
                '}';
    }
}
=======
package com.itlizesession.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "technical_detail_id")
    private TechnicalDetail technicalDetail;

    @OneToOne(cascade={CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinColumn(name = "description_id")
    private Description description;

    @OneToMany(mappedBy = "product", orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<ProjectProduct> productList = new HashSet<ProjectProduct>(){};


    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Set<ProjectProduct> getProductList() {
        return productList;
    }

    public void setProductList(Set<ProjectProduct> productList) {
        this.productList = productList;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productBrand='" + productBrand + '\'' +
                ", certification='" + certification + '\'' +
                ", productType=" + productType +
                ", technicalDetail=" + technicalDetail +
                ", description=" + description +
                '}';
    }
}


