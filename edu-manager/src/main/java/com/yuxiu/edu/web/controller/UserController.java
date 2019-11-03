package com.yuxiu.edu.web.controller;


import com.yuxiu.edu.mdoel.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mpacc")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("start")
    public String login(){
        return "User/MPACC";
    }

}
