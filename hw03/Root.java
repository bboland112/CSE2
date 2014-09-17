//hw03
//Root
//Brian Boland
//September 16, 2014
//This program will ask the user to input a double and it will print out an estimated cubed root of the inputed number.

import java.util.Scanner; //importing scanner for user inputs
public class Root { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter a double, and the cubed root will be printed: "); //This line is a prompt asking the user to enter a double
        double input = myScanner.nextInt(); //initilizing the input as a double variable called input
        double guess = input/3; //dividing the input by 3 is the first part in estimating the cubed root
        double guess2 = (2*guess*guess*guess+input)/(3*guess*guess); //the next 5 lines are to narrow down the estimate closer to the actual cubed root of the input
        double guess3 = (2*guess2*guess2*guess2+input)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+input)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+input)/(3*guess4*guess4);
        double guess6 = (2*guess5*guess5*guess5+input)/(3*guess5*guess5);
        System.out.println("The cube root is " + guess6);//this is a print out statement that will tell the user what the estimated cubed root of the input is
        double cubed = guess6*guess6*guess6; //initializing a variable to be printed out as the estimated cubed root, cubed
        System.out.println(guess6 + "*" + guess6 + "*" + guess6 + "=" + cubed);//this is a print out statement that tells the user how close the estimated cubed root is to the actual value
        
    }
}