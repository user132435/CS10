package Assignments;

import java.util.Scanner;

public class Finalproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    {
		        Scanner userinput = new Scanner(System.in);
		   	 
		    	System.out.println("Please enter your money amount or type -1 to exit the program: ");
		  	 
		    	double money = userinput.nextDouble();
		    	 
		    	while (money != -1)
		   	 
		        	{    
		        	if ((money > 0)||(money < 100000)||((money > 0)&&(money < 100)))
		        	{
		         	System.out.println("if less then 100 then type 99 is more then 100 enter 101.");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}
		        	else if  ((money >= 99)&&(money < 100))
		        	{
		         	System.out.println("You are not broke");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}     	 
		  
		        	else if ((money >= 99)&&(money < 100))
		        	{
		         	System.out.println("You are not broke");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}
		   	 
		        	else if ((money >= 99)&&(money < 100))
		        	{
		         	System.out.println("You are not broke");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}
		   	 
		        	else  
		        	{
		         	System.out.println("Sorry, you are broke.");
		         	System.out.println("Enter another money amount, or type -1 to leave:");
		         	money = userinput.nextDouble();
		        	}
		   	 
		              	 
		        	}
		   	 
		         	System.out.println("Thank you for using our program, have a great day!");
		         	 
			
		        
		        
		        
		    }

		}
		
		
		

		
		
		
	}


