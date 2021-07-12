package com.jhy.section2.service;

import com.jhy.section2.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    // 获取所有用户
    public String getAllUsers();

    // 根据id获取用户
    public String getUserById(Integer id);

    // 新增用户
    public String addUser(User user);

    // 修改用户
    public String updateUser(User user);

    // 删除用户
    public String deleteUser(Integer id);
}
