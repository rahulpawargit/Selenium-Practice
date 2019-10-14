package OOPS_concept;

public class Static_Nonstatic {

	
	 static int a=10;
	 int b=20;
	 
	 public static int sum(int a, int b)
	 {
		int c= a+b;
		return c;
	 }
	 
	public static void main(String[] args) 
	
	{
	  System.out.println(a);
	  System.out.println(Static_Nonstatic.a);
	  
	  //int b= sum(10,20);
	  
	  System.out.println("Staic method addition is == " +sum(10, 50));

	}

}
 