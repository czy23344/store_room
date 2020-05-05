package com.store_room.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store_room.entity.Settlement;
import org.apache.ibatis.annotations.Mapper;

/**
 * 结算单(Settlement)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@Mapper
public interface SettlementMapper extends BaseMapper<Settlement> {

}