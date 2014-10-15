//Brian Boland
//hw 05
//Roulette
//This program will prompt the user to enter a number from 1 to 38 and it will simulate 100 Route spins, 1000 times. It will tell the user how many times they made a profit, their total winnings, and how many times their number was never matched in a turn (100 spins)

import java.util.Random; 
import java.util.Scanner; //importing scanner for user inputs
public class Roulette { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        Random rand = new Random();
        
        int spinCounter = 0;//initializing a variable to track the amount of turns have happened (100 spins per run)
        int runCounter = 0;//initializing a variable to track the amount of runs have occured (we are doing a total of 1000 runs)
        int cash = 0; //initializing a variable to keep track of how much money has been made
        int win = 0;//variable keeping track of how many times number won
        int loss = 0;//variable to keep track of how many runs we don't get a single win
        int profit = 0;//variable to keep track of how many times we made a profit
        
        System.out.println("Enter a number between 1 and 38 to use for Roulette spin simulation:");//prompting the user to enter a number from 1-38
        if (myScanner.hasNextInt()) {//checking if the input is an int
            int number = myScanner.nextInt(); //storing user input as value to use
            
            if (number > 0 && number < 39) { //checking to see if user input is in correct interval
                while (runCounter < 1000) {//while loop that will run 1000 times
                    while(spinCounter < 100) {//while loop that will run 100 times (100 spins in one turn)
                        int spinNum = (int) ((Math.random() * 38) + 1);//generating a number from 1-38
                        if (spinNum == number) {//if statement checking if the random number is equal to the user input
                            cash += 36;//incrementing the cash amount by 36 each time the user wins
                            spinCounter++;//incrementing the spin count to ensure each round is only 100 spins
                            win++;//adding to the count of how many times the user won
                                                }
                            else { spinCounter++; }//if the random number does not equal the input number the only thing that happens is the spin count will increase by 1
                                            }   
                                if (win == 0) {
                                    loss++;//incrementing the loss count by 1 if the user does not match any random number over 100 spins
                                                }
                                else if (win >= 3) {//if statement to find out if the user made a profit on that set of 100 spins
                                    profit++;
                                                     }
                    runCounter++;//incrementing the amount of runs have happened
                    win = 0;//resetting the win counter so that we can get accurate results
            }
            System.out.println("Your total winnings are $" + cash);//summary of what the user won, how many times they made a profit, and how many times they didnt get a single match
            System.out.println("You made a profit " + profit + " time(s)");
            System.out.println("You did not get a single win " + loss + " time(s)");
        }  
        else {
            System.out.println("You did not enter a valid number");//telling the user if they did not enter a number in the range
        }
        
    }
    else {
                System.out.println("You did not enter an int");//telling the user that they didn't enter an int
                return; }
}
}
        
        
    
        