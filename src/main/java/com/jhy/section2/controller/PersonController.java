package com.jhy.section2.controller;

import com.jhy.section2.pojo.Person;
import com.jhy.section2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    // 获取所有人员信息
    @GetMapping("/person")
    public String getAllPerson() {
        return personService.getAllPerson();
    }

    // 获取指定id人员信息
    @GetMapping("/person/{id}")
    public String getPersonById(@PathVariable Integer id) {
        return personService.getPersonById(id);
    }

    // 添加人员信息
    @PostMapping("/person")
    public String addPerson(@RequestBody Person p) {
        return personService.addPerson(p);
    }

    // 更新人员信息
    @PutMapping("/person")
    public String updatePerson(@RequestBody Person p) {
        return personService.updatePerson(p);
    }

    // 删除指定id人员信息
    @DeleteMapping("/person/{id}")
    public String deletePersonById(@PathVariable Integer id) {
        return personService.deletePersonById(id);
    }

    // 删除全部人员信息
    @DeleteMapping("/person")
    public String deleteAll() {
        return personService.deleteAll();
    }
}
