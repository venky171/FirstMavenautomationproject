package Edpuloginpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Edpu.CommonUtils.commonUtils;
import com.Edpu.Excels.ExcelClass;
import com.EdpuMohap.Elements.EDPULoginpageElements;
import com.EdpuMohap.Elements.EdpuMohapQABoothElements;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Sheet;

public class EdpuLoginPageTestcases extends commonUtils {

	public static EDPULoginpageElements Elements;
	public Sheet s;
	public Select select;
	String baseUrl = "http://192.168.0.76:66/";

	@BeforeClass
	public void setUp() throws IOException {
		OpenBrowser();
		commonUtils.ModuleName = "EdpuMohap";
		commonUtils.Reports("EdpuMohapLoginPage.html", "EdpuMohapLoginPage");
		//s = commonUtils.readExcelSheet(ExcelClass.filepath3 + "Loginpagedata.xlsx", 0);
		Elements = PageFactory.initElements(driver, EDPULoginpageElements.class);
	}
	@Test(priority = 1)
	public void ValidatetheFiledsOnLoginPage() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().to(baseUrl);
		logger.log(LogStatus.INFO,"User is navigated to Edpu Loginpage");
		commonUtils.Thread_Sleep(2);
		if (Elements.EmailTextField.isDisplayed()&&Elements.passwordTextField.isDisplayed()&&Elements.Loginbutton.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "ValidatetheFiledsOnLoginPage","User is able to see Fields on Loginpage");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "ValidatetheFiledsOnLoginPage","User is not able to see Fields on Loginpage");
		}
	}
	
	@Test(priority = 2)
	public void WithEnteringValidEmailIdAndWithoutEnterPassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Entered valid Emaild");
		commonUtils.Thread_Sleep(2);
		Elements.EmailTextField.sendKeys("nurse@blueaves.com");
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Clicked on Login button");
		Elements.Loginbutton.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.PasswordFieldError_validation.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "WithEnteringValidEmailIdAndWithEnterPassword","User is Entered WithEnteringValidEmailIdAndWithEnterPassword then able to see Error validation ");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "WithEnteringValidEmailIdAndWithEnterPassword","User is Entered WithEnteringValidEmailIdAndWithEnterPassword then not able to see Error validation");
		}
	}
	
	
	@Test(priority = 3)
	public void WithoutEnterEmailIdAndWithEnterPassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Entered valid password");
		Elements.passwordTextField.sendKeys("files@123");
		commonUtils.Thread_Sleep(2);
		Elements.Loginbutton.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.EmailfieldError_validation.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "WithoutEnterEmailIdAndWithEnterPassword","User is Entered WithoutEnterEmailIdAndWithEnterPassword then able to see Error validation ");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "WithoutEnterEmailIdAndWithEnterPassword","User is Entered WithoutEnterEmailIdAndWithEnterPassword then not able to see Error validation");
		}
	}
	
	@Test(priority = 4)
	public void UnRegisteredEmailidandPassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		logger.log(LogStatus.INFO,"Entered unregistered EmailID");
		Elements.EmailTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.EmailTextField.sendKeys("nurse1@blueaves.com");
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Entered unRegitered password");
		Elements.passwordTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.passwordTextField.sendKeys("Nurse@321");
		commonUtils.Thread_Sleep(2);
		Elements.Loginbutton.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.UserdoesntExist_Err_validationMsg.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "UnRegisteredEmailidandPassword","User is Entered UnRegisteredEmailidandPassword then able to see Error validation ");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "UnRegisteredEmailidandPassword","User is Entered UnRegisteredEmailidandPassword then not able to see Error validation");
		}
	}
	
	@Test(priority = 5)
	public void EnterValidEmailidAndInvalidpassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		logger.log(LogStatus.INFO,"Entered Valid EmailID");
		Elements.EmailTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.EmailTextField.sendKeys("nurse@blueaves.com");
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Entered Invalid password");
		Elements.passwordTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.passwordTextField.sendKeys("Nurse@321");
		commonUtils.Thread_Sleep(2);
		Elements.Loginbutton.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.WorngCredentials.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "EnterValidEmailidAndInvalidpassword","User is Entered EnterValidEmailidAndInvalidpassword then able to see Error validation ");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "EnterValidEmailidAndInvalidpassword","User is Entered EnterValidEmailidAndInvalidpassword then not able to see Error validation");
		}
	}
	@Test(priority = 6)
	public void EnterInValidEmailidAndvalidpassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		logger.log(LogStatus.INFO,"Entered InValid EmailID");
		Elements.EmailTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.EmailTextField.sendKeys("nurse1@blueaves.com");
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Entered valid password");
		Elements.passwordTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.passwordTextField.sendKeys("files@123");
		commonUtils.Thread_Sleep(2);
		Elements.Loginbutton.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.UserdoesntExist_Err_validationMsg.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "EnterValidEmailidAndInvalidpassword","User is Entered EnterInValidEmailidAndvalidpassword then able to see Error validation ");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "EnterValidEmailidAndInvalidpassword","User is Entered EnterInValidEmailidAndvalidpassword then not able to see Error validation");
		}
	}
	
	@Test(priority = 7)
	public void WithoutEnteringEmailandPassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().to(baseUrl);
		logger.log(LogStatus.INFO,"User is navigated to Edpu Loginpage");
		Elements.EmailTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.passwordTextField.clear();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"Clicked on Login button");
		Elements.Loginbutton.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.EmailfieldError_validation.isDisplayed()&&Elements.PasswordFieldError_validation.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "WithoutEnteringEmailandPassword","User is able to see Error validation without enter the data");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "WithoutEnteringEmailandPassword","User is not able to see Error validation without enter the data");
		}
	}
	

	@Test(priority = 8)
	public void ValidAccountmailAndValidpassword() throws IOException {
		commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO,"User is Entered Valid Email and password on Edpu Loginpage");
		Elements.EmailTextField.clear();
		commonUtils.Thread_Sleep(2);
		Elements.passwordTextField.clear();
		commonUtils.Thread_Sleep(2);
		Edpulogin(driver, "nurse@blueaves.com", "files@123");
		commonUtils.Thread_Sleep(2);
		String windowTitle = getWindowTitle(driver);
		commonUtils.Thread_Sleep(2);
		System.out.println("Window Title: " + windowTitle);
		if (windowTitle.equals("EDPU")) {
			captureScreenshot_pass(driver, "EdpuMohapLoginPage", "ValidAccountmailAndValidpassword","User is able to login with validAccountEmail And valid Password");
		} else {
			captureScreenshot_fail(driver, "EdpuMohapLoginPage", "ValidAccountmailAndValidpassword","User is not able to login with validAccountEmail And valid Password");
		}
	}

}
