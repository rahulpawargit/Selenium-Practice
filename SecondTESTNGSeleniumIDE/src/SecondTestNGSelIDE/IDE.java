
package SecondTestNGSelIDE;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IDE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

 

  @Test
  public void testEditorUserLogin() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
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
  }

  @AfterClass(alwaysRun = true)
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
