package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

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
		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
		
		WebElement dept = driver.findElement(By.xpath("//span[text()='Departments']"));
		action.moveToElement(dept).perform();
		
		WebElement books = driver.findElement(By.xpath("//span[text()='Books & Audible']"));
		action.moveToElement(books).perform();
		
		WebElement textbooks = driver.findElement(By.xpath("//span[text()='Textbooks']"));
		textbooks.click();
		

	}

}
