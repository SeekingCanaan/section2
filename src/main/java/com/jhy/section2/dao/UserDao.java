package com.jhy.section2.dao;

import com.jhy.section2.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    // 获取全部用户
    List<User> getUsers();

    // 根据id获取用户
    User User(@Param("id") Integer id);

    // 新增用户信息
    int addUser(User user);

    // 修改用户信息
    int updateUser(User user);

    // 根据id删除用户信息
    int deleteUser(@Param("id") Integer id);

    // 删除所有用户数据
    int deleteAll();
}
