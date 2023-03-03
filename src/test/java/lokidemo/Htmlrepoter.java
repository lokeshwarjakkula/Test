package lokidemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Htmlrepoter {
	
	 WebDriver driver;
	 
	

	    @Test


	    public void LoginTest() throws Exception
	    {
	        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
	        driver =new ChromeDriver();
	        driver.manage().window().maximize() ;
	        driver.get("https://www.amazon.in/");
	        Reporter.log("Pass- enter url");

	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" ");
	        Reporter.log("Pass- enter space");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        Reporter.log("Pass- click");

	        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	        dropdown.selectByIndex(1);
	        Reporter.log("Pass- skills");
	        dropdown.selectByIndex(2);
	        Reporter.log("Pass- devices");
	        dropdown.selectByIndex(3);
	        Reporter.log("Pass- fashion");
	        dropdown.selectByIndex(4);
	        Reporter.log("Pass- fresh");
	        dropdown.selectByIndex(5);
	        Reporter.log("Pass- pharmacy");

	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("wrist band");
	        Reporter.log("Pass- enter wrist band");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        Reporter.log("Pass- click");
	        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	        Reporter.log("Pass- click");
	        
	    	

	        driver.quit();
	    }

}
