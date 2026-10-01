package LabActivity2_3;

import java.util.Scanner;

public class ElectricityBillCalculator2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for electricity units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        
        double totalBill = 0;
        
        // Calculate bill based on the given tariff rates
        if (units >= 501) {
            totalBill = units * 0.80; // RM0.80 per unit for above 500 units
        } else if (units >= 301 && units <= 500) {
            totalBill = units * 0.70; // RM0.70 per unit for 301 - 500 units 
        } else if (units >= 101 && totalBill <= 300) {
            totalBill = units * 0.50; // RM0.50 per unit for 101 - 300 units
        } else if (units >= 1 && units <= 100) {
            totalBill = units * 0.30; // RM0.30 per units for 100 or less units
        } else {
            System.out.println("Invalid input! The number of units consumed be at least 1. ");
        }
        
        // Display the final electricity bill amount by two decimal places
        System.out.println("Total Electricity Bill: RM " + String.format("%.2f", totalBill));
        scanner.close();
    }
}