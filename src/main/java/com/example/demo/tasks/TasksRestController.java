package com.example.demo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TasksRestController {

    private final TasksService tasksService;

    @Autowired
    public TasksRestController(TasksService tasksService){
        this.tasksService = tasksService;
    }

    @GetMapping("/tasks")
    public List<Task> findAll(){
        return tasksService.findAll();
    }
}
