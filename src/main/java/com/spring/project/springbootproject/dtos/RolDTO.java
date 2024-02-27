package com.spring.project.springbootproject.dtos;

public class RolDTO {
    private String uuid;
    private String name;

    public RolDTO(String uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public RolDTO() {
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
}
