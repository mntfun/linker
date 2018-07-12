package com.linker.dao;

import com.linker.model.Like;

public interface LikeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Like record);

    int insertSelective(Like record);

    Like selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}