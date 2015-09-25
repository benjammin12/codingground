//author Ben
/*
*Example of array
*Example of StringBuilder
*Example of indexOf and substring Methods
*/

public class HelloWorld{

     public static void main(String []args){
       int arr1[]  = {4,5,11,3,0,3,2};  //set an array and declare its values
       
     
        String greeting1 = "Hello, nice to meet you"; 
        int splitgreeting = greeting1.indexOf('l'); //Try printing this out and see what you get!
        String substring1 = greeting1.substring(5,11); // Cut the string greeting one to say ', nice' based on index
        System.out.println("Cut out from index values 5-11 and get: " + substring1); //print substring
        
        String editString =new StringBuilder("Lets put this into reverse").reverse().toString();  //use StringBuilder to reverse an item
        System.out.println("var editString in reverse: \t" + editString); //print it out
       
        System.out.println("Position\tItem"); //used to position title header for array
       
       for (int i = 0; i < arr1.length; i++) { // run a for loop for the length of the array
           
           if (arr1[i] > 2){    //print out array values greater than 2
           
                System.out.println(i+"\t\t" + arr1[i]);  //use two '\t' methods to spread out your array table
           
           }
       }
       
     }
}
