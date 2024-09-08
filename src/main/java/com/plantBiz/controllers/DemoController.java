package com.plantBiz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class DemoController {
    @GetMapping("/data")
    public String getData(){
        return "Data Found";
    }
}
