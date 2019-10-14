
package testpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Check_vowels_consonent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Scanner in=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char  ch; 
        System.out.println("Enter Character==");
       ch = (char) br.read();
       

		if (ch=='a'|| ch=='A'||ch=='i' || ch=='I' || ch=='e'|| ch=='E'||ch=='o'|| ch=='O' || ch=='u' || ch=='U' )
		{
			
			System.out.println("Given Characher is Vowels");
		}
		else
		{
		System.out.println("Given Character is Consonents");
		}

	}

}
