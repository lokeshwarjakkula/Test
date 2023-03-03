package lokidemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	
	 public  static   WebDriver OpenChromeBrowser()throws Exception
	 {
	
			 	WebDriver driver; 
			
			 	 System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
			 	driver =new ChromeDriver();
			 	driver.manage().window().maximize() ;	

		    return driver;
			
	}


}
