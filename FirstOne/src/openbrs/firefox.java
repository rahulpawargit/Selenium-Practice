package openbrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class firefox {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","C://SeleniumDriver//geckodriver-v0.20.0-win64//geckodriver.exe");
		  System.setProperty("webdriver.firefox.marionette","C:/SeleniumDriver/geckodriver-v0.20.0-win64"); 
		  WebDriver driver=new FirefoxDriver();
	      driver.get("http://www.google.com");

	/*System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new  ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://cendevqa.acs.org/index.html"); 
	*/
	/*	System.setProperty("webdriver.ie.driver", "C:\\SeleniumDriver\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com"); 
	    driver.close();
	    */
	    
	/*    System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get("https://cendevqa.acs.org/index.html");
	    
	    //WebDriver driver=new InternetExplorerDriver();
	 
         driver.close();
         */
	}

}
