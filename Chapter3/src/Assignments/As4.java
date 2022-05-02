package Assignments;
import java.util.Scanner;
public class As4 {


		/*

		Program: As4     Date: April 8, 2022


		Author: Jujhar Singh 
		School: CHHS
		Course: Computer Science 10
		 

		*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			    Scanner myObj = new Scanner(System.in);  
			    System.out.println("Enter the Diameter of the Pizza in Whole Inches");
			    int size = myObj.nextInt();
			    		
			    double cost = (size * size * 0.05) + 0.75 + 1.00;
			    
			    System.out.println("It costs $ " + cost); 
			}
		/* Screen Dump
		 Enter the Diameter of the Pizza in Whole Inches


		 
		 */
		

		}


