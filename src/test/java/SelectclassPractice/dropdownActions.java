package SelectclassPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;

public class dropdownActions extends commonUtils{

	
	@Test(priority = 1)
	public void actionClickMethod() throws InterruptedException {
		Thread.sleep(2000);
		commonUtils.Openbrowser("https://electoralsearch.eci.gov.in/");
		Thread.sleep(2000);
		//by using send keys we can select dropdown
		driver.findElement(By.xpath("(//select[@class='form-select'])[2]")).sendKeys("Andhra Pradesh");
		
		// i want to check single selection or multi selection 
		WebElement ele= driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));		
		Select s=new Select(ele);
		System.out.println(s.isMultiple());
         
		
		// i want to check  with differnet methods 
				WebElement ele1= driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));		
				Select s1=new Select(ele1);
				Thread.sleep(2000);
				s1.selectByIndex(1);
				Thread.sleep(2000);
				
				
				WebElement ele2= driver.findElement(By.xpath("(//select[@class='form-select'])[2]"));
				Select s2=new Select(ele2);
				Thread.sleep(2000);
				s2.selectByVisibleText("West Bengal");
				Thread.sleep(2000);
				
				WebElement ele3= driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));		
				Select s3=new Select(ele3);
				Thread.sleep(2000);
				s3.selectByValue("telugu");
				Thread.sleep(2000);
				
				
				//how to find the no of options
				WebElement ele4= driver.findElement(By.xpath("(//select[@class='form-select'])[2]"));
				Select s4=new Select(ele4);
				System.out.println(s4.getOptions().size());
               	//driver.quit();
				
				//get all the options and display in console
				
				WebElement ele5= driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));
				Select s5=new Select(ele5);
				List<WebElement> list=s5.getOptions();
				for(WebElement drop : list) {
					System.out.println(drop.getText());;
				}
				
			/*	//deselection method not aplicable for single slection dropdown
				s1.deselectByIndex(1);
				Thread.sleep(2000);
				s2.deselectByVisibleText("West Bengal");
				Thread.sleep(2000);
				s3.deselectByValue("telugu");
				Thread.sleep(2000);
				i want to deselect all we have to use
				deselect all ();
				*/
}
}