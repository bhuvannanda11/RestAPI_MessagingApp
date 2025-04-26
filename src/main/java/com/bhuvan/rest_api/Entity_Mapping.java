package com.bhuvan.rest_api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Entity_Mapping {
    @PostMapping("/post")
    public String helloWithBody(@RequestBody Entity entity) {
        return "Hello from "+entity.getFirstName() + " "+entity.getLastName();
    }
}
