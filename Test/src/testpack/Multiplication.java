package testpack;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
	//	int in;
		
		System.out.println("Enter two numbers to mulicplication");
		Scanner in=new Scanner(System.in);
		
		a=in.nextInt();
		b=in.nextInt();
		
		c=a*b;
		
		System.out.println("multiplication of tow no "+c);

	}

}
