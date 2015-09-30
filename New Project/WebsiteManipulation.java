/*Author: Ben Xerri
Objective:  Enter a commercial website name starting 
with www, and ends with .com from the keyboard, retrieve the name 
of the website and print it out. For example, given www.google.com, print out google.
*/

/*Psuedocode
Prompt user for the name of a website
Take the user answer and store it in a variable for a string
take that variable and slice off the first 4 letters and the last 4 letters using subString &.length method
print results
*/

/* Output
if you enter www.youtube.com
results will be youtube
*/
import java.util.Scanner;

public class WebsiteManipulation{

     public static void main(String []args){
    
        System.out.println("Enter a full website address: "); //prompt for website
        
        Scanner user_input = new Scanner(System.in); // new scanner
        
        String fullWebsite = user_input.nextLine(); // store user_input
        
        System.out.println("The full website you entered was: " + "\""+fullWebsite+"\"");
        
      String removeWWW_COM = fullWebsite.substring(4,fullWebsite.length()-4);  // remove first 4 for 'www' and the length -4 for '.com'
      
      System.out.println("After you remove www. and .com, you get: " + removeWWW_COM);  //print results
      
       
     }
}
