package Midterm;

import Midterm.task.*;
import Midterm.user.*;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("-------------------------------------------------");

        // Create UserManagement and add users
        UserManagement userManager = new UserManagement();
        System.out.println("---- Adding users ----");
        userManager.addUser("John", "Smith");
        userManager.addUser("Jane", "Doe");
        userManager.addUser("John", "Smith");

        // Create users and add tasks
        User john = new User("John", "Smith");
        User jane = new User("Jane", "Doe");

        john.addTask("Buy groceries.");
        john.addTask("Go to gym.");
        jane.addTask("Work on midterm sprint.");
        jane.addTask("Go for a run");

        // Mark a task complete
        john.completeTask(0);
        System.out.println("\nFirst task marked as completed:");
        System.out.println(john.getTasks().getTaskAt(0));

        // Show task lists
        System.out.println("\n---- John's Tasks ----");
        john.printTasks();

        System.out.println("\n---- Jane's Tasks ----");
        jane.printTasks();

        // Demonstrate undo and redo
        TaskList taskList = john.getTasks();
        System.out.println("\n ---- Performing undo and redo on John's tasks ----");
        taskList.undo();
        taskList.redo();

        // Use TaskManagement for adding unique tasks
        TaskManagement taskManager = new TaskManagement();

        Task task1 = new Task("Make lunch.", false);
        Task task2 = new Task("Make lunch.", false);

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Show all users from userManagement
        System.out.println("\n---- All users in system ----");
        userManager.printUsers();

        System.out.println("-------------------------------------------------");
    }
}
