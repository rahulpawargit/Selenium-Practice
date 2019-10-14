package AndroidTest;
import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class  TESt {
	@org.testng.annotations.Test
	public  void opendevie()
	{
		
		
		//Set the Desired Capabilities
		DesiredCapabilities caps= new DesiredCapabilities();
		
		caps.setCapability("deviceName", "Pixel API 25");
		caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.2");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		caps.setCapability("noReset", "true");
		
		System.out.println("Hello");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
	
 
}
