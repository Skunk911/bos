package com.vue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.vue.mapper")
@SpringBootApplication
public class BosVueApplication {

    public static void main(String[] args) {
        SpringApplication.run(BosVueApplication.class, args);
    }

}
