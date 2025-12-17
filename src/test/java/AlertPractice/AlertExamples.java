package AlertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;

public class AlertExamples extends commonUtils {

	// alert is an interface it contains methods are like
	// accept(),dismiss(),getext(),sendkeys()

	@Test(priority = 1)
	public void actionClickMethod() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Show Prompt")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("testing by venkatesh");
		Thread.sleep(2000);
		System.out.println(a.getText());
		Thread.sleep(4000);
		a.accept();  //ok
		//a.dismiss();  //cancel

	}
}
