package openbrs;

import java.util.Scanner;

public class Addtion {

	public static void main(String[] args) {
		
		
		
		//Addtion
		/*int c=0;
		System.out.println("Enter 1 st number");
		Scanner sc1=new Scanner(System.in);
		int no1=sc1.nextInt();
		
		System.out.println("Etner 2nd nubmer");
		Scanner sc2=new Scanner(System.in);
		int no2=sc2.nextInt();
		
		c=no1+no2;
		System.out.println("Addtion of 2 number=" +c);
		
		
		*/
		
		//Factorial
		/*
		int Fact=1;
		System.out.println("Etner the number");
		Scanner sc1=new Scanner(System.in);
		int no=sc1.nextInt();
		while(no>0)
		{
			Fact=Fact *no;
			no--;
		}
		
		System.out.println(+Fact);
		
		*/
		
		
		//count the String Lenght wihtout space
	/*	String s = "This is testing purpose string  ";
		int count=0;
		for(int i=0; i<=s.length()-1;i++)
		{
			if ((s.charAt(i) == ' ') )
			{
				count--;
 
			}
			
			count++;
		}
		
		System.out.println(count);
		
		// TODO Auto-generated method stub

	}
*/
		//Reverse Array
	/*	int a[]={4,2,3,1,0,6,9};
		int largest=0;
		//int smallest=0;
		for (int counter = 0; counter < a.length; counter++)
		{
		     if (a[counter] > largest)
		     {
		      largest = a[counter];
		     }
		    // else if (a[counter] < smallest)
		    	// largest = a[counter];
		}
		System.out.println( largest);
		//System.out.println( smallest);
	}*/
		
		
		//**Palindrom Number
		
		int pal=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		int no= sc.nextInt();
		int temp;
		temp=no;
		while(no>0)
		{
			no=no%10;
			pal=(pal*10)+no;
			no=no/10;
		}
		/*for(int i=0; i<=no;i++)
		{
			no=no%10;
			pal=(pal*10)+no;
			no=no/10;
		}*/
		if (temp==pal)
		
			System.out.println("No is Palindrom");
		
		else
		
			System.out.println("No is not palindrom");
		
	}
}
