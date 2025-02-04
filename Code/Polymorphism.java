// Polymorphism:
// Method Overriding (Runtime Polymorphism): A subclass provides a specific implementation of a method already defined in its parent class.
// Method Overloading (Compile-time Polymorphism): Multiple methods with the same name but different parameters.

//polymorphism -- Over ridding

import java.util.*;
class Animal{
    void makesound(){
        System.out.println("Hello this is the animal");
    }
}
class Cat extends Animal{
    void makesound(){
    System.out.println("The cat meow ");
}
}
class Main{
    public static void main(String[] args){
        Animal myAnimal =new Cat(); // upcasting
        myAnimal.makesound(); // Calls Cat's method (Overridden)
    }
}
//OUTPUT:
// The cat meow

Question 2: OverLoading in polymorphism

  //polymorphism -- Over ridding

import java.util.*;
class Sum{
    int add( int a, int b, int c){
        int sum= a+b+c;
        System.out.println("Sum of the number is: "+ sum);
        return sum;
    }


    int add( int a, int b){
        int sum= a+b;
    System.out.println("Sum of the number is: "+ sum);
        return sum;
}
}
class Main{
    public static void main(String[] args){
        Sum mySum = new Sum(); 
        mySum.add(5, 20); 
        mySum.add(3,4,6);
    }
}

//OUTPUT:
Sum of the number is: 25
Sum of the number is: 13
