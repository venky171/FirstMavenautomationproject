package EDPUPatientRegestration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;

public class Testngexamples extends commonUtils{
	
	
	
	
	@BeforeMethod
	
	public void openbrowser() {
		
	    commonUtils.baseSetup();
		
	}
	@Test(enabled = true, description = "This method is used to Add the Items to Cart", invocationCount = 2)
	public void addTocart() {
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		commonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		commonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		commonUtils.Thread_Sleep(2);
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		commonUtils.Thread_Sleep(2);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		commonUtils.Thread_Sleep(2);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		commonUtils.Thread_Sleep(2);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	

}
