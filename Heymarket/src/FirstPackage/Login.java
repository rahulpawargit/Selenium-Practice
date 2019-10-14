package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new  ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://35.173.239.167/login-standalone");
		   
		   driver.findElement(By.id("root_email")).sendKeys("smith11@yopmail.com");;
		 
		   
		   driver.findElement(By.id("root_password")).sendKeys("Admin1234");
		   driver.findElement(By.id("submit")).click();
		   
	}

}
