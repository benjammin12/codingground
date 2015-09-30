/*Author: Ben Xerri
Objective:  Enter a commercial website name starting 
with www, and ends with .com from the keyboard, retrieve the name 
of the website and print it out. For example, given www.google.com, print out google.
*/

/*Psuedocode
Prompt user for the name of a website
Take the user answer and store it in a variable for a string
take that variable and slice off the first 4 letters and the last 4 letters using subString method
print results
*/
import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
    
        System.out.println("Enter a full website address: ");
        
        Scanner user_input = new Scanner(System.in);
        
        String fullWebsite = user_input.nextLine();
        
      String removeWWW_COM = fullWebsite.substring(4,fullWebsite.length()-4);
      
      System.out.println(removeWWW_COM);
      
       
     }
}
