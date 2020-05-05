package com.store_room.entity;

import javax.persistence.Entity;

/**
 * 库存表
 */
@Entity
public class InventoryEntity extends BaseEntity{
    private String shopId; //商品id
    private Integer usableNum; //可用数量
    private Integer lockNum; //锁定数量
    private Integer sumNum; //总数量

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getUsableNum() {
        return usableNum;
    }

    public void setUsableNum(Integer usableNum) {
        this.usableNum = usableNum;
    }

    public Integer getLockNum() {
        return lockNum;
    }

    public void setLockNum(Integer lockNum) {
        this.lockNum = lockNum;
    }

    public Integer getSumNum() {
        return sumNum;
    }

    public void setSumNum(Integer sumNum) {
        this.sumNum = sumNum;
    }
}
