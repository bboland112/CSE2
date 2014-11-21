//Brian Boland
//lab05-RandomGames

import java.util.Scanner;
public class RandomGames {
    public static void main (String [] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.print("Let's play a game.  For Roulette, type in (R/r). For Craps, type in (C/c). To pick a random card from a deck, type in (P/p).  ");
                        //asking the user to enter a character relating to the game that they want to play
        String choice = myScanner.next();
        boolean oneLetter = choice.length() == 1;//the purpose of this line is so that the program will only accept inputs with one letter
            if (oneLetter) {//this if statement will run if the user has enetered a single letter (i.e. oneLetter is true)
            
            //Create if statement only accepting R,r,C,c,P,p for the three game choices
            if (choice.equals("R") || choice.equals("r")) {//starting an if statement if the user inputs R or r
                
                int roulette = (int) (Math.random()*38) + 1;//this is initializing a variable called roulette that is a random number between 1 and 38
                    switch (roulette) {//Create switch statement that prints out the random roulette integer
                        case 38: System.out.println("Roulette:  00"); 
                        break;
                        default: System.out.println("Roulette:  " + roulette);
                }
            }
            else if (choice.equals("P") || choice.equals("p") || choice.equals("C") || choice.equals("c")) {
                System.out.println("Not implemented yet");
            }
            else {
                System.out.println("You did not enter a valid choice");//telling the user they did not enter a letter that corresponds with a game
                return;
            }
        }
        else {
            System.out.println("You entered more than one letter");//telling the user that they entered more than one letter
            return; 
            }
        
    }
    
}

        
        
