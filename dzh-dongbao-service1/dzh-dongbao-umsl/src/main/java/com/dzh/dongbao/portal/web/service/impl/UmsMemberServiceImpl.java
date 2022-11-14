package com.dzh.dongbao.portal.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.dzh.dongbao.common.utils.JwtUtil;
import com.dzh.dongbao.portal.web.dto.UmsMemberLoginParamDTO;
import com.dzh.dongbao.portal.web.mapper.UmsMemberMapper;
import com.dzh.dongbao.portal.web.dto.UmsMemberREgisterParamDTO;
import com.dzh.dongbao.portal.web.entity.UmsMember;
import com.dzh.dongbao.portal.web.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author 杜中辉
 * @since 2022-11-08
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String register(UmsMemberREgisterParamDTO umsMemberREgisterParamDTO) {
        UpdateWrapper<UmsMember> updateWrapper = new UpdateWrapper<>();
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberREgisterParamDTO, umsMember);
        String encode = passwordEncoder.encode(umsMemberREgisterParamDTO.getPassword());
        umsMember.setPassword(encode);
        int insert = umsMemberMapper.insert(umsMember);
        System.out.println(insert);
        updateWrapper.eq("username", umsMemberREgisterParamDTO.getUsername());
        umsMemberMapper.update(umsMember, updateWrapper);
        return "success";
    }

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());
        if (null != umsMember) {
            String password = umsMember.getPassword();
            if (!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(), password)) {
                return "密码不正确";
            }
        } else {
            return "用户不存在";
        }
        String token = JwtUtil.createToken(umsMember.getUsername());
        System.out.println("登录成功！！！");
        return token;
    }
}
