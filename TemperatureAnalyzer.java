// Noah Whiffen - SD 12
// Average Temp Calculator
// May 7th, 2025

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        
        // Take an input from the user (number of days)
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of days: ");
        
        // Initialize necessary variables
        int days = scanner.nextInt();
        int[] temperatures = new int[days];
        int sum = 0;

        // Prompt the user to enter all temperature values
        for (int i = 0; i < days; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
            sum += temperatures[i];
        }

        // Calculate the average temperature
        double average = (double) sum / days;
        System.out.println("Average temperature: " + average);

    // Using the average, Find how many temps are higher than average
    int numAboveAverage = 0;
    for (int temp : temperatures) {
        if (temp > average) {
            numAboveAverage++;
        }
    }

    System.out.println(numAboveAverage + " days were above average temperature.");

    scanner.close();
    }
}
