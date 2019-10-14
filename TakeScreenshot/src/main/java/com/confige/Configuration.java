package com.confige;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {
	
	public static WebDriver driver;
	
	public void  initilisation ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.freecrm.com");
	}
	
	public void failed()
	{
	
	}
	
	

}
