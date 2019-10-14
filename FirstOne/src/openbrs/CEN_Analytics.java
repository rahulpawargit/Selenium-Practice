

package openbrs;

import org.testng.Assert;
import org.testng.annotations.*;

import com.google.common.base.Verify;

import static org.testng.Assert.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CEN_Analytics {

  private StringBuffer verificationErrors = new StringBuffer();

 

  @Test(enabled=false)
  public void TPFirefox() throws Exception {
	
    System.setProperty("webdriver.firefox.marionette","C:/SeleniumDriver/geckodriver-v0.20.0-win64");
     WebDriver driver=new FirefoxDriver();
    driver.get("https://centest.acs.org//index.html");
    driver.findElement(By.cssSelector("i.fa.fa-caret-down")).click();
    driver.findElement(By.linkText("Analytical Chemistry")).click();
    try {
      assertEquals(driver.getTitle(), "Analytical Chemistry | C&EN");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.quit();
  }

  @Test
  public void TPChrome() throws Exception {
	
     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
    driver.get("https://www.google.com");
   // driver.findElement(By.cssSelector("i.fa.fa-caret-down")).click();
    //driver.findElement(By.linkText("Analytical Chemistry")).click();
    // assertEquals(driver.getTitle(), "Analytical Chemistry | C&EN");
    //Assert.assertEquals("Analytical Chemistry | C&EN", driver.getTitle(), "Title is matching");
    //driver.quit();

    this.takeSnapShot(driver, "E://test.png") ;
  }
  
  
  @Test(enabled=false)
  public void TPIE() throws Exception {
	
    System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
     WebDriver driver=new InternetExplorerDriver();
     driver.manage().window().maximize();
    driver.get("https://www.goolge.com");
    driver.findElement(By.cssSelector("i.fa.fa-caret-down")).click();
    driver.findElement(By.linkText("Analytical Chemistry")).click();
    try {
      assertEquals(driver.getTitle(), "Analytical Chemistry | C&EN");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.quit();
  }
  

  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

      //Convert web driver object to TakeScreenshot

      TakesScreenshot scrShot =((TakesScreenshot)webdriver);

      //Call getScreenshotAs method to create image file

              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

          //Move image file to new destination

              File DestFile=new File(fileWithPath);

              //Copy file at destination

              FileUtils.copyFile(SrcFile, DestFile);

  }

  
  }

