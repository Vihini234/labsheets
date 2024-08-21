/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Questin2 {
    
    // Method to print the multiplication table recursively
    public static void printTable(int number, int multiplier) {
        // Base case: stop when multiplier exceeds 12
        if (multiplier > 12) {
            return;
        }

        // Print the current multiplication line
        System.out.printf("%2d x %d = %d%n", multiplier, number, multiplier * number);

        // Recursive call to print the next line
        printTable(number, multiplier + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the header for the multiplication table
        System.out.println("Multiplication table for: " + number);
        System.out.println("==============================");
        
        // Start printing the table from 1 to 12
        printTable(number, 1);

        // Close the scanner
        scanner.close();
    }
}
