package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a[]= {"Rahul", "AEM", "Rahul"};
		
		List<String> templist=Arrays.asList(a);
		
		TreeSet<String> unique= new TreeSet<String>(templist);
		
		System.out.println(unique);
		
		

	}

}
