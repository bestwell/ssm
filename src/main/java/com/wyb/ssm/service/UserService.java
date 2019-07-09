package com.wyb.ssm.service;

import com.wyb.ssm.pojo.User;

import java.util.List;

public interface UserService {


    List<User> findAll();

    User get(Integer id);

    void add(User user);

    void update(User user);

    void delete(Integer id);
}
