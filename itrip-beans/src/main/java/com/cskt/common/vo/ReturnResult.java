package com.cskt.common.vo;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * ClassName: ReturnRsult
 * Description:
 * date: 2021/1/5 11:11
 *
 * @author 咏殇
 * @since JDK 1.8
 */
public class ReturnResult implements Serializable {
    private static final long serialVersionUID = 4849087550620538822L;
    @ApiModelProperty(value = "是否成功标示，true：成功；false：失败")
    private String success;
    @ApiModelProperty(value = "异常码")
    private String errorCode;
    @ApiModelProperty(value = "响应提示信息")
    private String msg;
    @ApiModelProperty(value = "响应数据")
    private Object data;
    /**
     * 正常响应
     * @return
     */
    public static ReturnResult ok() {
        return ok(ErrorCodeEnum.OK);
    }
    /**
     * 正常响应
     * @param errorCodeEnum 错误码枚举
     * @return
     */
    public static ReturnResult ok(ErrorCodeEnum errorCodeEnum) {
        return ok(errorCodeEnum,null);
    }
    /**
     * 正常响应
     * @param data 数据
     * @return
     */
    public static ReturnResult ok(Object data) {
        return ok(ErrorCodeEnum.OK, data);
    }
    /**
     * 正常响应
     * @param errorCodeEnum 错误码枚举
     * @param data 数据
     * @return
     */
    public static ReturnResult ok(ErrorCodeEnum errorCodeEnum, Object data) {
        return new ReturnResult(String.valueOf(true),
                errorCodeEnum.getErrorCode(), errorCodeEnum.getMsg(), data);
    }
    /**
     * 异常响应
     * @return
     */
    public static ReturnResult error() {
        return error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }
    /**
     * 异常响应
     * @param errorCodeEnum 错误码枚举
     * @return
     */
    public static ReturnResult error(ErrorCodeEnum errorCodeEnum) {
        return error(errorCodeEnum.getErrorCode(), errorCodeEnum.getMsg());
    }
    /**
     * 异常响应
     * @param errorCode 内部错误码
     * @param msg 错误信息
     * @return
     */
    public static ReturnResult error(String errorCode, String msg) {
        return error(false, errorCode, msg);
    }
    /**
     * 异常响应
     * @param success 是否成功标示
     * @param errorCode 内部错误码
     * @param msg 错误信息
     * @return
     */
    public static ReturnResult error(Boolean success, String errorCode, String
            msg) {
        return error(success, errorCode, msg, null);
    }
    /**
     * 异常响应
     * @param success 是否成功标示,成功为true;失败为false,一般情况下为true
     * @param errorCode 内部错误码
     * @param msg 错误信息
     * @param data 数据
     * @return
     */
    public static ReturnResult error(Boolean success, String errorCode, String
            msg, Object data) {
        return new ReturnResult(String.valueOf(success), errorCode, msg, data);
    }
    private ReturnResult(String success, String errorCode, String msg, Object
            data) {
        this.success = success;
        this.errorCode = errorCode;
        this.msg = msg;
        this.data = data;
    }
    private ReturnResult() {
    }
}
