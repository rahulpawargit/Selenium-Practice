package OPPS_Concept_Part_2;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBDbank obj= new HSBDbank();
		
		obj.credit();
		obj.seperatemethod();
	    obj.credit();	
        obj.debit();
        obj. mutualfund();
        obj.commercialloan();
        
        
        
        System.out.println("********Referance veriable of interface");
        USBank ref= new HSBDbank();
        ref.credit();
       
	} 

}

