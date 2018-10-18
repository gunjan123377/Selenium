package selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByPartialLinkText {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement forgot = driver.findElement(By.partialLinkText("?"));
		forgot.click();
	}
	
	/*
	 *  //a   - find all the links on a webpage
	 *   
	 *    //a[1] - find all the first links
	 *    
	 *    (//a)[1] - find the very first link
	 * 
	 * 
	 * 
	 * 
	 * */
	 

}
