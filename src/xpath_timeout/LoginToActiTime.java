package xpath_timeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("gun.jaan12@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("chandan1292");
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginBtn.click();
		
		driver.findElement(By.id("userNavigationLabel"));      
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		
		/*
		if(logoutLink.isDisplayed())
		{
			System.out.println("Logged in successfully");
		}
		else
			System.out.println("Unable to login, Pleaseenter valid credentrials");
		
		*/

	}

}
