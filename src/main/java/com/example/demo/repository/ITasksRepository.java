package com.example.demo.repository;

import com.example.demo.model.Tasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface ITasksRepository extends CrudRepository<Tasks, Long> {

    @Override
    List<Tasks> findAll();
}
