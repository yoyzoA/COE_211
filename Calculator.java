import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		
		Scanner scan= new Scanner(System.in);
		int integer1, integer2;
		int calc;
		int start;

		
		
		System.out.println("welcome to the program!Press  1 to start, Press 0 to quit");
		start=scan.nextInt();
		
		while(start==1){
		  System.out.print("enter the first integer: ");
		  integer1=scan.nextInt();
		
		  System.out.print("enter the second integer: ");
		  integer2=scan.nextInt();
		
		  System.out.println("What calculations do you wish to perform? \n1"+")"+"add=1 \t2"+")"+"substract=2 \t3"+")"+"multiply=3 \t4"+")"+"divide=4");
		  calc=scan.nextInt();	
		
		  if(calc==1){
			System.out.println(integer1+"+"+integer2+"="+(integer1+integer2));
		  }
		  if(calc==2){
			System.out.println(integer1+"-"+integer2+"="+(integer1-integer2));
		  }
		  if(calc==3){
			System.out.println(integer1+"x"+integer2+"="+(integer1*integer2));
		  }
		  if(calc==4){
		  	  while(integer2==0){
				System.out.println("you can't divide by zero!");
				
				System.out.print("enter the first integer: ");
				integer1=scan.nextInt();
				
				System.out.print("enter the second integer: ");
				integer2=scan.nextInt();
			  }
			  if(integer1%integer2==0){
				System.out.println(integer1+"/"+integer2+"="+(integer1/integer2));
			  }else{
				System.out.println(integer1+"/"+integer2+"="+(integer1/(double) integer2));
			  }
		  } 
		  System.out.println("Press 1 to continue or 0 to abort");
		  start=scan.nextInt();
		}
		if(start==0){
			System.out.println("Thank you for using the calculator");
		}
	}
	
}