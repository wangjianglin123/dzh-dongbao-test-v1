package com.dzh.dongbao.portal.web.dto;

import lombok.Data;
import lombok.ToString;
import org.apache.logging.log4j.message.Message;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@ToString
public class UmsMemberREgisterParamDTO {
    @Size(min = 1, max = 8, message = "用户名长度在1-8之间")
    private String username;
    private String password;
    private String icon;
    @Email
    private String email;
    private String nickName;
    private String note;
}
