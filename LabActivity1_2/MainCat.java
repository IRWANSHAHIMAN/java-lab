package LabActivity1_2;


// MainCat class
public class MainCat {
    public static void main(String[] args) {
        //Create an object (instance) of tje Cat class
        Cat myCat = new Cat();
        
        // Access and set the object's fields
        myCat.name = "Whiskers";
        myCat.breed = "Persian";
        myCat.age = 2;
        
        // Call the object's method
        myCat.meow();
        
        // Create another Cat object
        Cat anotherCat = new Cat();
        anotherCat.name = "Milo";
        anotherCat.breed = "Siamese";
        anotherCat.age = 4;
        anotherCat.meow();
    }
}
