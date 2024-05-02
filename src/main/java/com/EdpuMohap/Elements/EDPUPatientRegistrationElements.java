package com.EdpuMohap.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EDPUPatientRegistrationElements {

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Patient Registration')]")
	public WebElement PatientRegistration_Menu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtNationalID']")
	public WebElement Patient_EmiratesId_Field;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Search')])[1]")
	public WebElement Search_Button;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Reading EID')])[1]")
	public WebElement Reading_EID_Button;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Please enter 15 digits emirates identification number!')])[2]")
	public WebElement Errorpopup_message;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'OK')])[2]")
	public WebElement Ok_button;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Patient personal information')]")
	public WebElement Patient_personalInformation_Page;
	

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Submit')]")
	public WebElement Submit_buttonONpatient_personalInformation_Page;

	
	@FindBy(how = How.XPATH, using = "//*[text()='First Name is required.']")
	public WebElement FirstNameField_Validation_msg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Last Name is required.']")
	public WebElement LastNameField_Validation_msg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Please enter Arabic first name']")
	public WebElement AraibicFirstName_Validation_msg;
	

	@FindBy(how = How.XPATH, using = "//*[text()='Please enter Arabic last name']")
	public WebElement AraibicLastName_Validation_msg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Date of Birth is required.']")
	public WebElement DateofBirthField_Validation_msg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Gender is required.']")
	public WebElement Gnerder_validation_msg;

	@FindBy(how = How.XPATH, using = "//*[text()='Enter email id']")
	public WebElement Email_validation_msg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Mobile Number is required.']")
	public WebElement mobilenumber_validation_msg;
	
	@FindBy(how = How.XPATH, using = "//*[text()='FHPC Name Arabic']")
	public WebElement NeedToMoveon;
	
	
	
	
}
