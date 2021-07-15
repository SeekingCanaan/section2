package com.jhy.section2.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jhy.section2.dao.PersonDao;
import com.jhy.section2.pojo.Person;
import com.jhy.section2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    // 实现获取所有人员的接口
    @Override
    public String getAllPerson() {

        // 调用personDao.getAllPerson()，将获取到的所有用户信息放在列表 person 中
        List<Person> person = personDao.getAllPerson();

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将所有人员信息 person 放到map中
        map.put("data", person);

        // 调用 fastjson 的 toJSONString()，将 map 中保存的键值对转换成 json 字符串
        return JSON.toJSONString(map);
    }

    // 实现获取根据id获取人员的接口
    @Override
    public String getPersonById(Integer id) {
        System.out.println(id);
        Person person = null;
        try {
            // 将参数id传入 personDao.getPersonById(id) 方法，把获取到的用户信息保存到 person 中
            person = personDao.getPersonById(id);
        } catch (NullPointerException e) {
            // 如果传入 id 不存在，查询不到人员信息，则打印下面的语句
            System.out.println("查询失败，用户id为空");
        }

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将查询到的人员信息 person 放到 map 中
        map.put("data", person);

        // 调用 fastjson 的 toJSONString()，将 map 中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现添加人员的接口
    @Override
    public String addPerson(Person person) {

        // personDao.addPerson(person) 方法会返回添加人员数据的数目
        int nums = personDao.addPerson(person);

        // 如果 num > 0，则表示该数据添加成功，num 为 0，则表示添加数据失败
        String msg = nums > 0 ? "添加成功" : "添加失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到 map 中
        map.put("msg", msg);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现更新人员的接口
    @Override
    public String updatePerson(Person person) {

        // userDao.updatePerson(person) 方法会返回修改数据的数目
        int nums = personDao.updatePerson(person);

        // 如果 num > 0，则表示该数据修改成功，num 为 0，则表示修改数据失败
        String msg = nums > 0 ? "修改成功" : "修改失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到map中
        map.put("msg", msg);

        // 调用fastjson的toJSONString()，将map中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 实现删除人员的接口
    @Override
    public String deletePersonById(Integer id) {

        // personDao.deletePerson(id) 方法会返回删除数据的数目
        int nums = personDao.deletePerson(id);

        // 如果 num > 0，则表示该数据删除成功，num 为 0，则表示删除数据失败
        String msg = nums > 0 ? "删除成功" : "删除失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到map中
        map.put("msg", msg);

        // 调用 fastjson 的 toJSONString()，将 map 中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }

    // 删除所有人员
    @Override
    public String deleteAll() {
        // personDao.deleteAll() 如果返回0，则表示删除成功了
        int nums = personDao.deleteAll();

        // 如果 num == 0，则表示该数据删除成功，否则视为删除失败
        String msg = nums == 0 ? "删除全部用户成功" : "删除失败";

        // 定义一个map，来保存要返回的数据
        Map<String, Object> map = new HashMap<>();

        // 将 msg 的内容放到map中
        map.put("msg", msg);

        // 调用 fastjson 的 toJSONString()，将 map 中保存的键值对转换成json字符串
        return JSON.toJSONString(map);
    }
}
