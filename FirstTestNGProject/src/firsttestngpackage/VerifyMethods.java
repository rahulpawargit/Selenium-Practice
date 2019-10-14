package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class VerifyMethods {
  
  public WebDriver driver=new FirefoxDriver();
 // public String url="http://newtours.demoaut.com/";
  String Expected=null;
  String Actual=null;
  
  
  
  @Test
  public void Register() {
	  
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.partialLinkText("REGISTER")).click();
	  String title= driver.getTitle();
	  Assert.assertTrue(title.contains("Register: Mercury Tours"));
	  
  }
  @Test(priority =0 )
  public void Support()
  {
	driver.findElement(By.partialLinkText("SUPPORT")).click(); 
	String title=driver.getTitle();
	Assert.assertTrue(title.contains("Under Construction: Mercury Tours"));
	driver.findElement(By.partialLinkText("Home")).click();
	  
  }
  @Test (priority =1 )
  public void Backhome()
  {
	  
	  
	  Expected="Welcome: Mercury Tours";
	  Actual=driver.getTitle();
	  Assert.assertEquals(Actual, Expected);
  }
  @Test (priority =2 )
  public void Quit()
  {
	  driver.close();
  }
  
}
