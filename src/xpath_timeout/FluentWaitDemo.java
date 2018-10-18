package xpath_timeout;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static WebDriver driver = null;
	public static Wait<WebDriver> wait= null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
	
		wait = new FluentWait<WebDriver>(driver).withTimeout(5, TimeUnit.SECONDS)    //DEPRICATED
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);   //NO MORE USED
		
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/strial1/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hema.gowda82");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("Apple12345");
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()= 'Login ']"));
		loginBtn.click();
		
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));      
		
		if(logoutLink.isDisplayed())
		{
			System.out.println("Logged in successfully");
		}
		else
			System.out.println("Unable to login, Pleaseenter valid credentrials");
		
		

	}

}
