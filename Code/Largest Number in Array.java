// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Given an integer array nums, find the maximum element in the array.
import java.util.*;
class Main {
    public static int largestNum(int[] arr1){
        int max =0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>= max){
                max=arr1[1];
            }
        }
            return max;
 }
        
    public static void main(String[] args) {
        int[] arr1 = { 23, 44,22,12,34};
        System.out.println("Largest number in the array is: "+ largestNum(arr1));
    }
}

output:
Largest number in the array is: 44
