//Brian Boland
//hw04
//September 23, 2014
//Month
//This program will prompt the user to enter an int giving the number of the month and the program will return how many days there are in the month

import java.util.Scanner; //importing scanner for user inputs
public class Month { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter an int giving the number of the month (1-12):");//prompting the user to enter a number for the month
        int month = myScanner.nextInt(); //declaring the user input as an int called month
        
            if (month<0 || month>12) { //This if statement is to check if the number entered matches with a month, as in if it is not between 1 and 12
                System.out.println("Invalid number for month"); //print out telling the user they have entered an invalid number
                return; //quit the program
            }
                else {
                    if (month == 2) { //The program is checking to see if the month is 2 (Feburary) because the amount of days depends on if it is a leap year or not
                        System.out.println("Enter an int giving the year: ");//prompting the user to enter the year
                        int year = myScanner.nextInt();//storing the input as an int called year
                        if (year%4 == 0) { //this is checking if the year is divisible by 4 and if it is it is a leap year
                            System.out.println("The month has 29 days");//Print out the number of days in the leap year
                                        }
                            else { //if the year is not divisible by 4 it is not a leap year and it will print out 28 days
                                System.out.println("The month has 28 days");
                            }
                    }
                    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { //checking to see if the month inputed is a month with 31 days
                        System.out.println("The month has 31 days");
                    }
                    else { //all other months that do not have 31 days or is Feburary will have 30 days
                        System.out.println("The month has 30 days");
                    }
                }
    }
}
        