package com.jhy.section2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // 用户id
    private Integer id;
    // 用户姓名
    private String name;
    // 用户密码
    private String password;
    // 用户成绩
    private Integer score;

}
