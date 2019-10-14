package com.com.com.com.datadrivantest;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 * Login
   Search
   Verifyname
   Main method
   deletecookie
   close system
   Delete History


 */

public class Verifyannotation {
 
	@BeforeClass
	public void openbrowser()
	{
		System.out.println("Open Browser");
	}
	
	//1
	@BeforeSuite
	public void Login()
	{
		System.out.println("Login");
	}
	
	//3
	@BeforeMethod
  public void Verifyname()
	{
		System.out.println("Verifyname");
    }
	
	//2
	@BeforeTest
	public void search()
	{
		System.out.println("Search");
	}
	
	//4
	@Test
	public void main()
	{
		System.out.println("Main method");
	}
	
	//5
	@AfterMethod
	public void deletecookie()
	{
		System.out.println("deletecookie");
	}
	
	
	@AfterTest
	public void deletehistory()
	{
		System.out.println("Delete History");
	}
	@AfterSuite
	public void closebrowser()
	{
		System.out.println("Closebrowser");
	}
	
	@AfterClass
	public void closesystem()
	{
		System.out.println("close system");
	}
	
}
