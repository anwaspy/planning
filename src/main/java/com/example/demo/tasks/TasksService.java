package com.example.demo.tasks;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TasksService {

    private List<Tasks> tasksList;


    public List<Tasks> showAllTasks() {


        this.tasksList = new ArrayList<>();
        tasksList.add(new Tasks("example task nr 1", new Date(2020, 4, 30, 6,5)));
        tasksList.add(new Tasks("example task nr 2", new Date(2020, 4, 28, 8, 15)));
        return tasksList;
    }
}
