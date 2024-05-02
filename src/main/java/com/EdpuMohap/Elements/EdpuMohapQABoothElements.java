package com.EdpuMohap.Elements;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EdpuMohapQABoothElements {
	//login
	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	public WebElement EmailTextField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='nopend']")
	public WebElement passwordTextField ;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Login']")
	public WebElement Loginbutton ;
	

	
	@FindBy(how = How.XPATH, using = "//span[text()='  QA Booth ']")
	public WebElement QA_Booth_leftHandLink;
	@FindBy(how = How.ID, using = "btnShowModal")
	public WebElement manual_link;	
	@FindBy(how = How.XPATH, using = "//input[@id='Email']")
	public WebElement loginPopUp_email;	
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	public WebElement loginPopUp_password;	
	@FindBy(how = How.XPATH, using = "//input[@id='btnVerify']")
	public WebElement popUpButton_login;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary']")
	public WebElement popUpButton_return;
	@FindBy(how = How.ID, using = "p_id")
	public WebElement questionnaire_emiratesID;
	@FindBy(how = How.ID, using = "btnSubmit")
	public WebElement Questionnaire_NextButtonORcontinueButton;
	@FindBy(how = How.ID, using = "IsConsent")
	public WebElement consent_Checkbox;
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr4'][@id='0']")
	public WebElement highBloodPressure_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr5'][@id='0']")
	public WebElement takeMedForhighBloodPressure_yes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr6'][@id='0']")
	public WebElement diabetes_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr7'][@id='39']")
	public WebElement diabetes_Type_1;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr7'][@id='40']")
	public WebElement diabetes_Type_2;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr7'][@id='2']")
	public WebElement diabetes_Type_DonotKnow;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr8'][@id='0']")
	public WebElement doYouHaveHeartORvascularDisease_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr8'][@id='1']")
	public WebElement doYouHaveHeartORvascularDisease_No;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr9'][@id='0']")
	public WebElement heartDiseaseBeforeAge55_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr9'][@id='1']")
	public WebElement heartDiseaseBeforeAge55_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr10'][@id='0']")
	public WebElement heartOrViscularDiseaseBefore65_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr10'][@id='1']")
	public WebElement heartOrViscularDiseaseBefore65_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr37'][@id='0']")
	public WebElement doYouSmoke_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr35'][@id='1']")
	public WebElement doYouSmoke_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr38'][@id='45']")
	public WebElement smokeCigratteDaily_1;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr38'][@id='46']")
	public WebElement smokeCigratteDaily_2;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr38'][@id='47']")
	public WebElement smokeCigratteDaily_5;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr38'][@id='48']")
	public WebElement smokeCigratteDaily_10;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr38'][@id='24']")
	public WebElement smokeCigratteDaily_10_More;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr39'][@id='49']")
	public WebElement triedToStopSmoking_0;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr39'][@id='45']")
	public WebElement triedToStopSmoking_1;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr39'][@id='46']")
	public WebElement triedToStopSmoking_2;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr39'][@id='25']")
	public WebElement triedToStopSmoking_2_More;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr40'][@id='0']")
	public WebElement smokingAfter30minsWaking_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr40'][@id='1']")
	public WebElement smokingAfter30minsWaking_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr11'][@id='26']")
	public WebElement cigratte_previousEffectHasWornOff_A;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr11'][@id='27']")
	public WebElement cigratte_feelBetter_B;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr59'][@id='0']")
	public WebElement eatVegetableDaily_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr59'][@id='1']")
	public WebElement eatVegetableDaily_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr12'][@id='0']")
	public WebElement eat_FruitsDaily_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr12'][@id='1']")
	public WebElement eat_FruitsDaily_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr13'][@id='0']")
	public WebElement exerciseDaily_30mins_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr13'][@id='1']")
	public WebElement exerciseDaily_30mins_no;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Next Question']")
	public WebElement Height_Weight_NextQuestion_button;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr16'][@id='0']")
	public WebElement maleDoctorDiscussSugarLevelInBlood_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr16'][@id='1']")
	public WebElement maleDoctorDiscussSugarLevelInBlood_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr15'][@id='0']")
	public WebElement doctorDiscussSugarLevelInBlood_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr15'][@id='1']")
	public WebElement doctorDiscussSugarLevelInBlood_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr16'][@id='0']")
	public WebElement  IncreasedSugarLevelDuringPregnency_yes;
	 
		
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr18'][@id='0']")
	public WebElement MaleincSugarLevelHospitalAdmission_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr18'][@id='1']")
	public WebElement MaleincSugarLevelHospitalAdmission_no;
	
	//female--
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr17'][@id='0']")
	public WebElement incSugarLevelHospitalAdmission_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr17'][@id='1']")
	public WebElement incSugarLevelHospitalAdmission_no;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr18'][@id='0']")
	public WebElement babyBirthWeight4orMore_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr18'][@id='1']")
	public WebElement babyBirthWeight4orMore_no;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr19'][@id='0']")
	public WebElement fatherMotherBrotherSisterHaveDiabetes_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr19'][@id='1']")
	public WebElement fatherMotherBrotherSisterHaveDiabetes_no; 
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr20'][@id='0']")
	public WebElement tetanusInjection10yearAgo_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr20'][@id='1']")
	public WebElement tetanusInjection10yearAgo_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr20'][@id='2']")
	public WebElement tetanusInjection10yearAgo_IDonotKnow;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr60'][@id='0']")
	public WebElement LungPatient_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr60'][@id='1']")
	public WebElement LungPatient_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr61'][@id='0']")
	public WebElement heartPatient_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr61'][@id='1']")
	public WebElement heartPatient_no;
		
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr62'][@id='0']")
	public WebElement liverPatient_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr62'][@id='1']")
	public WebElement liverPatient_no;
		
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr26'][@id='0']")
	public WebElement kidneyPatient_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr26'][@id='1']")
	public WebElement kidneyPatient_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr21'][@id='0']")
	public WebElement femalekidneyPatient_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr21'][@id='1']")
	public WebElement femalekidneyPatient_no;
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr41'][@id='0']")
	public WebElement breastCancer_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr41'][@id='1']")
	public WebElement breastCancer_no;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr22'][@id='28']")
	public WebElement cancerDiagnosedat_40;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr22'][@id='29']")
	public WebElement cancerDiagnosedat_40_50;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr22'][@id='30']")
	public WebElement cancerDiagnosedat_50;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr42'][@id='0']")
	public WebElement breastORovarianCancer_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr23'][@id='1']")
	public WebElement breastORovarianCancer_no;
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr43'][@id='0']")
	public WebElement fatherMothSisBroSonDaug_BreastCancer_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr44'][@id='1']")
	public WebElement fatherMothSisBroSonDaug_BreastCancer_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr44'][@id='28']")
	public WebElement fatherMothSisBroSonDaug_BreastCancer_age40;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr44'][@id='29']")
	public WebElement fatherMothSisBroSonDaug_BreastCancer_age40TO50;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr44'][@id='30']")
	public WebElement fatherMothSisBroSonDaug_BreastCancer_age50;
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr23'][@id='0']")
	public WebElement GrandfatherMothUncleAuntCousHalfSisBro_BreastCancer_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr23'][@id='1']")
	public WebElement GrandfatherMothUncleAuntCousHalfSisBro_BreastCancer_no;
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr24'][@id='0']")
	public WebElement Memogram2yearsAgo_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr24'][@id='1']")
	public WebElement Memogram2yearsAgo_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr24'][@id='2']")
	public WebElement Memogram2yearsAgo_IdonotKnow;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr26'][@id='0']")
	public WebElement papSmear3yearsAgo_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr25'][@id='1']")
	public WebElement papSmear3yearsAgo_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr26'][@id='2']")
	public WebElement papSmear3yearsAgo_IdonotKnow;
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr27'][@id='0']")
	public WebElement fatherMothSisBro_intestinalCancer_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr27'][@id='1']")
	public WebElement fatherMothSisBro_intestinalCancer_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr28'][@id='0']")
	public WebElement alcoholicBeverages_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr28'][@id='1']")
	public WebElement alcoholicBeverages_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr29'][@id='15']")
	public WebElement wineGlassesPerWeek_5to7;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr29'][@id='18']")
	public WebElement wineGlassesPerWeek_14to15;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr45'][@id='20']")
	public WebElement wineGlassesPerWeek_21to25;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr46'][@id='31']")
	public WebElement drinkAlcohol_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr46'][@id='32']")
	public WebElement drinkAlcohol_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr46'][@id='33']")
	public WebElement drinkAlcohol_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr46'][@id='34']")
	public WebElement drinkAlcohol_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr46'][@id='35']")
	public WebElement drinkAlcohol_Daily;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr47'][@id='13']")
	public WebElement alcoholGlasses_0to2;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr47'][@id='14']")
	public WebElement alcoholGlasses_3to4;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr47'][@id='36']")
	public WebElement alcoholGlasses_5to6;	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr47'][@id='37']")
	public WebElement alcoholGlasses_7to9;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr47'][@id='24']")
	public WebElement alcoholGlasses_10Plus;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr48'][@id='31']")
	public WebElement glasses6InASingleOccasion_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr48'][@id='32']")
	public WebElement glasses6InASingleOccasion_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr48'][@id='33']")
	public WebElement glasses6InASingleOccasion_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr48'][@id='34']")
	public WebElement glasses6InASingleOccasion_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr48'][@id='35']")
	public WebElement glasses6InASingleOccasion_Daily;
		
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr49'][@id='31']")
	public WebElement couldNotStopDrinking_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr49'][@id='32']")
	public WebElement couldNotStopDrinking_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr49'][@id='33']")
	public WebElement couldNotStopDrinking_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr49'][@id='34']")
	public WebElement couldNotStopDrinking_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr49'][@id='35']")
	public WebElement couldNotStopDrinking_Daily;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr50'][@id='31']")
	public WebElement notAbleToDoButExpected_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr50'][@id='32']")
	public WebElement notAbleToDoButExpected_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr50'][@id='33']")
	public WebElement notAbleToDoButExpected_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr50'][@id='34']")
	public WebElement notAbleToDoButExpected_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr50'][@id='35']")
	public WebElement notAbleToDoButExpected_Daily;	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr51'][@id='31']")
	public WebElement needAlcoholForPreviousNightOut_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr51'][@id='32']")
	public WebElement needAlcoholForPreviousNightOut_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr51'][@id='33']")
	public WebElement needAlcoholForPreviousNightOut_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr51'][@id='34']")
	public WebElement needAlcoholForPreviousNightOut_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr51'][@id='35']")
	public WebElement needAlcoholForPreviousNightOut_Daily;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr52'][@id='31']")
	public WebElement feelingGuiltAfterDrinking_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr52'][@id='32']")
	public WebElement feelingGuiltAfterDrinking_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr52'][@id='33']")
	public WebElement feelingGuiltAfterDrinking_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr52'][@id='34']")
	public WebElement feelingGuiltAfterDrinking_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr52'][@id='35']")
	public WebElement feelingGuiltAfterDrinking_Daily;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr53'][@id='31']")
	public WebElement UnableToRememberNightEvents_Never;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr53'][@id='32']")
	public WebElement UnableToRememberNightEvents_lessThanMonthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr53'][@id='33']")
	public WebElement UnableToRememberNightEvents_Monthly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr53'][@id='34']")
	public WebElement UnableToRememberNightEvents_Weekly;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr53'][@id='35']")
	public WebElement UnableToRememberNightEvents_Daily;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr54'][@id='0']")
	public WebElement injuredBehaviour_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr54'][@id='1']")
	public WebElement injuredBehaviour_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr29'][@id='0']")
	public WebElement adviseDrinkLess_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr29'][@id='1']")
	public WebElement adviseDrinkLess_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr30'][@id='0']")
	public WebElement moreMedicationTaken_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr30'][@id='1']")
	public WebElement moreMedicationTaken_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr31'][@id='0']")
	public WebElement desireToStopTakingMedicine_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr31'][@id='1']")
	public WebElement desireToStopTakingMedicine_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr32'][@id='0']")
	public WebElement forgetTakingMedicine_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr32'][@id='1']")
	public WebElement forgetTakingMedicine_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr32'][@id='21']")
	public WebElement forgetTakingMedicine_DonotTakeMedicine;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr33'][@id='22']")
	public WebElement thisHappens_Sometimes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr33'][@id='23']")
	public WebElement thisHappens_often;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr33'][@id='38']")
	public WebElement thisHappens_conciously;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr55'][@id='0']")
	public WebElement sleepingPills_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr55'][@id='1']")
	public WebElement sleepingPills_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr56'][@id='0']")
	public WebElement HopelessExhausted_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr56'][@id='1']")
	public WebElement HopelessExhausted_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr57'][@id='0']")
	public WebElement lackedEnjoymentOfJob_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr57'][@id='1']")
	public WebElement lackedEnjoymentOfJob_no;
		
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr58'][@id='0']")
	public WebElement coughingExtremeMucus_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr58'][@id='1']")
	public WebElement coughingExtremeMucus_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr63'][@id='0']")
	public WebElement exposedToDustSmokeFumes_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr63'][@id='1']")
	public WebElement exposedToDustSmokeFumes_no;
		
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr64'][@id='0']")
	public WebElement hearingImpaired_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr64'][@id='1']")
	public WebElement hearingImpaired_no;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr65'][@id='0']")
	public WebElement hearingProblemMeetingWithNewPeople_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr65'][@id='1']")
	public WebElement hearingProblemMeetingWithNewPeople_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr65'][@id='22']")
	public WebElement hearingProblemMeetingWithNewPeople_sometimes;
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr66'][@id='0']")
	public WebElement hearingProblemTalkingToFamilyMembers_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr66'][@id='1']")
	public WebElement hearingProblemTalkingToFamilyMembers_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr66'][@id='22']")
	public WebElement hearingProblemTalkingToFamilyMembers_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr67'][@id='0']")
	public WebElement hearingProblemWithFriendsColleagues_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr67'][@id='1']")
	public WebElement hearingProblemWithFriendsColleagues_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr67'][@id='22']")
	public WebElement hearingProblemWithFriendsColleagues_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr68'][@id='0']")
	public WebElement hearingLossLimitsDailyActivities_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr68'][@id='1']")
	public WebElement hearingLossLimitsDailyActivities_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr68'][@id='22']")
	public WebElement hearingLossLimitsDailyActivities_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr69'][@id='0']")
	public WebElement hearingProblemVisitsFamilyFriendsNeighbours_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr69'][@id='1']")
	public WebElement hearingProblemVisitsFamilyFriendsNeighbours_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr69'][@id='22']")
	public WebElement hearingProblemVisitsFamilyFriendsNeighbours_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr70'][@id='0']")
	public WebElement hearingProblemAtCinemaConcerts_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr70'][@id='1']")
	public WebElement hearingProblemAtCinemaConcerts_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr70'][@id='22']")
	public WebElement hearingProblemAtCinemaConcerts_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr71'][@id='0']")
	public WebElement hearingProblemCreateConflictsWithFamily_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr71'][@id='1']")
	public WebElement hearingProblemCreateConflictsWithFamily_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr71'][@id='22']")
	public WebElement hearingProblemCreateConflictsWithFamily_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr72'][@id='0']")
	public WebElement hearingProblemWithTVradio_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr72'][@id='1']")
	public WebElement hearingProblemWithTVradio_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr72'][@id='22']")
	public WebElement hearingProblemWithTVradio_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr73'][@id='0']")
	public WebElement hearingProblemPrivateLifeSocialLife_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr73'][@id='1']")
	public WebElement hearingProblemPrivateLifeSocialLife_no;
	@FindBy(how = How.XPATH, using = "//button[@data-next='vr73'][@id='22']")
	public WebElement hearingProblemPrivateLifeSocialLife_sometimes;
	
	@FindBy(how = How.XPATH, using = "//button[@data-answerid='0'][@id='0']")
	public WebElement hearingProblemVisitingResturants_yes;
	@FindBy(how = How.XPATH, using = "//button[@data-answerid='1'][@id='1']")
	public WebElement hearingProblemVisitingResturants_no;
	@FindBy(how = How.XPATH, using = "//button[@data-answerid='22'][@id='22']")
	public WebElement hearingProblemVisitingResturants_sometimes;
	
	@FindBy(how = How.XPATH, using = "//a[@id='btnSubmitAllData']")
	public WebElement Submit_button;
	@FindBy(how = How.XPATH, using = "//a[@id='btnBack']")
	public WebElement restartQuestionnaire;
	@FindBy(how = How.XPATH, using = "//button[@id='btnOk']")
	public WebElement OKpopUpAtEndOfQuestionnaire;

	
	
	

	}
	
