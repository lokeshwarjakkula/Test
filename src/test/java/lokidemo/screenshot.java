package lokidemo;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class screenshot{
	
	 WebDriver driver;
	 
	

	    @Test

	    public void testTakeScreenShot() throws Exception{

			WebDriver driver ;
			  System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		        driver =new ChromeDriver();

	        //goto url

		        driver.get("https://www.amazon.in/");
		        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" ");
		        Reporter.log("Pass- enter space");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test0.png") ;  
		        
		        driver.findElement(By.id("nav-search-submit-button")).click();
	
    // genarates html report
		        
		        Reporter.log("Pass- click"); 
   // takes screenshoot
		        
		        this.takeSnapShot(driver, "D:\\test screenshoot//test1.png") ;     

	// selects dropdown
		        
		        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		        dropdown.selectByIndex(1);
		        Reporter.log("Pass- skills");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test2.png") ;   
		        
		        dropdown.selectByIndex(2);
		        Reporter.log("Pass- devices");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test3.png") ;   
		        
		        dropdown.selectByIndex(3);
		        Reporter.log("Pass- fashion");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test4.png") ;   
		        
		        dropdown.selectByIndex(4);
		        Reporter.log("Pass- fresh");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test5.png") ;   
		        
		        dropdown.selectByIndex(5);
		        Reporter.log("Pass- pharmacy");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test6.png") ;   

		        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("wrist band");
		        Reporter.log("Pass- enter wrist band");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test7.png") ;   
		        
		        driver.findElement(By.id("nav-search-submit-button")).click();
		        Reporter.log("Pass- click");
		        this.takeSnapShot(driver, "D:\\test screenshoot//test8.png") ;   
		        
		        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		        Reporter.log("Pass- click");
		        

	        //Call take screenshot function

	        this.takeSnapShot(driver, "D:\\test screenshoot//test.png") ;     

	    }

	    /**

	     * This function will take screenshot

	     * @param webdriver

	     * @param fileWithPath

	     * @throws Exception

	     */

	    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }

	}
	   

