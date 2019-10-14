package firsttestngpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserCalling {


 private static WebDriver driver = null;

 @Test
 @Parameters( {"BROWSER"}) 
 public  void testread(String BROWSER)throws Exception{
  System.out.println("Browser: " + BROWSER);
  
   if (BROWSER.equals("CH")){
   System.out.println("Google chrome is selected");
   driver = new ChromeDriver();
  }
  driver.navigate().to("http://www.yahoo.com");
  Thread.sleep(10000);
  
  
  driver.close();

 }
}
