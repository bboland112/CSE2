//Brian Boland
//HW8
//10/28/14

import java.util.Scanner;
public class HW8{
    public static void main(String []arg){
        char input;
        Scanner scan=new Scanner(System.in); 
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input=getInput(scan,"Cc");//will call on first getInput method
        System.out.println("You entered '"+input+"'"); 
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); 
        input=getInput(scan,"yYnN",5); //will call on second getInput method
        if(input!=' '){ 
        	System.out.println("You entered '"+ input +"'");//printing out conclusions of second getInput method
                        }
        input=getInput(scan,"Choose a digit.","0123456789"); //will call on third getInput method
        System.out.println("You entered '"+input+"'");//printing out conclusion of third getInput method
  } 
  
  
  public static char getInput(Scanner in, String word){ //This is the start of the first getInput method
      char[] charArray = word.toCharArray(); //takes the input word and changes it from a char to an array so that it can be searched through in a more efficient way
      do{
          String str = in.next(); 
          char letter = str.charAt(0);  
          
      for (int x = 0; x < charArray.length; x++){//searching through array
          if(charArray[x] == letter){ //checking if any of the letters in the array match the user input
          return letter; //will return the letter that matches
          }
      }
      System.out.print("You did not enter a character from the list '" + word +"'; try again-");//if the above for loop runs and cannot find a match, this line will run and prompt the user to try again
      }
      while(true); //this will cause the program to keep prompting the user to enter a character until it matches
      
      
      
  }
  
  
  public static char getInput(Scanner in, String word, int z){//This is the start of the second getInput method
      char[] charArray = word.toCharArray();//same as the first step in the first getInput method
      int attempt = z;
      do{
          String str = in.next();
          char letter = str.charAt(0);
       for (int x = 0; x < charArray.length; x++){//same for loop as the for loop in first getInput method to check if user input matches the needed characters
          if(charArray[x] == letter){
          return letter;
          }
      }
      System.out.print("You did not enter one of these characters: '" + word +"'; try again-");
      attempt--; //decreases the attempt variable by one so that the program will limit the amount of times the user has until the program will move on
      } 
        while(attempt > 0); //once the attempt counter reaches 0, the program will print a line and then tell the user that they have not succesfully matched a character after z amount of times(in this case 7 times)
            System.out.println("");
            System.out.println("You failed after " + z + " tries");//error message
            return ' ';
  }
  
  
  public static char getInput(Scanner in, String prompt, String word){//This is the start of the third getInput method
      char[] charArray = word.toCharArray();
      boolean count = true;
      
      do{
       System.out.println(prompt);//this line will print out the prompt in the main method
       System.out.print("Enter one of:");//this will prompt the user to enter the following characters which will be controlled by the following for loop to surround each character with ''
       for (int y = 0; y<charArray.length; y++){
           System.out.print("'"+ charArray[y] + "'");
       }
       System.out.print("-");
       
       String str = in.next();
       char letter = str.charAt(0);
       
       
       if (str.length() == 1){ //this if statement will run if the user inputs a single character
          for (int x = 0; x < charArray.length; x++){
             if(charArray[x] == letter){//checking if the character entered is in the array/one of the characters requested
             return letter;
             }
          }
          System.out.println("You did not enter an acceptable character");//error message that appears if character does not match
       }
          else{ 
        System.out.println("Enter exactly one character");//error message that appears if more than one character is entered
        }
        }while(count);
      
      return ' ';
      
      
      
  }
  
  
  
}