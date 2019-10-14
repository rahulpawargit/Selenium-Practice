package com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.LoginPage;

public class LoginTestCase {

	
	@Test
	public void verifyvalidlogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		LoginPage login= new LoginPage(driver);
		//login.typeusername("pwrahul");
		//login.typepassword("Test@123");
		login.crmlogin("pwrahul", "Test@123");
		Thread.sleep(3000);
		//login.clickbutton();
		driver.close();
	}
}
