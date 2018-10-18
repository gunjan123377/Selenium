package selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement firstname = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));  
		//identifying webelement uniquely will not be possible using classname locator
		firstname.sendKeys("firstname");
		//Here, we are getting issue "invalid selector: Compound class names not permitted"
	}

}
