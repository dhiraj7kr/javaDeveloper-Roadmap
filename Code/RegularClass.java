//File name should be Car.java
// Regular Class (or Concrete Class)
import java.util.*;

 public class Car {
     // Fields (properties)
    String model;
    String brand;
    int price;
    
    // Constructor to initialize the fields
    public Car(String brand, String model, int price ){
        this.model=model;
        this.price=price;
        this.brand=brand;
        
    }
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
    
    
    public static void main(String[] args) {
        
        Car mycar = new Car("Ford", "Truck",3000000);
        mycar.display();
        
        mycar.brand="BMW";
        mycar.model ="Track";
        mycar.price= 2000000;
        
        mycar.display();
    }
}
