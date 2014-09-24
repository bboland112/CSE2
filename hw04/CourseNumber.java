//Brian Boland
//hw04
//September 23, 2014
//Course Number
//This program will prompt the user to enter a course number and it will return the semester and year the course took place in

import java.util.Scanner; //importing scanner for user inputs
public class CourseNumber { //initiating the class
    public static void main(String[] args) { 
        Scanner myScanner; //declaring the scanner for user inputs
        myScanner=new Scanner(System.in);
        
        System.out.println("Enter a six digit number giving the course semester:");//prompting the user to enter the course number
        int course = myScanner.nextInt(); //declaring the user input as an int called course
        if (course<186510 || course>201440) { //ensuring that the input is in the appropriate range
            System.out.println("The number was outside the range [186510,201440]");//telling the user that the input is invalid
            return;//quitting the program
                                            }
            else {
                int semester = (course%100); //Initializing a variable for the semester, it arrives at this by taking the remained of the course number divided by 100 which will return the last two digits on the course number, aka out semester number
                if (semester !=10 && semester !=20 && semester !=30 && semester !=40) { //An if statement to ensure that the semester number is a 10,20,30 or 40
                        System.out.println(semester + " is not a valid semester");//Telling the user that they have an invalid semester number (not 10,20,30 or 40)
                                                                                         }
                else {
                        int year = (course/100);//Initializing a variable for the year, it arrives at this by diving the course number by 100, and since it is an int, the decimal place (which is the last two digits of the course number, the two numbers we do not need) will be truncated and the year will remain
                        if (semester == 10) { //if the semester is 10 this portion of the code will run
                            System.out.println("The course was offered in the Spring semester of " + year);//print statement summarizing the findings of the program
                        }
                            else if (semester == 20) { //if the semester is 20 this portion of the code will run
                            System.out.println("The course was offered in the Summer 1 semester of " + year);//print statement summarizing the findings of the program
                            }
                            else if (semester == 30) { //if the semester is 30 this portion of the code will run
                            System.out.println("The course was offered in the Summer 2 semester of " + year);//print statement summarizing the findings of the program
                            }
                            else if (semester == 40) { //if the semester is 40 this portion of the code will run
                            System.out.println("The course was offered in the Fall semester of " + year);//print statement summarizing the findings of the program
                            }
                    
                        
                        
                        }
                }
    }
}