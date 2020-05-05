package com.store_room.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store_room.entity.InSku;
import org.apache.ibatis.annotations.Mapper;

/**
 * 入库表(InSku)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 18:30:27
 */
@Mapper
public interface InSkuMapper extends BaseMapper<InSku> {

}