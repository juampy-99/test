package com.spring.project.springbootproject.mappers;

import com.spring.project.springbootproject.dtos.RolDTO;
import com.spring.project.springbootproject.models.Rol;
import org.springframework.stereotype.Component;

@Component
public class RolMapper {
    public RolDTO toDTO(Rol rol){
        RolDTO rolDTO = new RolDTO();
        rolDTO.setUuid(rol.getUuid());
        rolDTO.setName(rol.getName());
        return rolDTO;
    }
    public Rol getRol(RolDTO rolDTO){
        Rol rol = new Rol();
        rol.setUuid(rolDTO.getUuid());
        rol.setName(rolDTO.getName());
        return rol;
    }
}
