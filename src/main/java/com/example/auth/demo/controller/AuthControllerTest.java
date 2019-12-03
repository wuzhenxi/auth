package com.example.auth.demo.controller;

import com.example.auth.demo.domain.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @version 1.0
 * @since 2019/12/3
 */
@RestController
@Api(description = "授权测试")
@RequestMapping("/api/v1")
@Slf4j
public class AuthControllerTest {

    @GetMapping("/test")
    @ApiOperation(value = "测试鉴权", notes = "token认证测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header")})
    public ResultJson testAuth(){
        return ResultJson.ok("test pass!!!");
    }
}
