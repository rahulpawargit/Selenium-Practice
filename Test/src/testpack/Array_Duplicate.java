package testpack;

public class Array_Duplicate {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
 String str[]={"Selenium Demmo"};
 int cnt=0;

 for(int i=1;i<str.length;i++)
 {
	 for(int j=i+1;j<str.length;j++)
	 {
		 
		 if(str[i].equals(str[j]))
		 {
			 cnt++;
			 System.out.println("Repeted Characted is " +cnt);
		 }
		 
		 
      }
	
 }
 
}
	
}