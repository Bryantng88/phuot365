package com.phuot365.service;

import java.util.List;

import com.phuot365.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
