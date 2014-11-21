//Brian Boland
//Hw10


import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }

public static boolean hasDub(int num[]) {
    int count = 0;//variable used to check how many times a member of an array is repeated
    for (int k=0; k<9; k++) {
        for (int m=k+1; m<9; m++) {
        if (num[k] = num [m]) {//checking if a memeber of the array is repeated
            count++;
            return true;//will return true if at least one member of the array is repeated
        }
        else {continue;} }
        if (count ==0){
            return false;
        }
       
        
    }
}

public static boolean exactlyOneDup(int num[]) {
    int count = 0;//variable used to check how many times a member of an array is repeated
    for (int n=0; n<9; n++) {
        for (int p=n+1; p<9; p++) {
        if (num[n] = num [p]) {//checking if a memebr of the array is repeated
            count++;
            
        }
        else {continue;} }
        if (count == 1){
            return true;//return true if member of array is repeated exactly once
        }
        else {
            return false;
        }
       
        
    }
}
    
}

