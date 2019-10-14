package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		//driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Rahul");
		//driver.findElement(By.cssSelector("#firstname")).sendKeys("CSS Selector");
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Rahul");
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Pawar");
		driver.findElement(By.xpath("//*[@id='sex-0']")).click();
		driver.findElement(By.xpath("//*[@id='exp-3']")).click();
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("28/02/2015"); 
	    boolean isChecked=	driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[20]")).isSelected();
	     if (isChecked== false)
			 {
		      driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[20]")).click();
			 }
	     else
	        {
		      driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[20]")).click();
	        }
		Select sel= new Select(driver.findElement(By.id("continents")));
		sel.selectByVisibleText("Europe");
		WebElement uploadfile = driver.findElement(By.xpath("//*[@id='photo']"));
		uploadfile.sendKeys("C://Users//rahul.pawar//Desktop//Desktop//2_background_colour.png");
		Select select = new Select(driver.findElement(By.xpath("//*[@id='selenium_commands']")));
		select.selectByVisibleText("Browser Commands");
		select.selectByVisibleText("Wait Commands");
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		WebElement msg= driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[1]/p[2]"));
		String text= msg.getText();
		System.out.println(text);
		
		/*String exp= "Read this message in your script and Print this in Console.";
		
		if(text.equals(exp))
		{
			System.out.println("Both messages are same");
		}
		else
		{
			System.out.println("Messages are not same!!.....");
		}*/
				}

}
