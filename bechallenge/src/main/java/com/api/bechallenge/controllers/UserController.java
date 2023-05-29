package com.api.bechallenge.controllers;

import com.api.bechallenge.models.UserModel;
import com.api.bechallenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

   @GetMapping
   public ArrayList<UserModel> getUsers(){
       return this.userService.getUsers();
   }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        if (this.userService.getByEmail(user.getEmail())==null) {
            return this.userService.saveUser(user);
        }else{
            return null;
        }
    }
}
