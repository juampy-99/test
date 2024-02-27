package com.spring.project.springbootproject.services.implement;

import com.spring.project.springbootproject.dtos.RolDTO;
import com.spring.project.springbootproject.services.IRolService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolService implements IRolService {

    public List<RolDTO> getAllRols() {
        RolDTO rolDTO1= new RolDTO("1a2d5f3","Estudiante");
        RolDTO rolDTO2= new RolDTO("1c2e5t3","Administrador");
        List<RolDTO> listRol = new ArrayList<>();
        listRol.add(rolDTO1);
        listRol.add(rolDTO2);
        return listRol;
    }
    public RolDTO getRol(String rolUuid) {
        return new RolDTO("1a2d5f3","Estudiante");
    }
    public RolDTO saveRol(RolDTO rol) {
        return null;
    }
    public RolDTO updateRol(RolDTO rol) {
        return null;
    }

    public RolDTO deleteRol(String rolUuid) {
        return null;
    }

}
