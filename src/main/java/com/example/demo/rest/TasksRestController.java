package com.example.demo.rest;

import com.example.demo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class TasksRestController {

    private TasksService tasksService;

    @Autowired
    public TasksRestController(TasksService tasksService){
        this.tasksService = tasksService;
    }


    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String showAllTasks(Model model){
        model.addAttribute("tasks", tasksService.findAll());
        return "tasks";
    }

}
