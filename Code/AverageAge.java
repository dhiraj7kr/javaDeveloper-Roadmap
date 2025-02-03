// Online Java Compiler
// Questin 1. Declare two variables: one for storing the user's age (integer type) and another for storing the user's height in meters (double type).
// Use an operator to calculate if the user is taller than the average height (175 cm).


import java.util.*;
class AverageAge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter your Name:");
        String name =sc.nextLine();
        System.out.println("Enter two age of the user:");
        int age =sc.nextInt();
        Scanner dc =new Scanner(System.in);
        System.out.println("Enter the height of the user in CM");
        double height =dc.nextDouble();
        
        if(height >175.0){
            System.out.println("User: "+ name +" with age "+ age+ " Has height "+height +" cm which is more then Average height.");
        }else{
           System.out.println("User: "+ name +" with age "+ age + " Has height "+ height +" cm  which is less then Average height.");
            
        }
    }
}


// output:

// Enter your Name:
// Dhiraj Kumar
// Enter two age of the user:
// 23
// Enter the height of the user in CM
// 174
// User: Dhiraj Kumar with age 23 Has height 174.0 cm  which is less then Average height.

// === Code Execution Successful ===
