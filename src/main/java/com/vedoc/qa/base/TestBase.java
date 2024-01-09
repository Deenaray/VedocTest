package com.vedoc.qa.base;

					
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;			 
//import org.testng.ITestResult;
import org.openqa.selenium.WebElement;							   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.*;
import org.openqa.selenium.support.ui.ExpectedConditions;								
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
							  
//import org.testng.annotations.AfterSuite;
//import org.testng.
//import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
													   
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
										
import com.vedoc.qa.util.TestUtil;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import io.github.bonigarcia.wdm.WebDriverManager;

							  

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
    String concatenate=".";
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static Status Status;
	
	//Kartik
	public static Actions action;
	
	public static String EngineVariantNumber_ThinClient;
	public static String givenvariant = RandomString(4, false, true);
	public static String givenPartNum = RandomString(4, false, true);
	public static String givenPrductionNum = RandomString(4, false, true);
	public static String givenOrderNum = RandomString(4, false, true);
	public static String givenRecondEngine = RandomString(4, false, true);
	public static String givenLUNum = RandomString(4, false, true);
	public static String givenEEC1269 = RandomString(4, false, true);
	public static String givenEEC195 = RandomString(4, false, true);
	public static String givenECE24 = RandomString(4, false, true);
	public static String givenBasicSetting = RandomString(4, false, true);
	public static String givendin70020 = RandomString(4, false, true);
	public static String givenStandardPower = RandomString(4, false, true);
	public static String givenOverloadPower = RandomString(4, false, true);
	public static String givendin3046 = RandomString(4, false, true);	
	public static String givencode = RandomString(2, false, true);
	public static String givensalesData = RandomString(10, false, true);
	public static String givenmodeldesiginput1 = RandomString(3, true, false);
	public static String givensalesareanumber = RandomString(4, false, true);
	public static String RandomEngineNumber = RandomString(11, false, true);
	public static String RandomExhaustAftertreatmentNumber = RandomString(14, false, true);
	public static String RandomVINNumber = RandomString(17, true, true);
	public static String RandomTransmissionNumber = RandomString(12, false, true);
	public static String RandomTransmissionVariantNumber_Length = RandomString(10, true, true);
	public static String RandomFrontAxle2Number = RandomString(13, false, true);
	public static String RandomFrontAxle2ObjectNumber = RandomString(12, true, true);
	public static String RandomRearAxle3Number = RandomString(13, false, true);
	public static String RandomRearAxle3ObjectNumber = RandomString(12, true, true);
	public static String RandomRearAxle4Number = RandomString(13, false, true);
	public static String RandomRearAxle4ObjectNumber = RandomString(12, true, true);
	public static String RandomElectricMotor1Number = RandomString(14, false, true);
	public static String RandomElectricMotor2Number = RandomString(14, false, true);
	public static String RandomAddCodeNumber = RandomString(3, true, true);

	public static String RandomAddVPDCode = RandomString(5, false, true);

	public static String RandomSpecialEquipmentCode = RandomString(4, false, true);

	public static String RandomAddVPDContent = RandomString(5, false, true);
	public static String RandomModelSeries = RandomString(3, true, true);
	public static String RandomModelDesignation = RandomString(6, true, true);
	public static String RandomPaintCode = RandomString(4, false, true);
	public static String RandomPaintModelSeries = RandomString(3, true, true);
	public static String RandomAddModelDesignation = RandomString(6, false, true);
	public static String RandomInteriorEquipmentCode = RandomString(4, false, true);
	public static String RandomInteriorEquipmentModelSeries = RandomString(3, true, true);
	public static String RandomInteriorEquipmentModelDesignation = RandomString(6, true, true);
	public static String RandomProvisionCode = RandomString(3, true, true);
	public static String RandomProvisionAdditionalCode = RandomString(3, true, true);
	public static String VehicleCodeDesignation = RandomString(8, true, false);
	public static String ControlUnit_DiogenesName = RandomString(7, true, true);
	public static String ControlUnit_ShortDesignation = RandomString(4, true, false);
	public static String ControlUnit_SCNVPDIdenta = RandomString(4, true, false);
	public static String VPDIDs_Designation = RandomString(4, true, false);
	public static String AliasID = RandomString(4, true, false);
	public static String AliasID_Designation = RandomString(6, true, false);
	public static String AliasID1 = RandomString(4, true, false);
	public static String AliasID_Designation1 = RandomString(6, true, false);
	public static String AliasID_Designation2 = RandomString(6, true, false);
	public static String CUGroup_Identifier = RandomString(5, false, true);
	public static String CUGroup_Designation = RandomString(5, true, false);
	public static String CUGroup_Identifier1 = RandomString(5, false, true);
	public static String CUGroup_Designation1 = RandomString(5, true, false);
	public static String ElectricalVariantPrefix = RandomString(3, true, false);
	public static String ElectricalVariant_Designation = RandomString(10, true, false);
	public static String ElectricalVariantPrefix1 = RandomString(2, false, true);
	public static String ElectricalVariantPrefix_For2ndEntry = RandomString(3, true, false);
	public static String ElectricalVariantPrefix1_For2ndEntry = RandomString(2, false, true);
	public static String ElectricalVariant_Designation_For2ndEntry = RandomString(10, true, false);
	public static String TransmissionModal_Add = RandomString(10, false, true);
	public static String TransmissionModal = RandomString(10, false, true);
	public static String TransmissionModal_Add2ndEntry = RandomString(10, false, true);
	public static String TransmissionModal_2ndEntry = RandomString(10, false, true);
	public static String TransmissionModal_3rdEntry = RandomString(10, false, true);
	public static String WLTP_VECTO_ID = RandomString(4, false, true);
	public static String WLTP_VECTO_Designation = RandomString(10, true, false);
	public static String WLTP_VECTO_ID_For2ndEntry = RandomString(4, false, true);
	public static String WLTP_VECTO_Designation_For2ndEntry = RandomString(10, true, false);
	public static String LabelData_Keya = RandomString(6, false, true);
	public static String LabelData_Designationa = RandomString(10, true, false);
	public static String LabelData_Key_2ndEntry = RandomString(4, false, true);
	public static String LabelData_Designation_For2ndEntry = RandomString(10, true, false);
	public static String RandomLabelData_DeviceNumber=RandomString(14, true, true);
	public static String RandomLabelData_MajorVersionNumber=RandomString(2, true, false);
	public static String RandomLabelData_FINNumber=RandomString(7, false, true);
	// swedha
	public static String randomNumbers_6 = RandomString(6, false, true);
	public static String randomNumbers_4 = RandomString(4, false, true);
	public static String randomNumbers_5 = RandomString(5, false, true);
	  public static String randomAlphabets_5 = RandomString(5, true, false);
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	DateFormat dateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 protected String date1= dateFormat.format(date);
	 protected String date2= dateFormat1.format(date);
	public static void warmup(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void warmup1(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void warmup3(){
		
		 try{
			    Alert alert = driver.switchTo().alert();
			    System.out.println(alert.getText()+" Alert is Displayed"); 
			    alert.accept();
			    }
			    catch(NoAlertPresentException ex){
			    System.out.println("Alert is NOT Displayed");
			    }
		
	}
	
	public static void warmup4(){
		
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void warmup5(){
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void warmup6(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void SystemMessageCheck(){
		
		try{
			
			if(driver.findElement(By.xpath("//div[(@class='modal-content')]")).isDisplayed()){
				
				WebElement dismisSystemMessage=driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary btn-sm')]"));

	//			wait.until(ExpectedConditions.elementToBeClickable(dismisSystemMessage));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].scrollIntoView();", dismisSystemMessage);
				js.executeScript("arguments[0].click();", dismisSystemMessage);

				
				dismisSystemMessage.click();
				
			}
		}
		catch (Exception exp)
		{
	         System.out.println("System message is not displayed");
		}

		
	}
	
	public void ClickingOnURLButtons() throws InterruptedException{
		
		 Thread.sleep(3000);
		 
		 WebElement ScrollToLastButton=driver.findElement(By.xpath("(//img[contains(@class,'img-brand-black')])"));
					
			
					JavascriptExecutor js=(JavascriptExecutor)driver;
			//
					js.executeScript("arguments[0].scrollIntoView();", ScrollToLastButton);
					
					Thread.sleep(1000);
//					
					try{
						driver.findElement(By.xpath("(//a[contains(@ng-click,'launchPrint()')])")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//button[contains(@data-ng-click,'okAction($event)')])")).click();
						
						Thread.sleep(15000);
						
				Set<String> handles=driver.getWindowHandles();
					
				Iterator<String> it=	handles.iterator();
				
//					
					String parentwindowID=it.next();
					String childwindowID=it.next();
					
					warmup();
					
//					driver.switchTo().window(childwindowID);
					
//					warmup1();
					
					driver.switchTo().window(parentwindowID);

					}

					catch(Exception exp)
					{
	                    System.out.println("Print button not available");
	                    
	                    
						 
					}
					Thread.sleep(2000);
					
					
		
					Set<String> handles=driver.getWindowHandles();
					
					Iterator<String> it=	handles.iterator();					
						
					String parentwindowID=it.next();
				
				driver.findElement(By.xpath("//span[contains(@class,'ura_icon rc-i-xentry-portal')]")).click();
				
				warmup1();
				
				driver.switchTo().window(parentwindowID);
				
				warmup();
				
				driver.findElement(By.xpath("//span[contains(@class,'ura_icon rc-i-line-new-message')]")).click();
				
				warmup1();
				
				driver.findElement(By.xpath("//button[contains(@data-ng-click,'okAction($event)')]")).click();
				
			
	}

							
	@BeforeSuite
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport_"+date1+".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Vedoc Report");
		extent.setSystemInfo("Environment", "test1");
		extent.setSystemInfo("User Name", "Vedoc QA Tester");

	}

	@AfterSuite
	public void endReport() {

		extent.flush();

	}

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/vedoc/qa/" + "config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String RandomString(int len, boolean a, boolean b) {  
		int length = len;
		boolean useLetters = a;
		boolean useNumbers = b;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		return generatedString;
	}
	
	public static String RandomString(int len) {
		int length = len;
	    boolean useLetters = false;
	    boolean useNumbers = true;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
	    return generatedString;
	}
	

	
	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEENARA\\Downloads\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") + "/SeleniumServer/geckodriver");
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",  System.getProperty("user.dir") + "/msedgedriver.exe");
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.get(prop.getProperty("url"));
	}
																														
 public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		  String dateName = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);

		  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		  String destination = System.getProperty("user.dir") + "/Screenshots/"+ screenshotName + dateName + ".png";
		  File finalDestination = new File(destination);
		  FileUtils.copyFile(source, finalDestination);
		  return destination;
		 }
 
 
 
 public static void mqinitialization() {
	 String browserName = prop.getProperty("browser");



	 if (browserName.equals("chrome")) {
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
	 driver = new ChromeDriver();
	 } else if (browserName.equals("FF")) {
	 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/SeleniumServer/geckodriver");
	 driver = new FirefoxDriver();
	 }



	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 wait = new WebDriverWait(driver, 20);
	 driver.get(prop.getProperty("urlMQ"));
	 }
 

	public static void messageCheck(){
		
		try{
			
			if(driver.findElement(By.xpath("//div[(@class='modal-content')]")).isDisplayed()){
				
				WebElement dismisSystemMessage=driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary btn-sm')]"));

	//			wait.until(ExpectedConditions.elementToBeClickable(dismisSystemMessage));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].scrollIntoView();", dismisSystemMessage);
				js.executeScript("arguments[0].click();", dismisSystemMessage);

				
				dismisSystemMessage.click();
				
			}
		}
		catch (Exception exp)
		{
	         System.out.println("System message is not displayed");
		}
		


		
	}
}
