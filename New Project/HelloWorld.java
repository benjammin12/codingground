import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        Scanner user_input = new Scanner(System.in);
        
        int x = 0;
        int total = 0;
        
        while (x < 10) {
            
            System.out.println("Enter a number: ");
            
            int number = user_input.nextInt();
           
            total = total + number;
            
            System.out.println("Total equals: " + total);
            
            x++;
            
            
            
        }
        
        int average = total / x;
        
        System.out.println("Your average is: " + average);
        
     }
}
