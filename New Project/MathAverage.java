// Author: Ben Xerri
// Objective:  Prompt user for 10 numbers, then Average.
 
 
 import java.util.Scanner;

public class MathAverage{

     public static void main(String []args){
        Scanner user_input = new Scanner(System.in);
        
        int x = 0; //used to count 
        int total = 0; //total
        
        while (x < 10) {
            
            System.out.println("Enter a number: "); //prompt for number
            
            int number = user_input.nextInt(); 
           
            total = total + number;
            
            System.out.println("Total equals: " + total); //updates total
            
            x++;
            
            
            
        }
        
        int average = total / x;  //divide total by amount counted in x
        
        System.out.println("Your average is: " + average); // output average
        
     }
}
