package com.example.demo.service;

import com.example.demo.model.Deadline;
import com.example.demo.model.Tasks;
import com.example.demo.repository.ITasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TasksService {

    private ITasksRepository tasksRepository;
    private List<Tasks> tasksList;

    @Autowired
    public TasksService(ITasksRepository tasksRepository){
        this.tasksRepository = tasksRepository;
    }


    public List<Tasks> findAll(){
        this.tasksList = new ArrayList<>();
        tasksList.add(new Tasks("have dinner", new Deadline(21,4, 2020, 16, 10)));
        tasksList.add(new Tasks("work", new Deadline(23,4,2020,8,15)));
        return tasksList;
    }
}
