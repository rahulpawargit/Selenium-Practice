
package  pkg_ACAMS;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AdditionalStories {
  private WebDriver driver;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void FirefoxAdditionalStories() throws Exception
  {
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[2]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[4]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[5]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(5000);
    driver.close();
  }
  
  @Test(priority=1)
  public void ChromeAdditionalStories() throws Exception
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[2]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[4]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[5]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.close();
  }
  
  @Test(priority=2)
  public void IEAddtionalStories() throws Exception
  {
	  
	     System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[2]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[4]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//div[5]/div/p/a")).click();
    driver.findElement(By.linkText("Home")).click();
    Thread.sleep(5000);
    driver.close();
  }

 

  
}
