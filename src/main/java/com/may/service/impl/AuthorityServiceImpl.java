package com.may.service.impl;

import com.may.domain.Authority;
import com.may.service.AuthorityService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by May on 3/16/17.
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {
    @Override
    public List<Authority> getByRoleId(Long roleId) {
        return null;
    }
}
