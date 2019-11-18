package com.vue.mapper;

import com.vue.model.PacStockitem;

public interface PacStockitemMapper {
    int deleteByPrimaryKey(Short id);

    int insert(PacStockitem record);

    int insertSelective(PacStockitem record);

    PacStockitem selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(PacStockitem record);

    int updateByPrimaryKey(PacStockitem record);
}