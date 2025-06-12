package Assignment4;

public class StateManagement<T> {
    
    class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        } 
    }

    class LinkedList {
        Node head = null;
        Node current = null;

    // Add a new state (clears redo history) -- this is a newNode
    public void addState(T data) {
        Node newNode = new Node(data);

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

    // undo function
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // redo function
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // get current state
    public T getCurrentState() {
        if (current != null) {
            return current.data;
        } else {
            throw new IllegalStateException("No state available.");
        }
    }
}
}