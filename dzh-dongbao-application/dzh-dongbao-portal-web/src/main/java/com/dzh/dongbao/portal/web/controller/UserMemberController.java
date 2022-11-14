package com.dzh.dongbao.portal.web.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.dzh.dongbao.common.base.result.ResultWrapper;
import com.dzh.dongbao.common.utils.JwtUtil;
import com.dzh.dongbao.portal.web.dto.UmsMemberLoginParamDTO;
import com.dzh.dongbao.portal.web.dto.UmsMemberREgisterParamDTO;
import com.dzh.dongbao.portal.web.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/user-member")
public class UserMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @PostMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/register")
    public ResultWrapper register(@RequestBody @Valid UmsMemberREgisterParamDTO umsMemberREgisterParamDTO) {
        umsMemberService.register(umsMemberREgisterParamDTO);
        return ResultWrapper.getSeccessBuilder().data(null).build();
    }

    @PostMapping("/login")
    public String login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO) {

        return umsMemberService.login(umsMemberLoginParamDTO);
    }

    @GetMapping("/verify")
    public String verify(String token) {
        String s = JwtUtil.parseTocken(token);
        String token1 = JwtUtil.createToken(s);
        return token1;
    }
}
