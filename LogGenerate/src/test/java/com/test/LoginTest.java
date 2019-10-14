package com.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class LoginTest 
{
	WebDriver driver;
	Logger log = Logger.getLogger(LoginTest.class);
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//log.info("Launching the Browser");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		log.info("######################################Entered the URL###############################################################");
		
	}
	
	@Test
	public void vefirylogo()
	{
		boolean b1= driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		Assert.assertTrue(b1, "//img[@class='img-responsive']");
		//log.info("Checking the LOGO");
	}
	
	@Test
	public void verifytitle()
	{
		String b2= driver.getTitle();
	    Assert.assertEquals(b2, "#1 Free CRM software in the cloud for sales and service");
	  log.warn("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@This is warning@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	  log.fatal("*****************************************************************************************This is fatal error**********************************************************");
	  //  log.info("This is info");
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	

}
