import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:/Rahul/Testing Docs/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.softwaretestingmaterial.com/");
       // System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
        driver.close();
		
		
		

	}

}
