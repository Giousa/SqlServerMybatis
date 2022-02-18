package com.giousa.sqlservermybatis.web.controller;

import com.giousa.sqlservermybatis.BaseTest;
import com.giousa.sqlservermybatis.web.req.TBabyReq;
import com.giousa.sqlservermybatis.web.request.IdReq;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

public class TBabyControllerTest extends BaseTest {

    @Resource
    private TBabyController tBabyController;

    @Test
    public void addTBabyTest() {
        TBabyReq req = new TBabyReq();
        req.setName("曹操");
        req.setAreaId(999);
        req.setHId(1000);
        req.setBStatus(1);
        tBabyController.addTBaby(req);
    }

    @Test
    public void updateTBabyyTest() {
        TBabyReq req = new TBabyReq();
        req.setId(4);
        req.setName("曹操-改");
        req.setAreaId(990);
        req.setHId(1009);
        req.setBStatus(0);
        tBabyController.updateTBaby(req);
    }

    @Test
    public void deleteTBabyByIdyTest() {
        IdReq req = new IdReq();
        req.setId(3L);
        tBabyController.deleteTBabyById(req);
    }

    @Test
    public void findTBabyByIdyTest() {
        IdReq req = new IdReq();
        req.setId(5L);
        tBabyController.findTBabyById(req);
    }

    @Test
    public void findTBabyByPageyTest() {
    }
}