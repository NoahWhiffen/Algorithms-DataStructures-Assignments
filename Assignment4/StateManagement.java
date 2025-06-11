package Assignment4;

public class StateManagement {
    
    // Inner Node class
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

        private Node<T> current;
    }

    // Add a new state (clears redo history) -- this is a newNode

    // undo function

    // redo function

    // get current state

    // create a main file to test it
}
