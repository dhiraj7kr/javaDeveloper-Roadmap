// Online Java Compiler: https://www.programiz.com/online-compiler/8apqKENmReREP
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Book{
    //properties
    String authorName;
    String bookTitle;
    int bookCost ;
    
    //construction
    public Book(String authorName, String bookTitle, int bookCost){
        this.authorName= authorName;
        this.bookTitle= bookTitle;
        this.bookCost= bookCost;
    }
    
    public void showInfo(){
        System.out.println("AuthorName: "+ authorName);
        System.out.println("BookTitle: "+ bookTitle);
        System.out.println("BookCost: "+ bookCost);
        
    }
}
class Main {
    public static void main(String[] args) {
        Book mybook= new Book("J K Rolling ", "Harry Potter ", 1000);
        mybook.showInfo();
        System.out.println("");
        Book mybook2= new Book("Java Script ", "Nokoma kara ", 5000);
        mybook2.showInfo();
        
    }
}

// output:
// AuthorName: J K Rolling 
// BookTitle: Harry Potter 
// BookCost: 1000
-----------------------------
// AuthorName: Java Script 
// BookTitle: Nokoma kara 
// BookCost: 5000

// === Code Execution Successful ===
