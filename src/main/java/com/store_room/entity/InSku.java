package com.store_room.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * 入库表(InSku)表实体类
 *
 * @author makejava
 * @since 2020-05-05 18:30:27
 */
@TableName("in_sku")
@Data
public class InSku implements Serializable{
    //库存id
    private String id;
    //商品id
    private String shopId;
    //入库的商品数量
    private Integer num;

}