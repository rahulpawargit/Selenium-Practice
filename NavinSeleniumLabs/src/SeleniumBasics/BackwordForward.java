package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackwordForward {

	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			
			driver.navigate().to("http://www.amazon.com");
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			driver.navigate().forward();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			System.out.println("Page refreshed!!!");
			
			driver.close();
	}

}
