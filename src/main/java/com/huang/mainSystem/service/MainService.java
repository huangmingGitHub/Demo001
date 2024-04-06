package com.huang.mainSystem.service;

import com.huang.mainSystem.dao.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    private MainMapper mapper;

    public String getInfo(){
        String message = mapper.getMessage();
        return message;
    }

}
