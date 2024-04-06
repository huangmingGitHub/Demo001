package com.huang.login.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(String username,String password){
        Boolean result = checkUser(username, password);
        if (result){
            return "mainPage";
        }
        return "error";
    }

    public Boolean checkUser(String username,String password){
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            return false;
        }
        return true;
    }

    //测试
}
