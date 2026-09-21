package Exercise;

import java.util.Scanner;

public class CelsiusToFahrentheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt user for Celsius input
        System.out.print("Enter temperature in Celcius: ");
        double celcius = scan.nextDouble();
        
        // Convert formula
        double Farenheit = (celcius * 9 / 5) + 32;
        
        // Display result
        System.out.println("Temperature in Farenheit: " + Farenheit);
        
        scan.close();
    }
}