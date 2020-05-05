package com.store_room.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.store_room.entity.InSku;
import com.store_room.service.InSkuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 入库表(InSku)表控制层
 *
 * @author makejava
 * @since 2020-05-05 18:30:27
 */
@RestController
@RequestMapping("inSku")
public class InSkuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private InSkuService inSkuService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param inSku 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<InSku> page, InSku inSku) {
        return success(this.inSkuService.page(page, new QueryWrapper<>(inSku)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.inSkuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param inSku 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody InSku inSku) {
        return success(this.inSkuService.save(inSku));
    }

    /**
     * 修改数据
     *
     * @param inSku 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody InSku inSku) {
        return success(this.inSkuService.updateById(inSku));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.inSkuService.removeByIds(idList));
    }
}