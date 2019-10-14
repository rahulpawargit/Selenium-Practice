package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 

{

	static WebDriver driver;
	public static WebDriver startbrowser(String browsername, String url)
	{
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	
		return driver;
		
	}
}
