class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
 public class Main {
    static void validAge(int age ) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 and above ");
            }
            else
            {
            System.out.println("Valid age for voting !! ");
        }
        
    }
    public static void main(String[] args){
        try{
            validAge(17);
        }catch(InvalidAgeException e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}


// output:

// Exception: Age must be 18 and above 
