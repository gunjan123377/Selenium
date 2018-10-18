package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {

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
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Alert Popups 
		/*WebElement alertbutton = driver.findElement(By.xpath("//button[contains(text(), 'display an  alert box')]"));
		alertbutton.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();*/
		
		
		//confirmation popups
		/*driver.findElement(By.xpath("//a[@href='#CancelTab']")).click(); 
		driver.findElement(By.xpath("//button[contains(text(), 'display a confirm box')]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	//	alert.accept();
		alert.dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);*/
		
		
		//Modal Popups
		
		WebElement alertbox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		alertbox.click();
		WebElement modalbutton = driver.findElement(By.xpath("//button[contains(text(), 'demonstrate the prompt box')]"));
		modalbutton.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Edureka");
		Thread.sleep(3000);
		alert.accept();
		String text = driver.findElement(By.id("demo1")).getText();
		System.out.println(text);
		driver.quit();
		}

}
