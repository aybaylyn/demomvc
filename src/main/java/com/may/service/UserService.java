package com.may.service;


import com.may.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by May on 3/16/17.
 */
public interface UserService {

    void save(User user);

    User findByName(String userName);
}
