package com.linker.dao;

import com.linker.model.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(String id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}