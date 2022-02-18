package com.giousa.sqlservermybatis.web.req;

import lombok.Data;

@Data
public class PageQueryReq extends BaseReq {

    /**
     * 当前页
     */
    private Integer page = 1;

    /**
     * 查询数量
     */
    private Integer size = 10;

    public Integer getOffset() {
        return page <= 0 ? 0 : (page - 1) * size;
    }
}
