package com.example.auth.demo.domain.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * @author : admin
 */
@Builder
@Data
public class User {
    @ApiModelProperty(value = "用户名", required = true)
    @Size(min=4, max=20)
    private String name;
    @ApiModelProperty(value = "密码", required = true)
    @Size(min=5, max=20)
    private String password;
}
