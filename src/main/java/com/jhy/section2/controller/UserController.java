package com.jhy.section2.controller;

import com.jhy.section2.pojo.User;
import com.jhy.section2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // 获取所有用户信息
    @GetMapping("/user")
    public String getAllUsers() {
        return userService.getAllUsers();
    }

    // 获取指定id用户信息
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    // 添加用户信息
    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // 更新用户信息
    @PutMapping("/user")
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // 删除指定id用户信息
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }

    // 删除全部用户信息
    @DeleteMapping("/user")
    public String deleteAll() {
        return userService.deleteAll();
    }
}
