package com.vue.services;

import com.vue.model.Sy_role;

import java.util.List;

public interface Sy_RoleServiceDjj {
    List<Sy_role> roles();
    Sy_role byid(Integer id);
    int insertrole(Sy_role role);
}
