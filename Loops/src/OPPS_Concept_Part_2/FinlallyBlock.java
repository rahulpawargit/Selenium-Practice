package OPPS_Concept_Part_2;

public class FinlallyBlock {

	public static void main(String[] args) {
		int a= 6;
		
try
{
	int b=a/0;
	System.out.println("Inside the try block");
}

catch(ArithmeticException e)
{
	System.out.println("Can't devide by zero");
}

finally
{
	
	System.out.println("close the browser == It's a finally block");
}
	}


}
