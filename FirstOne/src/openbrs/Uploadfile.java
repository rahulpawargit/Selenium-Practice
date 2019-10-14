package openbrs;

import org.testng.annotations.Test;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Uploadfile  {

  @Test
  public void Chrm() throws Exception {
	     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://topdf.com/");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//div[@id='switch']/label/span"));
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//input[@id='html5_1cauk95i610eo17qiaeb43e1tbr3']")).clear();
        // driver.findElement(By.id("id=html5_1cauk95i610eo17qiaeb43e1tbr3")).sendKeys("E:\test.png");
  }
  
  }

