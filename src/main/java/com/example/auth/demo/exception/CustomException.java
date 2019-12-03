package com.example.auth.demo.exception;

import com.example.auth.demo.domain.ResultJson;
import lombok.Getter;

/**
 * 自定义异常
 * @author admin
 */
@Getter
public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }
}
