package controls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserPopUps {

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
		
		driver.get("http://www.popuptest.com/");
		String handle = driver.getWindowHandle();					//id of parent window
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.switchTo().window(handle).getCurrentUrl());
		
		WebElement multiPopup = driver.findElement(By.linkText("Multi-PopUp Test"));
		multiPopup.click();
		Set<String> handles = driver.getWindowHandles();
		
		
		for(String window : handles)
		{
			if(window.equals(handle))
				continue;
			else
			{
				String url = driver.switchTo().window(window).getCurrentUrl();
				System.out.println(url);
				driver.close();
			}
		}

	}

}
