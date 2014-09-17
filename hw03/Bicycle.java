//hw03
//Bicycle
//Brian Boland
//September 16, 2014
//This program will prompt the user to enter two numbers, the number of counts on the cyclometer and the number of seconds and it will output the total distance, total time, and average speed

import java.util.Scanner; //important scanner for user inputs
public class Bicycle { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter number of counts:"); //prompt the user to enter the number of counts on cyclometer
        int count = myScanner.nextInt(); //declares the input as a variable called count
        System.out.println();//skip a line to seperate prompts for inputs
        System.out.print("Enter number of seconds:"); //prompt the user to enter the number of seconds during cyclometer counting
        int time = myScanner.nextInt(); //declares the input as a variable called time
        System.out.println();//skips a line in the output for organizational purposes
        
            double wheelDiameter=27.0,  //decalring the diameter of the wheel used in later calculations
            PI=3.14159, //decalring the value of pi used in later calculations
            feetPerMile=5280, //decalring the amount of feet per mile used in later calculations
            inchesPerFoot=12, //decalring the number of inches in a foot for later calculations
            secondsPerMinute=60; //decalring the amount of seconds in a minute used for later calculations
        
            double distanceTrip=(count*wheelDiameter*PI)/(feetPerMile*inchesPerFoot); //calculating the distance of the trip
            double timeTrip = time/secondsPerMinute; //calculating the time in minutes that the trip took
            double speed = distanceTrip/(timeTrip/60); //calculating the avergae speed in MPH
            
            distanceTrip = (distanceTrip*100);//The next three lines are so that the output distance has limited decimal places, without this piece is would go out to too many decimal points
            int distanceTrip2 = (int) distanceTrip;
            distanceTrip = distanceTrip2/100.0;
            
            speed = (speed*100);//The next three lines are so that the output speed is reported to two decimal places
            int speed2 = (int) speed;
            speed = speed2/100.0;
            
        
                System.out.println("The distance was " + distanceTrip + " miles and took " + timeTrip + " minutes."); //This line will print out a statement summarizing how long the trip took and the total distance in miles
                System.out.println("The average mph was " + speed + " MPH."); //This line will print out a statement telling the user what the average speed is
    }
}
        
        
        
        
