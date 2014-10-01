//Brian Boland
//hw 05 Boola Boola
//September 30, 2014
//This program will assign 3 variables a random boolean and then randomly assign an &&(AND) or ||(OR) between the booleans to create an equation. The program will then ask the user to answer the equation and the program will tell the user if they are right or wrong

import java.util.Random;
import java.util.Scanner; //importing scanner for user inputs
public class BoolaBoola { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        Random rand = new Random();
    
            boolean variable1 = Math.random() < 0.5;//assigning a random boolean to variable1
            boolean variable2 = Math.random() < 0.5;//assigning a random boolean to variable2
            boolean variable3 = Math.random() < 0.5;//assigning a random boolean to variable3
                    
            int randomDecider = rand.nextInt((4 - 1) + 1) + 1;//finding a random number between 1 and 4 which will decide which combination of && and || will be used (4 different possible combinations of && and ||)
                if (randomDecider == 1) { //or or statement
                    System.out.println("Does " + variable1 + " || " + variable2 + " || " + variable3 + " have the value true(t/T) or false(f/F)? ");//printout statement asking the user to answer the question
                    String input1 = myScanner.next();//storing the users input as a string called input1
                    boolean answer1 = (variable1 || variable2 || variable3);//this is the program figuring out the answer to the proposed boolean equation
                    String checkA1, checkB1;//initializing two variables that will be used to cross the check the users input with the actual answer
                    if (answer1 == false) {
                        checkA1 = "f";
                        checkB1 = "F";
                    }
                        else {
                            checkA1 = "t";
                            checkB1 = "T";//the above if/else statement is translating the answer to the equation(which is in boolean) to a string that we can compare to the user input
                        }
                        if (input1.equals(checkA1) || input1.equals(checkB1)) {
                            System.out.println("Correct");
                        }
                            else {
                                System.out.println("Wrong, Try again");//the above if/else statement is checking to see if the user input is correct or not
                            }
            
                
                   
            }
                else if (randomDecider == 2) {//or and statement
                    System.out.println("Does " + variable1 + " || " + variable2 + " && " + variable3 + " have the value true(t/T) or false(f/F)? ");//printout statement asking the user to answer the question
                    String input2 = myScanner.next();//storing the users input as a string called input2
                    boolean answer2 = (variable1 || variable2 && variable3);//this is the program figuring out the answer to the proposed boolean equation
                    String checkA2, checkB2;//initializing two variables that will be used to cross the check the users input with the actual answer
                    if (answer2 == false) {
                        checkA2 = "f";
                        checkB2 = "F";
                    }
                        else {
                            checkA2 = "t";
                            checkB2 = "T";//the above if/else statement is translating the answer to the equation(which is in boolean) to a string that we can compare to the user input
                        }
                        if (input2.equals(checkA2) || input2.equals(checkB2)) {
                            System.out.println("Correct");
                        }
                            else {
                                System.out.println("Wrong, Try again");//the above if/else statement is checking to see if the user input is correct or not
                            }
                    
                }
                
                else if (randomDecider == 3) { //and or statement
                    System.out.println("Does " + variable1 + " && " + variable2 + " || " + variable3 + " have the value true(t/T) or false(f/F)? ");//printout statement asking the user to answer the question
                    String input3 = myScanner.next();//storing the users input as a string called input3
                    boolean answer3 = (variable1 && variable2 || variable3);//this is the program figuring out the answer to the proposed boolean equation
                    String checkA3, checkB3;//initializing two variables that will be used to cross the check the users input with the actual answer
                    if (answer3 == false) {
                        checkA3 = "f";
                        checkB3 = "F";
                    }
                        else {
                            checkA3 = "t";
                            checkB3 = "T";//the above if/else statement is translating the answer to the equation(which is in boolean) to a string that we can compare to the user input
                        }
                        if (input3.equals(checkA3) || input3.equals(checkB3)) {
                            System.out.println("Correct");
                        }
                            else {
                                System.out.println("Wrong, Try again");//the above if/else statement is checking to see if the user input is correct or not
                            }
                    
               
                }
                else { //and and statement
                    System.out.println("Does " + variable1 + " && " + variable2 + " && " + variable3 + " have the value true(t/T) or false(f/F)? ");//printout statement asking the user to answer the question
                    String input4 = myScanner.next();//storing the users input as a string called input4
                    boolean answer4 = (variable1 && variable2 && variable3);//this is the program figuring out the answer to the proposed boolean equation
                    String checkA4, checkB4;//initializing two variables that will be used to cross the check the users input with the actual answer
                    if (answer4 == false) {
                        checkA4 = "f";
                        checkB4 = "F";
                    }
                        else {
                            checkA4 = "t";
                            checkB4 = "T";//the above if/else statement is translating the answer to the equation(which is in boolean) to a string that we can compare to the user input
                        }
                        if (input4.equals(checkA4) || input4.equals(checkB4)) {
                            System.out.println("Correct");
                        }
                            else {
                                System.out.println("Wrong, Try again");//the above if/else statement is checking to see if the user input is correct or not
                            }
                    
                }
        

        
    }//end method
}//end class
        