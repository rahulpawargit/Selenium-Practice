package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) 
	
	{
		 try {
			 
	            Properties properties = new Properties();
	            FileInputStream fis = new FileInputStream("C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	            properties.load(fis);
	            fis.close();
	 
	            properties.list(System.out);
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (InvalidPropertiesFormatException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

}
}
