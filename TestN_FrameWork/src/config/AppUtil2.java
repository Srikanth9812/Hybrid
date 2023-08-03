package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtil2 {
	public static WebDriver driver;
	@BeforeSuite
	public static void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@AfterSuite
	public static void tearDown()
	{
		driver.quit();
	}
	

}
