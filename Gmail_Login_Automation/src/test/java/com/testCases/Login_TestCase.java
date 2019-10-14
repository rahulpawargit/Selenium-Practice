package com.testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Login_Page;
import com.pages.Welcome_Page;


public class Login_TestCase extends TestBase {

	Login_Page LoginPage;
	Welcome_Page WelcomePage;
	
	public Login_TestCase() throws IOException
	{
		super();
	}
	
	@BeforeTest()
	public void TestSetup() throws IOException
	{
		initilization("chrome");
		LoginPage = new Login_Page();
	}
	
	@Test()
	public void login(String uname, String pass) throws IOException
	{
		LoginPage.login("rahul.pawar.asentech@gmail.com", "Abcd$123");
	}
	
	@AfterMethod()
	public void closebrowser()
	{
		driver.close();
	}
	
	

}
