package com.PedroHenrique.taskboard;

public class Task {
    private static int idCounter = 1;

    private final int id;
    private String title;
    private String description;
    private TaskStatus status;

    public Task(String title, String description) {
        this.id = idCounter++;
        this.title = title;
        this.description = description;
        this.status = TaskStatus.TODO;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Task #%d - %s [%s]\n  Description: %s", id, title, status, description);
    }
}
