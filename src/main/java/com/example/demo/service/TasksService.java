package com.example.demo.service;

import com.example.demo.model.Tasks;
import com.example.demo.repository.ITasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {

    private ITasksRepository tasksRepository;

    @Autowired
    public TasksService(ITasksRepository tasksRepository){
        this.tasksRepository = tasksRepository;
    }

    public List<Tasks> findAll(){
        return tasksRepository.findAll();
    }
}
