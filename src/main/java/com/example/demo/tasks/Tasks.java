package com.example.demo.tasks;

import java.util.Date;

public class Tasks {

    private String name;
    private Date deadline;

    public Tasks(String name, Date deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
