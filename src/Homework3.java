
import java.util.Scanner;

/**
 * Student Name: Oratile Mmusi
 * Student Number: ST10312691
 * Assignment Name: Homework 1
 * Submission due date: 04 Aug 2024
 */

public class Homework3 { 
    public static void main(String[] args) {
        // Prompt user for the number of hours worked
        try ( // Create a Scanner object for user input
                Scanner scanner = new Scanner(System.in)) {
            // Prompt user for the number of hours worked
            System.out.print("Enter the number of hours worked: ");
            double hoursWorked = scanner.nextDouble();
            // Prompt user for the hourly pay rate
            System.out.print("Enter the hourly pay rate: ");
            double hourlyRate = scanner.nextDouble();
            // Initialize gross pay variable
            double grossPay;
            // Calculate gross pay based on hours worked
            if (hoursWorked <= 40) {
                // If hours worked is 40 or less, calculate pay at regular rate
                grossPay = hoursWorked * hourlyRate;
            } else {
                // If hours worked exceeds 40, calculate pay with overtime
                double regularHours = 40;
                double overtimeHours = hoursWorked - regularHours;
                double overtimeRate = hourlyRate * 1.5;
                grossPay = (regularHours * hourlyRate) + (overtimeHours * overtimeRate);
            }   // Output the gross pay
            System.out.printf("Gross Pay: $%.2f%n", grossPay);
            // Close the scanner
        }
    }
}
