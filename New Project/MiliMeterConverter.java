//author: Ben 
//objective: convert inches to meters

/*

Psuedocode:

millimeters = multiply 1 inch by 25.4 
get user_input for amount of inches
multiply user amount by millimeters and re-sign in new milimeters
print out milimeteres

*/

import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
         
         double miliMeters = (1* 25.4);
         
            Scanner user_input = new Scanner(System.in);
         
            System.out.print("Enter the inches you would like to convert to milimeters: ");
         
                double inches = user_input.nextDouble();
         
                 miliMeters = inches * miliMeters;
         
         System.out.println("Your inches is " + miliMeters + " milimeters.");
         
        
     }
}
