
package DoctorUnite;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DoctorUniteLogin {
 
private WebDriver driver;
 

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void FirefoxLogin() throws Exception {
    driver.get("http://sandbox.doctorunite.com");
    driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
    driver.findElement(By.id("LoginForm_pword")).clear();
    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
    driver.findElement(By.id("loginbutton")).click();
    driver.findElement(By.cssSelector("#drop3 > a.skiptaiconinner.submenu > #profileImage_header")).click();
    String uname=driver.findElement(By.xpath(".//*[@id='UserDisplayName']")).getText();
    assertEquals(uname, "Skipta _qa");
    //driver.findElement(By.cssSelector("#drop3 > a.skiptaiconinner.submenu > #profileImage_header")).click();
    //driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[2]")).click();
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
    driver.findElement(By.cssSelector("#drop3 > a.skiptaiconinner.submenu > #profileImage_header")).click();
    String uname=driver.findElement(By.xpath(".//*[@id='UserDisplayName']")).getText();
    assertEquals(uname, "Skipta _qa");
    driver.close();
  }

 
  
  @Test(priority=2)
  public void IEHomePageEventLink() throws Exception
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
		    driver.findElement(By.cssSelector("#drop3 > a.skiptaiconinner.submenu > #profileImage_header")).click();
		    String uname=driver.findElement(By.xpath(".//*[@id='UserDisplayName']")).getText();
		    assertEquals(uname, "Skipta _qa");
             driver.close();
  }
  
  }

