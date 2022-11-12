package com.dzh.dongbao.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dzh"})
@MapperScan("com.dzh.dongbao.ums.mapper")
public class DzhDongbaoPortarWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DzhDongbaoPortarWebApplication.class, args);
    }

}
