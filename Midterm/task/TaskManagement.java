package Midterm.task;

import java.util.LinkedList;

public class TaskManagement {

    private LinkedList<Task> tasks;

    private boolean isTaskNameUnique(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                return false;
            }
        }
        return true;
    }

    public boolean addTask(Task task) {
        if (isTaskNameUnique(task.getDescription())) {
            tasks.add(task);
            return true;
        } else {
            System.out.println("Task with description: " + task.getDescription() + " already exists.");
            return false;
        }
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void completeTask(int index) {
        
    }
}
