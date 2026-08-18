package LabActivity5_2;

class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 20);
        
        System.out.println("Calling displayInfo() with no parameters:");
        s1.displayInfo();
        
        System.out.println();
        
        System.out.println("Calling dispalyInfo() with one parameter:");
        s1.displayInfo("Computer Science");
        
        System.out.println();
        
        System.out.println("Calling displayInfo() with two parameters:");
        s1.displayInfo("Information Technology", 3.75);
    }
}