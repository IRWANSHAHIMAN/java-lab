package Exercise2;

import java.util.Scanner;

public class Bus {
    
    // Private attributes (Encapsulation)
    private String model;
    private int year;
    private double price;

    // Default constructor
    public Bus() {
        // No values are initialized
    }

    // Parameterized constructor (Constructor Overloading)
    public Bus(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter and setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to accept bus information
    public void acceptBusInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter bus model: ");
        setModel(input.nextLine());

        System.out.print("Enter bus year: ");
        setYear(input.nextInt());

        System.out.print("Enter bus price: ");
        setPrice(input.nextDouble());
    }

    // Method to display bus information
    public void displayBusInfo() {
        System.out.println("\nBus Details:");
        System.out.println("Bus Model: " + getModel());
        System.out.println("Bus Year: " + getYear());
        System.out.println("Bus Price: RM" + getPrice());
    }
}
