package com.example.EmployeeTracker.Employee.Controller;

import com.example.EmployeeTracker.Employee.Entity.Task_Entity;
import com.example.EmployeeTracker.Employee.Entity.User;
import com.example.EmployeeTracker.Employee.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5174")
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }
    @CrossOrigin("http://localhost:5174")
    @PostMapping
    public User saveTask(@RequestBody User user) {
        return userService.saveTask(user);
    }

}