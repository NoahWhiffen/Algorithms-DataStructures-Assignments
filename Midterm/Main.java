package Midterm;

import Midterm.task.*;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        // Add tasks
        taskList.addTask("Buy groceries.");
        taskList.addTask("Go to gym.");
        taskList.addTask("Work on midterm sprint.");

        // Print tasks
        System.out.println("Current Tasks:");
        taskList.printTasks();

        // Change completion status of a task
        boolean completed = taskList.markTaskCompleted(1);

        // Confirm completion
        System.out.println("\nTask 1 marked as completed: " + completed);

        System.out.println("\nUpdated Task List:");
        taskList.printTasks();
    }
}