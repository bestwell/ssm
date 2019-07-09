package com.wyb.ssm.mapper;

import com.wyb.ssm.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User get(Integer id);

    @Insert("insert into user(name,birthday,address) values(#{name},#{birthday},#{address})")
    void add(User user);

    @Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
    void update(User user);

    @Delete("delete from user where id=#{id}")
    void delete(Integer id);
}
