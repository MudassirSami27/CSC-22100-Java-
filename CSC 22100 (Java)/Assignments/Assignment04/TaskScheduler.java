package Assignments.Assignment04;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

public class TaskScheduler {
    private PriorityQueue<Task> taskQueue;

    public TaskScheduler() {
        // PriorityQueue with custom comparator to sort tasks by priority
        taskQueue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
    }

    public void addTask(String description, int priority) {
        Task task = new Task(description, priority);
        taskQueue.add(task);
        // Implicitly calls task.toString()
        System.out.println("Added: " + task);
    }

    public void displayTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("No upcoming tasks.");
        } else {
            System.out.println("Upcoming Tasks:");
            // Implicitly calls toString() on each Task object
            taskQueue.forEach(System.out::println);
        }
    }

    public void completeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks to complete.");
        } else {
            Task completedTask = taskQueue.poll();
            // Implicitly calls completedTask.toString()
            System.out.println("Completed: " + completedTask);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Upcoming Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task priority (1-High, 2-Medium, 3-Low): ");
                    int priority = scanner.nextInt();
                    scheduler.addTask(description, priority);
                }
                case 2 -> scheduler.displayTasks();
                case 3 -> scheduler.completeTask();
                case 4 -> {
                    System.out.println("Exiting Task Scheduler.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
