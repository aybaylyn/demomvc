package com.may.service;

import com.may.domain.Role;

import java.util.List;

/**
 * Created by May on 3/16/17.
 */
public interface RoleService {

    void saveRoleAuthority(Long roleId , List<Long> authorityIds);

    /**
     *
     * 根据用户id获取他的角色
     * @param userId
     * @return
     */
     List<String> queryRolesByUserId(Long userId);
}
