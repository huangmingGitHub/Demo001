package com.huang.login.controller;

import com.huang.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(String username,String password){
        Boolean result = loginService.checkUser(username, password);
        if (result){
            return "html/mainPage/mainPage";
        }
        return "error";
    }

}
