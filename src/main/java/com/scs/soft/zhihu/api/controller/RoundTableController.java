package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: Jack
 * @Date: 2020/1/18 11:50
 * @Description:
 */
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    /**
     * 获取所有的圆桌内容
     * @return
     */
    @GetMapping(value = "/all")
    public Result getAllRoundTable(){
        return Result.success(roundTableService.getAllRoundTable());
    }

    /**
     * 获取前四个圆桌内容
     * @return
     */
    @GetMapping
    public Result getRoundTable(){
        return Result.success(roundTableService.getRoundTable());
    }
}
