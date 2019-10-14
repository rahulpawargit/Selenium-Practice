
package Groups;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliqus{
  private WebDriver driver;
 
/*
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
   
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
  }

  @Test
  public void testUntitled2() throws Exception 
  {
    //driver.get("http://pulmonologistconnectus.dev.asentechllc.net/");
   
    driver.get("http://doctorunite.dev.asentechllc.net/EliquisDU");
    driver.findElement(By.id("LoginForm_email")).clear();
    driver.findElement(By.id("LoginForm_email")).sendKeys("skiptaneo@gmail.com");
    driver.findElement(By.id("LoginForm_pword")).clear();
    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
    driver.findElement(By.id("ousideloginbutton")).click();
    driver.findElement(By.xpath(".//*[@id='drop3']/a")).click();
    driver.findElement(By.xpath(".//*[@id='profileDropDown']/div[2]/form/ul/li[8]/a/div/div/div/label")).click();
    //driver.findElement(By.cssSelector("#AboutELIQUIS>span")).click();
    
    //driver.get( "http://doctorunite.dev.asentechllc.net//EliquisDU");
    driver.findElement(By.cssSelector("span")).click();
    driver.findElement(By.cssSelector("#AboutELIQUIS > span")).click();
    driver.findElement(By.cssSelector("#Dosing > span")).click();
  }  
    */
  
 // private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://sandbox.doctorunite.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/site");
    driver.findElement(By.id("LoginForm_email")).click();
    driver.findElement(By.id("LoginForm_email")).clear();
    driver.findElement(By.id("LoginForm_email")).sendKeys("qa@asentech.com");
    driver.findElement(By.id("LoginForm_pword")).clear();
    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
    driver.findElement(By.id("loginbutton")).click();
    assertEquals(driver.findElement(By.xpath(".//*[@id='profileImage_header']")).getText(), "Skipta _qa");
  }

  }

  

