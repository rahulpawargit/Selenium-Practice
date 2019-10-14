package OPPS_Concept_Part_2;

public class HSBDbank implements USBank,DutchBank {
	
	public void credit()
	{
		System.out.println("Impletemted  credit by USbank");
	}
	public void debit()
	{
		System.out.println("Implemented by Debit by USbank");
		
	}
	
	public void seperatemethod()
	{
		System.out.println("Seperate method");
	}

	public void mutualfund()
	{
		System.out.println("This is another class interface mutualfund");
	}
	public void commercialloan()
	{
		System.out.println("This is dutchBank interface class");
	}
	
}
