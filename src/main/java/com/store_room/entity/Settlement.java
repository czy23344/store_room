package com.store_room.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 结算单(Settlement)表实体类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@TableName("settlement")
@Data
public class Settlement implements Serializable{
    //结算单id
    private String id;
    //结算单名称
    private String name;
    //结算的订单id
    private String orderId;
    //商品id
    private String shopId;



}