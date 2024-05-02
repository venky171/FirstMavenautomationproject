package com.EdpuMohap.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EDPULoginpageElements {
	//login
		@FindBy(how = How.XPATH, using = "//*[@id='username']")
		public WebElement EmailTextField;
		
		@FindBy(how = How.XPATH, using = "//*[@id='nopend']")
		public WebElement passwordTextField ;
		
		@FindBy(how = How.XPATH, using = "//*[@value='Login']")
		public WebElement Loginbutton ;
		
		@FindBy(how = How.XPATH, using = "//*[text()='The Email field is required.']")
		public WebElement EmailfieldError_validation ;
		
		@FindBy(how = How.XPATH, using = "//*[text()='The Password field is required.']")
		public WebElement PasswordFieldError_validation ;
		
		@FindBy(how = How.XPATH, using = "//*[text()='User does not exist!']")
		public WebElement UserdoesntExist_Err_validationMsg ;
		
		@FindBy(how = How.XPATH, using = "//*[text()='Invalid credentials.']")
		public WebElement WorngCredentials ;
		
		
		
		
		
		
		
		
		
}
