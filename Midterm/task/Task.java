package Midterm.task;

import java.util.LinkedList;
import Midterm.user.*;

public class Task {
    private String description;
    private boolean isCompleted;
    

    public Task(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public Task() {
        this.description = "";
        this.isCompleted = false;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String toString() {
        return "Task: " + description + " Completed: " + isCompleted;  
    }

}
