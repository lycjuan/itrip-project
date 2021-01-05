package com.cskt.common.constants;

import sun.security.util.Password;

/**
 * ClassName: ErrorCodeEnum
 * Description:
 * date: 2021/1/5 11:06
 *
 * @author 咏殇
 * @since JDK 1.8
 */
public enum ErrorCodeEnum {
    /*前台*/
    OK("00000", "成功"),
    AUTH_UNKNOWN("30000", "用户不存在"),
    AUTH_USER_ALREADY_EXISTS("30001", "用户已存在"),
    AUTH_AUTHENTICATION_FAILED("30002", "用户名或密码错误"),
    AUTH_PARAMETER_ERROR("30003", "用户名密码参数错误，为空"),
    AUTH_ACTIVATE_FAILED("30004", "邮件注册，激活失败"),
    AUTH_REPLACEMENT_FAILED("30005", "置换token失败"),
    AUTH_TOKEN_INVALID("30006", "token无效"),
    AUTH_ILLEGAL_USERCODE("30007", "非法的用户名"),
    AUTH_NOT_ACTIVATE("30008", "用户未激活"),
    AUTH_LOGOUT_SUCCESS("30009", "退出成功"),
    AUTH_NOT_LOGIN("30010", "用户未登录"),
    AUTH_PARAMETER_IS_EMPTY("30011", "参数为空"),
    /*后台*/
    SYSTEM_EXECUTION_ERROR("B0001", "系统执行出错"),
    SYSTEM_EXECUTION_TIMEOUT("B0100", "系统执行超时"),
    SYSTEM_ORDER_PROCESSING_TIMEOUT("B0101", "系统订单处理超时"),
    /*第三方系统 */
    ERROR_CALLING_THIRD_PARTY_SERVICE("C0001", "调用第三方服务出错"),
    MIDDLEWARE_SERVICE_ERROR("C0100", "中间件服务出错"),
    RPC_SERVICE_ERROR("C0110", "RPC服务出错"),
    RPC_SERVICE_NOT_FOUND("C0111", "RPC服务未找到"),
    RPC_SERVICE_IS_NOT_REGISTERED("C0112", "RPC服务未注册"),
    MESSAGE_SERVICE_ERROR("C0120", "消息服务出错"),
    MESSAGE_DELIVERY_ERROR("C0121", "消息投递出错"),
    MESSAGE_CONSUMPTION_ERROR("C0122", "消息消费出错"),
    MESSAGE_SUBSCRIPTION_ERROR("C0123", "消息订阅出错"),
    MESSAGE_GROUP_NOT_FOUND("C0124", "消息分组未查到"),
    CACHE_SERVICE_ERROR("C0130", "缓存服务出错"),
    BIZ_DATA_NULL("10000","数据为空"),
            ;
    private String errorCode;
    private String msg;
    ErrorCodeEnum(String errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }
    public String getErrorCode() {
        return errorCode;
    }
    public String getMsg() {
        return msg;
    }

}
