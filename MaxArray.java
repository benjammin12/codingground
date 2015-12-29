/* Objective: Create an array and find the max and min values of it
*
*   Declare an array and create  min & max values
*   Read through the array with a for loop with i , if the max array at index i
*   Then set the max to be the array position at the current i
*/

public class MaxArray{

     public static void main(String []args){
        int [] array1 = new int[10];
        int [] array2 = { 3 , 22 , 13 , 1 , 11};
        
        for (int i = 0; i < array2.length; i++)
            System.out.println(array2[i]);
            
            int max = array2[0];
            int min = array2[0];
            
            for(int i = 0; i < array2.length ; i++) 
                if (array2[i] > max)
                    max = array2[i];
                    
           
            for (int i = 0; i < array2.length ; i++)
                if (array2[i] < min)
                    min = array2[i];
                
                    
            System.out.println("Max is " + max);
            System.out.println("Min is " + min);
     }
}
