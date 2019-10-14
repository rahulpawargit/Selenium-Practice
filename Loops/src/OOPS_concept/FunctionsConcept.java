package OOPS_concept;

public class FunctionsConcept {

	public void test(){
		System.out.println("This is test method no input and no ooutpu method");
	}
	
	public int addition()
	{
		System.out.println("This is no input but outpout method");
		 int a =10;
		 int b=20;
		 
		 int c= a +b;
		 return c;
				 
	}
	
	public String pqr()
	{
		System.out.println("This string return mehtod");
		
		String s= "Rahul ";
		
		return s;
		
	}
	
	public int division(int a , int b)
	{
		System.out.println("This is input /outout methot");
		
		int c=a/b;
		 return c;
	}
	
	
	public static void main(String[] args) {
		
		
		FunctionsConcept obj= new FunctionsConcept();
		obj.test();
		
		 int x= obj.addition();
		 System.out.println("Additon method output=" +x);

		String s= obj.pqr();
		System.out.println(s);
		
		int div=obj.division(10, 0);
		System.out.println("Divistion of 2 numbers =" +div);

	}

}
