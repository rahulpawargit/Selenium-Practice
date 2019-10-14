
package IDEExport;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstExport {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

 

  @Test
  public void testEditorUserLogin() throws Exception {
	  System.setProperty("webdriver.gecko.driver","C://SeleniumDriver//geckodriver-v0.20.0-win64//geckodriver.exe");
	  
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
  //System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new  ChromeDriver();
		//driver.get("http://acams.dev.asentechllc.net/"); 	
		// System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		 // WebDriver driver=new InternetExplorerDriver();
		 
    //driver.get("http://acams.dev.asentechllc.net/");
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
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
