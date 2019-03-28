package com.hlb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Fly on 2019/3/28.
 */
@Controller
public class UserController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg", "嗨，你好呀1");

        return "index";
    }
}