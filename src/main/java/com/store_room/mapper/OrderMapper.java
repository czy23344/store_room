package com.store_room.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store_room.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单表(Order)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 18:01:05
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}