package com.cskt.common.exception;
import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName: SysException
 * Description:全局异常类
 * date: 2021/1/5 11:49
 *
 * @author 咏殇
 * @since JDK 1.8
 */
@Data
@ApiModel(value = "自定义系统异常")
public class SysException extends RuntimeException {
    @ApiModelProperty(value = "异常编码")
    private String errorCode;
    public SysException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public SysException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
