package com.hello.app.common.exception;

import com.hello.app.common.model.response.ResultCode;

/**
 * 自定义异常工具
 *
 * @Date: 2020/9/2 23:55
 * @Author: dlice
 */
public class ExceptionCast {

    /**
     * 抛出自定义异常
     * @param resultCode 异常代码
     */
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
