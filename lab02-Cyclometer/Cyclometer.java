//lab 2
//Brian Boland
//Cyclometer

public class Cyclometer { //creating the class that is needed in every Java program
    public static void main(String [] args) {
        int secsTrip1=480; //declaring the amount of seconds in Trip 1
        int secsTrip2=3220; //declaring the amount of seconds in Trip 2
        int countsTrip1=1561; //decalring the number of rotations in Trip 1
        int countsTrip2=9037; //decalring the number of rotations in Trip 2
        double wheelDiameter=27.0,  //decalring the diameter of the wheel used in later calculations
        PI=3.14159, // decalring the value of pi used in later calculations
        feetPerMile=5280, //decalring the amount of feet per mile used in later calculations
        inchesPerFoot=12, //decalring the number of inches in a foot for later calculations
        secondsPerMinute=60; //decalring the amount of seconds in a minute used for later calculations
        double distanceTrip1, distanceTrip2, totalDistance; //decalring the variables of the distance for Trip 1, Trip 2, and the total distance which will be the variables printed at the end of the program
       
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+ " minutes and had " + (countsTrip1) +" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+ " minutes and had " + countsTrip2 +" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches for each count, a rotation of the wheel travels the diameter in inches times PI

        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculating the distance for trip 2
        totalDistance=distanceTrip1+distanceTrip2; //calculating the total distance of Trip 1 + Trip 2
        System.out.println("Trip 1 was "+distanceTrip1+" miles");//Printing out the distance for Trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles");//printing out a statement saying the distance for Trip 2
        System.out.println("The total distance was "+totalDistance+" miles");//printing out a statement saying the total distance traveled


    }
}