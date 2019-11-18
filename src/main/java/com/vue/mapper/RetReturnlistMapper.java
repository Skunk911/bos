package com.vue.mapper;

import com.vue.model.RetReturnlist;

public interface RetReturnlistMapper {
    int deleteByPrimaryKey(Short id);

    int insert(RetReturnlist record);

    int insertSelective(RetReturnlist record);

    RetReturnlist selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(RetReturnlist record);

    int updateByPrimaryKey(RetReturnlist record);
}