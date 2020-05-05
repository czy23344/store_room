package com.store_room.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store_room.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品表(Shop)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@Mapper
public interface ShopMapper extends BaseMapper<Shop> {

}