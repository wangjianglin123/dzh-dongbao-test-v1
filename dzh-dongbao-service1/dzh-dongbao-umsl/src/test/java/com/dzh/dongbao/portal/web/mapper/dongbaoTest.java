package com.dzh.dongbao.portal.web.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.dzh.dongbao.portal.web.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest(classes = com.dzh.dongbao.portal.web.DzhDongbaoUmslApplication.class)
public class dongbaoTest {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Test
    void testInsert() {
        UpdateWrapper<UmsMember> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("username", "zhangsan");
        UmsMember t = new UmsMember();
        t.setEmail("email");
        t.setUsername("zhangsan");
        t.setPassword("zhangsan");
        t.setIcon("...");
        t.setEmail("1264292841@qq.com");
        t.setNickName("wangjianglin");
        t.setNote("note");
        t.setLoginTime(new Date());
        t.setStatus(1);
        int update = umsMemberMapper.update(t, updateWrapper);
        System.out.println(update);
    }

    @Test
    void testInsert2() {
        UpdateWrapper<UmsMember> updateWrapper = new UpdateWrapper<>();
        UmsMember t1 = new UmsMember();
        t1.setId(15L);
        t1.setUsername("lisi");
        t1.setPassword("lisi");
        umsMemberMapper.insert(t1);
        updateWrapper.eq("username", "lisi");
        umsMemberMapper.update(t1, updateWrapper);
    }

    @Test
    void testUpdate() {
        UmsMember t = new UmsMember();
        t.setId(15L);
        t.setNickName("sjkaj");
        umsMemberMapper.updateById(t);
    }
}
