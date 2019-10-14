package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Properties.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;

@Test (enabled=false)
public class OpenHomepage {

public void firefox() 
	
	{
		
	System.setProperty("webDriver.geckodriver.driver","C:/SeleniumDriver/geckodriver-v0.20.0" );
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
		
  }

public void chrome(Properties props)
  {
		try
		{ 
        Properties pr = new Properties();
         FileInputStream fis = new FileInputStream("E:\\Rahul\\Testing Docs\\Selenium\\C&EN\\PropertyDetails\\Configuration.properties");
         pr.load(fis);
         
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (InvalidPropertiesFormatException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
		System.out.println("URL ::" + props.getProperty("URL"));
	   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver= new  ChromeDriver();
	   driver.manage().window().maximize();
	 
	//driver.get(prop.getProperty("URL"));
	   //driver.get(props1.getProperty("URL"));
	  driver.navigate().to(pr.getProperty("URL"));
	  driver.close();
  }
public void IE()
{
	System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://www.google.com");
	driver.close();
}
}
