//Brian Boland
//hw04
//September 23, 2014
//Income Tax
//This program will prompt the user to enter an income in thousands of dollars and it will return the % tax and the dollar amount of tax based on the progressive tax code

import java.util.Scanner; //importing scanner for user inputs
public class IncomeTax { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter an int giving the number of thousands: "); //This line will prompt the user to enter their income in number of thousands
        if (myScanner.hasNextInt()) { //Checking to see in input in an int
            int income = myScanner.nextInt(); //initializing the input as an int called income
            
                if (income<0) { //ensuring that the input is a positive number
                System.out.println("You did not enter a positive int");
                return; //will quit the program if the input is not positive
                }
                else {
                    if (income < 20) { //if the income is less than 20 this portion of the code will run and the program will finish
                        double tax = income*0.05; //calculating the tax
                        System.out.println("The tax rate on $" + income + ",000 is 5%, and the tax is $" + (tax*1000));//Printing out a summary of the findings of the program
                    }
                    
                    else if (income >=20 && income<40) {//if the income is greater than or equal to 20 and less than 40 this portion of the code will run and the program will finish
                        double tax1 = income*0.07;//calculating the tax
                        System.out.println("The tax rate on $" + income + ",000 is 7%, and the tax is $" + (tax1*1000));//Printing out a summary of the findings of the program
                    }
                    
                    else if (income >=40 && income<78) { //if the income is greater than or equal to 40 and less than 78 this portion of the code will run
                        double tax2 = income*0.12;//calculating the tax
                        System.out.println("The tax rate on $" + income + ",000 is 12%, and the tax is $" + (tax2*1000));//Printing out a summary of the findings of the program
                    }
                    
                    else { //this portion of the code is for all other positive inputs that are greater than or equal to 78
                        double tax3 = income*0.14; //calculating the tax
                        System.out.println("The tax rate on $" + income + ",000 is 14%, and the tax is $" + (tax3*1000));//Printing out a summary of the findings of the program
                    }
                }
        }
            else { //this else statement is if the input is not an int, it is a continuation of the very first if statement
            System.out.println("You did not enter an int");//printing out a statement telling the user thaat their input was not an int
            return;//quitting the program if input is not an int
            }
        
    }
}
        
       
        
        