package com.example.demo.rest;

import com.example.demo.model.Tasks;
import com.example.demo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TasksRestController {

    private TasksService tasksService;

    @Autowired
    public TasksRestController(TasksService tasksService){
        this.tasksService = tasksService;
    }


    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<Tasks> showAllTasks(Model model){
        model.addAttribute("tasks", tasksService.findAll());
        return tasksService.findAll();
    }

}
