package com.store_room.service.impl;

import com.store_room.entity.SalesContractEntity;
import com.store_room.repository.SalesContractDao;
import com.store_room.service.SalesContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @创建人: WangHK
 * @类名：SysUser
 * @功能：用户管理实体
 * @公司：天津圣沃科技
 * @date: 2020/5/5 18:25 下午
 */
@Service
@Transactional
public class SalesContractServiceImpl implements SalesContractService {

    @Autowired
    SalesContractDao salesContractDao;

    /**
     * 保存销售订单
     *
     * @param salesContractEntity
     * @return
     * @throws Exception
     */
    @Override
    public SalesContractEntity save(SalesContractEntity salesContractEntity) throws Exception {
        return salesContractDao.save(salesContractEntity);
    }
}
