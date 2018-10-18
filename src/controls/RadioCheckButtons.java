package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioCheckButtons 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Zerobean/Downloads/Sample%20Web%20Page.html");
		
		WebElement femaleBtn = driver.findElement(By.id("radio_id2"));
		femaleBtn.click();
		System.out.println(femaleBtn.isEnabled());
		
		
		WebElement maleCheck = driver.findElement(By.id("chk_id1"));
		maleCheck.click();
		System.out.println(maleCheck.isSelected());
		
		
		
	}
}
