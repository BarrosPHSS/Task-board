package com.PedroHenrique.taskboard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskBoard {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
        System.out.println("Tarefa criada: " + task);
    }

    public void moveTask(int taskId, TaskStatus newStatus) {
        Task task = findTaskById(taskId);
        if (task != null) {
            task.setStatus(newStatus);
            System.out.println("Tarefa atualizada: " + task);
        } else {
            System.out.println("Tarefa com ID " + taskId + " não encontrada.");
        }
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    public Task findTaskById(int taskId) {
        return tasks.stream()
                .filter(t -> t.getId() == taskId)
                .findFirst()
                .orElse(null);
    }

    public void printBoard() {
        System.out.println("\n--- BOARD DE TAREFAS ---");

        for (TaskStatus status : TaskStatus.values()) {
            System.out.println("\n" + status + ":");
            List<Task> tasksByStatus = getTasksByStatus(status);
            if (tasksByStatus.isEmpty()) {
                System.out.println("  (Nenhuma tarefa)");
            } else {
                tasksByStatus.forEach(task -> System.out.println("  " + task));
            }
        }
        System.out.println();
    }
}
