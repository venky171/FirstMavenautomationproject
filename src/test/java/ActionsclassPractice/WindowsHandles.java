package ActionsclassPractice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.Edpu.CommonUtils.commonUtils;


public class WindowsHandles extends commonUtils {
	
	@Test
	public void SmartBear() throws InterruptedException {
		
	    Thread.sleep(2000);
		commonUtils.Openbrowser("https://smartbear.com");
		Thread.sleep(2000);
		WebElement allow = driver.findElement(By.xpath("//*[@class='ch2-btn ch2-allow-all-btn ch2-btn-primary']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", allow);
		/*  Actions a =new Actions(driver);
	     WebElement allowBtn = driver.findElement(By.xpath("//*[@class='ch2-btn ch2-allow-all-btn ch2-btn-primary']"));	  a.moveToElement(allowBtn).click().perform();
		  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		    WebElement allowBtn1 = wait.until(
		    ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ch2-btn ch2-allow-all-btn ch2-btn-primary']")) );
		    allowBtn1.click();
		} catch (Exception e) {
		    System.out.println("No cookie popup found.");
		}*/
       // driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=' Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CrossBrowserTesting")).click();
		Thread.sleep(2000);
		Set<String> s=driver.getWindowHandles();
		Thread.sleep(2000);
		List<String> list=new ArrayList<String>(s);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//Thread.sleep(2000);
        driver.switchTo().window(list.get(1));
        Thread.sleep(2000);

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inputEmail']")));
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("vvenkatesh916020@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("venky171");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login-btn']")).click();
        Thread.sleep(2000);
        if(driver.findElement(By.xpath("//*[text()='Unable to find user by email address: vvenkatesh916020@gmail.com']")).isDisplayed()) {
        	System.out.println("user is not able to loin due to invalid credentials");
        }
        else {
        	System.out.println("user is sucessfully login to Account");
        }
       // driver.switchTo().window(list.get(0));
	}}
