//Brian Boland
//hw07
//Number Stacks
//This program will prompt the user to enter a number 1-9 and it will print out a design based on the number using different kinds of loops

import java.util.Scanner; //importing scanner for user inputs
public class NumberStack { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 9: ");
        if (myScanner.hasNextInt()) {//checking if the number inputted by the user is an int
            int input = myScanner.nextInt();//storing the input as an int
            if (input > 0 && input < 10) {//checking if the input is between the range we want
                
                
                //FOR loop portion
                System.out.println("Using for loops: ");
                for (int i=1; i<input + 1; i++) {//number being printed
                    for (int k=1; k< (i+1); k++) { //amount of lines of number being printed
                        
                            for (int m=0; m<input-i; m++) {//printing the appropriate amount of spaces before number
                                System.out.print(" ");
                                                    }
                        
                            for (int j=1; j< (2*i); j++) {//amount of number being printed in a line
                                System.out.print(i); 
                                                        }
                        System.out.println();//prints line after sufficient amount of numbers have been printed on a line
                                             }
                            for (int p=0; p<input-i; p++) {//printing the appropriate amount of spaces before dashes
                                System.out.print(" ");
                                                    }                    
                            for (int n=1; n < (2*i); n++) {//printing out appropriate amount of dashes but only after k loop is done
                                System.out.print("-");
                        
                                                         }
                    System.out.println();
                }
                
               //using WHILE loops, had to change to use if statements because technique used in for loop is not easily translatable to while/do-while loops
               System.out.println("Using while loops: ");
                int a=1;
          while(a<=input){ 
              int b = 0;
              while(b <= a){//will control the number of rows
                  if(b != a){
                      int space = input - a; //will control the amount  of spaces to print
                      int again = 2 * a - 1; //will control what numbers to print
                      
                      while(space > 0){ //will print spaces when condition is met
                          System.out.print(" ");
                          space--;
                      }
                      
                      while(again > 0){//will print appropriate numbers when condition is met
                          System.out.print(a);
                          again--;
                      }
                  }
                  else{//is the same as the loop/if statment above but applies to dashes
                      int space = input-a;
                      int again = (2*a) - 1;
                      
                      while(space > 0){
                          System.out.print(" ");
                          space--;
                      }
                      
                      while(again > 0){
                          System.out.print("-");
                          again--;
                      }
                      
                  }
                  System.out.println();
                  b++;
              }
              
              a++;
          }
          
          System.out.println("Using do while loops");//Using do-while loops will be the exact same as while loops except the first iteration is always performed so you decrease the while part by one
            a = 1;
          do{
              int b = 0;
              do{
                  if(b != a){
                      int space = input-a;
                      int again = (2*a) - 1;
                      
                      if(a != input){
                      
                      do{ 
                          System.out.print(" ");
                          space--;
                      }
                      while(space > 0);
                      }
                      
                      do{
                          System.out.print(a);
                          again--;
                      }
                      while(again > 0);
                  }
                  else{
                      int space = input-a;
                      int again = (2*a) - 1;
                      
                      if(a != input){
                      
                        do{
                             System.out.print(" ");
                             space--;
                      }
                      while(space > 0);
                      }
                      do{
                          System.out.print("-");
                          again--;
                      }
                      while(again> 0);
                      
                  }
                  System.out.println();
                  b++;
              
                  
              } while(b<=a);
              
              a++;
          } while(a<=input);

                
                
            }//end of if statement for checking if it is between 1 and 9
            else { 
                System.out.println("Input is not between 1 and 9");
            }
        }
            else {
                System.out.println("Input is not an int");//telling the user that the input is not an int
            }
        }
        }
