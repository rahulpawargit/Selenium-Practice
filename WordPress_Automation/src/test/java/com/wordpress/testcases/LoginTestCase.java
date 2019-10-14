package com.wordpress.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.base.TestBase;
import com.wordpress.pages.Wp_LoginPage;
import com.wordpress.pages.Wp_Dashboard;

public class LoginTestCase extends TestBase{
	
	Wp_LoginPage Wp_LoginPage;
	com.wordpress.pages.Wp_Dashboard Wp_Dashboard;
	
	public LoginTestCase() throws IOException
	{
		super();
	}
	
	@BeforeMethod()
	public void TestSetup() throws IOException
	{
		initilization("chrome");
	    Wp_LoginPage = new Wp_LoginPage();
		
	}
	@Test(priority=1)
	public void LoginPageTitle()
	{
		String title= Wp_LoginPage.verifyTitle();
		Assert.assertEquals(title, "Log In ‹ NJBiz — WordPress");
	}
	
	@Test(priority=2)
	public void verifyLogo()
	{
		boolean logo= Wp_LoginPage.verifylogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void adminlogin() throws IOException
	{
		 Wp_Dashboard=Wp_LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod()
	public void closebrowser()
	{
		driver.close();
	}

}
