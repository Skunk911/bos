package com.vue.services.impl;

import com.vue.mapper.Sy_RoleMapper;
import com.vue.model.Sy_role;
import com.vue.services.Sy_RoleServiceDjj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sy_RoleServiceImplDjj implements Sy_RoleServiceDjj {
    @Autowired
    private Sy_RoleMapper syRoleMapper;

    @Override
    public List<Sy_role> roles() {
        return syRoleMapper.roles();
    }

    @Override
    public Sy_role byid(Integer id) {
        return syRoleMapper.byid(id);
    }

    @Override
    public int insertrole(Sy_role role) {
        return syRoleMapper.insertrole(role);
    }
}
