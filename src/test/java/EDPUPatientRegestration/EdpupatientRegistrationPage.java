package EDPUPatientRegestration;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Edpu.CommonUtils.commonUtils;
import com.EdpuMohap.Elements.EDPUPatientRegistrationElements;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Sheet;

public class EdpupatientRegistrationPage extends commonUtils {

	public static EDPUPatientRegistrationElements Elements;
	public Sheet s;
	public Select select;
	String baseUrl = "http://192.168.0.76:86/";

	@BeforeClass
	public void setUp() throws IOException {
		commonUtils.baseSetup();
		commonUtils.ModuleName = "EdpuMohap";
		commonUtils.Reports("EdpumohapPatientRegistrationPage.html", "EdpumohapPatientRegistrationPage");
		// s = commonUtils.readExcelSheet(ExcelClass.filepath3 + "Loginpagedata.xlsx",// 0); i am commenting this line due to internal issues
		Elements = PageFactory.initElements(driver, EDPUPatientRegistrationElements.class);
	}

	@Test(priority = 0)
	public void PatientRegistrationValidations() throws IOException {
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "Login as nurse user into EDPU Mohap");
		Edpulogin(driver, "nurse@blueaves.com", "files@123");
		commonUtils.Thread_Sleep(2);
		if (Elements.PatientRegistration_Menu.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-001","patient Registration menu is displaying left side of the page");
		} else {
			captureScreenshot_fail(driver, "EdpumohapPatientRegistrationPage", "TC-001","patient Registration menu is displaying left side of the page");
		}
		commonUtils.Thread_Sleep(5);
		logger.log(LogStatus.INFO, "Clicked on the Patient Registration menu");
		Elements.PatientRegistration_Menu.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.Patient_EmiratesId_Field.isDisplayed() && Elements.Search_Button.isDisplayed()
				&& Elements.Reading_EID_Button.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-002","User is able to see searchbutton,ReadingEid,patientEmiratesidField");
		} else {
			captureScreenshot_fail(driver, "EdpumohapPatientRegistrationPage", "TC-002","User is able to see searchbutton,ReadingEid,patientEmiratesidField");
		}
		commonUtils.Thread_Sleep(5);
		logger.log(LogStatus.INFO, "Entered 14 digits patient emirates id ");
		Elements.Patient_EmiratesId_Field.sendKeys(generateRandomNumber(10));
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "Clicked on search button ");
		Elements.Search_Button.click();
		commonUtils.Thread_Sleep(2);
		String actualpopText = Elements.Errorpopup_message.getText();
		String ExpectedpopupText = "Please enter 15 digits emirates identification number!";
		if (actualpopText.equals(ExpectedpopupText)) {
			Assert.assertEquals(actualpopText, ExpectedpopupText);
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-003","User is able to see Please enter 15 digits emirates identification number! is displaying ");
		} else {
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-003","User is not able to see Please enter 15 digits emirates identification number! is displaying ");
		}
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "Clicked on ok button ");
		Elements.Ok_button.click();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "Entered 15 digits patient emirates id ");
		Elements.Patient_EmiratesId_Field.sendKeys(generateRandomNumber(12));
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "Clicked on serach button");
		Elements.Search_Button.click();
		String actualpopText1 = Elements.Patient_personalInformation_Page.getText();
		String ExpectedpopupText1 = "Patient personal information";
		if (actualpopText1.equals(ExpectedpopupText1)) {
			Assert.assertEquals(actualpopText1, ExpectedpopupText1);
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-004","User is able to navigating to the Patient personal information page ");
		} else {
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-004","User is not able navigating to the Patient personal information page ");
		}
		logger.log(LogStatus.INFO, "Clicked on submitbutton patient personal InformationPage");
		commonUtils.Thread_Sleep(2);
	//	Elements.Search_Button.click();
		commonUtils.Thread_Sleep(2);
		Elements.Submit_buttonONpatient_personalInformation_Page.click();
		commonUtils.Thread_Sleep(2);
		if (Elements.FirstNameField_Validation_msg.isDisplayed()&&Elements.LastNameField_Validation_msg.isDisplayed()&&Elements.AraibicFirstName_Validation_msg.isDisplayed()
				&&Elements.LastNameField_Validation_msg.isDisplayed()&&Elements.DateofBirthField_Validation_msg.isDisplayed()&&Elements.Gnerder_validation_msg.isDisplayed()&&Elements.Email_validation_msg.isDisplayed()&&Elements.mobilenumber_validation_msg.isDisplayed()) {
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-005","User is able to see validation messages After click submit button ");
		} else {
			captureScreenshot_pass(driver, "EdpumohapPatientRegistrationPage", "TC-005","User is able to see validation messages After click submit button");
		}}
     @Test(priority  =1)
      public void sucessfullpatienRegistration() {
	    commonUtils.Thread_Sleep(2);
		driver.navigate().refresh();
		commonUtils.Thread_Sleep(2);
		Elements.Patient_EmiratesId_Field.sendKeys(generateRandomNumber(12));
		commonUtils.Thread_Sleep(2);
		Elements.Search_Button.click();
		commonUtils.Thread_Sleep(2);
		String randomName = generateRandomFirstName();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "patient First Name is entered");
		WebElement firstNameField = driver.findElement(By.id("p_f_nameE")); 
		commonUtils.Thread_Sleep(2);
	    firstNameField.clear();
	    commonUtils.Thread_Sleep(2);
	    firstNameField.sendKeys(randomName);
	    String randomName1 = generateRandomLastName();
		commonUtils.Thread_Sleep(2);
		logger.log(LogStatus.INFO, "patient LastName Name is entered");
		WebElement LastNameField = driver.findElement(By.id("p_naamE")); 
		commonUtils.Thread_Sleep(2);
		LastNameField.clear();
	    commonUtils.Thread_Sleep(2);
	    LastNameField.sendKeys(randomName1);
}
}
