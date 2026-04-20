package com.example.demo.RestControllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;

@RestController
public class RestControllers {
    
    private UserService service;

    @Autowired
    public RestControllers(UserService service) {
        this.service = service;
    }
    
}
