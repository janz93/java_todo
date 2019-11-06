package com.example.todo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private final TodoRepository todoRepository;

    @Autowired
    TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo/{id}")
    public Optional<Todo> todo(@PathVariable String id) {
        Optional<Todo> todo = this.todoRepository.findById(id);
        return todo;
    }

}
