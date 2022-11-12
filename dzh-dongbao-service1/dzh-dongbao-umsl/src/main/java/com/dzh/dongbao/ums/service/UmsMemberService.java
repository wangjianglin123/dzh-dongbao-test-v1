package com.dzh.dongbao.ums.service;

import com.dzh.dongbao.ums.entity.UmsMember;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author 杜中辉
 * @since 2022-11-08
 */
@Repository
public interface UmsMemberService  {
    public String register();
}
