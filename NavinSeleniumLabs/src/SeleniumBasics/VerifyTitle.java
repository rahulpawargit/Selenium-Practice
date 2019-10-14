package SeleniumBasics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyTitle {
	
	WebDriver driver;
	
	
	@BeforeMethod()
	public void openchrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	//@SuppressWarnings("deprecation")
	@Test
	public void verifytitle()
	{
		String title= driver.getTitle();
		System.out.println(title);
		
	   
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void vefirylogo()
	{
		boolean b= driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(b);
		//Assert.assertEquals(b, "Logo is available ");
		Assert.assertEquals("//*[@id='hplogo']", b);
	}
	
	
	@AfterMethod
	public void closeinstance()
	{
		driver.quit();
	}

}
