package openbrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
  @Test
  Priority=1
  public void chrome() 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://cendevqa.acs.org/index.html"); 
  }
  
  @Test
  public void chrome() 
  {
	  System.setProperty("webdriver.InternetExplorer.driver", "C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		WebDriver driver= new  InternetExplorer();
		driver.manage().window().maximize();
	    driver.get("https://cendevqa.acs.org/index.html"); 
  }
}

