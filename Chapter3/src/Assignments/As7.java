package Assignments;

import java.util.Scanner;

public class As7 {

	/*

	Program: As7.java          Date: Apr 27, 2022


	Author: Jujhar Singh
	School: CHHS
	Course: Computer Science 10
	 

	*/
	
		 public static void main(String args[])
		    {
		       Scanner userinput = new Scanner(System.in);
		        
		       System.out.println("Enter your change: ");
		       
		       int change = userinput.nextInt();
		       
		       int quarters = change / 25;
		       
		       int dimes = ((change % 25) / 10);
		       
		       int nickels = (((change % 25)%10)/ 5);
		       
		       System.out.println("The change you provided is: " + change);
		       
		       System.out.println("Quarters: " + quarters);
		       
		       System.out.println("Dimes: " + dimes);
		       
		       System.out.println("Nickels: " + nickels);

		       
		    }

}
	/* Screen Dump
	 Enter your change: 
12
The change you provided is: 12
Quarters: 0
Dimes: 1
Nickels: 0

	 
	 */
		
		