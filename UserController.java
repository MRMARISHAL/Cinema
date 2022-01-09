package com.projet.Cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping
        public ApiResponse<User> saveUser(@RequestBody UserDto user){
            return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
        }

        @GetMapping
        public ApiResponse<List<User>> listUser(){
            return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
        }

        @GetMapping("/{id}")
        public ApiResponse<User> getOne(@PathVariable int id){
            return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
        }


        @DeleteMapping("/{id}")
        public ApiResponse<Void> delete(@PathVariable int id) {
            userService.delete(id);
            return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
        }



    }

}
