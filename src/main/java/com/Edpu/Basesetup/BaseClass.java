package com.Edpu.Basesetup;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Edpu.CommonUtils.commonUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties pro=new Properties();
//	public static Properties pro=new Properties();- --if you another file
	public static FileReader fr;
//	public static FileReader fr1; ---if you another file
	String browser="chrome";
	//String baseUrl="http://192.168.0.76:82/Account/Login";
	String baseUrl="http://192.168.0.76:86/";
	
	@SuppressWarnings("deprecation")
	public void OpenBrowser() throws IOException {
		if(driver==null) {
			FileReader fr=new FileReader("C:\\Users\\BLUEAVES\\eclipse-workspace\\Fooodwatch2023\\ConfigFiles\\config.properties");
		//	FileReader fr1=new FileReader("C:\\Users\\BLUEAVES\\eclipse-workspace\\Fooodwatch2023\\ConfigFiles\\config.properties");
			pro.load(fr);
		//	pro.load(fr1)
			}
		switch (browser) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLUEAVES\\Downloads\\Chromedriver\\chrome_proxy.exe");
			ChromeOptions options = new ChromeOptions();
			////options.addArguments("--headless"); 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
			break;
		case "ff":
			WebDriverManager.firefoxdriver().create();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Edge":
			WebDriverManager.edgedriver().create();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		}	
		}
	

	public String getusername() {
		String username=pro.getProperty("username");
		System.out.println("username is"+username);
		if(username!=null) 
			return username;
		else
			throw new RuntimeException("Username is not found");
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		if(password!=null) 
			return password;
		else
			throw new RuntimeException("Password is not found");
	}
	public void Close() {
		driver.close();
		
	}}