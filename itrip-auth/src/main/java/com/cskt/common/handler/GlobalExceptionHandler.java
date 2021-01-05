package com.cskt.common.handler;

import com.cskt.common.constants.ErrorCodeEnum;
import com.cskt.common.exception.DaoException;
import com.cskt.common.exception.ServiceException;
import com.cskt.common.exception.SysException;
import com.cskt.common.vo.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * ClassName: GlobalExceptionHandler
 * Description:
 * date: 2021/1/5 11:46
 *
 * @author 咏殇
 * @since JDK 1.8
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 捕获异常
     * @param e 异常类型为 Exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ReturnResult error(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }
    /**
     * 捕获异常
     * @param e 异常类型为 ServiceException
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    public ReturnResult error(ServiceException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }
    /**
     * 捕获异常
     * @param e 异常类型为 DaoException
     * @return
     */
    @ExceptionHandler(value = DaoException.class)
    public ReturnResult error(DaoException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }
    @ExceptionHandler(value = SysException.class)
    public ReturnResult error(SysException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }
}

