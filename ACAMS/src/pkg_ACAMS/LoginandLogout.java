
package pkg_ACAMS;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LoginandLogout {
  private WebDriver driver;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void FFLogoutUser() throws Exception {
	  
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(1000);
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
    Thread.sleep(2000);
    driver.findElement(By.linkText("Welcome, Editor1")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.get("http://acams.dev.asentechllc.net/");
    Thread.sleep(2000);
    driver.close();
  }
  @Test(priority=1)
  public void CHLogoutUser() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize(); 
	  
	    driver.get("http://acams.dev.asentechllc.net/");
	    Thread.sleep(1000);
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
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Welcome, Editor1")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Logout")).click();
	    driver.get("http://acams.dev.asentechllc.net/");
	    Thread.sleep(2000);
	    driver.close();
	  }
  
   @Test(priority=2)
  public void IELogoutUser() throws Exception {
	   
	     System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
	    driver.get("http://acams.dev.asentechllc.net/");
	    Thread.sleep(1000);
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
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Welcome, Editor1")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    driver.get("http://acams.dev.asentechllc.net/");
	    Thread.sleep(2000);
	    driver.close();
	  }
}
