package com.jhy.section2.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jhy.section2.dao.UserDao;
import com.jhy.section2.pojo.User;
import com.jhy.section2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    // 实现获取所有用户的接口
    @Override
    public String getAllUsers() {

        // 调用userDao.getUsers()，将获取到的所有用户信息放在列表 users 中
        List<User> users = userDao.getUsers();

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将所有用户信息 users 放到map中
        map.put("data", users);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现获取根据id获取用户的接口
    @Override
    public String getUserById(Integer id) {
        System.out.println(id);
        User user = null;
        try {
            // 将参数id传入userDao.User(id)方法，把获取到的用户信息保存到 user 中
            user = userDao.User(id);
        } catch (NullPointerException e) {
            // 如果传入 id 不存在，查询不到用户，则打印下面的语句
            System.out.println("查询失败，用户id为空");
        }

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将查询到的用户信息 user 放到map中
        map.put("data", user);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现添加用户的接口
    @Override
    public String addUser(User user) {

        // userDao.addUser(user) 方法会返回添加数据的数目
        int nums = userDao.addUser(user);

        // 如果 num > 0，则表示该数据添加成功，num 为 0，则表示添加数据失败
        String msg = nums > 0 ? "添加成功" : "添加失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到map中
        map.put("msg", msg);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现更新用户的接口
    @Override
    public String updateUser(User user) {

        // userDao.updateUser(user) 方法会返回修改数据的数目
        int nums = userDao.updateUser(user);

        // 如果 num > 0，则表示该数据修改成功，num 为 0，则表示修改数据失败
        String msg = nums > 0 ? "修改成功" : "修改失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到map中
        map.put("msg", msg);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现删除用户的接口
    @Override
    public String deleteUser(Integer id) {

        // userDao.deleteUser(user) 方法会返回删除数据的数目
        int nums = userDao.deleteUser(id);

        // 如果 num > 0，则表示该数据删除成功，num 为 0，则表示删除数据失败
        String msg = nums > 0 ? "删除成功" : "删除失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到map中
        map.put("msg", msg);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }
}
