//Brian Boland
//Lab 01-Hello World
import java.util.Scanner;
public class HelloWorld{  //define the class

  public static void main( String args[] ){
   int count = 0;
   for (int i = 6; i>0; i--) {
       for (int j = 4; j>count; j--) {
           for (int k = 1; k<j+1; k++) {
               System.out.print(i);
               if (j==k) {
                   System.out.println();
               }
       }
   }
   count++;
        
    }
        
  }

}
