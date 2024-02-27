package com.spring.project.springbootproject.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Blog {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(updatable = false, nullable = false, unique = true, length = 36)
    private String uuid;
    @Column(updatable = true)
    private String name;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @CreatedDate
    @Column(updatable = false, columnDefinition = "timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;


    public Blog(String uuid) {
        this.uuid = uuid;
    }

    public Blog(Integer id, String uuid, String name, Date createdAt) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.createdAt = createdAt;

    }

    public Blog() {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
    @PrePersist
    public void initializeUuid(){
        this.setUuid(UUID.randomUUID().toString());
    }
}
