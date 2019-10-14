package DoctorUnite;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenNewsArticle {
  private WebDriver driver;
  

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void FirefoxOpenNewsPost() throws Exception {
	    driver.get("http://sandbox.doctorunite.com");
	    driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
	    driver.findElement(By.id("LoginForm_pword")).clear();
	    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
	    driver.findElement(By.id("loginbutton")).click();
	    driver.findElement(By.cssSelector("#menu > #homestream > a")).click();
        driver.findElement(By.xpath(".//*[@id='dsn_notfcn_obj_593eca411d0b4f464b8b457e']/div[1]")).click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
	    driver.quit();
  }

  @Test(priority=1)
  public void ChromeOpenNewsPost() throws Exception 
  { 
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize(); 
	    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);	
	    driver.get("http://sandbox.doctorunite.com");
	    driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
	    driver.findElement(By.id("LoginForm_pword")).clear();
	    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//input[@name='yt4'][@id='loginbutton'][@class='btn btnlogin pull-right']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.cssSelector("#menu > #homestream > a")).click();
	    driver.findElement(By.xpath(".//*[@id='dsn_notfcn_obj_593eca411d0b4f464b8b457e']/div[1]")).click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	    driver.quit();
  }
  
  
  @Test(priority=2)
  public void IEOpenNewsPost() throws Exception
  {
	  System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	     WebDriver driver=new InternetExplorerDriver();
	     	driver.manage().window().maximize();
	     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     	driver.get("http://sandbox.doctorunite.com");
	     	driver.get("javascript:document.getElementById('overridelink').click();");
		    driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
		    driver.findElement(By.id("LoginForm_pword")).clear();
		    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
		    driver.findElement(By.id("loginbutton")).click();
		    driver.findElement(By.cssSelector("#menu > #homestream > a")).click();
	        driver.findElement(By.xpath(".//*[@id='dsn_notfcn_obj_593eca411d0b4f464b8b457e']/div[1]")).click();
	        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	        driver.switchTo().window(tabs2.get(1));
	        driver.close();
	        driver.switchTo().window(tabs2.get(0));
		    driver.quit();
  }
  
}
