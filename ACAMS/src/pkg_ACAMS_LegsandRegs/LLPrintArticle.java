
package pkg_ACAMS_LegsandRegs;


import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import java.awt.event.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LLPrintArticle {
private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void FFLLPrintButton() throws Exception {
    driver.get("http://acams.dev.asentechllc.net/legs_and_regs/");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='articleArea']/div[1]/div[1]/div/div[2]/h3/a")).click();
    driver.findElement(By.linkText("Brief")).click();
    driver.findElement(By.xpath("html/body/div/div/div[3]/div[1]/div[2]/ul/li[3]/a")).click();
    Thread.sleep(2000);
    Robot r=new Robot();
    // r.keyPress(KeyEvent.VK_ESCAPE);
    // r.keyPress(KeyEvent.VK_CANCEL);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    r.keyPress(KeyEvent.VK_ESCAPE);
    driver.close();
  }

  @Test(priority=1)
  public void CHLLPrintButton() throws Exception 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize(); 
    driver.get("http://acams.dev.asentechllc.net/legs_and_regs/");
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='articleArea']/div[1]/div[1]/div/div[2]/h3/a")).click();
    driver.findElement(By.linkText("Brief")).click();
    driver.findElement(By.xpath("html/body/div/div/div[3]/div[1]/div[2]/ul/li[3]/a")).click();
    Thread.sleep(2000);
    Robot r=new Robot();
    // r.keyPress(KeyEvent.VK_ESCAPE);
    // r.keyPress(KeyEvent.VK_CANCEL);
    //r.keyPress(KeyEvent.VK_ENTER);
   // r.keyPress(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_ESCAPE);
    driver.close();
  }
 
  @Test(priority=1)
  public void IELLPrintButton() throws Exception 
  {
	     System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
    driver.get("http://acams.dev.asentechllc.net/legs_and_regs/");
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='articleArea']/div[1]/div[1]/div/div[2]/h3/a")).click();
    driver.findElement(By.linkText("Brief")).click();
    driver.findElement(By.xpath("html/body/div/div/div[3]/div[1]/div[2]/ul/li[3]/a")).click();
    Thread.sleep(2000);
    Robot r=new Robot();
    // r.keyPress(KeyEvent.VK_ESCAPE);
    // r.keyPress(KeyEvent.VK_CANCEL);
   // r.keyPress(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_ESCAPE);
    driver.close();
    
  }
  
}