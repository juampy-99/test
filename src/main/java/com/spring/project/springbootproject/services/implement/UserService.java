package com.spring.project.springbootproject.services.implement;

import com.spring.project.springbootproject.dtos.UserDTO;
import com.spring.project.springbootproject.mappers.UserMapper;
import com.spring.project.springbootproject.models.Users;
import com.spring.project.springbootproject.repository.UserRepository;
import com.spring.project.springbootproject.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Override
    public List<UserDTO> getAll() {
        UserDTO userDTO1 = new UserDTO("1a2b3c","Liliana","lili_12@gmail.com");
        UserDTO userDTO2 = new UserDTO("1a2b3d","Carmen","carmen@gmail.com");
        List<UserDTO> userDTOList=new ArrayList<>();
        userDTOList.add(userDTO1);
        userDTOList.add(userDTO2);
        return userDTOList;
    }

    @Override
    public UserDTO getUser(String uuid) {

        return new UserDTO("1a2b3c","Liliana","lili_12@gmail.com");
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        Users users = userMapper.getUser(userDTO);
        return userMapper.toDTO(userRepository.save(users));
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteUser(String uuid) {
        return null;
    }
}
