package com.spring.project.springbootproject.dtos;

public class ArticleDTO {
    private String uuid;
    private String title;
    private String reference;

    public ArticleDTO(String uuid, String title, String reference) {
        this.uuid = uuid;
        this.title = title;
        this.reference = reference;
    }

    public ArticleDTO() {
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
}
