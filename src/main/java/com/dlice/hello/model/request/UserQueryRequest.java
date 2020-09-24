package com.dlice.hello.model.request;

import com.dlice.hello.common.model.request.PageQueryParam;
import com.dlice.hello.common.model.request.Request;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Date: 2020/9/21 22:12
 * @Author: dlice
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserQueryRequest extends PageQueryParam {

    // 用户名
    private String username;

    // 用户昵称
    private String nickname;

    // 用户邮箱
    private String email;

    // 用户手机号
    private String phone;
}
