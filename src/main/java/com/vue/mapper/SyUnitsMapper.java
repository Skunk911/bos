package com.vue.mapper;

import com.vue.model.SyUnits;

public interface SyUnitsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    SyUnits selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);
}