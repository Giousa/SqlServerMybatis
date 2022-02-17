package com.giousa.sqlservermybatis.core.mapper;

import com.giousa.sqlservermybatis.core.model.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper {

    int insert(UserInfoDO param);

    int update(UserInfoDO param);

    UserInfoDO getById(@Param("id") Long id);
}
