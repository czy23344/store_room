package com.store_room.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store_room.entity.PurchaseContract;
import com.store_room.mapper.PurchaseContractMapper;
import com.store_room.service.PurchaseContractService;
import org.springframework.stereotype.Service;
/**
 * 采购订单(PurchaseContract)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@Service("purchaseContractService")
public class PurchaseContractServiceImpl extends ServiceImpl<PurchaseContractMapper, PurchaseContract> implements PurchaseContractService {

}