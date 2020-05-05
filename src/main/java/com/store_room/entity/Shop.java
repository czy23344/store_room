package com.store_room.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品表(Shop)表实体类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@TableName("shop")
@Data
public class Shop implements Serializable{
    //商品id
    private String id;
    //商品名称
    private String name;
    //商品属性
    private String title;



}