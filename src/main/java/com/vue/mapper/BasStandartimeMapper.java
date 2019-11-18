package com.vue.mapper;

import com.vue.model.BasStandartime;

public interface BasStandartimeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasStandartime record);

    int insertSelective(BasStandartime record);

    BasStandartime selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasStandartime record);

    int updateByPrimaryKey(BasStandartime record);
}