package xpath_timeout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByRelativeXpath {

	public static WebDriver driver = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//String relativeXpath = "//tagname[@attribute = 'value'] ";     //syntax
		WebElement email = driver.findElement(By.xpath("//input[@type= 'email']"));
		email.sendKeys("email");

		//xpath with text method.
		//String xpathWithTextMethod = "//tagname[text()='text of webelement']";   //syntax
		
		WebElement create = driver.findElement(By.xpath("//span[text() = 'Create an account']"));
		
		System.out.println(create.getText());
		
		//xpath with starts-with and contains
		
		String xpathWithStartsWith = "//tagname[starts-with(@attribute, 'partial_value')]";
		WebElement mobile = driver.findElement(By.xpath("//input[starts-with(@aria-label,'Mobile number or')]"));
		mobile.sendKeys("45687452654");
		
		String xpathWithContains = "//tagname[contains(@attribute, 'partial_value')]";
		WebElement mobile1 = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or')]"));
		mobile.sendKeys("45687452654");
		
		String containsWithTextMethod = "//tagname[contains(text(),'partial_value')]";
		String startsWithTextMethod = "//tagname[starts-with(text(),'partial_value')]\"";
		
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Facebook helps you')]"));
		System.out.println(text.getText());

		//xpath with groups and indexes
		
		WebElement surname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		surname.sendKeys("abcdef");
		

		
		
	}

}
//Syntex for relative xpath
//tagname[@attribute='value']
//