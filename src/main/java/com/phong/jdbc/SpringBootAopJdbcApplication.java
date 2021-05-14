package com.phong.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(value = "com.phong.jdbc.dao")
@EnableTransactionManagement
public class SpringBootAopJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopJdbcApplication.class, args);
    }
}