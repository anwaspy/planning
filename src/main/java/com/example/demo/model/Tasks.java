package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tasks {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private transient Deadline deadline;

    public Long getId() {
      return id;
     }

    public void setId(Long id) {
        this.id = id;
    }

    public Tasks() {
    }

    public Tasks(String name, Deadline deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline(Deadline deadline) {
        this.deadline = deadline;
    }
}
