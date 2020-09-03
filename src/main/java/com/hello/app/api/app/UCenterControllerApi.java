package com.hello.app.api.app;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;

/**
 * @Date: 2020/9/3 21:26
 * @Author: dlice
 */
@Api(tags = "uCenter_app")
public interface UCenterControllerApi {

    @ApiOperation(value = "获取用户详细信息", notes = "根据用户名查找用户详细信息", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public String getUserInfoByName(@NonNull String username);
}
