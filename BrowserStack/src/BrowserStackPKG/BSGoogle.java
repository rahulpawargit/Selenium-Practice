package BrowserStackPKG;

import org.testng.annotations.Test;

public class BSGoogle {
	public class SingleTest extends BrowserStackTestNGTest {

	    @Test
	    public void test() throws Exception {
	        driver.get("https://www.google.com/ncr");
	        WebElement element = driver.findElement(By.name("q"));
	        element.sendKeys("BrowserStack");
	        element.submit();
	        Thread.sleep(5000);

	        Assert.assertEquals("BrowserStack - Google Search", driver.getTitle());
	    }
	}
}

