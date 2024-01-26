package com.ToDoapplication.example.ToDoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ToDoapplication.example.ToDoapp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {
    // You can add custom query methods if needed
}
