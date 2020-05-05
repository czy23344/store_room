package com.store_room.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 采购订单(PurchaseContract)表实体类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@TableName("purchase_contract")
@Data
public class PurchaseContract implements Serializable{
    //合同
    private String id;
    
    private String name;



}