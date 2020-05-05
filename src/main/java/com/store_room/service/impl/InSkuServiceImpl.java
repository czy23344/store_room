package com.store_room.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store_room.mapper.InSkuMapper;
import com.store_room.entity.InSku;
import com.store_room.service.InSkuService;
import org.springframework.stereotype.Service;

/**
 * 入库表(InSku)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 18:30:27
 */
@Service("inSkuService")
public class InSkuServiceImpl extends ServiceImpl<InSkuMapper, InSku> implements InSkuService {

}