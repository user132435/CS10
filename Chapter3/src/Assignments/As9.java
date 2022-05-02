package Assignments;

public class As9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner userinput = new Scanner(System.in);
	       
	       System.out.println("Enter an integer: ");
	       
	       int integer1 = userinput.nextInt();
	       
	       System.out.println("Enter a second integer: ");
	    
	       int integer2 = userinput.nextInt();
	    
	       int answer1 = (integer1 / integer2);
	       
	       int answer2 =(integer1 % integer2);
	       
	       int answer3 =(integer2 / integer1);
	       
	       int answer4 =(integer2 % integer1);
	      
	       System.out.print(integer1);
	       System.out.print(" / ");
	       System.out.print(integer2);
	       System.out.print(" = ");
	       System.out.println(answer1);
	       
	       System.out.print(integer1);
	       System.out.print(" % ");
	       System.out.print(integer2);
	       System.out.print(" = ");
	       System.out.println(answer2);
	       
	       System.out.print(integer2);
	       System.out.print(" / ");
	       System.out.print(integer1);
	       System.out.print(" = ");
	       System.out.println(answer3);
	       
	       System.out.print(integer2);
	       System.out.print(" % ");
	       System.out.print(integer1);
	       System.out.print(" = ");
	       System.out.println(answer3);
	}

}
