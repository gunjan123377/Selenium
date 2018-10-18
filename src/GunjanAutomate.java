
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class GunjanAutomate
{
	WebDriver driver;
	public void invokeBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		getCommands();
		
	}
	public void getCommands()
	{
		try {
			driver.get("https://www.amazon.in/");
			String title=driver.getTitle();
			System.out.println(title);
			String url =driver.getCurrentUrl();
			System.out.println(url);
			//String pagesource =driver.getPageSource();
			//System.out.println(pagesource);
			//driver.close();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]")).click();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("gunjan123377@gmail.com");
			//Thread.sleep(4000);
			driver.findElement(By.id("continue")).click();
			//Thread.sleep(4000);
			driver.findElement(By.id("ap_password")).sendKeys("ind000o0");
			//Thread.sleep(4000);
			driver.findElement(By.id("signInSubmit")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String [] args)
	{
		GunjanAutomate  obj = new GunjanAutomate();
		obj.invokeBrowser();
	}

}
