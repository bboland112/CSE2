//Brian Boland
//hw06
//Root
//This program wil find the approximate square root of a double that the user inputs


import java.util.Scanner; //importing scanner for user inputs
public class Root { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        double low = 0;
        double high = 100000;
        double middle = 0;
        
        System.out.println("Enter a double that is greater than 0:");//prompting the user to enter a double greater than 0
        if (myScanner.hasNextDouble()) {//checking if the input is a double
            double num = myScanner.nextDouble();//initialize the input number
            if (num > 0) {//checking if the number is greater than 0
           
                while ((0.0000001*(1+num)) < (high-low)) {//checking the "tolerance" of how close the square root is
                    high = num+1;//going through the algorithm of finding the square root
                    low = 0;
                    middle = (low + high)/2;
                        if ((middle*middle)>num) {
                        high = middle;
                                                }
                        else { low = middle; }
                    }
                    System.out.println("The square root of " + num +" is " + high);//printing out what the algorithm finds as the square root
            }
            
            else {
            System.out.println("Number must be greater than 0");//else statement to see if the number is greater than 0
        }
        }
        else {
            System.out.println("Input is not a double");//else statement showing the user they have not entered a double
        }
    }
}
