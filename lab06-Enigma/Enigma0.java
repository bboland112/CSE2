//Brian Boland
//Lab06 Enigma0

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] args){ //[] is supposed to be directly after String and then a space then args
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in); 
    int n=0;//must initialize n outside of the if scopes so that it can be used throughout the program
    if(scan.hasNextInt()){
        n = scan.nextInt(); //do not need to initialize inside scope of if statement, just have to define it
        System.out.println("You entered "+ n );
    }
    else{
      n=4;//logic error, should not be initializing n again
      System.out.println("You entered " + n);
    }
    
    int k=4,p=6,q=7,r=8; //should delete n from this initialization
    switch(k+p+q+r){
   //do not need case 24 here, it is pointless
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}



