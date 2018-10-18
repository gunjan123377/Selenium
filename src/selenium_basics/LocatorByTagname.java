package selenium_basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagname {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());//we can also get size in this way directly.
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//int linkCount = allLinks.size();
		//System.out.println(linkCount);
		System.out.println(allLinks.size());
		/*for(initialization; condition; updation)
		{
			
		}*/
		
		for(WebElement link : allLinks)
		{
			//System.out.println(link.getText());//it is working
			String text = link.getText();
			System.out.println(text);
			
		}
		driver.quit();
	}

}
