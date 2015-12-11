/* Auhtor: Ben 
 * Objective: Create an array and create a for loop to search for the value in 
 * The array, if it's there, print out sucess message
 */

import java.util.Scanner;

class BreakWithLabelDemo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to search for in our database"  +
        "of lucky numbers:  ");
        int seekNumber = sc.nextInt();
        
        
        int[] myArray = { 4, 3 , 12, 34, 88, 14}; // declare array
        
        int i; //create integer for i, you declare it out of your for loop 
        //or else compiler will not be able to find out what i is on line 32
        boolean numberFound = false; //false because we have not found our value yet
        
        for (i = 0; i < myArray.length; i++) //for loop running the length of array 
            if (myArray[i] == seekNumber) { // if seek number is in loop
                numberFound = true;  // number found is true
                break;
            } 
           
        
            if (numberFound) // if number found is true 
                System.out.println("Found value at: " + i);
            else
                System.out.println("Number not found");
            
        
    }
}
