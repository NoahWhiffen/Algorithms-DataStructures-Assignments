package Assignment4;

public class Main {
    public static void main(String[] args) {
        StateManagement stateManagement = new StateManagement();
        StateManagement.LinkedList history = stateManagement.new LinkedList();
        
        history.addState(1);
        history.addState(2);
        history.addState(3);
        history.addState(4);

        System.out.println("Current State: " + history.getCurrentState());

        // Undo

        //Re do

        // Add a new state

        // Attempt a redo
    }
}
