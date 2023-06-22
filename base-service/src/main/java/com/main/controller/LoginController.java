package com.main.controller;

import com.main.Utils.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "控制层")
@Controller
@RequestMapping("/demo")
public class LoginController {
    @ApiOperation("添加用户")
    @RequestMapping("/insert")
    @PostMapping()
    public void insert(){
        System.out.println("Hello World!");
    }
}
