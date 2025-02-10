// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        // int [] arr1 = {12, 34,0, 55, 445,0,765};
        // int [] arr2 = new int[arr1.length];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n =sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        System.out.println("Enter the "+ n+ " number for the array: ");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        int nonZeroIndex =0;
        int zeroIndex =arr1.length-1;
        for (int i=0; i< n; i++){
            if(arr1[i] !=0){
                arr2[nonZeroIndex]= arr1[i];
                nonZeroIndex++;
            }
        }
        for (int i=0; i< n; i++){
            if(arr1[i] ==0){
                arr2[zeroIndex]= arr1[i];
                zeroIndex--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr2[i]+ " ");
        }
        
    }
}
output:

Enter the length of the array
5
Enter the 5 number for the array: 
4
5
5
0
5
4 5 5 5 0 
