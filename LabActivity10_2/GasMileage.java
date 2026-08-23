package LabActivity10_2;

import java.util.Scanner;// Importing the Scanner class for user input

public class GasMileage { // Class Declaration
    public static void main(String[] args) { // Main method
        // Variable Declarations
        int miles; // Variable to store the number of miles driven
        double gallons; // Variable to store amount of fuel used in gallons
        double mpg; // Variable to store the calculated miles per gallon (MPG)
        
        // Creation a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompting the user to enter the number of miles driven
        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt(); // Reading an integer input for miles
        
        // Prompting the user to enter the gallons of fuel used
        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble(); // Reading a double input for gallons
        
        // Calculating miles per gallon (MPG)
        mpg = miles / gallons; // MPG is calculated as miles divided by gallons
        
        // Displaying the calculated MOPG value formatted to two decimal places
        System.out.println("Miles Per Gallon: " + String.format("%.2f", mpg));

        scan.close();
    }
}