package com.wordpress.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		try
		{
		
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Rahul\\Testing Docs\\Selenium\\WordPress_Automation\\src\\main\\java\\com\\wordpress\\confige\\confige.properties");
			prop.load(ip);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initilization(String browsername)
	{
		prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
	{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	}
		else if(browsername.equals("IE"))
				{
			     WebDriverManager.iedriver().setup();
			     driver=new InternetExplorerDriver();
				}
//		else if(browsername.equals("Firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
		else if(browsername.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}
}
