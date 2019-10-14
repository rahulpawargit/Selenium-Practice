package testpack;

import java.util.Scanner;
import java.util.scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter  no a=");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("Enter  no b=");
		int b=in.nextInt();
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Swapping number a=" +a);
		System.out.println("Swapping number b=" +b);
		

	}

}
