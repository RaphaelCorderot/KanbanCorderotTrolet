package com.example.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class Task {

    public Task() {

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDesignatedUser(User designatedUser) {
        this.designatedUser = designatedUser;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public Task(String label, Date date, User designatedUser, int estimatedTime, List<String> tags, String location, String url, String description) {
        this.label = label;
        this.date = date;
        this.designatedUser = designatedUser;
        this.estimatedTime = estimatedTime;
        this.tags = tags;
        this.location = location;
        this.url = url;
        this.description = description;
    }

    public void setDescription(String description) {
        if (description == null) {
            this.description = "";
        } else {
            this.description = description;
        }
    }

    // identifiant
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    // nom de la fiche
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    private String label;
    // Date butoire
    private Date date;
    // utilisateur désigné
    @ManyToOne
    private User designatedUser;
    // Temps estimé
    private int estimatedTime;
    // liste des tags
    @ElementCollection
    private List<String> tags;
    // lieu
    private String location;
    // url
    private String url;
    // description
    private String description;

    public User getDesignatedUser() {
        return designatedUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
