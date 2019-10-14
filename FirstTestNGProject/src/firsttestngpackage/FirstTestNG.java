package firsttestngpackage;

import org.testng.annotations.*;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class FirstTestNG {
	
	public WebDriver driver=new FirefoxDriver();
	
  
@Test
  public void d() {
	  driver.navigate().to("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  String title= driver.getTitle();
	  AssertJUnit.assertTrue(title.contains("Register page"));
  }
 @Test
 public void e()
 {
driver.close();
 }
 @Test
 public void c()
 {
	 driver.manage().window().maximize();
 }
 
}
