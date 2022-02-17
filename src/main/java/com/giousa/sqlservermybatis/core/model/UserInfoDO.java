package com.giousa.sqlservermybatis.core.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer bStatus;

}
