// Enter the first number: 10
// Regular Class (or Concrete Class)
import java.util.*;

abstract class AbstractClass {
    abstract void sound(); // abstarct method
    
    void breathe(){ // regular method
        System.out.println("It si breathing");
    }
}
    class Dog extends AbstractClass{
        void sound(){
           System.out.println("Bark");  
        }
       
    }
public class Main{
    public static void main(String[] args) {
        
        Dog dog= new Dog();
        
        dog.sound(); // output: Bark
        dog.breathe();// output: It si breathing
    }
}
