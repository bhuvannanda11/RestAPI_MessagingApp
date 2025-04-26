package com.bhuvan.rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UC3_RestAPICall {

    @GetMapping("/param/{name}")
    public String sayName(@PathVariable String name){
        return "Hello "+name;
    }
}
