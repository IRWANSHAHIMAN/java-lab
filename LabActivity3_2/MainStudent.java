package LabActivity3_2;

// MainStudent
public class MainStudent {
    public static void main(String[] args) {
        // Using Default Constructor
        Student student1 = new Student();
        System.out.println("Default Constructor");
        student1.displayInfo();
        
        System.out.println();
        
        // Using Parameterized Constructor
        Student student2 = new Student("Ali", 20);
        System.out.println("Parameterized Constructor");
        student2.displayInfo();
    }
}