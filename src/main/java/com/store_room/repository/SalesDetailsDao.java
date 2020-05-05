package com.store_room.repository;

import com.store_room.entity.SalesDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @创建人: WangHK
 * @类名：SalesDetailsDao
 * @功能：商品详情Dao
 * @公司：天津中义科技
 * @date: 2020/5/5 17:54 下午
 */
@Repository
public interface SalesDetailsDao extends JpaRepository<SalesDetailsEntity, String>, JpaSpecificationExecutor<SalesDetailsEntity> {

}
