package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID']")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[@class='wHuge4s2 required']")).sendKeys("Class");
		//driver.findElement(By.xpath("//input[contains(@maxlength,'64')]")).sendKeys("Contains");
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'ControlGrou')]")).sendKeys("Start With");
		// driver.findElement(By.xpath("//input[ends-with(@id,'TextBoxUserID')]")).sendKeys("Ends With");
		
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();

	}

}
