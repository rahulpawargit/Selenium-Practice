package OOPS_concept;

public class Constructor_concept {
	
	
	public Constructor_concept()
	{
		System.out.println("this is default consturctor");
	}
	
	public Constructor_concept(int a, int b)
	{
		System.out.println("this is parameterised constoctur");
		int c= a+b;
		System.out.println("additioin of c= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_concept obj= new Constructor_concept();
		

	}

}
