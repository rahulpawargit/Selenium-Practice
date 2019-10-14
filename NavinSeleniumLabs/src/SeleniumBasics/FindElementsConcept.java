package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	List<WebElement> linklist=	driver.findElements(By.tagName("a"));
	
	
	System.out.println(linklist.size());
	
	for(int i=0; i<linklist.size();i++)
	{
		String linktext= linklist.get(i).getText();
		System.out.println(linktext);
	}
	}
	

}
