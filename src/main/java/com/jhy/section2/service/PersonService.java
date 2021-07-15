package com.jhy.section2.service;

import com.jhy.section2.pojo.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    // 获取所有用户
    String getAllPerson();

    // 根据id获取用户
    String getPersonById(Integer id);

    // 新增用户
    String addPerson(Person user);

    // 修改用户
    String updatePerson(Person user);

    // 根据id删除用户
    String deletePersonById(Integer id);

    // 删除所有用户
    String deleteAll();
}
