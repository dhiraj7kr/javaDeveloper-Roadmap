// Example 1: Here we are taking a student class and creating an array of Students
// with five Student objects stored in the array. The Student objects have
//  to be instantiated using the constructor of the Student class
// and their references should be assigned to the array elements



class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student[] arr; // declaration
        arr = new Student[5]; // initialization
        arr[0] = new Student(1, "Ram");
        arr[1] = new Student(2, "Rahul");
        arr[2] = new Student(3, "Dhiraj");
        arr[3] = new Student(4, "Raj");
        arr[4] = new Student(5, "Gautam");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " 
            + i + ": { " 
            + arr[i].roll_no + "  " 
            + arr[i].name + " }");
        }
    }
}
