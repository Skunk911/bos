package com.vue.mapper;

import com.vue.model.BasZoneinfo;

public interface BasZoneinfoMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasZoneinfo record);

    int insertSelective(BasZoneinfo record);

    BasZoneinfo selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasZoneinfo record);

    int updateByPrimaryKey(BasZoneinfo record);
}