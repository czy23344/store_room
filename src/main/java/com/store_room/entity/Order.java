package com.store_room.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 订单表(Order)表实体类
 *
 * @author makejava
 * @since 2020-05-05 18:01:04
 */
@TableName("order")
@Data
public class Order implements Serializable{
    //订单id
    private String id;
    //订单编号
    private String orderNo;
    //订单名称
    private String name;
    //商品id
    private String shopId;



}