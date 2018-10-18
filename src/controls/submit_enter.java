package controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class submit_enter 
{	public static WebDriver driver=null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.id("lst-ib"));
		search.sendKeys("https://www.cricbuzz.com/");
		search.submit();*/
		driver.get("https://www.cricbuzz.com/");
		WebElement search =driver.findElement(By.xpath("(//div[@class=\"cb-ovr-flo\"])[1]"));
		System.out.println(search.getText());
		
	}

}
