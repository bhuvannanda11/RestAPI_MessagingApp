package com.bhuvan.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC3_RestAPICall {

    @GetMapping("/param/{name}")
    public String sayName(@PathVariable String name){
        return "Hello "+name;
    }
}
