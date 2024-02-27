package com.spring.project.springbootproject.controllers;

import com.spring.project.springbootproject.dtos.RolDTO;
import com.spring.project.springbootproject.dtos.UserDTO;
import com.spring.project.springbootproject.services.IRolService;
import com.spring.project.springbootproject.services.implement.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/rols")
public class RolController {
    private final IRolService rolService;
    public RolController(IRolService rolService) {
        this.rolService = rolService;
    }
    @GetMapping
    public List<RolDTO> getAll(){
        return rolService.getAllRols();
    }
    @GetMapping("/{rolUuid}")
    public RolDTO get(@PathVariable String rolUuid){
        return rolService.getRol(rolUuid);
    }

    @PostMapping
    public ResponseEntity<RolDTO> create(@RequestBody RolDTO rol) throws URISyntaxException {
        RolDTO rolDTO = rolService.saveRol(rol);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{uuid}")
                .buildAndExpand(rolDTO.getUuid())
                .toUri();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, uri.toString())
                .body(rolDTO);
    }
    @PutMapping("/{rolUuid}")
    public RolDTO update(@RequestBody RolDTO rol){
        return rolService.updateRol(rol);
    }
    @DeleteMapping("/{rolUuid}")
    public RolDTO delete(@PathVariable String rolUuid){
        return rolService.deleteRol(rolUuid);
    }

}
