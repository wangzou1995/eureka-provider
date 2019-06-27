package com.wangz.eurekaprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
    @GetMapping(value = "/test")
    public String test(@PathVariable(name = "id") int id ){
        if (id == 1) {
            return "hello,world";
        }
        return "error code";
    }
}
