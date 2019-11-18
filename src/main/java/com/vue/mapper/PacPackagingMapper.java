package com.vue.mapper;

import com.vue.model.PacPackaging;

public interface PacPackagingMapper {
    int deleteByPrimaryKey(Short id);

    int insert(PacPackaging record);

    int insertSelective(PacPackaging record);

    PacPackaging selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(PacPackaging record);

    int updateByPrimaryKey(PacPackaging record);
}