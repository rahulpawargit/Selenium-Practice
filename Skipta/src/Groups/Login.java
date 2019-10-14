

package Groups;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
  private WebDriver driver;
  private String baseUrl;
  
  

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://pulmonologistconnectus.dev.asentechllc.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled2() throws Exception {
    driver.get(baseUrl + "/EliquisPC");
    driver.findElement(By.id("LoginForm_email")).clear();
    driver.findElement(By.id("LoginForm_email")).sendKeys("skiptaneo@gmail.com");
    driver.findElement(By.id("LoginForm_pword")).clear();
    driver.findElement(By.id("LoginForm_pword")).sendKeys("Test@123");
    driver.findElement(By.id("ousideloginbutton")).click();
  }

  
  

  
  
}
