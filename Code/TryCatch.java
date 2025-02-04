import java.util.*;
public class Main{
    public static void main(String[] args){
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a=sc.nextInt();
            System.out.println("Enter second number: ");
            int b= sc.nextInt();
            
            int result = a/b;
            System.out.println("Result: "+ result);
            
        }catch( ArithmeticException e){
            System.out.println("Exception caught: " + e.getMessage());
            
        }
        System.out.println(" program Contiue...");
    }
}

//OUTPUT:
// Enter first number: 
// 11
// Enter second number: 
// 0
// Exception caught: / by zero
//  program Contiue...
