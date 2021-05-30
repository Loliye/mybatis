package com.mikufans.mapper;

import com.mikufans.po.Role;

public interface RoleMapper
{
    Role getRole(Long id);

    Role findRole(String roleName);

    int deleteRole(Long id);

    int insertRole(Role role);
}
