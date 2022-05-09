package Assignments;

import java.util.Scanner;

public class As8 {
	/*

	Program: As8.java          Date: Apr 27, 2022


	Author: Jujhar Singh
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner userinput = new Scanner(System.in);
	       System.out.println("Enter three digits: ");
	       int digit = userinput.nextInt();
	       int first = digit / 100;
	       int second = (digit / 10) % 1;
	       int third = digit % 10;
	       System.out.println("The hundreds place digit is: " +first);
	       System.out.println("The tens place digit is: " +second);
	       System.out.println("The ones place digit is: " +third);
		
		
		
	}

}

/* Screen Dump
Enter three digits: 
812
The hundreds place digit is: 8
The tens place digit is: 0
The ones place digit is: 2




*/