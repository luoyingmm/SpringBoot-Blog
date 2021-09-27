package com.luoyingmm.controller;

import com.luoyingmm.service.LoginService;
import com.luoyingmm.vo.Result;
import com.luoyingmm.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping()
    public Result login(@RequestBody LoginParam loginParam){
        return loginService.login(loginParam);

    }
}
