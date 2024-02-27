package com.spring.project.springbootproject.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Article {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(updatable = false, nullable = false, unique = true, length = 36)
    private String uuid;
    @Column(updatable = true)
    private String title;
    @Column(updatable = true)
    private String reference;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private Users users;

    @ManyToOne()
    @JoinColumn(name = "blog_id")
    private Blog blog;
    @CreatedDate
    @Column(updatable = false, columnDefinition = "timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    public Article() {
    }

    public Article(String uuid) {
        this.uuid = uuid;
    }

    public Article(Integer id, String uuid, String title, String reference, Date createdAt) {
        this.id = id;
        this.uuid = uuid;
        this.title = title;
        this.reference = reference;
        this.createdAt = createdAt;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
    @PrePersist
    public void initializeUuid(){
        this.setUuid(UUID.randomUUID().toString());
    }
}
