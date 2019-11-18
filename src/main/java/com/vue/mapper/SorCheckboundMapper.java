package com.vue.mapper;

import com.vue.model.SorCheckbound;

public interface SorCheckboundMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorCheckbound record);

    int insertSelective(SorCheckbound record);

    SorCheckbound selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorCheckbound record);

    int updateByPrimaryKey(SorCheckbound record);
}