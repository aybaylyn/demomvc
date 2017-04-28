package com.may.service.impl;

import com.may.domain.User;
import com.may.repository.UserRepository;
import com.may.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by May on 3/16/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {

    }

    @Override
    public User findByName(String userName) {
        User user = userRepository.findByName(userName);
        return user;
    }
}
