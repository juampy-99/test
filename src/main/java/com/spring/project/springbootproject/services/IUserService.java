package com.spring.project.springbootproject.services;

import com.spring.project.springbootproject.dtos.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAll();
    UserDTO getUser(String uuid);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    UserDTO deleteUser(String uuid);
}
