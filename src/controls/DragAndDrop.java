package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		//WebElement column = driver.findElement(By.id("column-2"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(block1, block3).perform();
		
	}

}
