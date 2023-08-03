package June16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Property_File {
	Properties prop;
	WebDriver driver;
	@Test
	public void startTest() throws Throwable
	{
		prop=new Properties();
		//load file
		prop.load(new FileInputStream("E:\\110clockselenium\\TestN_FrameWork\\Login.properties"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("Url"));
		driver.findElement(By.xpath(prop.getProperty("Objuser"))).sendKeys("Admin");
		driver.findElement(By.xpath(prop.getProperty("Objpass"))).sendKeys("Admin");
		driver.findElement(By.xpath(prop.getProperty("ObjLogin"))).click();
		driver.quit();
		
		
	}

}
