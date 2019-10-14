package com.com.datadrivantest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HeymarketLogin {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver= new  ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://35.173.239.167/login-standalone");
	   
	 //  driver.findElement((By.id("root_email"));
 }
  }

