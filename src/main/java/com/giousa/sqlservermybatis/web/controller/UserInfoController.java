package com.giousa.sqlservermybatis.web.controller;


import com.alibaba.fastjson.JSON;
import com.giousa.sqlservermybatis.core.mapper.UserInfoMapper;
import com.giousa.sqlservermybatis.core.model.UserInfoDO;
import com.giousa.sqlservermybatis.web.request.IdReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("userInfoApi")
public class UserInfoController {

    @Resource
    private UserInfoMapper userInfoMapper;

    @PostMapping("insert")
    public void insert(@RequestBody UserInfoDO userInfoDO) {
        userInfoMapper.insert(userInfoDO);
        System.out.println("insert OK");
    }

    @PostMapping("update")
    public void update(@RequestBody UserInfoDO userInfoDO) {
        userInfoMapper.update(userInfoDO);
        System.out.println("update OK");
    }


    @PostMapping("getById")
    public void getById(@RequestBody IdReq idReq) {
        UserInfoDO userInfoDO = userInfoMapper.getById(idReq.getId());
        System.out.println("getById userInfoDO = " + JSON.toJSONString(userInfoDO));
    }

    @PostMapping("queryList")
    public void queryList(@RequestBody UserInfoDO userInfoDO) {
        List<UserInfoDO> userInfoDOS = userInfoMapper.queryList(userInfoDO);
        System.out.println("queryList OK");
        System.out.println(JSON.toJSONString(userInfoDOS));
    }

}
