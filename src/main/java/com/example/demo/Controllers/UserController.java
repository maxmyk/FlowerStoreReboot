package com.example.demo.Controllers;

import com.example.demo.UserServices.UserService;
import com.example.demo.users.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<AppUser> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody AppUser user) {
        userService.addUser(user);
    }
}
