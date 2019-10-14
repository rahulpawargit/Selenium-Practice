package SeleniumBasics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginCRM {
	
	@Test
	public void verifylogo() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		//boolean tr= driver.findElement(By.xpath("html/body/div[2]/div/div[1]/a/img")).isDisplayed();
		// tr1=tr;
		
		//System.out.println(tr);
		
		//assert.assertTrue(tr);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class= 'btn btn-small']")).click();
		
	}

}
