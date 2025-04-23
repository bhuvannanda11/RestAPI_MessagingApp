package com.bhuvan.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC2_restCall {
    @GetMapping("/query")
    public String greet(@RequestParam String name){
        return "Hello "+name;
    }


}
