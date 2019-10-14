package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alert {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	
	Alert alert=driver.switchTo().alert();
	String str= alert.getText();
	System.out.println(str);
	alert.accept();
	
	if(str.equals("Please enter a valid user name"))
	{
		System.out.println("Message is valid");
	}
	else
	{
		System.out.println("Message is invlalid !!!!");
	}
 
	 driver.close();
	}

}
