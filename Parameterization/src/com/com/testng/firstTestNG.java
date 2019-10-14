package com.com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstTestNG {
	
	static WebDriver driver;
	@BeforeMethod
	public static void openbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.get("http://www.google.com");
		
	}	
	
  @Test
  public void verifytitle()
  {
	  String title= driver.getTitle();
	  System.out.println(title);
	  
  }
  @Test
  public void searchverify()
  {
	  boolean b= driver.findElement(By.id("lst-ib")).isDisplayed();
	  System.out.println(b);
	  
  }
  
   @AfterMethod
   public void closebroser()
   {
	   driver.quit();
   }
}
