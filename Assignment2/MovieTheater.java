package Assignment2;
// Noah Whiffen - SD 12
// Movie Theater Seating System
// May 15th - May 16th, 2025

import java.util.Scanner;

public class MovieTheater {
        
    private String[][] seats;
    private final int ROWS = 10;
    private final int COLUMNS = 10;
    int row;
    int column;

    // Constructor to create seats data structure
    public MovieTheater() {
        seats = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = "Empty";
            }
        }
    }

    // Method to display all seats
    public void DisplaySeating() {
        System.out.println("Current Seating: ");

        
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        System.out.print("\t");
        for(int c = 0; c < 10; c++){
            System.out.print("Col " + letters[c] + "   ");
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
        for (int i = 0; i < ROWS; i++) {
            // System.out.print("Row " + (i + 1) + ": ");
            System.out.print("Row " + letters[i] + ": ");
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("[" + seats[i][j] + "] ");
            } 
            System.out.println();
        }
        System.out.println();
    }

    // Method to reserve seats
    public void ReserveSeating() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Enter row (1-10): ");
        if (scanner.hasNextInt()) {
            row = scanner.nextInt();
            if (row < 0 || row >= ROWS) {
                System.out.println("Row must be between 1 and 10.");
            } else {
                break;
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        }

        while (true) {
        System.out.println("Enter column (1-10): ");
        if (scanner.hasNextInt()) {
            column = scanner.nextInt();
            if ( column < 0 || column >= COLUMNS) {
                System.out.println("Column must be between 1 and 10.");
            } else {
                break;
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

        // Check if seat is available
        if (seats[row - 1][column - 1].equals("Empty")) {
            scanner.nextLine();
            System.out.println("Enter name for reservation: ");
            String name = scanner.nextLine();
            seats[row - 1][column - 1] = name;
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Sorry, that seat is already taken.");
            scanner.next();
        }
    }

    // Method to cancel seats
    public void CancelSeating() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter row (1-10): ");
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
                if (row < 0 || row >= ROWS) {
                    System.out.println("Row must be between 1 and 10.");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        while (true) {
            System.out.println("Enter column (1-10): ");
            if (scanner.hasNextInt()) {
                column = scanner.nextInt();
                if ( column < 0 || column >= COLUMNS) {
                    System.out.println("Column must be between 1 and 10.");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        // Validate the input (make sure within range and that seat isnt empty)
        if (!seats[row - 1][column - 1].equals("Empty")) {
            System.out.printf("This seat is reserved for %s\n", seats[row - 1][column - 1]);
            System.out.println("Are you sure you want to cancel this reservation? (y/n)");
            
            char choice;
            do {
                choice = scanner.next().charAt(0);
            // input validation (y or n)
                if (choice == 'y') {
                    seats[row - 1][column - 1] = "Empty";
                    System.out.println("Seat cancelled successfully.");
                } else if (choice == 'n') {
                    return;
                } else {
                    System.out.println("Invalid input. Please enter y or n."); 
                }
            } while(choice != 'y' && choice != 'n');
        } else {
            System.out.println("Sorry, that seat is empty.");
        }    
    }

    // Main Program
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("--------Movie Theater System--------");
            System.out.println("1. Display Seating");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel a Reservation");
            System.out.println("4. Exit");
            System.out.println("------------------------------------");
            System.out.print("Select an Option: ");
            
            option = scanner.nextLine();
        
            switch (option) {
                case "1":
                    theater.DisplaySeating();
                    break;
                case "2":
                    theater.ReserveSeating();
                    break;
                case "3":
                    theater.CancelSeating();
                    break;
                case "4":
                    System.out.println("You are now exiting the program.");
                    
                    break;
                default:
                    System.out.println("Invalid option. Must be a number from 1 to 4.");
            }
        } while (!option.equals("4"));

        scanner.close();
    } 
}
