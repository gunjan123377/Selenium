package xpath_timeout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByAbsoluteXpath {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String absoluteXpath = "/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input";
		WebElement email = driver.findElement(By.xpath(absoluteXpath));
		email.sendKeys("your_email@something.com");

	}

}
//it always start from single forward slash.
//it always start from root element means html and we have to write all the open tag till we find relevant web element.
//We generally do not use this as it is lengthly and time consuming.
//Now a days each & every web portal's development is running parallely for adding new features, due to which tag may change.

