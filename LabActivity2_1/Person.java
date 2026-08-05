public class Person {
    String name;
    int age;
    char gender;
    
    public static void main(String[] args) {
        Person p1 = new Person(); // object creation
        
        p1.name = "Ali";
        p1.age = 18;
        p1.gender = 'M';
        
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("gender: " + p1.gender);
    }
}