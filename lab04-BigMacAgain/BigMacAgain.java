//Brian Boland
//lab04


import java.util.Scanner;
public class BigMacAgain {
    public static void main (String [] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        int numberBigMacs; //declaring all variables needed
        double costBigMac = 2.22;
        double costFries = 2.15;
        double totalCostBigMac;
    
        System.out.print("How many Big Macs would you like to order? (must be an integer>0)  ");//asking the user to input how many big macs they want
        if(myScanner.hasNextInt()) {//making sure the input is an integer
            numberBigMacs = myScanner.nextInt(); //initializing input variable 
            }
            else {
            System.out.println("You did not enter an integer");
            return;
                }

        if (numberBigMacs > 0) { //making sure input is positive
            totalCostBigMac = costBigMac*numberBigMacs;//total cost of big mac
            totalCostBigMac = totalCostBigMac*100; //This line and next 2 allow for only 2 decimal places
            int totalCostBigMac2 = (int) totalCostBigMac;
            totalCostBigMac = totalCostBigMac2/100.0;
            System.out.println("You ordered " + numberBigMacs +" Big Macs for a cost of "+ numberBigMacs +"*"+ costBigMac + " = " + totalCostBigMac);
        }
            else {
                System.out.println("You entered an integer that is less than zero");
                return;
        }

        
        System.out.print("Would you like an order of fries?  ");//asking the user if they want fries
        String answer = myScanner.next();
        if (answer.equals("Y") || answer.equals("y")) {//checking the user's response to see if they want fries
            totalCostBigMac = totalCostBigMac + costFries;//evaluating the total cost of big mac
            System.out.println("You ordered fries at a cost of:  "+ costFries);//summarizing what the user has ordered and how much it costs
            System.out.println("The total cost of your meal is:  "+ totalCostBigMac);
        }
        else if (answer.equals("N") || answer.equals("n")) {
            System.out.println("The total cost of your meal is:  "+totalCostBigMac);
        }
        else {
            System.out.println("You did not answer Y/y or N/n");
        }
         }
}

    

        
