package OOPS_concept;

public class MethodOverloading {

	public void sum(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition of two int= " +c);
	}
	
	public void sum(double a, double b)
	{
		double c= a+b;
		System.out.println("Addition of two double= " +c);
	}
	
	public void main()
	{
		System.out.println("This is main method overloading");
	}
	
	public void sum()
	{
		System.out.println("With no any parameteres!!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj= new MethodOverloading();
		obj.sum(1, 2);
		obj.sum(2.4, 3.54);
		obj.main();
		obj.sum();
	}
	

}
