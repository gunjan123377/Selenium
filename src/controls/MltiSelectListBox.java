package controls;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MltiSelectListBox {

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
		driver.get("file:///C:/Users/Zerobean/Downloads/Sample%20Web%20Page.html?text_name1=&pwd_name1=");
		
		WebElement list = driver.findElement(By.id("list2"));
		Select osel = new Select(list);
		
		osel.selectByIndex(1);
		osel.selectByValue("mlore");
		osel.selectByIndex(4);;
		
		//osel.deselectAll();
		osel.deselectByIndex(4);
		
		List<WebElement> selectedOpts = osel.getAllSelectedOptions();
		int count=selectedOpts.size();
		for(int i = 1; i<count; i++)
		{
			System.out.println(selectedOpts.get(i).getText());
		}
		
		
		WebElement firstOption = osel.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		

	}

}
