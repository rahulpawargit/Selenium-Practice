package SeleniumBasics;

import org.testng.annotations.Test;

public class TestNGF {
	
	@Test(invocationCount=4)
	public void LoginTest()
	{
		System.out.println("Login....");
		//int a= 10/0;
		//System.out.println(a);
		
	}

	@Test(dependsOnMethods="LoginTest", invocationCount=3)
	public void HomePage()
	{
		System.out.println("Registration ....");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void Enquiry()
	{
		System.out.println("Enquiry ....");
	}
	
	
}
