package com.vue.mapper;

import com.vue.model.SorPackage;

public interface SorPackageMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    SorPackage selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}