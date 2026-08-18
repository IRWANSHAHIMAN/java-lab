package LabActivity5_2;

// Student Class
public class Student {
    String name;
    int age;
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method 1: displayInfo with no parameters
    public void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
    
    // Method 2: displayInfo with one parameters
    public void displayInfo(String course) {
        System.out.println("Student name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Course: " + course);
    }
    
    // Method 3: displayInfo with two parameters
    public void displayInfo(String course, double cgpa) {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Course: " + course);
      System.out.println("Student CGPA" + cgpa);
    }

}