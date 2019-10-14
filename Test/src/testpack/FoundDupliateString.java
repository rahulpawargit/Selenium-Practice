package testpack;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class FoundDupliateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str[]=br.lines();
		*/
		
		
		String Str[]={"Rahul"};
		
		
		for (int i=1; i<Str.length;i++)
		{
			
			
			if(Str[i]=="a")

			{
				Str[i].toUpperCase();
				System.out.println("Update String="+ Str[i]);
			}
			
		}
		

	}

}
