package com.cskt.common.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName: DaoException
 * Description:异常类
 * date: 2021/1/5 11:48
 *
 * @author 咏殇
 * @since JDK 1.8
 */
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public DaoException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}

