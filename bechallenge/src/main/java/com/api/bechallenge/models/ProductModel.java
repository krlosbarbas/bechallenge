package com.api.bechallenge.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_unit_price")
    private Float productUnitPrice;

    @Column(name="created_at")
    private Date createdAt;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(Float productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


}
