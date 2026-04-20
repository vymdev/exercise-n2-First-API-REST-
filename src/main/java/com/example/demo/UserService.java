package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public static List<String> User = new ArrayList<>();;
    public static List<String> Password = new ArrayList<>();;

    public void AddUser(String user, String password) {
        this.User.add(user);
        this.Password.add(password);
    }

    public List<String> GetAllUsers() {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < User.size(); i++) {
            result.add(User.get(i));
            result.add(Password.get(i));
        }

        return result;

    }
}
