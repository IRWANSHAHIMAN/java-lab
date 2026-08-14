package LabActivity2_2;

public class MainCat2 {
    public static void main(String[] args) {
        Cat2 myCat = new Cat2("Whiskers", 3, "Persian", "White");
        
        // Public field -> accessible
        System.out.println("Cat name: " + myCat.name);
        
        // Protected & default -> accessible
        System.out.println("Breed: " + myCat.breed);
        System.out.println("Color: " + myCat.color);

        // Private field -> NOT directly accessible (Error if uncommented)
        // System.out.println("myCat.age");
        
        // Accessible private field using getter & setter
        myCat.setAge(5);
        System.out.println("Update Age: " + myCat.getAge());
        
        // Call public method
        myCat.displayInfo();
        
        System.out.println();
    }
}



