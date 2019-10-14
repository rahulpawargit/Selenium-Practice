package com.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBroserWithoutProperty {
	WebDriver driver;
	
	
	@BeforeMethod()
	public void BrowserSetup()
	{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().version("71.0.3578.33").setup();
		driver= new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().version("70.1").setup();
		//driver=new FirefoxDriver();
		

		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
		
		//WebDriverManager.iedriver().setup();
	//	driver=new InternetExplorerDriver();
		
	//	WebDriverManager.operadriver().setup();
//		driver=new OperaDriver();
		
		driver.manage().window().maximize();
	}
	@Test
	public void OpenBrowser()
	{
		driver.get("http://www.freecrm.com");
       String title= driver.getTitle();
       System.out.println(title);
        
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}
		

}
