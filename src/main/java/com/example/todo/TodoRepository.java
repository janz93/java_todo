package com.example.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * TodoRepository
 */
@Repository
public interface TodoRepository extends CrudRepository<Todo, String> {
    public Todo findByTitle(String title);
}