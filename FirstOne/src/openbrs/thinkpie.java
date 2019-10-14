package openbrs;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class thinkpie {
  
	@Test (priority=1)
  public void thinkpieFirefox() throws InterruptedException
  
  {
	   System.setProperty("webdriver.firefox.marionette","C:/SeleniumDriver/geckodriver-v0.20.0-win64");
	   WebDriver driver=new FirefoxDriver();
	 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://thinkpei.dev.asentechllc.net/");
    driver.findElement(By.cssSelector("a.continue > span")).click();
    
    Actions act=new Actions(driver);
    WebElement mainMenu= driver.findElement(By.xpath("//a[text()='Understanding PEI']"));
    act.moveToElement(mainMenu);
    
    WebElement submenu=driver.findElement(By.linkText("What is PEI?"));
    act.moveToElement(submenu);
    act.click().build().perform();
    
    //act.moveToElement((WebElement) driver.findElement(By.xpath("//a[text()='Understanding PEI']"))).perform();
    //WebElement we= WebDriver.findElement(By.xpath(//a[text()='Understanding PEI']'));
   // Thread.sleep(500);
  // driver.findElement(By.linkText("What is PEI?")).click();
   driver.findElement(By.cssSelector("a.top-page")).click();
   driver.close();
  }

  
}