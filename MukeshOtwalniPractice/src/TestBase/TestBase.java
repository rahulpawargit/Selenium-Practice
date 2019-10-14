package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{

	
	 Properties prop;
	 WebDriver driver;
	
	public TestBase(WebDriver driver)
	
	{
	 this.driver=driver;		
		
	}
	
	public void inilization( )
	{
		
		try{
			prop = new Properties();
	        FileInputStream ip= new FileInputStream("E:\\Rahul\\Testing Docs\\Selenium\\MukeshOtwalniPractice\\src\\com\\config\\config.properties");
			}
			
			catch(FileNotFoundException e)
			{
			e.printStackTrace();	
			}
			
		String browsername= prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
					
		}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
					
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
	}
	
}
