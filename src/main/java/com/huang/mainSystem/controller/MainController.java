package com.huang.mainSystem.controller;

import com.huang.mainSystem.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping("/system/login")
    public String Init(){
        String info = mainService.getInfo();
        return "html/mainPage/mainPage";
    }
    @RequestMapping("/index2")
    public String index(){
        return "index";
    }

}
