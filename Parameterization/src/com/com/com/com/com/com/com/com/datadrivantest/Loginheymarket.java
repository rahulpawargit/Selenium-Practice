package com.com.com.com.com.com.com.com.datadrivantest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginheymarket {
  @Test
  public void f() throws Exception 
  
  {
	  
	 
	   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver= new  ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://35.173.239.167/login-standalone");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id='root_email']")).sendKeys("smith11@yopmail.com");
	   
	   driver.findElement(By.id("root_password")).sendKeys("Admin1234");
	   driver.findElement(By.xpath("//*[@id='HMIRegistration__Root']/div/form/button")).click();
	   Thread.sleep(3000); 
	   try {
	   
		   boolean isPresent= driver.findElement(By.xpath("//*[@id='HMIRegistration__Root']/div/p[@class='error-message']"))!= null;
		
	   
	   
	   System.out.println(isPresent);
	   boolean flag;
	   if (isPresent=true)
		
			System.out.println("............Unsucessful");
		
		else
		
			System.out.println("............successful");
		
	   }catch(NoSuchElementException e)
	   {
		   System.out.println("NoSuchElementException");
		   
		   boolean flag;
		   if (flag=false)
			
				System.out.println("Unsucessful");
			
			else
			
				System.out.println("successful");
			
		   }
		   
		   
	   }
  
  }

