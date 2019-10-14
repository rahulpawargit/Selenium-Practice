package OOPS_concept;

public class Encapsulation {

	
	private String empname;
	private int empage;
	
	public String getEmpname() 
	{
		return empname;
	}
	public void setEmpname(String empname)
	{
		this.empname = empname;
	}


	public int getEmpage()
	{
		return empage;
	}
	
	public void setEmpage(int empage)
	{
		this.empage = empage;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation emp=new Encapsulation();
		emp.setEmpname("Rahul");
		emp.setEmpage(25);
		System.out.println("Emap name is= "+emp.getEmpname());
	    System.out.println("Emap age is = " + emp.getEmpage());
	}
}
