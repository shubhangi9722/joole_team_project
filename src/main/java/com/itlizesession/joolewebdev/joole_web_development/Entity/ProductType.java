package com.itlizesession.joolewebdev.joole_web_development.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "application")
    private String application;

    @Column(name = "type")
    private String type;

    @Column(name = "mounting_location")
    private String mountingLocation;

    @Column(name = "accessories")
    private String accessories;

    @Column(name = "model_year")
    private Date model_year;

    @OneToOne(mappedBy = "product_type",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductType(String application, String type, String mountingLocation, String accessories, Date model_year) {
        this.application = application;
        this.type = type;
        this.mountingLocation = mountingLocation;
        this.accessories = accessories;
        this.model_year = model_year;
    }

    public ProductType() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMountingLocation() {
        return mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public Date getModel_year() {
        return model_year;
    }

    public void setModel_year(Date model_year) {
        this.model_year = model_year;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

