package openbrs;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class fisrtIDE {

	


	  private WebDriver driver;
	  private StringBuffer verificationErrors = new StringBuffer();

	 

	  @Test
	  public void testUntitled() throws Exception {
		   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new  ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://cendevqa.acs.org/index.html");
	    
	    driver.findElement(By.xpath("//li/a/i")).click();
	    Thread.sleep(5000L);
	    driver.findElement(By.linkText("Analytical Chemistry")).click();
	    try {
	      assertEquals(driver.getTitle(), "Analytical Chemistry | C&EN");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	  }

	  
	  }

	  

	  
	  
	

	

