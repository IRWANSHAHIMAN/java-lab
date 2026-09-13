package LabActivity11_2;

public class ImplicitCast {
    public static void main(String[] args) {
        // Declare an integer variable an assign a value
        int i = 100;
        
        // Implicit casting: int to long
        // The value of 'i' (int) is automatically cast to a long type
        long l = i;
        
        // Implicit casting long to float
        // The value of 'i' (long) is automatically cast to a float type
        float f = l;
        
        // Output the values of all three variables
        System.out.println("Int value: " + i); // Prints the integer value
        System.out.println("Long value: " + l); // Prints the long value
        System.out.println("Float value: " + f); // Print the float value
    }
}