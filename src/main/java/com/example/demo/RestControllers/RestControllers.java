package com.example.demo.RestControllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;



@RestController
@RequestMapping("/api")
public class RestControllers {
    
    private UserService service;

    @Autowired
    public RestControllers(UserService service) {
        this.service = service;
    } 
    
    @GetMapping("/users")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(service.GetAllUsers());
    }

    @PostMapping("/users")
    public ResponseEntity<?> postUser(@RequestBody UserDTO entity) {
        String user = entity.getUser();
        String password = entity.getPassword();
        if (user != null && !user.isEmpty() && password != null && !password.isEmpty()) {
            service.AddUser(user,password);
            return ResponseEntity.ok("User saved");
        } else {
            return ResponseEntity.badRequest().body("The password or username is empty.");
        }
    }

}
