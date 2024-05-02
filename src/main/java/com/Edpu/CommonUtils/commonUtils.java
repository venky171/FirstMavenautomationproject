package com.Edpu.CommonUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Edpu.Basesetup.BaseClass;
import com.Edpu.Excels.ExcelClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class commonUtils extends BaseClass {
	public Robot robot;
//	public static WebDriver driver;
	public static String newDateC;
	public static String newDateF;
	public static FileInputStream fii;
	public static Workbook wbb;
	public static Sheet sh;
	// static int time;
	public static DateFormat df = new SimpleDateFormat("dd MMM YYYY");
	public static Date d = new Date();
	public static String time = df.format(d);
	public static WebDriverWait Wait;
	public static Workbook wb;
	// public static ReturnOrder_Elements Elements;
	public static File file;
	public static DateFormat DateReport = new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss a");
	public static Date daterep = new Date();
	public static String timereport = DateReport.format(daterep);
	public static String ModuleName;
	public static ExtentReports report = new ExtentReports(ExcelClass.filepath1);
	// public String baseUrl = "http://192.168.0.76:82/Account/Login";
	// public String email="reach_ghaffar@dm.gov.ae";
	public String Password = "200sresu@1966";
	public WebDriverWait wait;
	public static String PTPusername = "kings";
	public static String PTPpassword = "Venky@0218";
	public static com.aventstack.extentreports.ExtentTest test;
	public static ExtentTest logger = report.startTest("Report");

	public static void Reports(String ReportName, String ScriptName) {

		report = new ExtentReports(ExcelClass.filepath1 + ReportName);
		logger = report.startTest(ScriptName);
	}

	public static void captureScreenshot_pass(WebDriver driver, String ModuleName, String screenshotname, String data)
			throws IOException {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(
				ExcelClass.filepath2 + "/" + ModuleName + "/" + "/pass/" + screenshotname + "_" + time + ".png"));

		logger.log(LogStatus.PASS, "Snapshot Below: " + screenshotname + " ", logger.addScreenCapture(
				ExcelClass.filepath2 + "/" + ModuleName + "/" + "/pass/" + screenshotname + "_" + time + ".png"));
		logger.log(LogStatus.PASS, data);
		report.endTest(logger);
		report.flush();
	}

	public static void captureScreenshot_fail(WebDriver driver, String ModuleName, String screenshotname, String data)
			throws IOException {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(
				ExcelClass.filepath2 + "/" + ModuleName + "/" + "/fail/" + screenshotname + "_" + time + ".png"));
		logger.log(LogStatus.FAIL, "Snapshot Below: " + screenshotname + " ", logger.addScreenCapture(
				ExcelClass.filepath2 + "/" + ModuleName + "/" + "/fail/" + screenshotname + "_" + time + ".png"));
		logger.log(LogStatus.FAIL, data);
		report.endTest(logger);
		report.flush();
	}

	public static void captureScreenshot_passParticularField(By by, WebDriver driver, String ModuleName,
			String screenshotname, String data) throws IOException {
		File f1 = driver.findElement(by).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(
				ExcelClass.filepath2 + "/" + ModuleName + "/" + "/pass/" + screenshotname + "_" + time + ".png"));

		logger.log(LogStatus.PASS, "Snapshot Below:" + screenshotname + " ", logger.addScreenCapture(
				ExcelClass.filepath2 + "/" + ModuleName + "/" + "/pass/" + screenshotname + "_" + time + ".png"));
		logger.log(LogStatus.PASS, data);
		report.endTest(logger);
		report.flush();
	}

	public static void scrollTOElement(By by, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
	}

	public static void scrollTOElement(WebElement el, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
	}

	public static void scroll_down(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000);");
	}

	public static void scroll_up(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000);");
	}

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public static String get_random_string() {
		return RandomStringUtils.random(15, true, false);
	}

	public static String get_random_alphaNumericString() {
		return RandomStringUtils.randomAlphanumeric(10);
	}

	public static long get_randomNumber() {
		Random rand = new Random();
		return (long) (rand.nextDouble() * 10000000000L);
	}

	public static void selectDropDownValue(WebElement locator, String type, String value) {
		Select select = new Select(locator);
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the correct selection criteria");
			break;

		/*
		 * implementation Find the dropdown element using appropriate locator strategy
		 * WebElement dropdownElement = driver.findElement(By.id("dropdownId"));
		 * selectDropDownValue(dropdownElement, "value", "optionValue");
		 */
		}
	}

	public static int generateRandomDigits(int n) {
		int m = (int) Math.pow(10, n - 1);
		return m + new Random().nextInt(9 * m);
	}

	public static Sheet readExcelSheet(String fileLocation, int sheetNumber) {
		file = new File(fileLocation);
		try {
			wb = Workbook.getWorkbook(file);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wb.getSheet(sheetNumber);
	}

	public static String getDate(int day, String dateFormat) {
		DateFormat dff = new SimpleDateFormat(dateFormat);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, day);
		newDateF = dff.format(cal.getTime());
		return (newDateF);

		/*
		 * implementation:
		 * 
		 * int numberOfDaysToAdd = 7; String desiredDateFormat = "yyyy-MM-dd";
		 * 
		 * // Call the getDate method with the number of days and desired date format
		 * String newDate = getDate(numberOfDaysToAdd, desiredDateFormat);
		 * 
		 * // Print the result System.out.println("New Date: " + newDate);
		 */
	}

	public static String getExcelData(int postion1, int postion2, Sheet sheet) {
		return sheet.getCell(postion1, postion2).getContents();
	}

	public static void navigate(WebDriver driver, String URL) {
		driver.navigate().to(URL);

		/*
		 * Call the navigate method with the URL navigate(driver,
		 * "https://www.example.com");
		 */
	}

	public static void logger_pass(WebDriver driver, String data) throws IOException {
		logger.log(LogStatus.PASS, data);
		report.endTest(logger);
		report.flush();
	}

	public static void logger_fail(WebDriver driver, String data) throws IOException {
		logger.log(LogStatus.FAIL, data);
		report.endTest(logger);
		report.flush();
	}

	public static void baseSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("192.168.0.76:60/");
		// driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
	}

	public static void Thread_Sleep(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// APP_LOGS.error("Interrupted! "+ e);
			// Restore interrupted state...
			Thread.currentThread().interrupt();
		}
	}

	public static void FoodWatchLogin(String email, String password) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='nopend']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	// Action for Clicking an Element
	public void ClickinganWebelement(WebElement element, long waittime) {
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		WebElement elements = null;
		elements = webwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	// This Action is for sendkeys
	public void SendKeysOnWebElement(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	// select VisibleText from dropdown
	public void SelectvisibleTextFromDropdown(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// Accept alert

	public void Acceptalert(WebDriver driver) {
		driver.switchTo().alert().accept();
		/*
		 * Implementation //Acceptalert(driver);
		 * 
		 */
	}

	// dismiss alert

	public void Dissmissalert(WebDriver driver) {
		driver.switchTo().alert().dismiss();

		/*
		 * Implementation:
		 * 
		 * Call the DismissAlert method DismissAlert(driver);
		 */
	}

	// sendkeys to alerts
	public void SendkeystoAlert(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
		/*
		 * implementation Call the SendkeystoAlert method with the text
		 * SendkeystoAlert(driver, "Example text");
		 * 
		 */

	}
	// This method is use for mouse over one method to another method

	public void MouseoverAndClickAction(WebElement element, WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

		/*
		 * implementation
		 * 
		 * Find the element to perform the mouseover and click action on WebElement
		 * element = driver.findElement(By.id("elementId"));
		 * 
		 * Call the MouseoverAndClickAction method MouseoverAndClickAction(element,
		 * driver);
		 * 
		 */
	}

	public static String GetTitle() {
		String titleofpage = driver.getTitle();
		return titleofpage;

	}

	private boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}

		/*
		 * imlementation
		 * 
		 * Call the isElementPresent method with the appropriate locator boolean
		 * elementPresent = isElementPresent(driver, By.id("elementId")); Print the
		 * result System.out.println("Element Present: " + elementPresent);
		 * 
		 */
	}

	public void Fileupload(String filename) throws AWTException, InterruptedException {
		StringSelection content = new StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(content, null);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	public void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void PerformanceTestLogin(WebDriver driver, String username, String password) {
		driver.findElement(By.xpath("//*[@name='_txtUserName']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='_txtPassword']")).sendKeys(password);
		/*
		 * Implementation
		 * 
		 * PerformanceTestLogin(driver, "exampleUser", "examplePassword");
		 * 
		 */
	}

	public static String getWindowTitle(WebDriver driver) {
		return driver.getTitle();
		/*
		 * // Get the window title using the method String windowTitle =
		 * getWindowTitle(driver);
		 * 
		 * // Print the window title System.out.println("Window Title: " + windowTitle);
		 */
	}

	// Please try to less use this method
	public static void selectDropdownbyValue(WebDriver driver, String id, String drpdownvalue) {
		WebElement drop_down = driver.findElement(By.id(id));
		Select sel = new Select(drop_down);
		sel.selectByValue(drpdownvalue);

		/*
		 * implementation
		 * 
		 * Call the selectDropdownbyValue method with the element ID and dropdown value
		 * selectDropdownbyValue(driver, "dropdownId", "optionValue");
		 */
	}

	public static String tooltipText(WebDriver driver, By locator) {
		String tooltip = driver.findElement(locator).getAttribute("title");
		return tooltip;
		/*
		 * Call the tooltipText method with the locator String tooltip =
		 * tooltipText(driver, By.id("elementId")); Print the tooltip text
		 * System.out.println("Tooltip Text: " + tooltip);
		 */

	}

	public WebDriverWait explicitWait() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait;
	}

	public void isDisplayed(WebElement element, String elementName, String moduleName, String TestcaseNo) {
		boolean displayElement;

		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			displayElement = element.isDisplayed();
			System.out.println("successfully displayed " + elementName);
			// test.pass("successfully displayed " + elementName);
			captureScreenshot_pass(driver, moduleName, "TestcaseNumber-" + TestcaseNo,
					"successfully displayed " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not displayed " + elementName);
			try {
				captureScreenshot_fail(driver, moduleName, "TestcaseNumber-" + TestcaseNo,
						"not displayed" + elementName);
			} catch (IOException e1) {
			}

		}
	}

	public static List<Integer> generateRandomNumbers(int count, int range) {
		List<Integer> numbers = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < count; i++) {
			int randomNumber = random.nextInt(range);
			numbers.add(randomNumber);
		}

		return numbers;
	}

	public static String generateRandomNumber(int length) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int digit = random.nextInt(11);
			sb.append(digit);
		}

		return sb.toString();
	}

	public static String generateDateOfBirth18Years() {
		LocalDate currentDate = LocalDate.now();
		LocalDate eighteenYearsAgo = currentDate.minusYears(18);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = eighteenYearsAgo.format(formatter);
		return formattedDate;
	}

	public static String generateDateOfBirth17years() {
		LocalDate currentDate = LocalDate.now();
		LocalDate seventeenyearsago = currentDate.minusYears(17).minusDays(1); // Subtracting 17 years and 1 day from
																				// the current date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = seventeenyearsago.format(formatter);
		return formattedDate;
	}

	public static String generateDateOfBirth18years() {
		LocalDate currentDate = LocalDate.now();
		LocalDate eighteenyearsago = currentDate.minusYears(18);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = eighteenyearsago.format(formatter);
		return formattedDate;
	}

	public static String generateFutureDate() {
		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusDays(1); // Example: Adding 1 days for future date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = futureDate.format(formatter);
		return formattedDate;
	}

	/*
	 * public void Edpulogin(String username,String password) {
	 * driver.findElement(By.id("username")).sendKeys(username);
	 * driver.findElement(By.id("nopend")).sendKeys(password);
	 * driver.findElement(By.xpath("//*[@value='Login']")).click();
	 * 
	 * }
	 */
	public WebElement waitForElementToBeVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementToBeClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static void Edpulogin(WebDriver driver, String username, String password) {
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("nopend"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@value='Login']"));

		// Clear the fields before entering new values
		usernameField.clear();
		passwordField.clear();

		// Use switch case to handle different users
		switch (username) {
		case "nurse@blueaves.com":
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			loginButton.click();
			// Perform Nurse tasks or validations
			break;
		case "doctor@blueaves.com":
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			loginButton.click();
			// Perform GP-specific tasks or validations
			break;
		case "CC":
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			loginButton.click();
			// Perform CC-specific tasks or validations
			break;
		default:
			System.out.println("Invalid user");
			break;
		}
	}
	 public  static String generateRandomFirstName() {
	        // You can generate a random name using your own logic or libraries
	        // Here's a simple example:
	        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
	        int randomIndex = (int) (Math.random() * names.length);
	        return names[randomIndex];
	    }
	 public static String generateRandomLastName() {
		    String[] names = {"A", "B", "C", "D", "E"};
		    int randomIndex = (int) (Math.random() * names.length);
		    return names[randomIndex];
		}
}
