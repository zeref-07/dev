package com.main.controller;

import com.main.Entity.UserinfoEntity;
import com.main.Service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "控制层")
@Controller
@RequestMapping("/manager/test")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @ApiOperation("查询用户信息")
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @ResponseBody
    public UserinfoEntity getUserinfo(@PathVariable Long id) {
        System.out.println("用户编号:" + id);
        return loginService.getUserinfo(id);
    }
}
