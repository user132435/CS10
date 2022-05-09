package Assignments;

import java.util.Scanner;

public class As14 {
	/*

	Program: As14.java          Date: May 9, 2022


	Author: Jujhar Singh
	School: CHHS
	Course: Computer Science 10
	 

	*/
	
	    public static void main(String args[])
	    {
	        //Ask for age to verify your stage of life
	        Scanner userinput = new Scanner(System.in);
	        System.out.println("Please enter your age: ");
	        int age = userinput.nextInt();
	        //if else statements to determine what stage of life you belong due to your age
	        if (age < 5)
	        {
	        System.out.println("You are a toddler");
	        }
	       
	        else if ((age < 10)&&(age > 6))               
	        {
	        System.out.println("You are a child");
	        }
	        
	        else if ((age < 12)&&(age > 11))
	        {
	        System.out.println("You are a preteen");
	        }
	       
	        else if ((age < 17)&&(age > 13))
	        {
	        System.out.println("You are a teen");
	        }
	       
	        else
	        {
	        System.out.println("You are an adult");
	        }
	        

	    }

	}
/* Screen Dump
Please enter your age: 
21
You are an adult


*/