package com.spring.project.springbootproject.dtos;

public class UserDTO {
    private String uuid;
    private String name;
    private String email;

    public UserDTO(String uuid, String name, String email) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
    }

    public UserDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
