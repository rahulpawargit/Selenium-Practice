package testpack;

import java.util.Scanner;

public class Check_Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter no=");
int no=in.nextInt();
if((no%5==0)||(no%11==0))
{
System.out.println("No is  devide by 5 or 11");	
}

else 
{
System.out.println("No is not devide by 5 or 11");	
}

	}

}
