package com.dzh.dongbao.portal.web.controller;

import com.dzh.dongbao.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user-member")
public class UserMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/register")
    public String register() {
        umsMemberService.register();
        return "register";
    }

}
