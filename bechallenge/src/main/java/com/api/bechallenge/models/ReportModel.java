package com.api.bechallenge.models;

import javax.persistence.*;

@Entity
@Table(name = "report")
public class ReportModel {

    @Id
    @Column(name="product_name")
    private String productName;
    @Column(name="product_unit_price")
    private Float productUnitPrice;
    @Column(name="total_units")
    private Integer totalUnits;
    @Column(name="total_amount")
    private Float totalAmount;

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

    public Integer getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }
}
