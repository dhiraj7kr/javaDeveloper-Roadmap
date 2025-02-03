// Inhertense: Inheritance allows a child class to inherit fields and methods from a parent class.

import java.util.*;
class Book{
    void read(){
        System.out.println("Today I am reading the book ");
    }
}
class Library extends Book{
    void borrowed(){
        System.out.println("That I borrowed from Library");
    }
}
// main class
public class Main{
    public static void main(String[] args){
        Library mybook= new Library();
        mybook.read();
        mybook.borrowed();
    }
}

//output:
//------------------------
// Today I am reading the book 
// That I borrowed from Library
