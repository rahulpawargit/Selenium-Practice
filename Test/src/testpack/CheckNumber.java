package testpack;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter No");
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		 if (no>=0)
		 {
			 System.out.println("No is Positive");
		 }
			 else
			 {
				 
				 System.out.println("No is Zero");
			 }
		 
			
		 
		 if (no<=0)
		 {
			 
			 System.out.println("No is Negative");
		 }
			 else
			 {
				 
				 System.out.println("No is Zero");
			 }
		 }
		
			/* else
			 {
				 System.out.println("No is Negative");
				 
			 }
			/* else
			 {
				 
				System.out.println("No is Zero"); 
			 }
			 */

	
	}



