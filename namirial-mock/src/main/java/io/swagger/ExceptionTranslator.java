package io.swagger;

import io.swagger.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 2018/09/25
 *
 * @author Sirius
 */
@ControllerAdvice
public class ExceptionTranslator {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse processMaxUploadSizeExceededException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMsg(ex.getMessage());
        errorResponse.setPath("boh");
        errorResponse.setStatus(500);
        errorResponse.setTimestamp("" + System.currentTimeMillis());
        return errorResponse;

    }
}
