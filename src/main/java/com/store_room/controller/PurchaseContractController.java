package com.store_room.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.store_room.entity.PurchaseContract;
import com.store_room.service.PurchaseContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 采购订单(PurchaseContract)表控制层
 *
 * @author makejava
 * @since 2020-05-05 18:01:07
 */
@RestController
@RequestMapping("purchaseContract")
public class PurchaseContractController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseContractService purchaseContractService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param purchaseContract 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PurchaseContract> page, PurchaseContract purchaseContract) {
        return success(this.purchaseContractService.page(page, new QueryWrapper<>(purchaseContract)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.purchaseContractService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param purchaseContract 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PurchaseContract purchaseContract) {
        return success(this.purchaseContractService.save(purchaseContract));
    }

    /**
     * 修改数据
     *
     * @param purchaseContract 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PurchaseContract purchaseContract) {
        return success(this.purchaseContractService.updateById(purchaseContract));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.purchaseContractService.removeByIds(idList));
    }
}