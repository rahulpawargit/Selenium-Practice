package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadProperties {
  @Test
  public void chrome(Properties props)
  {
		try
		{ 
        Properties pr = new Properties();
         FileInputStream fis = new FileInputStream("E:\\Rahul\\Testing Docs\\Selenium\\C&EN\\PropertyDetails\\Configuration.properties");
         pr.load(fis);
         
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (InvalidPropertiesFormatException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
	   System.out.println("URL ::" + props.getProperty("URL"));
	   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver= new  ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(pr.getProperty("URL"));
	   driver.close();
  } 
}
