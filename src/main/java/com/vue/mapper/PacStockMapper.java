package com.vue.mapper;

import com.vue.model.PacStock;

public interface PacStockMapper {
    int deleteByPrimaryKey(Short id);

    int insert(PacStock record);

    int insertSelective(PacStock record);

    PacStock selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(PacStock record);

    int updateByPrimaryKey(PacStock record);
}