package KeywordDrivenFramewords;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class ActionKeyword {

			public static WebDriver driver;

		public static void openBrowser(){		
			driver=new FirefoxDriver();
			}

		public static void navigate(){	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
			}

		public static void input_userName(){
			driver.findElement(By.name("name")).sendKeys("Rahul"); 
			}

		public static void input_Password(){
			driver.findElement(By.id("password")).sendKeys("Test@123");
			}
		public static void input_Cpassword(){
			driver.findElement(By.id("confirmpassword")).sendKeys("Test@123");
			}

		public static void click_Login(){
			driver.findElement(By.id("insert")).click();
			}

		public static void waitFor() throws Exception{
			Thread.sleep(5000);
			}

		

		public static void closeBrowser(){
				driver.quit();
			}

		}	


