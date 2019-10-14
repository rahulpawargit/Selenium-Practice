package SeleniumBasics;

public class ClassB extends ClassA{
	
	public void a( int a, double b)
	{
		System.out.println("This is B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB obj= new ClassB();
		obj.a(1, 2.2);
		
		
	}

}
