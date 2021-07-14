package com.jhy.section2.service;

import com.jhy.section2.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    // 获取所有用户
    String getAllUsers();

    // 根据id获取用户
    String getUserById(Integer id);

    // 新增用户
    String addUser(User user);

    // 修改用户
    String updateUser(User user);

    // 根据id删除用户
    String deleteUserById(Integer id);

    // 删除所有用户
    String deleteAll();
}
