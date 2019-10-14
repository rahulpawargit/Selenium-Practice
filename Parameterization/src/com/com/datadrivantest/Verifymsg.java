package com.com.datadrivantest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifymsg {
  @Test
  public void Verifymsg() 
  
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://nehatesting-trials641.orangehrmlive.com/");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String actualval= driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualval,"Username cannot be empty");
		//String actualmsg= driver.findElement(By.id("spanMessage")).getText();
		//String expmsg= "Username cannot be empty";
		
		

		/*if (actualmsg.contains(expmsg))
		{
			System.out.println("Error message is matching");
		}
		else
		{
			System.out.println("Error message is not matching");
		}
		*/
		driver.close();
  }
}
