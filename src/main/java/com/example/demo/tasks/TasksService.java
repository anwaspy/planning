package com.example.demo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TasksService {

    public ITasksRepository repository;

    public List<Task> tasksList;

    @Autowired
    public TasksService(ITasksRepository repository){
        this.repository = repository;
    }


    public List<Task> findAll() {
        this.tasksList = new ArrayList<>();
        tasksList.add(new Task("example task nr 1", new Date(2020, 5, 30, 6, 5)));
        tasksList.add(new Task("example task nr 2", new Date(2020, 5, 31, 8, 15)));
        return tasksList;
    }
}
