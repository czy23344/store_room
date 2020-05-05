package com.store_room.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.store_room.entity.SalesContractEntity;
import com.store_room.service.SalesContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @创建人: WangHK
 * @类名：salesContractController
 * @功能：销售订单控制层
 * @公司：天津中义科技
 * @date: 2020/5/5 18:14 下午
 */
//@Slf4j
@RestController
@RequestMapping(value = "/sales")
//@Api(tags = "业务模块：销售订单")
@CrossOrigin(maxAge = 3600, origins = "*")
//@RequestMapping(InterfaceConsts.PUBLIC_PREFIX + "sys/user")
public class salesContractController {

    @Autowired
    SalesContractService salesContractService;

    /**
     * 保存销售订单
     *
     * @param salesContractEntity 用户对象
     * @return 保存结果
     */
    //@UserLoginToken
    @PostMapping(value = "save", produces = "text/html;charset=UTF-8")
    public Object save(@RequestBody SalesContractEntity salesContractEntity, HttpServletRequest httpServletRequest) throws Exception{
        Map<String, Object> resMap = new HashMap<>();
        try {
            SalesContractEntity entity = this.salesContractService.save(salesContractEntity);
            if (entity != null) {
                resMap.put("res", true);
                resMap.put("msg", "销售订单保存成功");
                resMap.put("list", entity);
            } else {
                resMap.put("res", false);
                resMap.put("msg", "销售订单保存失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resMap.put("res", false);
            resMap.put("msg", "保存失败");
        }
        return JSON.toJSONString(resMap, SerializerFeature.DisableCircularReferenceDetect);
    }
}
