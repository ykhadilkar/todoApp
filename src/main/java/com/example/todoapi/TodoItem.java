package com.example.todoapi;

public class TodoItem {
    private final long id;
    private final String content;
    private final boolean completed;

    public TodoItem(long id, String content, boolean completed) {
        this.id = id;
        this.content = content;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isCompleted() {
        return completed;
    }
}