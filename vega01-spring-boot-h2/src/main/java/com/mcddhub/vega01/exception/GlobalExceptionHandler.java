package com.mcddhub.vega01.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

/**
 * GlobalExceptionHandler
 *
 * @version 1.0.0
 * @author: caobaoqi1029
 * @date: 2024/9/23 10:09
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(ResponseStatusException ex) {
        return ex.getReason();
    }
}
