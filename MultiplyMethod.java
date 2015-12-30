/* Objective: Simple Multiplication Method.  Create a method that will multiply 2 integer values
* Print out the values to the screen.

*/

public class MultiplyMethod{

     public static void main(String []args){
        System.out.println("Hello World, lets create a method to multiply 2 values");
        int value = multiplyValues(4,5);
        System.out.println(value);
        
     }
        
     public static int multiplyValues (int a, int b) {  //takes 2 integers as parameters
  // use static so this method is available to all methods of this class       
         return a*b; 
         
     }
}
