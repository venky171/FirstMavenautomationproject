package EDPUPatientRegestration;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;
import com.EdpuMohap.Elements.EDPUPatientRegistrationElements;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Sheet;

public class Edpuscenario extends commonUtils {

	public static EDPUPatientRegistrationElements Elements;
	public Sheet s;
	public Select select;
	String baseUrl = "http://192.168.0.76:86/";

	@BeforeClass
	public void setUp() throws IOException {
		OpenBrowser();
		commonUtils.ModuleName = "EdpuMohap";
		commonUtils.Reports("EdpumohapPatientRegistrationPage.html", "EdpumohapPatientRegistrationPage");
		// s = commonUtils.readExcelSheet(ExcelClass.filepath3 + "Loginpagedata.xlsx", 0);
		Elements = PageFactory.initElements(driver, EDPUPatientRegistrationElements.class);
	}

	@Test(priority = 0)
	public void PatientRegistrationValidations() throws IOException, InterruptedException {
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "Login as nurse user into EDPU Mohap");
		Edpulogin(driver, "nurse@blueaves.com", "files@123");
		commonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[text()='  Patient Dashboard ']")).click();
		commonUtils.Thread_Sleep(3);
		driver.findElement(By.xpath("//*[text()='Reset Filter']")).click();
		commonUtils.Thread_Sleep(3);
		driver.findElement(By.id("btnSearch")).click();
		commonUtils.Thread_Sleep(3);
		scroll_down(driver);
		
		int numberOfIterations = 66;

		for (int i = 0; i < numberOfIterations; i++) {
			// Locate the "next" button element
			WebElement nextButton = driver.findElement(By.xpath("//*[text()='Next']"));

			// Click the "next" button
			nextButton.click();

			// Optional: Add a delay to allow the page to load (if needed)
			Thread.sleep(2000); // 2-second delay, adjust as necessary
		}

		int numberOfIterations1 = 66;

		for (int i = 0; i < numberOfIterations1; i--) {
			// Locate the "next" button element
			WebElement nextButton = driver.findElement(By.xpath("//*[text()='Previous']"));

			// Click the "next" button
			nextButton.click();

			// Optional: Add a delay to allow the page to load (if needed)
			Thread.sleep(2000); // 2-second delay, adjust as necessary
		}
	}
}

		/*int numberOfIterations = 5;
		
		for (int i = 0; i < numberOfIterations; i++) {
		    // Locate the "next" button element
		    WebElement nextButton = driver.findElement(By.xpath("//*[text()='Next']"));

		    // Click the "next" button
		    nextButton.click();
		    Thread.sleep(2000); // 2-second delay, adjust as necessary
		}
		try {
			// Locate the table using XPath
			WebElement table = driver.findElement(By.xpath("//div[@id='tbldata_wrapper']/div[2]/div/table/tbody"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			int rowIndexToClick = 4; // Index 4 corresponds to the 5th row (0-based index)

			if (rows.size() > rowIndexToClick) {
				WebElement fifthRow = rows.get(rowIndexToClick);
				WebElement editButton = fifthRow.findElement(By.partialLinkText("Edit"));
				editButton.click();
			} else {
				System.out.println("There are not enough rows to click the Edit button.");
			}
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		commonUtils.Thread_Sleep(5);
		
		scrollTOElement(Elements.NeedToMoveon, driver);
		
		commonUtils.Thread_Sleep(5);
		driver.findElement(By.xpath("//*[@id='submitNursing_btn']")).click();

	}
}*/


