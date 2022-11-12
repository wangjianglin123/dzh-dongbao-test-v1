package com.dzh.dongbao.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@MapperScan("com.dzh.mapper")
public class DzhDongbaoUmslApplication {

    public static void main(String[] args) {
        SpringApplication.run(DzhDongbaoUmslApplication.class, args);
    }

}
