package com.dzh.dongbao.portal.web.service;

import com.dzh.dongbao.portal.web.dto.UmsMemberLoginParamDTO;
import com.dzh.dongbao.portal.web.dto.UmsMemberREgisterParamDTO;
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
public interface UmsMemberService {
    String register(UmsMemberREgisterParamDTO umsMemberREgisterParamDTO);

    String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);
}
