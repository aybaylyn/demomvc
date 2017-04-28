package com.may.repository;

import com.may.domain.Role;

import java.util.List;

/**
 * Created by May on 3/17/17.
 */
public interface RoleRepository {

    List<String> queryRoleNamesByUserId(Long userId);
}
