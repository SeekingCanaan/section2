package com.jhy.section2.dao;

import com.jhy.section2.pojo.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {
    // 获取全部用户
    List<Person> getAllPerson();

    // 根据id获取用户
    Person getPersonById(@Param("id") Integer id);

    // 新增用户信息
    int addPerson(Person p);

    // 修改用户信息
    int updatePerson(Person p);

    // 根据id删除用户信息
    int deletePerson(@Param("id") Integer id);

    // 删除所有用户数据
    int deleteAll();
}
