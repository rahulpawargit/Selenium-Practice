package ArrayListP;

public class ExceptionHandling {
	
	
	int a=10;

	public static void main(String[] args) {
		
		
		//int a= 9/0;
		
		//System.out.println(a);
		
	//	ExceptionHandling obj=new ExceptionHandling();
	
	//System.out.println(obj.a);
		
		try
		{
			int a=10/0;
			System.out.println(a);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Exeption handling...");
		System.out.println("Exeption handling...");
	}

}
