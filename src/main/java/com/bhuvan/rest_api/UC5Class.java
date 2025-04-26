package com.bhuvan.rest_api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UC5Class {
    @PutMapping("/hello/put/{firstname}")
    public String updateEntry(@PathVariable String firstname, @RequestParam String lastname){
        return "Hello "+ firstname+" "+lastname ;
    }
}
