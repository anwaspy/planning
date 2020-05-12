package com.example.demo.tasks;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITasksRepository extends CrudRepository<Task,Long> {

    @Override
    List<Task> findAll();
}
