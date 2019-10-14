package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.spicejet.com/");
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Actions act= new Actions(driver);
		/*
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']")));
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@class='selected']")));
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[14]/ul/li[2]/ul/li[1]/a")));	
		*/
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='highlight-addons']/span[1]")));
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu-list-addons']/li[1]/a")));
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu-list-login']/li[2]/a"))).click().build().perform();
	    driver.close();
		
	}

}
