package firsttestngpackage;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CallURL {  
	
  @Test
  public void Callfile()
  {
	  File file=new File("D:\\Rahul\\Testing Docs\\Selenium\\FirstTestNGProject\\src\\firsttestngpackage\\PassURL.properties");
	  FileInputStream fileread=null; 
	  Properties pro=new Properties();
  try
  {
	 fileread=new FileInputStream(file); 
  }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
  try
  {
	  pro.load(fileread);
  }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver= new  ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get(pro.getProperty("URL"));
  driver.findElement(By.id("Email")).sendKeys(pro.getProperty("USERNAME"));
  driver.findElement(By.id("next")).click();
  driver.findElement(By.id("Passwd")).sendKeys(pro.getProperty("PASSWORD"));
  driver.findElement(By.id("signIn")).click();
  driver.close();
  }
  
}
