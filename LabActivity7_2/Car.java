package LabActivity7_2;
// Car class demonstrating Encapsulation
public class Car {
    // Private field
    private String brand;
    
    // Getter
    public String getBrand() {
        return brand;
    }
    
    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // Main method
    public static void main(String[] args) {
        Car car1 = new Car();
        
        // Set value using setter
        car1.setBrand("Toyota");
        
        // Get value using getter
        System.out.println("Car Brand: " + car1.getBrand());
    }
}