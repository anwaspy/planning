package com.example.demo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TasksRestController {

    private TasksService tasksService;

    @Autowired
    public TasksRestController(TasksService tasksService){
        this.tasksService = tasksService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/tasks")
    public List<Tasks> showAllTasks(){
        return tasksService.showAllTasks();
    }
}
