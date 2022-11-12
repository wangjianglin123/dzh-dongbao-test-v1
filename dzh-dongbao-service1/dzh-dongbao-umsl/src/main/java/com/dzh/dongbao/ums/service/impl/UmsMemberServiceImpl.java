package com.dzh.dongbao.ums.service.impl;

import com.dzh.dongbao.ums.mapper.UmsMemberMapper;
import com.dzh.dongbao.ums.entity.UmsMember;
import com.dzh.dongbao.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author 杜中辉
 * @since 2022-11-08
 */
@Service
public class UmsMemberServiceImpl  implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    public String register() {
        UmsMember umsMember = new UmsMember();
        umsMember.setEmail("1");
        umsMember.setNickName("wangwu");
        int insert = umsMemberMapper.insert(umsMember);
        System.out.println(insert);
        return "success";
    }
}
