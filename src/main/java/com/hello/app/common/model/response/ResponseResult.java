package com.hello.app.common.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.slf4j.MDC;

import static com.hello.app.common.constant.CommonConstant.TRACE_ID;

/**
 * @Author: dlice.
 * @Description: Common result
 * @Date:Created in 2020/9/1 22:33.
 * @Modified By:
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ResponseResult implements Response {

    //操作是否成功
    boolean success;

    //操作代码
    int code;

    //提示信息
    String message;

    /**
     * 链路跟踪Id
     */
    private String traceId;

    public ResponseResult(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.traceId = MDC.get(TRACE_ID);
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(CommonCode.SUCCESS);
    }
    public static ResponseResult FAIL(){
        return new ResponseResult(CommonCode.FAIL);
    }

}