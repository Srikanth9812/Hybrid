package june12;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil;

public class FirstTestNGClass extends AppUtil {
	@Test
	public void branches()
	{
		driver.findElement(By.xpath("(//table[@id='Table_01']//img)[1]")).click();
		Reporter.log("Executing Branches test",true);
	}
	@Test
	public void roles() 
	{
		driver.findElement(By.xpath("(//table[@id='Table_01']//img)[2]")).click();
		Reporter.log("Executing roles test",true);
	}
	@Test
	public void users()
	{
		driver.findElement(By.xpath("(//table[@id='Table_01']//img)[3]")).click();
		Reporter.log("Executing users test",true);
	}

}
