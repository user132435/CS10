package Assignments;

import java.util.Scanner;

public class As6 {


	/*

	Program: As6.java          Date: April 27, 2022


	Author: Jujhar Singh
	School: CHHS
	Course: Computer Science 10
	 

	*/
	 

	
	
	
		   public static void main(String args[])
		         
		    {
		       Scanner userinput = new Scanner(System.in);
		       System.out.println("What is your first name? ");
		        String name = userinput.nextLine();
		        
		       System.out.println("What is your last name? ");
		        String name2 = userinput.nextLine();
		        
		       System.out.println("What grade are you in? ");
		        String Grade = userinput.nextLine();
		        
		       System.out.println("What school do you attend? ");
		        String Schoolname = userinput.nextLine();
		        
		       System.out.println("What is your favourite hobby? ");
		        String hobby = userinput.nextLine();
		        
		       System.out.println("Hello, your name is " +name+ " " +name2+ ", you are "
		                + "currently in grade " +Grade+ " at " +Schoolname+ ". Your "
		                        + "favourite hobby is " +hobby+ ".");
		    }

		}

	/* Screen Dump
	 What is your first name? 
Jujhar
What is your last name? 
Singh
What grade are you in? 
10
What school do you attend? 
Crescent Heights High School
What is your favourite hobby? 
Ice Hockey
Hello, your name is Jujhar Singh, you are currently in grade 10 at Crescent Heights High School. Your favourite hobby is Ice Hockey.

	 */