package com.TestCase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLogin
{
	
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	}
	@Test(priority=2)
	public void Login() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("rahul.pawar.asentech@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Abcd$123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		//driver.findElement(By.xpath("//*[@id=':35']")).click();
		
		String expected_subject= "B&C Today";
		
		if (expected_subject=="B&C Today")
		{
			driver.findElement(By.xpath("//*[@id=':35']")).click();
			Thread.sleep(2000);
		}
	}
	
	@AfterTest
	public void closebrower()
	{
		driver.quit();
	}
	
	
	

	
	

}
