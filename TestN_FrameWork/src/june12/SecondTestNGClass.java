package june12;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil1;

public class SecondTestNGClass extends AppUtil1{
	@Test
	public void Addition()
	{
		driver.findElement(By.id("fld_1")).sendKeys("7645");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		String additionatt=driver.findElement(By.name("")).getAttribute("");
		Reporter.log("Executing Addition test",true);
		Reporter.log("Addition output::"   +additionatt ,true);
		}
	@Test
	public void division()
	{
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		String adddiv=driver.findElement(By.name("")).getAttribute("");
		Reporter.log("Executing division test",true);
		Reporter.log("Division output"    +adddiv,true);
	}
	@Test
	public void multiplication()
	{
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		String addmult=driver.findElement(By.name("")).getAttribute("");
		Reporter.log("Executing division test",true);
		Reporter.log("Division output"    +addmult,true);
		
	}

}
