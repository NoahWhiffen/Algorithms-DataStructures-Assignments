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
    public void DisplaySeating() {

    }

    // Method to reserve seats
    public void ReserveSeating() {

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
                case "2":
                case "3":
                case "4":
                    System.out.println("You are now exiting the program.")
                default:
                    System.out.println("Invalid option. Must be a number from 1 to 4.");
            }
        } while (!option.equals("4"));

        scanner.close();
    } 
}
