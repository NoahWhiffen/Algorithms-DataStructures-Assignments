package Assignment4;

public class Main {
    public static void main(String[] args) {
        StateManagement<Integer> stateManagement = new StateManagement<>();
        StateManagement<Integer>.LinkedList history = stateManagement.new LinkedList();
        
        System.out.println("---------------------------------------");

        history.addState(1);
        history.addState(2);
        history.addState(3);
        history.addState(4);

        System.out.println("Current state: " + history.getCurrentState());

        // Undo
        history.undo();
        System.out.println("Current state after undo: " + history.getCurrentState());

        // Redo
        history.redo();
        System.out.println("Current state after redo: " + history.getCurrentState());

        // Undo twice
        history.undo();
        history.undo();
        System.out.println("Current state after two more undos: " + history.getCurrentState());

        // Redo again
        history.redo();
        System.out.println("Current state after redo: " + history.getCurrentState()); // 3

        // Add a new state to clear the redo history
        history.addState(5);
        System.out.println("Current state after adding a new state: " + history.getCurrentState());

        // Demonstrate redo error
        history.redo();

        System.out.println("Final state: " + history.getCurrentState());

        System.out.println("---------------------------------------");
    }
}
