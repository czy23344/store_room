package com.store_room.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.util.Set;

/**
 * @创建人: WangHK
 * @类名：SalesContract
 * @功能：销售订单实体
 * @公司：天津中义科技
 * @date: 2020/5/5 17:45 下午
 */
//@Data
//@TableName("sales_contract")
//@ApiModel(value = "SalesContractEntity", description = "销售订单实体")
@Entity
@Table(name = "sales_contract")
public class SalesContractEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 销售单名称
     */
    private String name;

    /**
     * 审核状态
     * 0:未审核, 1:审核通过, 2:完结
     */
    private Integer state;


    /**
     * 销售订单(一) 关联 商品(多)
     */
    @JSONField(serialize = false)
    @OneToMany(mappedBy = "salesContract", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private Set<SalesDetailsEntity> salesDetailss;


}
