package Assignments;

import java.util.Scanner;

public class As10 {
	/*

	Program: As10.java          Date: Apr 27, 2022


	Author: Jujhar Singh
	School: CHHS
	Course: Computer Science 10
	 

	*/
	
		 public static void main(String args[])
		    {
		       Scanner userinput = new Scanner(System.in);
		       System.out.println("Enter an integer: ");
		       int digit = userinput.nextInt();
		       if (digit % 2 == 0) {
		           System.out.println("Your integer " +digit+ " is even!");
		                   } else {
		           System.out.println("Your interger " +digit+ " is odd");
		       }
		    }
} 
/* Screen Dump

Enter an integer: 
10
Your integer 10.0 is even!


*/

