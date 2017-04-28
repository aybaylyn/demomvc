package com.may.service;

import com.may.domain.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by May on 3/16/17.
 */
public interface AuthorityService {

    List<Authority> getByRoleId(Long roleId);
}
