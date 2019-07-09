package com.wyb.ssm.controller;

import com.wyb.ssm.pojo.User;
import com.wyb.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //查询所有的
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    //查询用户
    @RequestMapping("/get/{id}")
    public User get(@PathVariable Integer id) {
        return userService.get(id);
    }

    //增加用户
    @RequestMapping("/add/{name}/{birthday}/{address}")
    public String add(User user) {
        try {
            userService.add(user);
            return "add success";
        } catch (Exception e) {
            e.printStackTrace();
            return "add error";
        }
    }

    //更新用户
    @RequestMapping("/update/{name}/{birthday}/{address}/{id}")
    public String update(User user) {
        try {
            userService.update(user);
            return "update success.";
        } catch (Exception e) {
            e.printStackTrace();
            return "update error.";
        }
    }

    //删除用户
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        try {
            userService.delete(id);
            return "delete success";
        }catch (Exception e){
            e.printStackTrace();
            return "delete error";
        }
    }











}