package testpack;

import java.util.Scanner;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner in=new Scanner(System.in);


System.out.println("Please  Enter A=");
int a=in.nextInt();
System.out.println("Please  Enter B=");
int b=in.nextInt();
System.out.println("Please  Enter C=");
int c=in.nextInt();

if ((a>b)&& (a>c)){
	
	System.out.println("A is Gretar than C and b");
}
else
{
if((b>a)&& (b>c))
{
	System.out.println("B is gretar than A and C");
}
else{
	
	System.out.println("C is Gretar than A and b");
}
}
	}

}
