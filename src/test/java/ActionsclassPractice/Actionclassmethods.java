package ActionsclassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;

public class Actionclassmethods extends commonUtils {

	@BeforeTest
	public void setUp() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
	}

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

	}

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

	@Test(priority = 3)
	public void dragAnddrop() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(2000);
		WebElement destini = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(source, destini).perform();
		Thread.sleep(2000);
		driver.quit();

	}
	@Test(priority = 4)
	public void ClickAndhold() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(2000);
		WebElement destini = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions a3 = new Actions(driver);
		a3.clickAndHold(source).build().perform();
		a3.release(destini).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}
	@Test(priority = 5)
	public void sliderusingdragAnddropBy() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://jqueryui.com/slider/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement slide = driver.findElement(By.xpath("///*[@id='slider']"));
		Thread.sleep(2000);
		Actions a4 = new Actions(driver);
		a4.dragAndDropBy(slide,100, 0).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(priority = 5)
	public void mouseHoverElement() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://www.dtdc.com/in/");
		Thread.sleep(2000);
		WebElement mouseele = driver.findElement(By.xpath("//*[@id='companyDropdown']"));
		Thread.sleep(2000);
		Actions a6 = new Actions(driver);
		a6.moveToElement(mouseele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(2000);
		driver.quit();
}
}