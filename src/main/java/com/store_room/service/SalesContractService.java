package com.store_room.service;

import com.store_room.entity.SalesContractEntity;

/**
 * @创建人: WangHK
 * @类名：SalesContractService
 * @功能：销售订单接口
 * @公司：天津中义科技
 * @date: 2020/5/5 18:14 下午
 */
public interface SalesContractService {

    //保存销售订单
    SalesContractEntity save(SalesContractEntity salesContractEntity) throws Exception;
}
