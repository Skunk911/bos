package com.vue.mapper;

import com.vue.model.BasZonecustominfo;

public interface BasZonecustominfoMapper {
    int deleteByPrimaryKey(Short customcode);

    int insert(BasZonecustominfo record);

    int insertSelective(BasZonecustominfo record);

    BasZonecustominfo selectByPrimaryKey(Short customcode);

    int updateByPrimaryKeySelective(BasZonecustominfo record);

    int updateByPrimaryKey(BasZonecustominfo record);
}