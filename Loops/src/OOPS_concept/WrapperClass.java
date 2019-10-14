package OOPS_concept;

public class WrapperClass {

	public static void main(String[] args) {
		 String s= "100";
		 int a= 10;
		 
		 System.out.println(s+a);
		 
		 int par= Integer.parseInt(s);
		 System.out.println(par+a);
		 
		 String str = "2.30";
		 double d= 2.03;
		 
		 double p= Double.parseDouble(str);
		 
		double ans= p + d;
		  
		 System.out.println(ans);
		 
		 
		 String j= "fals";
		 
		 boolean b=Boolean.parseBoolean(j);
		 
		 System.out.println(b);
		 
		 

	}

}
