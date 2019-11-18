package com.vue.mapper;

import com.vue.model.IaeDeparture;

public interface IaeDepartureMapper {
    int deleteByPrimaryKey(String id);

    int insert(IaeDeparture record);

    int insertSelective(IaeDeparture record);

    IaeDeparture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeDeparture record);

    int updateByPrimaryKey(IaeDeparture record);
}