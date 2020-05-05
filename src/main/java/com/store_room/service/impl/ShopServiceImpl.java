package com.store_room.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store_room.entity.Shop;
import com.store_room.mapper.ShopMapper;
import com.store_room.service.ShopService;
import org.springframework.stereotype.Service;

/**
 * 商品表(Shop)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@Service("shopService")
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements ShopService {

}