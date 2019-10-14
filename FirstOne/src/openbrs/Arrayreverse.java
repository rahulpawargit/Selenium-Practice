package openbrs;

import java.util.Scanner;

public class Arrayreverse {

	public static void main(String[] args) {
		
		
	/*	int a[]= new int[]{1,2,3,4,5};
		for (int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

		String myname="rahul";
		String newname=myname.substring(0,3)+ 'p' + myname.substring(5);
		System.out.println(newname);
		
		*/
	
	
	
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	}
	


