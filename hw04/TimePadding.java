//Brian Boland
//hw04
//September 23, 2014
//Time Padding
//This program will prompt the user to enter a certain amount of seconds and the program will convert this into conventional time including padding (zeros )

import java.util.Scanner; //importing scanner for user inputs
public class TimePadding { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter the number of seconds:");
        if (myScanner.hasNextInt()) { //Checking to see in input in an int
            int seconds = myScanner.nextInt(); //initializing the input as an int called seconds
            if (seconds < 0) { //if the user input is less than zero the program will print out an error and quit
                System.out.println("Number of seconds entered is not positive");//error print out
                return;//quit program
               }
                    else {
                        int sec = (seconds%60);//calculating number of seconds 
                        int minute = (seconds/60)%60;//calculating number of minutes
                        int hour = (seconds/3600)%60;//calculating number of hours
                    
                            if (sec < 9 && minute < 9) {//padding number of minutes and seconds
                                System.out.println(hour + ":0" + minute + ":0" + sec);
                            }
                            else if (sec < 9 && minute >9) {//padding number of seconds in situations where the number of minutes does not need to be padded
                                System.out.println(hour + ":" + minute + ":0" + sec);
                            }
                            else if (sec > 9 && minute < 9) {//padding number of minutes in situations where the number of seconds does not need to be padded
                                System.out.println(hour + ":0" + minute + ":" + sec);
                            }
                            else if (sec > 9 && minute > 9) {//last case where neither minutes or seconds need to be padded
                                System.out.println(hour + ":" + minute + ":" + sec);
                            }
                        }
                    }
                    else {
                        System.out.println("You did not enter an int"); //printing out an error statement if the input is not an int
                        return;//quit program
                    }
               }
}
        