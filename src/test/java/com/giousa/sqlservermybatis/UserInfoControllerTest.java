package com.giousa.sqlservermybatis;

import com.giousa.sqlservermybatis.core.model.UserInfoDO;
import com.giousa.sqlservermybatis.web.controller.UserInfoController;
import com.giousa.sqlservermybatis.web.request.IdReq;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class UserInfoControllerTest extends BaseTest{

    @Resource
    private UserInfoController controller;

    @Test
    public void insertTest(){
        System.out.println("准备添加数据....");
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setName("小麻花");
        userInfoDO.setBStatus(1);

        controller.insert(userInfoDO);
    }

    @Test
    public void updateTest(){
        System.out.println("准备更新数据....");
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setId(3);
        userInfoDO.setName("小麻花-改");
        userInfoDO.setBStatus(0);
        controller.update(userInfoDO);
    }

    @Test
    public void getByIdTest(){
        System.out.println("准备查询数据....");
        IdReq idReq = new IdReq();
        idReq.setId(3L);
        controller.getById(idReq);
    }
}
