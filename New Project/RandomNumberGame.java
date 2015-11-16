//author: Ben Xerri
//project 1: guess a random number in [0-100] within 7 guesses


/* Psuedocode: random integer from 0-100
* prompt user for number 0-100
* use while loop to check if user_guess == randomNumber
* while user_guess does not equal randomNumber, prompt for user guess
* create a counter that starts at 7 and counts down with each guess
* if counter = 0 , then exit while loop
*/
import java.util.*;

public class RandomNumberGame{

     public static void main(String []args){
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a random integer from 1-100");
        int user_guess = sc.nextInt();
        
        int count = 7;
        
        while (user_guess != randomNumber){
            count--;
            
            if (user_guess < randomNumber)
                System.out.println("Wrong, your guess was too small");
            else
                System.out.println("Wrong, your guess was too large");
            
            System.out.println("Guess another number, you have " + count + " guesses left");
            user_guess = sc.nextInt();
            
            if (user_guess == randomNumber)
                System.out.println("Congratulations, you're a great guesser!");
            
            if (count == 0) {
                System.out.println("You have no more guesses left.");
                user_guess = randomNumber;
            } // end if statement
            
        } // end while loop
        
        if (user_guess == randomNumber)
            System.out.println("The number was " + randomNumber);
        
        
        
     }
}
