package com.lovecyy.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(value = "com.lovecyy.dynamic.mapper")
public class DynamicApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicApplication.class,args);
    }
}
