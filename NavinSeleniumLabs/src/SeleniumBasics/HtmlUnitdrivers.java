package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class HtmlUnitdrivers {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
		String title1= driver.getTitle();
		System.out.println(title1);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		String title2=driver.getTitle();
		System.out.println(title2);
	

	}

}
