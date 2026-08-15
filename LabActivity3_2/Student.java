package LabActivity3_2;

// Student class
public class Student {
    String name;
    int age;
    
    // 1. Default Constructor (no parameters)
    public Student() {
        this.name = "Not Assigned";
        this.age = 0;
    }
    
    // 2. Parameterized Constructor (with parameters)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
}