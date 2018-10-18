package xpath_timeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitDemo {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/strial1/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hema.gowda82");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("Apple12345");
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()= 'Login ']"));
		loginBtn.click();
		
		wait.until(ExpectedConditions.titleContains("Time-Track"));
		
		String expected_Title = "actiTIME - Enter Time-Track";    
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		if(actual_title.equals(expected_Title))
		{
			System.out.println("Logged in successfully");
		}
		else
			System.out.println("Unable to login, Pleaseenter valid credentrials");
		

	}

}
