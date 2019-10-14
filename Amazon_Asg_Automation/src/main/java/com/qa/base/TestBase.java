package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Rahul\\Testing Docs\\Selenium\\Amazon_Asg_Automation\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{	
			e.printStackTrace();
			
		}
		
		catch(IOException e)
		{
		e.printStackTrace();
		}
	}

	
	public void initialization()
	{
		String browsername= prop.getProperty("browser");
				if(browsername.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
					
				}
				
				else if(browsername.equals("FF"))
				{
				 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		         driver = new ChromeDriver();
				}
		
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
	}
}
