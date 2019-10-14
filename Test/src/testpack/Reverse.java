package testpack;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter no ");
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt();
		int rev=0;
		int temp=0;
		
		while(a>0)
		{
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
			
			
		}
	System.out.println("Reverse No is=" +rev);
		
	}

}
