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

    private Node head = null;
    private Node current = null;

    public void addTask(String description) {
        Task newTask = new Task(description, false);
        Node newNode = new Node(newTask);

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
                temp.task.setIsCompleted(true);
                return true;
            }
            count++;
            temp = temp.next;
        }
        return false;
    }

}
