// Noah Whiffen - SD 12
// Movie Theater Seating System
// May 15th, 2025

import java.util.Scanner;

public class MovieTheater {
        
    private String[][] seats;
    private final int ROWS = 10;
    private final int COLUMNS = 10;
    
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
    public void DisplaySeating(MovieTheater theater) {
        System.out.println("Current Seating: ");

        for (int i = 0; i < ROWS; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }
    }

    // Method to reserve seats
    public void ReserveSeating() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row (1-10): ");
        int row = scanner.nextInt();

        System.out.println("Enter column (1-10): ");
        int column = scanner.nextInt();

        // Validate input
        if (row < 0 || row >= ROWS || column < 0 || column >= COLUMNS) {
            System.out.println("Invalid seat selection. Please try again.");
            return;
        }

        // Check if seat is available

        // Reserve the seat
        
    }

    // Method to cancel seats
    public void CancelSeating() {

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
            System.out.println("Select an Option: ");
            
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
                default:
                    System.out.println("Invalid option. Must be a number from 1 to 4.");
            }
        } while (!option.equals("4"));

        scanner.close();
    } 
}
