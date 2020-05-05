package com.store_room.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @创建人: WangHK
 * @类名：SalesDetailsEntity
 * @功能：商品详情实体
 * @公司：天津中义科技
 * @date: 2020/5/5 17:54 下午
 */
//@Data
//@TableName("sales_details")
//@ApiModel(value = "SalesDetailsEntity", description = "商品详情实体")
@Entity
@Table(name = "sales_details")
public class SalesDetailsEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 商品数量
     */
    private String number;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 备注
     */
    private String remark;


    /**
     * 商品(多) 关联 销售订单(一)
     */
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private SalesContractEntity salesContract;


    /**
     * 以下为非持久化字段
     */
    @Transient
    private String name;//商品名称

}
