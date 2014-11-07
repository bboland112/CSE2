//Brian Boland
//hw09
//This program will use methods to print out a specific patter

import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
    
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
}
    public static int getInt() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number from 1-9: ");//prompting the user to enter a number 1-9
            int n = scan.nextInt();
            
            while ((checkRange(n)) = 0) {//checking on checkRange method to make sure range is fine, reprint prompt if user is incorrect
                System.out.println("You did not enter a number 1-9; Try again: ");
                n = scan.nextInt();
            }
            return n;//return the input value once it passes the test
            
        }
    public static int checkRange(int m){
        if (m>=0 && m <11) {//checking if input is in valid range
            return 1;
        }
        else { return 0; }//return 0 (false) if not in range
        
             }
        
    public static void allBlocks(int x){
        for (int i=1; i<x + 1; i++) {//number being printed
                    for (int k=1; k< (i+1); k++) { //amount of lines of number being printed
                        
                            for (int m=0; m<x-i; m++) {//printing the appropriate amount of spaces before number
                                System.out.print(" ");
                                                    }
                        
                            for (int j=1; j< (2*i); j++) {//amount of number being printed in a line
                                System.out.print(i); 
                                                        }
                        System.out.println();//prints line after sufficient amount of numbers have been printed on a line
                                             }
                            for (int p=0; p<x-i; p++) {//printing the appropriate amount of spaces before dashes
                                System.out.print(" ");
                                                    }                    
                            for (int n=1; n < (2*i); n++) {//printing out appropriate amount of dashes but only after k loop is done
                                System.out.print("-");
                        
                                                         }
                    System.out.println();
                }
        
    }
}
    