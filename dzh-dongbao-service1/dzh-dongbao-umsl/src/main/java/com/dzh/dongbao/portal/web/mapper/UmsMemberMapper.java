package com.dzh.dongbao.portal.web.mapper;

import com.dzh.dongbao.portal.web.entity.UmsMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author 杜中辉
 * @since 2022-11-08
 */
@Mapper
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    UmsMember selectByName(String username);
}
