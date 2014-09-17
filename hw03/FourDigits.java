//hw03
//FourDigits
//Brian Boland
//September 16, 2014
//This program will tell the user the first four digits beyond the decimal place of the inputed number

import java.util.Scanner; //importing scanner for user inputs
public class FourDigits { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter a double and I display the four digits to the right of the decimal point-");//prompting the user to input a double that will be manipulated in the program
        double input = myScanner.nextDouble();//initializing the input as a double variable
        
        int input1, input2, input3, input4;//initilizing all variables needed in program
        
        input1 = (int) (input*10000);//these two lines isolate the number in the 10 thousandth decimal place
        input1 = input1%10;
        
        input2 = (int) (input*1000);//these two lines isolate the number in the thousandth decimal place
        input2 = input2%10;
        
        input3 = (int) (input*100);//these two lines isolate the number in the hundreth decimal place
        input3 = input3%10;
        
        input4 = (int) (input*10);//these two lines isolate the number in the tenth decimal place
        input4 = input4%10;
        
        System.out.println("The four digits are " + input4 + input3 + input2 + input1);//A printout statement telling the user the four digits beyond the decimal place
        
    }
}
        
        