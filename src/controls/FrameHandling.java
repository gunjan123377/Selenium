package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

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
		
		//handling frame using index
		/*driver.switchTo().frame(0);
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("Edureka");*/
		
		
		//handling frame using webelement with iframe tag
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame);
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("Edureka");
		
		//handling frame using id or name attribute of iframe tag
		/*driver.switchTo().frame("");
		WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("Edureka");
		 */

		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();

	}

}
