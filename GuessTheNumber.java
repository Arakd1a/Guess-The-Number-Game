
package GuessTheNumber;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author mbarker
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        mainMenu();  
    }
    
    
        
    public static void mainMenu(){
        int optionNumber = 0;
        Scanner scannner = new Scanner(System.in);  
        System.out.println("MAIN MENU" + "\n" + "Pleaase Choose: " 
                + "\n" + " 1. Guess The Number");
        optionNumber = scannner.nextInt();
        while (optionNumber == 1){
            guessNumberGame();
        }
   }
    
    
    public static void guessNumberGame(){
     
     int answer = (int )(Math.random() * 50 + 1); 
     int guess = 0;
     int attempts = 0;
     
     
            Scanner scannner = new Scanner(System.in);  
            System.out.println("I'm thinking of a number.");
            while (answer != guess) {
          
                System.out.println("What is your guess?");

                guess = scannner.nextInt(); 
                   if(guess < answer){
                   System.out.println("Number is higher than " + guess);
                   attempts++;
                 
            
                   
                       } else {
                       System.out.println("Number is lower than than " + guess);
                       attempts++;
                      
                       
                   }



                } 
            System.out.println("You guessed the correct number of " 
            + answer + " in " + attempts + " attempt(s)");
            pressAnyKeyToContinue();
            mainMenu();
         

   }
 
    public static void clearConsole(){
        int count = 0;
        while(count < 10){
            System.out.println("\n");
            count++;
            }
    }
 
    
     public static void pressAnyKeyToContinue()
 { 
        System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }
   
  
}
