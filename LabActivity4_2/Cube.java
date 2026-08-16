package LabActivity4_2;

public class Cube {
    // declare variable lenght, width, height data type double and private
    private double length, width, heigth;
    
    // Default constructor
    Cube() {
        length = 5;
        width = 10;
        heigth = 7;
    }
    
    // Parameterized constructor
    Cube(double length, double width, double heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }
    
    // compute and return volume
    public double calculateVolume() {
        return length * width * heigth;
    }
    
    public static void main(String[] args) {
        // Create object for default and parameterized constructor
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(4.7, 8, 5.9);
        
        // Display volumes
        System.out.println("Volume of cube 1: " + cube1.calculateVolume()); //call method
        System.out.println("Volume of cube 2: " + cube2.calculateVolume()); // call method
    }
}