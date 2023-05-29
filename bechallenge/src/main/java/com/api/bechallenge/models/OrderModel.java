package com.api.bechallenge.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "order_complete")
public class OrderModel {

    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name="client_name")
    private String clientName;

    @Column(name="order_total_amount")
    private Float orderTotalAmount;

    @Column(name="created_at")
    private Date createdAt;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public Float getOrderTotalAmount() {
        return orderTotalAmount;
    }
    public void setOrderTotalAmount(Float orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
