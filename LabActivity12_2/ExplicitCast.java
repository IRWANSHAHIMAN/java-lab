package LabActivity12_2;

public class ExplicitCast {
    public static void main(String[] args) {
        // Declare and initialize a double variable
        double d = 100.04;
        
        // Explicitly cast the double value to a long
        // The fractional part (.04) will be truncated
        long l = (long)d;
        
        // Explicitly cast the long value to an int
        // Since the value fits in the range of int, no data loss occours here
        int i = (int)l;
        
        // Print the original double value
        System.out.println("Double value: " + d);
        
        // Print the long value after casting (fractional part is dropped)
        System.out.println("Long value" + l);
        
        // Print the int value after casting (no further truncation)
        System.out.println("Int value: " + i);
    }
}