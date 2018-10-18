package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InlineFrames
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
			WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src= 'MultipleFrames.html']"));
			driver.switchTo().frame(outerFrame);
			driver.switchTo().frame(0);
			WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
			textBox.sendKeys("Inline Frames");
		
	}

}
