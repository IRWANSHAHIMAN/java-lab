package LabActivity6_2;

public class Calculator {
    
    // method 1: sum with two integers
    public int sum(int a, int b) {
        return a + b;
    }
    
    // Method 2: sum with three integers
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: sum with two doubles
    public double sum(double a, double b) {
        return a + b;
    }
    
    // Main method inside the class
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling overload methods
        System.out.println("Sum of 2 integers: " + calc.sum(5,10));
        System.out.println("Sum of 3 integers: " + calc.sum(2,4,6));
        System.out.println("Sum of 2 doubles: " + calc.sum(3.5,4.8));
    }
}
