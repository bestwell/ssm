package com.wyb.ssm.service;

import com.wyb.ssm.mapper.UserMapper;
import com.wyb.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User get(Integer id) {
        return userMapper.get(id);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);

    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
