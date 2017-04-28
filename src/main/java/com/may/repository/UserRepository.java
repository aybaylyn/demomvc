package com.may.repository;

import com.may.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by May on 3/16/17.
 */
public interface UserRepository {

    User findByName(String userName);
}
