package Assignments;

import java.util.Random;
import java.util.Scanner;

public class As15 {
	/*

	Program: As14.java          Date: May 9, 2022


	Author: Jujhar Singh
	School: CHHS
	Course: Computer Science 10
	 

	*/
	
	
	    public static void main(String args[])
	    {

	        Scanner userinput = new Scanner(System.in);
	        String a;

	        do{

	        String operatorSwitch;
	        int b;
	        int c = 0;

	        Random number = new Random();
	        int d = number.nextInt(50) +1;
	        int e = number.nextInt(50) +1;

	        Random operatorChoice = new Random();
	        int operator = operatorChoice.nextInt(4);

	        switch (operator){

	            case 0: operatorSwitch= "+";
	                c = d+e;
	                break;
	            case 1: operatorSwitch= "-";
	                c = d-e;
	                break;
	            case 2: operatorSwitch= "*";
	                c = d*e;
	                break;
	            case 3: operatorSwitch= "/";
	                c = d/e;
	                break;
	            default: operatorSwitch= "";
	        }
	        System.out.println("What is: "+d+operatorSwitch+e+"?");
	        b = userinput.nextInt();


	        if(b!=c)
	            System.out.println("Wrong answer! Right answer is: "+c);
	        else{if(b==c)
	            System.out.println("Right answer!"+c);
	        }
	            System.out.println("Continue? y/n");
	            a = userinput.next();

	        }while(a.equals("y"));
	        
	        

	    }

	}
/* Screen Dump
What is: 5+2?
7
Right answer!7
Continue? y/n

y
What is: 20/5?
4
Right answer!4
Continue? y/n
y
What is: 26+29?
55
Right answer!55
Continue? y/n
y
What is: 26+45?
71
Right answer!71
Continue? y/n

n




 */


