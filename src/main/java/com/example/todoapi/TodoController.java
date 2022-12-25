package com.example.todoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TodoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private static final boolean completed = false;

    @GetMapping("/todo")
    public TodoItem todoItem(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new TodoItem(counter.incrementAndGet(), String.format(template, name), completed);
    }
}