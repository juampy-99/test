package com.spring.project.springbootproject.models;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Rol {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(updatable = false, nullable = false, unique = true, length = 36)
    private String uuid;
    @Column(updatable = true)
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<Users> users;
    public Rol(Integer id) {
        this.id = id;
    }

    public Rol(String uuid) {
        this.uuid = uuid;
    }

    public Rol() {
    }

    public Rol(Integer id, String uuid, String name) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
    @PrePersist
    public void initializeUuid(){
        this.setUuid(UUID.randomUUID().toString());
    }
}
