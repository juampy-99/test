package com.spring.project.springbootproject.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Users {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(updatable = false, nullable = false, unique = true, length = 36)
    private String uuid;
    @Column(updatable = true)
    private String name;
    @Column(updatable = true)
    private String email;

    @CreatedDate
    private LocalDateTime created_at;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "users")
    private List<Article> articles;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Rol> roles;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "users")
    private Blog blog;
    public Users() {
    }

    public Users(String uuid) {
        this.uuid = uuid;
    }

    public Users(Integer id, String uuid, String name, String email, LocalDateTime created_at) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.created_at = created_at;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @PrePersist
    public void initializeUuid(){
        this.setUuid(UUID.randomUUID().toString());
        //this.setCreated_at("2022-02-01");
    }
}
