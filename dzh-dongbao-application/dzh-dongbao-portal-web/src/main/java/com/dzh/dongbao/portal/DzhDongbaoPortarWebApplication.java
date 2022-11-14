package com.dzh.dongbao.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication(scanBasePackages = {"com.dzh"})
@MapperScan("com.dzh.dongbao.ums.mapper")
//@ComponentScan({"com.dzh.dongbao.portal.web.config"})
public class DzhDongbaoPortarWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DzhDongbaoPortarWebApplication.class, args);
    }



}
