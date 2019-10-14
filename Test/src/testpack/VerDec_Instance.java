package testpack;

public class VerDec_Instance {

	int sal;
	String name;
	
	public void empsal(int s)
	{
		System.out.println("emp Sal=" +sal);
	}
	
	public void empname(String nm)
	{
		
		System.out.println("Emp Name=" +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VerDec_Instance obj= new VerDec_Instance();
		obj.empsal(1000);
		obj.empname("Rahul");
		
	}

}
