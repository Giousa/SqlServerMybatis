package com.giousa.sqlservermybatis.core.mapper;

import com.giousa.sqlservermybatis.core.model.TBabyDO;
import com.giousa.sqlservermybatis.web.req.BaseReq;
import com.giousa.sqlservermybatis.web.req.PageQueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TBabyMapper {

	int insert(TBabyDO param);

	int update(TBabyDO param);

	int delete(@Param("id") Long id);

	TBabyDO findById(@Param("id") Long id);

	int countPageQuery(PageQueryReq param);

	List<TBabyDO> pageQuery(PageQueryReq param);

	List<TBabyDO> findByBaseReq(BaseReq req);
}

