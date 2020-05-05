package com.store_room.entity;

import javax.persistence.Entity;

/**
 * 入库表
 */
@Entity
public class InventoryInEntity extends BaseEntity{
    private String shopId; //商品id
    private Integer num; //数量

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
