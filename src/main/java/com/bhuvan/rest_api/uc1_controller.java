package com.bhuvan.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class uc1_controller {
    @GetMapping("/123")
    public String PrintMain(){
        return "Hello from BridgeLabz";
    }



}
