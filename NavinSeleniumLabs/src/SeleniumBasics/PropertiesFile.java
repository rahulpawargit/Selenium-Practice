package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		Properties prop= new Properties();
		
		FileInputStream fl= new FileInputStream("E://Rahul//Testing Docs//Selenium//NavinSeleniumLabs//config.properties");
		prop.load(fl);
		//System.out.println(prop.getProperty("URL"));
		
//if (prop.getProperty("Browser")=="chrome")
	//{
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumDriver\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe" );
		driver= new InternetExplorerDriver();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath(prop.getProperty("firstname"))).sendKeys("Rahul");
		driver.findElement(By.xpath(prop.getProperty("lastname"))).sendKeys("Pawar");
        driver.findElement(By.xpath(prop.getProperty("email"))).sendKeys("rahul.pawar@asentech.com");	
	//}
	//	else
	//	{
	//	System.setProperty("webdriver.InternetExplorer.driver", "C:\\SeleniumDriver\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe" );
	//	driver= new InternetExplorerDriver();
	//	driver.get(prop.getProperty("URL"));
        
	//	}
       
        driver.close();
        
        
        
		
		

	}

}
