package openbrs;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Subscribe {
  @Test
  public void firefox() throws Exception {
	  
    System.setProperty("webdriver.firefox.marionette","C:/SeleniumDriver/geckodriver-v0.20.0-win64");
    WebDriver driver=new FirefoxDriver();
    driver.get("http://djcoregon.com/subscribe/?source=wp_head");
    driver.findElement(By.xpath("//div[@id='main-content']/div[2]/div/article/div/div[2]/p[3]/a/strong")).click();
    driver.findElement(By.xpath("//div[@id='sub_c_1']/div[3]/a/div/span")).click();
    
    //driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='sub_c_1']/div[3]/a/div/span")));
    
    System.out.println("I am on Frame");
    //driver.findElement(By.cssSelector("div.lst_btn > span")).click();
    driver.findElement(By.xpath("//input[@id='prefix']")).clear();
   /* driver.findElement(By.xpath("//input[@id='prefix']")).sendKeys("Mr");
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Rahul");
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Pawar");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("Asentech");
    driver.findElement(By.id("company")).clear();
    driver.findElement(By.id("company")).sendKeys("Pune");
    new Select(driver.findElement(By.id("industry"))).selectByVisibleText("Non-profit/Government/Education");
    driver.findElement(By.id("address1")).clear();
    driver.findElement(By.id("address1")).sendKeys("Pune");
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Pune");
    new Select(driver.findElement(By.id("state"))).selectByVisibleText("Illinois");
    driver.findElement(By.id("zip")).clear();
    driver.findElement(By.id("zip")).sendKeys("68899");
    driver.findElement(By.id("phone")).clear();
    driver.findElement(By.id("phone")).sendKeys("9098766789");
    driver.findElement(By.id("e_mail_1")).clear();
    driver.findElement(By.id("e_mail_1")).sendKeys("rahul.pawar@asentech.com");
    driver.findElement(By.id("user_ID")).clear();
    driver.findElement(By.id("user_ID")).sendKeys("rahul.pawar");
    driver.findElement(By.id("user_password")).clear();
    driver.findElement(By.id("user_password")).sendKeys("123456");
    driver.findElement(By.id("user_password_confirm")).clear();
    driver.findElement(By.id("user_password_confirm")).sendKeys("123456");
    */
  }

 

 

  

  
}
