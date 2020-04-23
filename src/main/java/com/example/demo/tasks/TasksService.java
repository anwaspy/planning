package com.example.demo.tasks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TasksService {

    private List<Tasks> tasksList;


    public List<Tasks> showAllTasks() {
        this.tasksList = new ArrayList<>();
        tasksList.add(new Tasks("example task nr 1", new Deadline(21, 4, 2020, 16, 10)));
        tasksList.add(new Tasks("example task nr 2", new Deadline(23, 4, 2020, 8, 15)));
        return tasksList;
    }
}
