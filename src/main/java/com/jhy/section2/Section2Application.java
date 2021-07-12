package com.jhy.section2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jhy.section2.dao")
@SpringBootApplication
public class Section2Application {

    public static void main(String[] args) {
        SpringApplication.run(Section2Application.class, args);
    }

}
