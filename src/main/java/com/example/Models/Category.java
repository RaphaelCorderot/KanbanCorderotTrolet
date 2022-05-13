package com.example.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String type;

    @OneToMany(cascade=CascadeType.ALL)
    private Collection<Task> tasks;

    public Collection<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Collection<Task> tasks) {
        this.tasks = tasks;
    }

    public void setKanban(Kanban kanban) {
        this.kanban = kanban;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Kanban kanban;

    public Kanban getKanban() {
        return kanban;
    }

    public Category(String type, Collection<Task> fiches) {
        this.type = type;
        this.tasks = fiches;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Category() {
        this.tasks = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
