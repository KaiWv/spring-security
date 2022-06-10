package com.kaiw.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wk
 * @date 2022/6/10 11:54
 */
@RestController("/somnus")
public class SomnusController {


    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
