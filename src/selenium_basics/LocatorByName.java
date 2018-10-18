package selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("your_password");		

	}

}
