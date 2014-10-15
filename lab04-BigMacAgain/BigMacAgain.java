//lab 04
//Brian Boland 

import java.util.Scanner; //importing scanner for user inputs 
public class BigMacAgain { //initiating the class
    public static void main(String[] args) {
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter number of Big Macs: ");
        if (myScanner.hasNextInt()) 
            int input = myScanner.nextInt();
            else {
                System.out.println("You did not enter an int");
                return;
            }
            if (input > 0) 
                System.out.println("You ordered " + input + " Big Macs for a cost of " + input + "x2.22 = $" + (input*2.22));
                else {
                    System.out.println("You did not enter an int > 0");
                    return;
                }
            }        
         }
    

        
