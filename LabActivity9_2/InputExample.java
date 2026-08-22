package LabActivity9_2;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        // Reading different types of input
        System.out.println("Enter a boolean value (true/false): ");
        boolean isValid = scanner.nextBoolean();
        
        System.out.println("Enter a byte value: ");
        byte byteNumber = scanner.nextByte();
        
        System.out.println("Enter a double value: ");
        double doubleNumber = scanner.nextDouble();
        
        System.out.println("Enter a float value: ");
        float floatNumber = scanner.nextFloat();
        
        System.out.println("Enter an int value: ");
        int intNumber = scanner.nextInt();
        
        scanner.nextLine(); // consume leftover newline
        
        System.out.println("Enter a String (one line): ");
        String text = scanner.nextLine();
        
        System.out.println("Enter a long value: ");
        long longNumber = scanner.nextLong();
        
        System.out.println("Enter a short value: ");
        short shortNumber = scanner.nextShort();
        
        // Displaying the input values
        System.out.println("\n--- Output ---");
        System.out.println("Boolean value: " + isValid);
        System.out.println("Byte value: " + byteNumber);
        System.out.println("Double value: " + doubleNumber);
        System.out.println("Float value: " + floatNumber);
        System.out.println("Int value: " + intNumber);
        System.out.println("String value: " + text);
        System.out.println("Long value: " + longNumber);
        System.out.println("Short value: " + shortNumber);
        
        scanner.close();
    }
}