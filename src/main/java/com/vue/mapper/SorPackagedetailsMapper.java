package com.vue.mapper;

import com.vue.model.SorPackagedetails;

public interface SorPackagedetailsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorPackagedetails record);

    int insertSelective(SorPackagedetails record);

    SorPackagedetails selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorPackagedetails record);

    int updateByPrimaryKey(SorPackagedetails record);
}