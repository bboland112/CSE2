//Brian Boland
//hw05 BurgerKing
//September 30, 2014
//This program will prompt the user to enter an order at Burger King based on single characters and the program will return what the user has decided to enter

import java.util.Scanner; //importing scanner for user inputs
public class BurgerKing { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
            System.out.println("Enter a letter to indicate a choice of");//prompting user to enter their order based on legend printed below
            System.out.println("Burger (B or b), Soda (S or s), Fries (F or f):");
            String order = myScanner.next();//storing input as a string called order
            if (order.equals("b") || order.equals("B") || order.equals("S") || order.equals("s") || order.equals("F") || order.equals("f")) {//ensuring that the user input is valid
          
            if (order.equals("b") || order.equals("B")) { //checking to see if the user ordered a burger
                System.out.println("Enter A or a for all fixins, C or c for cheese, N or n for nothing:");//if the user did order a burger then we prompt the user to enter their addons
                String burger = myScanner.next();
                if (burger.equals("A") == burger.equals("a")) { //checking if the customer wants all fixins
                    System.out.println("You ordered a burger with all the fixins");
                                        }
                        else if (burger.equals("C") || burger.equals("c")) {//checking if the customer wants cheese
                            System.out.println("You ordered a burger with cheese");
                                                    }
                        else if (burger.equals("N") || burger.equals("n")) {//checking if the customer doesn't want anything on the burger
                            System.out.println("You ordered a plain burger");
                        }
                        else { //if the user doesn't enter a value that is listed above the below print out will occur
                            System.out.println("Invalid entry");
                            return;
                        }
            }
            
            if (order.equals("S") || order.equals("s")) { //checking to see if the user wants a soda
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m):");//prompting the user to enter what kind of soda they want
                String soda = myScanner.next();//storing the kind of soda the user wants as a string called soda
                if (soda.equals("p") || soda.equals("P")) {//checking if the user ordered Pepsi
                    System.out.println("You ordered a Pepsi");
                }
                    else if (soda.equals("c") || soda.equals("C")) {//checking if the user ordered a coke
                        System.out.println("You ordered a Coke");
                    }
                    else if (soda.equals("s") || soda.equals("S")) {//checking if the user ordered a sprite
                        System.out.println("You ordered a Sprite");
                    }
                    else if (soda.equals("m") || soda.equals("M")) {//checking if the user ordered a mountain dew
                        System.out.println("You ordered a Mountain Dew");
                    }
                    else {
                        System.out.println("Invalid entry");//Telling the user that they entered an invalid entry
                        return;
                    }
                    
            if (order.equals("F") || order.equals("f")) {//checking to see if the user ordered fries
                System.out.println("Do you want a large or small order of fries (l,L,s, or S):");//asking the user what size fries they want
                String fries = myScanner.next();//storing the user input as a string variable called fries
                if (fries.equals("l") || fries.equals("L")) {//checking if the user wanted a large fries
                    System.out.println("You ordered large fries");
                }
                    else if (fries.equals("s") || fries.equals("S")){//checking if the user wanted a small fries
                        System.out.println("You ordered a small fries");
                    }
                    else {
                        System.out.println("Invalid entry");//if the user does not enter an l,L,s, or S an invalid entry printout statement will occur
                        return;
                    }
            }
            }
            }
            else {
                System.out.println("Invalid Entry");//second part of very initial if statement to check if the user entered a valid character
                return;
            }
    }
}
          
            
            