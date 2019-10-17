package com.example.demo.service;

import com.example.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoService extends CrudRepository<Todo, Integer> {

}
