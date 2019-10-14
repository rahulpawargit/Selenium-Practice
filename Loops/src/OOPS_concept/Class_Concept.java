package OOPS_concept;

public class Class_Concept {
	
	int mod;
	int wheel;
	
	

	public static void main(String[] args) 
	
	{
		Class_Concept obj1= new Class_Concept();
		Class_Concept obj2= new Class_Concept();
		
		obj1.mod=2015;
		obj1.wheel=4;
		
		System.out.println(obj1.mod);
		System.out.println(obj1.wheel);
		
		obj2.mod=2018;
		obj2.wheel=5;
		
		System.out.println(obj2.wheel);
		System.out.println(obj2.mod);
		
		obj1=obj2;
		
		System.out.println(obj1.mod);
		
		
	}

}
