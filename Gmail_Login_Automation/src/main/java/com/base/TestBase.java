package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.opc.PackageProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
			FileInputStream ip = new FileInputStream("E:\\Rahul\\Testing Docs\\Selenium\\Gmail_Login_Automation\\src\\main\\java\\com\\properties\\confige.properties");
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
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
	}
 
	}
 
   
}
