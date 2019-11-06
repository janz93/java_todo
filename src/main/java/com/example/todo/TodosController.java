package com.example.todo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodosController {
    @GetMapping("/todos")
    public List<String> todos() {
        return Arrays.asList("one", "two");
    }
}
