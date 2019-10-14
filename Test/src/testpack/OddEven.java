package testpack;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter No to find type");
		Scanner in = new Scanner(System.in);
		
		int a=in.nextInt();
		 if (a%2==0)
		 {
			 
			 System.out.println("Given No is even");
		 }
		 else
			 
		 System.out.println("Given no is odd");
	}

}
