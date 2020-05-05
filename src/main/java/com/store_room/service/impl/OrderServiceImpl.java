package com.store_room.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store_room.entity.Order;
import com.store_room.mapper.OrderMapper;
import com.store_room.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * 订单表(Order)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}