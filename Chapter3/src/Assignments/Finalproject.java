package Assignments;

import java.util.Scanner;

public class Finalproject {

	public static void main(String[] args) {
{
	/*

	Program:Finalproject.java          Date: June 7, 2022


	Author: Jujhar Singh 
	School: CHHS
	Course: Computer Science 10
	 

	*/
	
	
	// POV you are at a restaurant and want to order something but don't know if you can afford it//
		    	
		    	
		    	Scanner userinput = new Scanner(System.in);
		   	 
		    	System.out.println("Please enter your money amount or type -1 to exit the program: ");
		  	 
		    	double money = userinput.nextDouble();
		    	 
		    	while (money != -1)
		   	 
		        	{    
		        	if ((money < 0))
		        	{
		         	System.out.println("Try again");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}
		            	
		        	else if  ((money >= 100))
		        	{
		         	System.out.println("You can order it");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		         	}
		         
		        	else if ((money<=99))
		        	{
		         	System.out.println("Sorry, you can not afford it or don't have enough money");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}
		   	 
		              	 
		        	}
		   	 
		         	System.out.println("Thank you for using our program, have a great day!");
		         	 
			
		        
		        
		        
		    }

		}
	/* Screen Dump
	Please enter your money amount or type -1 to exit the program: 
	149
	You can order it
	Enter another money amount, or type -1 to leave:
	68
	Sorry, you can not afford it or don't have enough money
	Enter another money amount, or type -1 to leave:
	-1
	Thank you for using our program, have a great day!



	 
	 */
		
		

		
		
		
	}


