package com.store_room.repository;

import com.store_room.entity.SalesContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @创建人: WangHK
 * @类名：SalesContractDao
 * @功能：销售订单Dao
 * @公司：天津中义科技
 * @date: 2020/5/5 17:54 下午
 */
@Repository
public interface SalesContractDao extends JpaRepository<SalesContractEntity, String>, JpaSpecificationExecutor<SalesContractEntity> {

}
