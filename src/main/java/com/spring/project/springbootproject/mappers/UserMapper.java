package com.spring.project.springbootproject.mappers;

import com.spring.project.springbootproject.dtos.UserDTO;
import com.spring.project.springbootproject.models.Users;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDTO toDTO(Users users) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUuid(users.getUuid());
        userDTO.setName(users.getName());
        userDTO.setEmail(users.getEmail());
        return userDTO;
    }
    public Users getUser(UserDTO userDTO) {
        Users users = new Users();
        users.setUuid(userDTO.getUuid());
        users.setName(userDTO.getName());
        users.setEmail(userDTO.getEmail());
        return users;
    }
}
