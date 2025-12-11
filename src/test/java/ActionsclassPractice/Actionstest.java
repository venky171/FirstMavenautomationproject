package ActionsclassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;

public class Actionstest extends commonUtils {

	
//	@BeforeTest
//	public void setUp() throws InterruptedException {
//		Thread.sleep(2000);
//		commonUtils.Openbrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
//	}
//     
/*	
	@Test(priority = 1)
	public void actionClickMethod() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		Actions a = new Actions(driver);
		a.click(we).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}*/
	@Test(priority = 2)
	public void doubleclick() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://api.jquery.com/dblclick/#trigger2");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement we1 = driver.findElement(By.tagName("div"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(we1).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}
}
