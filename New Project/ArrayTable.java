


public class ArrayTable{

     public static void main(String []args){
         
         System.out.println("Index\tValue\tSum");
         int arr[]= {4,6,7,8,0,1};
         int sum = 0;
         
       for (int i = 0; i < arr.length ; i ++) {
       
        sum += arr[i];
        
       
        System.out.println(i + "\t" + arr[i] + "\t" + sum);    
        
       
        
       }
     }
     
}