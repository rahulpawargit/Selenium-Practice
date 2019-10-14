
package pkg_ACAMS_LegsandRegs;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LegAndRegsOpenArticle {
  private WebDriver driver;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void FFLROpenFirstArticleUsingLink() throws Exception
  {
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.findElement(By.xpath(".//*[@id='articleArea']/div[1]/div[1]/div/div[2]/h3/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.quit();
  }

  @Test(priority=1)
  public void CHLROpenFirstArticleUsingLink() throws Exception
  {
	   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize(); 
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.findElement(By.xpath(".//*[@id='articleArea']/div[1]/div[1]/div/div[2]/h3/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.quit();
  }
  
  @Test(priority=2)
  public void IELROpenFirstArticleUsingLink() throws Exception
  {
	     System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(1000);
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.findElement(By.xpath(".//*[@id='articleArea']/div[1]/div[1]/div/div[2]/h3/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.quit();
  }
}
