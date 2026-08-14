package LabActivity2_2;

// Cat2 class
public class Cat2 {
    // 1. public field (Accessible from anywhere)
    public String name;
    
    // 2. private field (Accessible only inside this class)
    private int age;
    
    // 3. protected field (Accessible within same package & subclasses)
    protected String breed;
    
    // 4. default (no modifier) field (accessible within same package)
    String color;
    
    public Cat2 (String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }
    
    // Public method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);  //private accessible here
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
    
    // Getter for private field
    public int getAge() {
        return age;
    }
    
    // Setter for private field
    public void setAge(int age) {
        this.age = age;
    }
}














