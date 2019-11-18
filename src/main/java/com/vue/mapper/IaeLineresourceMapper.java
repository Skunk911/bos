package com.vue.mapper;

import com.vue.model.IaeLineresource;

public interface IaeLineresourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(IaeLineresource record);

    int insertSelective(IaeLineresource record);

    IaeLineresource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeLineresource record);

    int updateByPrimaryKey(IaeLineresource record);
}