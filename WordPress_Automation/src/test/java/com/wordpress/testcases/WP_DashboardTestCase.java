package com.wordpress.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.base.TestBase;
import com.wordpress.pages.Wp_Dashboard;
import com.wordpress.pages.Wp_LoginPage;

import junit.framework.Assert;

public class WP_DashboardTestCase extends TestBase {
	
	Wp_LoginPage loginpage;
	Wp_Dashboard dashboard;

	public WP_DashboardTestCase() throws IOException 
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initilization("chrome");
		loginpage=new Wp_LoginPage();
		dashboard=Wp_LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void verifytitle()
	{
		String title= dashboard.vefifytitle();
		Assert.assertEquals(title, "Dashboard ‹ NJBiz — WordPress");
	}
	
	@Test(priority=2)
	public void verifyUsername()
	{
		boolean uname= dashboard.verifyusername();
		//Assert.assertEquals(uname, "asentechssg");
		Assert.assertTrue(uname);
		
	}
	
	@Test(priority=3)
	public void AllPostpage() throws IOException
	{
		dashboard.clickonAddPost();
		String title=dashboard.vefifytitle();
		Assert.assertEquals(title, "Posts ‹ NJBiz — WordPress");
	}
	
	
	@AfterMethod()
	public void closebrowser()
	{
		driver.close();
	}
	
}
