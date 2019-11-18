package com.vue.mapper;

import com.vue.model.AccWorksheet;

public interface AccWorksheetMapper {
    int deleteByPrimaryKey(Short id);

    int insert(AccWorksheet record);

    int insertSelective(AccWorksheet record);

    AccWorksheet selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(AccWorksheet record);

    int updateByPrimaryKey(AccWorksheet record);
}