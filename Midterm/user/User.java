package Midterm.user;

import java.util.LinkedList;
import Midterm.task.*;

public class User {
    // private int userId;
    private String firstName;
    private String lastName;
    private TaskList tasks;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tasks = new TaskList();
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public TaskList getTasks() {
        return new TaskList(this.tasks);
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setTasks(TaskList tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + tasks.toString();
    }

    // Utility
    public void addTask(String description) {
        tasks.addTask(description);
    }

    public void removeTask(Task task) {
    tasks.removeTask(task);
    }

    public void completeTask(int index) {
        tasks.markTaskCompleted(index);
    }

    public void printTasks() {
        tasks.printTasks();
    }

}
