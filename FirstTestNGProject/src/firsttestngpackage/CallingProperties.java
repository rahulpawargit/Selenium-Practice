package firsttestngpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CallingProperties {
	
	
	@Test
	  public void readinput()
	  {	
		File file= new File("D:\\Rahul\\Testing Docs\\Selenium\\FirstTestNGProject\\src\\firsttestngpackage\\Creditionals.properties");
		FileInputStream fileinput=null;
		
	try
	{
	
	fileinput=new FileInputStream(file);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	Properties pro=new Properties();
	try
	{
		pro.load(fileinput);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get(pro.getProperty("URL"));
	driver.findElement(By.name("name")).sendKeys(pro.getProperty("name"));
	driver.findElement(By.name("password")).sendKeys(pro.getProperty("Password"));
	driver.findElement(By.name("confirmpassword")).sendKeys("CPassword");
	driver.findElement(By.name("insert")).click();
	
  }
	
	
}
