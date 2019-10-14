package firsttestngpackage;



import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
  private WebDriver driver;
  private String baseUrl;
  
  private StringBuffer verificationErrors = new StringBuffer();

  

  
  @Test
  public void IEAddtionalStories() throws Exception
  {
	  
	  System.setProperty("webdriver.ie.driver","C:\\SeleniumDriver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		Thread.sleep(30000);
		 
    driver.get("http://acams.dev.asentechllc.net/");
    
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

 


  
}

