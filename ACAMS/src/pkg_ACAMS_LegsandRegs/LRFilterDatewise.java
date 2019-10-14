
package pkg_ACAMS_LegsandRegs;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LRFilterDatewise {
  private WebDriver driver;
  

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLLFilterDatewise() throws Exception {
    driver.get("http://acams.dev.asentechllc.net/legs_and_regs/");
    driver.findElement(By.linkText("Legs & Regs")).click();
    driver.findElement(By.id("start_date")).click();
    driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-w")).click();
    driver.findElement(By.linkText("4")).click();
    driver.findElement(By.linkText("1")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.id("end_date")).click();
    driver.findElement(By.linkText("16")).click();
  }

 
}
