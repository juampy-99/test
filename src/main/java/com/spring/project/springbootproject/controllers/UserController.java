package com.spring.project.springbootproject.controllers;

import com.spring.project.springbootproject.dtos.UserDTO;
import com.spring.project.springbootproject.services.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<UserDTO> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/{uuid}")
    public  ResponseEntity<UserDTO> getUser(@PathVariable String uuid){
        return ResponseEntity.ok().body(userService.getUser(uuid));
    }

    @PostMapping()
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id,@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
    }
}
