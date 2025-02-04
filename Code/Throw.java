import java.util.*;

public class Throw{
     static void readFile() throws IOException{
        FileReader file= new FileReader("text.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.prinltn(br.readLine());
        br.close();
    }

// public class Main{
    public static void main(String[] args){
        try{
            readFile();
            
        }catch( IOException e){
            System.out.println("File cannot be found or read : " + e.getMessage());
            
        }
        System.out.println(" program Contiue...");
    }
}
