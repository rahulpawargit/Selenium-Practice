


package pkg_ACAMS_LegsandRegs;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LREmailFriend {
  private WebDriver driver;
 

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLLEmailAFriend() throws Exception {
    driver.get("http://acams.dev.asentechllc.net/legs_and_regs/");
    driver.findElement(By.xpath("//h3/a")).click();
    driver.findElement(By.cssSelector("#email > button[type=\"button\"]")).click();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.findElement(By.id("your_name")).clear();
    driver.findElement(By.id("your_name")).sendKeys("Rahul");
    driver.findElement(By.id("your_email_id")).clear();
    driver.findElement(By.id("your_email_id")).sendKeys("pwrahul@gmai.com");
    driver.findElement(By.id("your_friend_email_id")).clear();
    driver.findElement(By.id("your_friend_email_id")).sendKeys("rahul.pawar@asentec.com");
    driver.findElement(By.id("submit")).click();
    driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    
    
    
  }

  
}
