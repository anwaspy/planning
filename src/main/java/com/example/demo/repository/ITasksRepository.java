package com.example.demo.repository;

import com.example.demo.model.Tasks;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface ITasksRepository extends CrudRepository<Tasks, Long> {

    @Override
    List<Tasks> findAll();
}
