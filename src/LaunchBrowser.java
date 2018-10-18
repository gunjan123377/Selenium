
//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//		ChromeDriver driver1 = new ChromeDriver();
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");    
		
		/*driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		*/
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.close();
		
		driver.quit();
		
		//WebElement email = driver.findElement(By.id("email"));
		
		//List<WebElement> a = driver.findElements(By.id(""));
		
		



	}

}
