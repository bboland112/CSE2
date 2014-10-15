//Brian Boland
//lab 3
//Big Mac

import java.util.Scanner; //importing scanner for user inputs 
public class BigMac { //initiating the class
    public static void main(String[] args) {
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
            System.out.print("Enter the number of Big Macs(an integer > 0): ");//prompt the user to enter the number of Big Macs
                int bigMac = myScanner.nextInt();//storing the input as an int called BigMac
            System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");//prompt the user to enter the cost per big mac
                double bigMac$ = myScanner.nextDouble();//storing input as a double called bigMac$
        	System.out.print("Enter the percent tax as a whole number (xx): ");//prompting the user to enter the tax rate
                double taxRate = myScanner.nextDouble();//storing the tax rate as a double variable called taxRate
            taxRate/=100; //changing the tax from a proportion to a percent
            double cost$;//initializing the varible to be used to find the total cost
            int dollars, dimes, pennies; //for storing digits to the right of the decimal point for the cost$
                cost$ = bigMac*bigMac$*(1+taxRate);//get the whole amount, dropping decimal fraction
                dollars=(int)cost$; //get dollars amount
                dimes=(int)(cost$*10)%10;//get dimes amount
                pennies=(int)(cost$*100)%10;//get pennies amount
                System.out.println("The total cost of " + bigMac +" BigMacs, at $"+ bigMac$ +" per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) + "%, is $" + dollars + "."+ dimes + pennies);
}                   //Printing out a summary of what the program found
}
