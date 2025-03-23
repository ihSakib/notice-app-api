package org.example.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Notice {
    public Notice() {
    }

    @Id
    private int id;
    private String title;
    private String description;
    private String url;
    private String date;


    public Notice(int id, String title, String description, String url, String date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.date = date;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {  // Fixed typo from 'getTile' to 'getTitle'
        return title;
    }

    public void setTitle(String title) {  // Fixed typo
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}