import java.util.Random;

public class ComputerGuessesRandom{

     public static void main(String []args){
        
        int start = 0;
        int end = 100;
      
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(start+end);
        int count = 0;
        
        while (count <= 7) {
            
            count++;
            
            int mid = (start + end)/2;
            
            if (randomNumber == mid) {
                System.out.println("congrats" + randomNumber);
                break;
            }
            else if (randomNumber < mid){
                System.out.println("Too small " + mid);
              end = mid;
           
             
            }
            else {
                System.out.println("Too big " + mid);
                
                start = mid;
              
              
                
            }
            
        }
        
        
     }
}
