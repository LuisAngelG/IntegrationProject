package com.lgastelu.integrationproject.Class;

import com.orm.dsl.Table;

@Table
public class Comentary {

    private Long id;
    private String description;
    private String category;
    private String commentary;

    public Comentary() {
    }

    public Comentary(String description, String category, String commentary) {
        this.description = description;
        this.category = category;
        this.commentary = commentary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
