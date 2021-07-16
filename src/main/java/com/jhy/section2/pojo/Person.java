package com.jhy.section2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    // 人员id
    private Integer id;
    // 人员姓名
    private String name;
    // 人员密码
    private String password;
    // 人员成绩
    private Integer score;

}
