package lokidemo;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazonlogin {
	
	 WebDriver driver;
	 
	

	    @Test


	    public  void LoginTest() throws Exception
	    {
	        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
	        driver =new ChromeDriver();
	        driver.manage().window().maximize() ;
	        driver.get("https://www.amazon.in/");
	   
	  

	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" ");
	       
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        
	        
	        
	        
	        /*telugu*/
	        
	        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span")).click();
	        
	        
	       // WebElement radio= driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[5]/div/label/i"));
	        
	        //radio.click();	   
	        
	       // driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
	      
	   /*   WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[3]/span/i"));
	      checkbox.click();*/
	     
	        
	        /*mouse hover actions*/
	        
	        WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));

	      //Creating object of an Actions class
	      Actions action = new Actions(driver);

	      //Performing the mouse hover action on the target element.
	      action.moveToElement(ele).perform();
	      
	      Thread.sleep(2000);
	        
	      WebElement ele0 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
	      Actions action0 = new Actions(driver);
	      action0.moveToElement(ele0).perform();
	        
	        
             
	        Thread.sleep(2000);
	        
	        WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		      Actions action1 = new Actions(driver);
		      action1.moveToElement(ele1).perform();
		        
		        
	             
		        Thread.sleep(2000);
		        
		        WebElement ele2 =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
			      Actions action2 = new Actions(driver);
			      action2.moveToElement(ele2).perform();
			        
			        
		             
			        Thread.sleep(2000);
	       
	      
	        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	        
	        dropdown.selectByIndex(1);
	        
	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" morning");
		       
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
	        
	        
	        Thread.sleep(1000);
	       
	        
	        Select dropdown1= new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	        
	        dropdown1.selectByIndex(2);
	        
	        Thread.sleep(2000);
	        
	        dropdown1.selectByIndex(3);
	        
	        Thread.sleep(2000);
	        
	        dropdown1.selectByIndex(4);
	        
	        Thread.sleep(2000);
	        
	        dropdown1.selectByIndex(5);
	        
	        Thread.sleep(2000);
	        

	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("wrist band");
	      
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        
	      /*telugu*/ // driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[2]/h2/a/span")).click();
	        
	       driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	     
	        
	       
			driver.quit();

	        
		
	    }
	    
	    
	   


}
