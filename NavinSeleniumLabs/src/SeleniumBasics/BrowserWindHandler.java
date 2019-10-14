package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> win= driver.getWindowHandles();
		
		Iterator<String> it= win.iterator();
		
		String mainwindow= it.next();
		System.out.println("Main Window id is= " +mainwindow);
		Thread.sleep(2000);
		
		String childwindow= it.next();
		System.out.println("child window id=" +childwindow);
		Thread.sleep(2000);
		
		driver.switchTo().window(childwindow);
		String chtilte= driver.getTitle();
		System.out.println("Childwindow title= " +chtilte);
		driver.close();
		
		driver.switchTo().window(mainwindow);
		String mainwidowtitle= driver.getTitle();
		System.out.println("Main window titile= " +mainwidowtitle);
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
