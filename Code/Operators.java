// Enter the first number: 10
// Enter the second number: 5
// Addition: 10 + 5 = 15
// Subtraction: 10 - 5 = 5
// Multiplication: 10 * 5 = 50
// Division: 10 / 5 = 2
// Modulus: 10 % 5 = 0
// Is num1 greater than num2? true
// Are both numbers positive? true
// Incremented num1: 11
// Decremented num2: 4
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a =sc.nextInt();
        System.out.println("Enter the second number: ");
        int b =sc.nextInt();
        
        System.out.println("Addition :" + a+ " + " +b+" = "+ (a+b));
        System.out.println("Substarction :" + a+ " - " +b+" = "+ (a-b));
        System.out.println("Multiplication :" + a+ " * " +b+" = "+ (a*b));
        System.out.println("Division :" + a+ " / " +b+" = "+ (a/b));
        System.out.println("Modules :" + a+ " % " +b+" = "+ (a%b));
        if(a>b){
            System.out.println("a is greater then b " + a+ " > " +b);
        }else{
            System.out.println("b is greater then a " + b+ " > " +a);
        }
        System.out.println("increment value of first number is "+ (++a) );
        System.out.println("increment value of second number is "+ (++b) );
    }
}

// output:

// Enter the first number: 
// 23
// Enter the second number: 
// 12
// Addition :23 + 12 = 35
// Substarction :23 - 12 = 11
// Multiplication :23 * 12 = 276
// Division :23 / 12 = 1
// Modules :23 % 12 = 11
// a is greater then b 23 > 12
// increment value of first number is 24
// increment value of second number is 13

// === Code Execution Successful ===
