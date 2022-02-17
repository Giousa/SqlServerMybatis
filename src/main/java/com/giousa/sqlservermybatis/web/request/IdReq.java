package com.giousa.sqlservermybatis.web.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class IdReq implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 编号ID
     */
    private Long id;

}
