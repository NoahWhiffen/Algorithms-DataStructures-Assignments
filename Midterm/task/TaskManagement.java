package Midterm.task;

public class TaskManagement {

    private TaskList tasks;

    public TaskManagement() {
        this.tasks = new TaskList();
    }

    private boolean isTaskNameUnique(String description) { 
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean addTask(Task task) {
        if (isTaskNameUnique(task.getDescription())) {
            tasks.addTask(task.getDescription());
            return true;
        } else {
            System.out.println("Task with description: " + task.getDescription() + " already exists.");
            return false;
        }
    }

    public void removeTask(Task task) {
        boolean removed = tasks.removeTask(task);
        if (!removed) {
            System.out.println("Task not found.");
        }
    }

    public void completeTask(int index) {
        boolean success = tasks.markTaskCompleted(index);
        if (!success) {
            System.out.println("Invalid task index.");
        } 
    }
}
