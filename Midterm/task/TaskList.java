package Midterm.task;

public class TaskList {

    private class Node {
        Task task;
        Node next;
        Node prev;

        Node(Task task) {
            this.task = task;
        }
    }

    public TaskList() {
        // Default constructor
    }

    public TaskList(TaskList other) {
        Node temp = other.head;
        while (temp != null) {
            Task originalTask = temp.task;
            Task copiedTask = new Task(originalTask.getDescription(), originalTask.getIsCompleted());
            this.addTask(copiedTask);
            temp = temp.next;
        }
    }

    private Node head = null;
    private Node current = null;

    public boolean isTaskNameUnique(String description) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getDescription().equalsIgnoreCase(description)) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public void addTask(String description) {
        Task newTask = new Task(description, false);
        addTask(newTask);
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            if (current != null) {
                current.next = null;
            }
            newNode.prev = current;
            if (current != null) {
                current.next = newNode;
            }
            current = newNode;
        }
    }

    public boolean removeTask(Task taskToRemove) {
        Node temp = head;

        while (temp != null) {
            if (temp.task.equals(taskToRemove)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                if (current == temp) {
                    current = temp.prev != null ? temp.prev : head;
                }

                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Task getTaskAt(int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.task;
            }
            temp = temp.next;
            count++;
        }
        return null;
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void printTasks() {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            System.out.println(index + ": " + temp.task.toString());
            temp = temp.next;
            index++;
        }
    }

    public boolean markTaskCompleted(int index) {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if (count == index) {
                temp.task.markCompleted();
                return true;
            }
            count++;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder allTasks = new StringBuilder();
        Node temp = head;
        int index = 0;
        while (temp != null) {
            allTasks.append(index).append(": ").append(temp.task.toString()).append("\n");
            temp = temp.next;
            index++;
        }
        return allTasks.toString();
    }

}
