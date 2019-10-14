package openbrs;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test1 
{

	@Test(priority=1)
	public static void testc()
	{
		//System.setProperty("webdriver.gecko.driver","C://SeleniumDriver//geckodriver-v0.20.0-win64//geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		 
		   System.setProperty("webdriver.firefox.marionette","C:/SeleniumDriver/geckodriver-v0.20.0-win64"); 
			WebDriver driver=new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("http://www.google.com"); 
	     driver.close();
	}
	
	@Test(priority=2)
	public static void testa()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://cendevqa.acs.org/index.html"); 
	    driver.close();
	}
	
	@Test(priority=3)
	public static void testb()
	{
		System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://cendevqa.acs.org/index.html");
        driver.quit();
	    
	}
}
