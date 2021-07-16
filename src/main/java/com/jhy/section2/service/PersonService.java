package com.jhy.section2.service;

import com.jhy.section2.pojo.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    // 获取所有人员数据
    String getAllPerson();

    // 根据id获取人员数据
    String getPersonById(Integer id);

    // 新增人员数据
    String addPerson(Person p);

    // 修改人员数据
    String updatePerson(Person p);

    // 根据id删除人员数据
    String deletePersonById(Integer id);

    // 删除所有人员数据
    String deleteAll();
}
