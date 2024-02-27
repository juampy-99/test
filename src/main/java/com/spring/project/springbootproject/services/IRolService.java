package com.spring.project.springbootproject.services;

import com.spring.project.springbootproject.dtos.RolDTO;

import java.util.List;

public interface IRolService {
    List<RolDTO> getAllRols();
    RolDTO getRol(String rolUuid);
    RolDTO saveRol(RolDTO rol);
    RolDTO updateRol(RolDTO rol);
    RolDTO deleteRol(String rolUuid);

}
