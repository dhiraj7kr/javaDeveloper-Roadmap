// Question:
// Write a Java program that calculates the factorial of a number using a for loop. The program should:

// Ask the user to enter a positive integer.
// Calculate the factorial of the entered number using a loop.
// Print the result.
import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= sc.nextInt();
       double b=Math.sqrt(a);
        System.out.println("Factorail of the number "+ a +" is");
        for(int i=2; i<=b; i++){
            if(a%i == 0){
                System.out.println(i);
            }
        }
    }
}

// output:
// Enter a number: 
// 100
// Factorail of the number 100 is
// 2
// 4
// 5
// 10

// === Code Execution Successful ===
