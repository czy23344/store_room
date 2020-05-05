package com.store_room.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * 支出表
 */
@Entity
public class OutGoEntity extends BaseEntity{
    private String orderId; //合同id
    private BigDecimal price; //金额

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
