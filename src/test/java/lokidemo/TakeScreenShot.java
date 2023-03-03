package lokidemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.text.SimpleDateFormat;

import org.testng.annotations.*;
import java.io.File;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import java.util.*;

public class TakeScreenShot
{
	
	WebDriver driver;
	
	String OutputFolder,TestName="Test11";
	
	
	@BeforeTest
	public void Create_Output_Folder()throws Exception {
		

	SimpleDateFormat sdfDate5 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
	Date now5 = new Date();
	String strDate6 = sdfDate5.format(now5);
	
	String OutputFolder1 ="D:\\HTML Report";
	OutputFolder = OutputFolder1 	+ "\\" + "New_Folder_" +  strDate6;
	
	}
	
	@Test
	public void Test11() throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
	        driver =new ChromeDriver();
	        driver.manage().window().maximize() ;
		
		String TestURL = "https://www.amazon.in";
		TakeScreenShotAuto(driver);
		
		driver.get(TestURL);
		TakeScreenShotAuto(driver);
		
		findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pen ");
	       
		TakeScreenShotAuto(driver);
		
		findElement(By.id("nav-search-submit-button")).click();
		TakeScreenShotAuto(driver);
		
	    findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" morning");
		TakeScreenShotAuto(driver);
		
		driver.quit();

	}
	
	
	
	public void TakeScreenShotAuto(WebDriver driver) throws Exception
	{
		
	
	 //Timestamp  append for .png file
	 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
	 Date now = new Date();
	 String strDate = sdfDate.format(now);
	 
	 //Takes screenshot
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	     
	 //Move image file to new destination
	 String fileWithPath= OutputFolder +"\\"+TestName+"_"+strDate +".png";
	 File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("HTML Screen Shot Path : "+ScreenShotPath);

	}
	
//javascript executor is used for highlight the selection and used for instance driver
	
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}
	
	

}












