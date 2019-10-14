package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multibrowser {

	@Test
  public void openpage() 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();

	}
  @Test
  public void firefox()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.close();
	  
  }
  @Test
  public void ie()
  {
  
  System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
  WebDriver driver=new InternetExplorerDriver();
  driver.get("http://www.google.com");
  driver.close();
  
  }
  
}
