//Brian Boland
//lab 7
//Loop the Loop
//October 10, 2014

import java.util.Scanner;
public class LoopTheLoop {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int stars = 1;//initializing variables
        int lines = 10;

        System.out.print("Enter an int between 1 and 15:  ");//ask user to enter an int between one and fifteen
        if (scan.hasNextInt()) {//making sure that the user is entering an int
            int nStars = scan.nextInt();//initializing users input as a variable called nStarts
            if (nStars >= 1 && nStars <= 15) {//making sure that the users input is between 1 and 15

                while (stars <= nStars) {//Create while loop that initially prints off number of stars corresponding to user input
                    System.out.print("*");
                    stars++;//increment stars by one
                }
                    System.out.println("");
                    stars = 1;
                    while (stars <= nStars) {//Create next while loop that incrementally increases number of stars on each line until user input number is reached
                        int lineCounter = 0;
           
                         while (lineCounter < stars) {
                            System.out.print("*");
                             lineCounter++;
                                                     }
                stars++;
                System.out.println("");
                }
            }
            else {
                System.out.println("Integer is not within the given range");//telling the user that their input is not within the given range if they input the wrong number
                return;
            }
        }
        else {
            System.out.println("You did not enter an integer");//telling the user they did not enter an integer
            return;
        }
    }
}
