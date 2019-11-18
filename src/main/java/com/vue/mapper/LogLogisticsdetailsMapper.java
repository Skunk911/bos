package com.vue.mapper;

import com.vue.model.LogLogisticsdetails;

public interface LogLogisticsdetailsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(LogLogisticsdetails record);

    int insertSelective(LogLogisticsdetails record);

    LogLogisticsdetails selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(LogLogisticsdetails record);

    int updateByPrimaryKey(LogLogisticsdetails record);
}