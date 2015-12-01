/*
*Objective: Print out multiplication table using nested while loops
* Declare x and column and initialize to be starting point 
*First while loop to run as long as x <= target amount of tables
*Second while loop nested inside of first to run as long as column <= x variable
* increment x inside of first loop and reset column to = 1.
*/



public class HelloWorld{

     public static void main(String []args){
       int x = 1;
       int column = 1;
       
     
        
       while (x <= 10) {
        
         
      
        
        while (column <= x) {
           
            System.out.print(x * column + " ");
            column++;
            
        }
        
          System.out.println();
          column = 1;
          x++;
       
    }
    
     }
}
