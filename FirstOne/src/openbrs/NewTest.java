package openbrs;


import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class NewTest {
  //private WebDriver driver;
  //private String baseUrl;
  //private boolean acceptNextAlert = true;
  //private StringBuffer verificationErrors = new StringBuffer();

  
 

 /* @Test
  public void OpenFX() throws Exception {
	  
	  System.setProperty("webdriver.firefox.marionette","C:/SeleniumDriver/geckodriver-v0.20.0-win64");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://centest.acs.org//index.html");
       driver.findElement(By.xpath("//span")).click();
       driver.findElement(By.xpath("(//a[contains(text(),'Meet Geraldine Richmond, 2018 Priestley Medalist')])[2]")).click();
  }
*/
  @Test (priority=1)
  public void OpenCH() throws Exception {
	  
	   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver= new  ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://centest.acs.org//index.html");
       driver.findElement(By.xpath("//span")).click();
       driver.findElement(By.xpath("(//a[contains(text(),'Meet Geraldine Richmond, 2018 Priestley Medalist')])[2]")).click();
  }
  @Test (priority=3)
  public void OpenIE() throws Exception {
	  
	   System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	   WebDriver driver=new InternetExplorerDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://centest.acs.org//index.html");
       driver.findElement(By.xpath("//span")).click();
       driver.findElement(By.xpath("(//a[contains(text(),'Meet Geraldine Richmond, 2018 Priestley Medalist')])[2]")).click();
  }
 
  }

  
