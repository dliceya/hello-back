package com.dlice.hello.model.user.request;

import com.dlice.hello.common.model.request.Request;
import lombok.Data;

import javax.persistence.Column;

/**
 * @Date: 2020/9/21 22:12
 * @Author: dlice
 */
@Data
public class UserQueryRequest extends Request {

    // 用户名
    private String username;

    // 用户昵称
    private String nickname;

    // 用户邮箱
    private String email;

    // 用户手机号
    @Column(name = "phone", length = 15)
    private String phone;
}
