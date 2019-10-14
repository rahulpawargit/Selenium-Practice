package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling<WebElement> {
	
	//public static void main(String[] args) throws InterruptedException
	@Test
	public void frames() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.get("http://www.freecrm.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pwrahul");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),Contacts)]")).click();
		
		Thread.sleep(3000);*/
		
		
		driver.get("file:///E:/Rahul/Testing%20Docs/Selenium%20Docs/ifrmaes.html");
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//*[@id='editPage']/a"));
		//Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		
		int frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of frames" + frames);
		
		org.openqa.selenium.WebElement ele= driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//*[@id='menu_projects']/a")).click();
		
		//driver.findElement(By.xpath("html/body/a")).click();
		
		//driver.close();
		
		
		
	}

}
