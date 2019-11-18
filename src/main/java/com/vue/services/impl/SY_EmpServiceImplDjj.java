package com.vue.services.impl;

import com.vue.mapper.SY_EmpMapper;
import com.vue.model.SY_Emp;
import com.vue.services.SY_EmpServiceDjj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SY_EmpServiceImplDjj implements SY_EmpServiceDjj {
    @Autowired
    private SY_EmpMapper sy_empMapper;

    @Override
    public List<SY_Emp> emplist() {
        return sy_empMapper.emplist();
    }
}
