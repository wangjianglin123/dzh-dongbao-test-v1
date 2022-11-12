package com.dzh.dongbao.ums.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.dzh.dongbao.ums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@MapperScan("com.dzh.dongbao.ums.mapper")
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
}
