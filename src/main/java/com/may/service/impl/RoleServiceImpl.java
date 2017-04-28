package com.may.service.impl;

import com.may.repository.RoleRepository;
import com.may.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by May on 3/16/17.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    private Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void saveRoleAuthority(Long roleId, List<Long> authorityIds) {

    }

    @Override
    @Cacheable(value="authorizationCache")
    public List<String> queryRolesByUserId(Long userId) {
        log.info("查询数据库，获取权限。userId="+userId);

        List<String> roleNames = roleRepository.queryRoleNamesByUserId(userId);
        return roleNames;

    }
}
