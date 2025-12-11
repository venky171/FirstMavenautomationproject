package ActionsclassPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.Edpu.CommonUtils.commonUtils;


public class ActionsKeysMethodExample extends commonUtils{

	@Test
	public void  Actions_PageNavigation_Test() throws InterruptedException {
		//keys is a enum class which comes from selenium to represents keyboard keys
		
		commonUtils.Openbrowser("https://www.goibibo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='logSprite icClose']")).click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.END).perform();////till end it will take the page
		Thread.sleep(2000);
		actions.sendKeys(Keys.HOME).perform();////till home it will take the page
		Thread.sleep(3000);
	
		}}

