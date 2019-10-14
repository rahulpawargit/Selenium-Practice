package testpack;

import java.util.Scanner;

public class Factorial {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int fact=1;
		
		System.out.println("Enter number to find factorial=");
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		
		
		while(a>0)
		{
			fact=a*fact;
			a--;
			
		}
System.out.println("Factorial is +" +fact);
	}

}
