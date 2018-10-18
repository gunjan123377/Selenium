package controls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleSelectListBox {

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
		driver.get("https://www.cleartrip.com/hotels");
		
		WebElement list = driver.findElement(By.id("travellersOnhome"));
		Select osel = new Select(list);
		
		osel.selectByIndex(2);
		//osel.selectByValue("mlore");
		//osel.selectByVisibleText("Bangalore");
	
		System.out.println(osel.isMultiple());
		
		//count the number of options in a listbox
		
		List<WebElement> allOptions = osel.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		
		
		//print all the options from the listbox
		for(int i = 1; i<count; i++)
		{
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
			System.out.println(allOptions.get(i).getText());
		}
		
		//print the options in sorted order
		
		ArrayList<String> alist = new ArrayList<String>();
		for(int i = 1; i<count; i++)
		{
			WebElement option = allOptions.get(i);
			String text = option.getText();
			alist.add(text);
		}
		
		Collections.sort(alist);
		for(String sorted: alist)
		{
			System.out.println(sorted);
		}
	}

}
