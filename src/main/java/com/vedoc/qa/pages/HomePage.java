package com.vedoc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.vedoc.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory (or) Object Repository of Home Page

	@FindBy(xpath = "//a[@href='VehicleArrangement.html']")
	WebElement VehicleData;
	@FindBy(xpath = "//a[@href='MajorAssemblyArrangement.html']")
	WebElement MajorAssembly;
	@FindBy(xpath="//a[@href='MasterDataArrangement.html']")
	WebElement MasterDataModule;
	@FindBy(xpath="//a[@href='PartsIdentificationArrangement.html']")
	WebElement PartsIdentificationModule;
	@FindBy(xpath="//a[@href='LogArrangement.html']")
	WebElement LogsModule;
	@FindBy(xpath="//a[@href='RulesAssistentArrangement.html']")
	WebElement RulesAssistantModule;
	@FindBy(xpath="//a[@href='TraceablePartArrangement.html']")
	WebElement TraceablePartArrangementModule;
	@FindBy(xpath="//a[@href='LicenseKeyMasterDataArrangement.html']")
	WebElement LicenseKeyMasterModule;
	@FindBy(xpath="//a[@href='AdministrationArrangement.html']")
	WebElement AdministrationModule;
	@FindBy(xpath="//img[contains(@class,'img-product')]")
	WebElement VedocIcon;
	@FindBy(xpath = "//span[text()='Vehicle data']/following-sibling::span")
    WebElement vehicleData_SidePanel;

	@FindBy(xpath = "//*[@id='sidebar']/li[5]/a")
	WebElement vehicleComparisionpage;

	@FindBy(xpath = "//*[@id='sidebar']/li[7]/a")
	WebElement CKDVehicleClick;
	// Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
		warmup4(); 
		warmup5();
		 logger = extent.createTest("V22005: Name of Browser-Tab");
		 wait.until(ExpectedConditions.visibilityOf(VedocIcon)); 
		 String title=driver.getTitle(); 
		 System.out.println("Title is:\t"+title);
		logger.createNode("Title is displayed:\t"+title).pass("Title is displayed. Test Case Passed");
	}
	
	public MasterDataPage MasterData(){
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModule));
		MasterDataModule.click();
		return new MasterDataPage();
		}
	public PartsIdentificationPage PartsIdentification(){
		wait.until(ExpectedConditions.elementToBeClickable(PartsIdentificationModule));
		PartsIdentificationModule.click();
		return new PartsIdentificationPage();
		}
	public LogsPage LogsModule(){
		wait.until(ExpectedConditions.elementToBeClickable(LogsModule));
		LogsModule.click();
		warmup1();
		return new LogsPage();
		}
	public Boolean validateHomePage() {
		wait.until(ExpectedConditions.elementToBeClickable(VehicleData));
		return VehicleData.isDisplayed();

	}
	public RulesAssistantPage RulesAssistantModule(){
		wait.until(ExpectedConditions.elementToBeClickable(RulesAssistantModule));
		RulesAssistantModule.click();
		warmup1();
		return new RulesAssistantPage();
		}
	// change // 	public VehicleDataPage_S VehicleData() {

	public VehicleDataPage_S VehicleData1() {
		wait.until(ExpectedConditions.elementToBeClickable(VehicleData));
		VehicleData.click();
		return new VehicleDataPage_S();
	}
	// chANGE
	
	public VehicleDataPage VehicleData() {
		wait.until(ExpectedConditions.elementToBeClickable(VehicleData));
		VehicleData.click();
		return new VehicleDataPage();
	} 
	
	public GClassVehiclePage VehicleData_GClass() {
		wait.until(ExpectedConditions.elementToBeClickable(VehicleData));
		VehicleData.click();
		return new GClassVehiclePage();
	} 
	
	public MajorAssemblyPage MajorAssembly() {
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssembly));
		MajorAssembly.click();
		return new MajorAssemblyPage();
	}
	
	public TraceablePartArrangementModulePage TraceablePartArrangementModule(){
		wait.until(ExpectedConditions.elementToBeClickable(TraceablePartArrangementModule));
		TraceablePartArrangementModule.click();
		return new TraceablePartArrangementModulePage();
		
	}
	
	public LicenseKeyMasterPage LicenseKeyMasterModule(){
		wait.until(ExpectedConditions.elementToBeClickable(LicenseKeyMasterModule));
		LicenseKeyMasterModule.click();
		return new LicenseKeyMasterPage();
	}
	
	public AdministrationPage AdministrationModule(){
		AdministrationModule.click();
		return new AdministrationPage();
	}
	
	 public VehicleDataPage_S VehicleDataSidePanel() {
	        wait.until(ExpectedConditions.visibilityOf(vehicleData_SidePanel));
	        vehicleData_SidePanel.click();
	        warmup1();
	        warmup1();
	        return new VehicleDataPage_S();
	    }
	public VehicleCoparisionPage VehicleComparision1() {
		wait.until(ExpectedConditions.elementToBeClickable(vehicleComparisionpage));
		vehicleComparisionpage.click();
		return new VehicleCoparisionPage();
	}
	public CKDvehiclesPage CKDVehicle1() {
		wait.until(ExpectedConditions.elementToBeClickable(CKDVehicleClick));
		CKDVehicleClick.click();
		return new CKDvehiclesPage();
	}
}
