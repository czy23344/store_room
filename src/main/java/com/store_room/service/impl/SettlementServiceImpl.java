package com.store_room.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store_room.entity.Settlement;
import com.store_room.mapper.SettlementMapper;
import com.store_room.service.SettlementService;
import org.springframework.stereotype.Service;

/**
 * 结算单(Settlement)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@Service("settlementService")
public class SettlementServiceImpl extends ServiceImpl<SettlementMapper, Settlement> implements SettlementService {

}