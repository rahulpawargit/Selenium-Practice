package firsttestngpackage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

 

  @Test
  public void LoingChrome() throws Exception 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://acams.dev.asentechllc.net/");
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("");
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("Editor1");
    driver.findElement(By.id("login-pass")).clear();
    driver.findElement(By.id("login-pass")).sendKeys("");
    driver.findElement(By.id("login-pass")).clear();
    driver.findElement(By.id("login-pass")).sendKeys("AuthI@%!F3");
    driver.findElement(By.name("login_submit")).click();
    driver.quit();
  }

 /* @Test
  public void LoginIE() throws Exception 
  {
	  
	  System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	  WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
	    driver.get("http://acams.dev.asentechllc.net/");
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("");
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("Editor1");
    driver.findElement(By.id("login-pass")).clear();
    driver.findElement(By.id("login-pass")).sendKeys("");
    driver.findElement(By.id("login-pass")).clear();
    driver.findElement(By.id("login-pass")).sendKeys("AuthI@%!F3");
    driver.findElement(By.name("login_submit")).click();
    driver.quit();
  }*/

  @Test
  public void LoginFirefox() throws Exception 
  {
	  
	    WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http://acams.dev.asentechllc.net/");
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("");
    driver.findElement(By.id("login-name")).clear();
    driver.findElement(By.id("login-name")).sendKeys("Editor1");
    driver.findElement(By.id("login-pass")).clear();
    driver.findElement(By.id("login-pass")).sendKeys("");
    driver.findElement(By.id("login-pass")).clear();
    driver.findElement(By.id("login-pass")).sendKeys("AuthI@%!F3");
    driver.findElement(By.name("login_submit")).click();
    driver.quit();
    
  }
  
  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } 
    catch (NoSuchElementException e) 
    {
      return false;
    }
  }

  private boolean isAlertPresent()
  {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e)
    {
      return false;
    }
  }

  private String closeAlertAndGetItsText()
  {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert)
     {
        alert.accept();
      } else 
      {
        alert.dismiss();
      }
      return alertText;
    } finally 
    {
      acceptNextAlert = true;
    }
   
  }
}
