package DoctorUnite;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SharePost {
  private WebDriver driver;
  

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void Firefoxfollow() throws Exception {
	    driver.get("http://sandbox.doctorunite.com");
	    driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
	    driver.findElement(By.id("LoginForm_pword")).clear();
	    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
	    driver.findElement(By.id("loginbutton")).click();
	    driver.findElement(By.cssSelector("#menu > #homestream > a")).click();
	    driver.findElement(By.cssSelector("img.share")).click();
	    driver.findElement(By.linkText("Facebook")).click();
	   // driver.switchTo().window("popup");
	   // Assert.assertEquals("Popup", driver.getTitle());
	    
	    
	   // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | f21045f714b2116 | 30000]]
	   driver.findElement(By.linkText("Twitter")).click();
	  // driver.findElement(By.id("tweet_597b5801eb15f5b42e8b4666")).click();
	   // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _xd_1 | 30000]]
        
	    driver.quit();
  }

  @Test(priority=1)
  public void ChromeLogin() throws Exception 
  { 
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new  ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
	driver.get("http://sandbox.doctorunite.com/site");       
	driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
    driver.findElement(By.xpath(".//*[@id='LoginForm_pword']")).sendKeys("Test@123"); 
    driver.findElement(By.xpath("//input[@name='yt4'][@id='loginbutton'][@class='btn btnlogin pull-right']")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("loginbutton")).click();
    driver.findElement(By.cssSelector("#menu > #homestream > a")).click();
    
    driver.findElement(By.cssSelector("img.share")).click();
    driver.findElement(By.linkText("Facebook")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | f21045f714b2116 | 30000]]
    driver.findElement(By.linkText("Twitter")).click();
    //driver.findElement(By.id("tweet_597b5801eb15f5b42e8b4666")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _xd_1 | 30000]]
    driver.close();
  }
  
  
  @Test(priority=2)
  public void IEfollow() throws Exception
  {
	  System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://sandbox.doctorunite.com/site");
		 driver.get("javascript:document.getElementById('overridelink').click();");
		 driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
		 driver.findElement(By.xpath(".//*[@id='LoginForm_pword']")).sendKeys("Test@123");
		 driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		 driver.findElement(By.cssSelector("#menu > #homestream > a")).click();
		    driver.findElement(By.cssSelector("img.share")).click();
		    driver.findElement(By.linkText("Facebook")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | f21045f714b2116 | 30000]]
		    driver.findElement(By.linkText("Twitter")).click();
		   // driver.findElement(By.id("tweet_597b5801eb15f5b42e8b4666")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _xd_1 | 30000]]
         driver.close();
  }
  
}