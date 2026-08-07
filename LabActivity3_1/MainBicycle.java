public class MainBicycle {
    
    public static void main(String[] args) {
        
        // Object creation 
        Bicycle bike = new Bicycle();
        
        // Assign value
        bike.brand = "Giant";
        bike.color = "Red";
        bike.gears = 21;
        
        //Method call
        bike.displayBrand();
    }
} 