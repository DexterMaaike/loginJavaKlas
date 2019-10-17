package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/hello")
    String sayHello(){
        return "Hello world!";
    }

    @GetMapping("/todo")
    Iterable<Todo> getTodo(){
        return todoService.findAll();
    }

    @PostMapping("/todo")
    void receiveTodo(@RequestBody Todo todo){
        todoService.save(todo);
    }

    @DeleteMapping("/todo/{id}")
    void deleteTodo(@PathVariable int id){
        todoService.deleteById(id);
    }

    @PutMapping("/todo")
    Todo updateTodo(@RequestBody Todo todo){
        return todoService.save(todo);
    }

}
