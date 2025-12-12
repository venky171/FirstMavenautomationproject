package ActionsclassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.Edpu.CommonUtils.commonUtils;

public class ActionsKeysMethodExample2 extends commonUtils {

	@Test
	public void dropdownrelated() throws InterruptedException {
		// keys is a enum class which comes from selenium to represents keyboard keys

		commonUtils.Openbrowser("https://www.tgsrtcbus.in/index.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='close_icon']")).click();
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='rc_select_0']"));
		ele1.sendKeys("hyd");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	
	}
}
