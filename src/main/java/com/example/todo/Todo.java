package com.example.todo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Todo
 */
@Entity
public class Todo {
    @Id
    private final String id;

    private final String title;
    private final String body;

    public Todo(){
        this.id = null;
        this.title = null;
        this.body = null;
    }

    public Todo(String id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

}