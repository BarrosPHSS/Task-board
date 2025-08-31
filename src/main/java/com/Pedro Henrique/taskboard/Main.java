package com.PedroHenrique.taskboard;

import java.util.Scanner;

public class Main {
    private static final TaskBoard board = new TaskBoard();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Board de Tarefas Simples ===");

        boolean running = true;
        while (running) {
            printMenu();
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> addTask();
                case "2" -> moveTask();
                case "3" -> board.printBoard();
                case "0" -> {
                    System.out.println("Saindo...");
                    running = false;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
                
                Escolha uma opção:
                1 - Adicionar tarefa
                2 - Mover tarefa
                3 - Mostrar board
                0 - Sair
                """);
        System.out.print("Opção: ");
    }

    private static void addTask() {
        System.out.print("Título da tarefa: ");
        String title = scanner.nextLine();

        System.out.print("Descrição da tarefa: ");
        String desc = scanner.nextLine();

        board.addTask(title, desc);
    }

    private static void moveTask() {
        System.out.print("ID da tarefa: ");
        String idStr = scanner.nextLine();

        int id;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
            return;
        }

        System.out.println("Novo status (TODO, IN_PROGRESS, DONE): ");
        String statusStr = scanner.nextLine().toUpperCase();

        TaskStatus status;
        try {
            status = TaskStatus.valueOf(statusStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Status inválido.");
            return;
        }

        board.moveTask(id, status);
    }
}
