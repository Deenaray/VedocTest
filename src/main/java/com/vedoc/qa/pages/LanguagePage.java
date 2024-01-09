package com.vedoc.qa.pages;

import java.nio.charset.StandardCharsets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.vedoc.qa.base.TestBase;

public class LanguagePage extends TestBase {
	
	@FindBy(xpath="//a[@id='menu-toggle']")
	WebElement menuButton;
	
	@FindBy(xpath = "//li[starts-with(@data-ng-show,'viewControl.VehicleIdentificationArrangement.visible')]")
	WebElement IdentificationTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleMajorAssembliesArrangement.visible']/a")
	WebElement MajorAssembliesTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleCodesArrangement.visible']/a")
	WebElement CodesTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleSaaArrangement.visible']/a")
	WebElement SaaNumbersTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleVpdArrangement.visible']/a")
	WebElement VPDSerialTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleControlUnitArrangement.visible']/a")
	WebElement ControlUnitsTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleTheftRelevantDataArrangement.visible']/a")
	WebElement TheftDataTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleNavigationArrangement.visible']/a")
	WebElement NavigationTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.VehicleFOTextArrangement.visible']/a")
	WebElement FOTab;
	
	@FindBy(xpath = "//li[@data-ng-show='viewControl.ProductHistoryArrangement.visible']/a")
	WebElement HistoryTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleRuleArrangement.visible')]/a")
	WebElement DataValidationTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleTheftArrangement.visible')]/a")
	WebElement TheftMessageTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleSalesDataArrangement.visible')]/a")
	WebElement SalesDataTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleCertificationArrangement.visible')]/a")
	WebElement CertificationTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleModelPlateArrangement.visible')]/a")
	WebElement ModelPlateTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleEquipmentArrangement.visible')]/a")
	WebElement EquipmentTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleBodyManufacturerArrangement.visible')]/a")
	WebElement BodiesTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleElectroVariantArrangement.visible')]/a")
	WebElement ElectricalVarientsTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleTechnicalDataArrangement.visible')]/a")
	WebElement TechnicalDataTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehiclePlantTextArrangement.visible')]/a")
	WebElement PlantTextsTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleInternalTextArrangement.visible')]/a")
	WebElement InternalTextsTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleTATextArrangement.visible')]/a")
	WebElement TechnicalAdviceTextsTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleInternalArrangement.visible')]/a")
	WebElement InternalTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleAdditionalPlantInformationArrangement.visible')]/a")
	WebElement FactoryAdditionTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleReservationArrangement.visible')]/a")
	WebElement OrdersOfTheftRelevantPartsTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.VehicleChassisHoleInfoArrangement.visible')]/a")
	WebElement InstallationDocumentationTab;
	
	@FindBy(xpath = "//li[contains(@data-ng-show,'viewControl.ProductLogArrangement.visible')]/a")
	WebElement LoggingTab;
	
	
	// Initializing the page objects
	public LanguagePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String encode(String actual) {
		byte[] bytes = actual.getBytes(StandardCharsets.UTF_8);
		String utf8actual = new String(bytes, StandardCharsets.UTF_8);
		return utf8actual;
	}
	
	
	public String IdentificationTab()  {
		String IdentificationTabText=IdentificationTab.getText();
		return IdentificationTabText;
	}
	
	public String MajorAssembliesTab() {
		String MajorAssembliesTabText=MajorAssembliesTab.getText();
		return MajorAssembliesTabText;
	}
	
	public String CodesTab() {
		String CodesTabText=CodesTab.getText();
		return CodesTabText;
	}
	
	public String SaaNumbersTab() {
		String SaaNumbersTabText=SaaNumbersTab.getText();
		return SaaNumbersTabText;
	}
	
	public String VPDSerialTab() {
		String VPDSerialTabText=VPDSerialTab.getText();
		return VPDSerialTabText;
	}
	
	public String ControlUnitsTab() {
		String ControlUnitsTabText=ControlUnitsTab.getText();
		return ControlUnitsTabText;
	}
	
	public String TheftDataTab() {
		String TheftDataTabText=TheftDataTab.getText();
		return TheftDataTabText;
	}
	
	public String NavigationTab() {
		String NavigationTabText=NavigationTab.getText();
		return NavigationTabText;
	}
	
	public String FOTab() {
		String FOTabText=FOTab.getText();
		return FOTabText;
	}
	
	public String HistoryTab() {
		String HistoryTabText=HistoryTab.getText();
		return HistoryTabText;
	}
	
	public String DataValidationTab() throws InterruptedException {
		Actions a= new Actions(driver);
		a.moveToElement(IdentificationTab).build().perform();
		Thread.sleep(1000);
		String DataValidationTabText=DataValidationTab.getText();
		return DataValidationTabText;
	}
	
	public String TheftMessageTab() throws InterruptedException {
		Actions a= new Actions(driver);
		a.moveToElement(IdentificationTab).build().perform();
		Thread.sleep(1000);
		String TheftMessageTabText=TheftMessageTab.getText();
		return TheftMessageTabText;
	}
	
	public String SalesDataTab() {
		Actions a= new Actions(driver);
		a.moveToElement(IdentificationTab).build().perform();
		String SalesDataTabText=SalesDataTab.getText();
		return SalesDataTabText;
	}
	
	public String CertificationTab() throws InterruptedException {
		Actions a= new Actions(driver);
		a.moveToElement(IdentificationTab).build().perform();
		Thread.sleep(2000);
		String CertificationTabText=CertificationTab.getText();
		return CertificationTabText;
	}
	
	public String ModelPlateTab() {
		String ModelPlateTabText=ModelPlateTab.getText();
		return ModelPlateTabText;
	}
	
	public String EquipmentTab() {
		String EquipmentTabText=EquipmentTab.getText();
		return EquipmentTabText;
	}
	
	public String BodiesTab() {
		String BodiesTabText=BodiesTab.getText();
		return BodiesTabText;
	}
	
	public String ElectricalVarientsTab() {
		String ElectricalVarientsTabText=ElectricalVarientsTab.getText();
		return ElectricalVarientsTabText;
	}
	
	public String TechnicalDataTab()  {
		String TechnicalDataTabText=TechnicalDataTab.getText();
		return TechnicalDataTabText;
	}
	
	public String PlantTextsTab() {
		String PlantTextsTabText=PlantTextsTab.getText();
		return PlantTextsTabText;
	}
	
	public String InternalTextsTab() {
		String InternalTextsTabText=InternalTextsTab.getText();
		return InternalTextsTabText;
	}
	
	public String TechnicalAdviceTextsTab() {
		String TechnicalAdviceTextsTabText=TechnicalAdviceTextsTab.getText();
		return TechnicalAdviceTextsTabText;
	}
	
	public String InternalTab() {
		String InternalTabText=InternalTab.getText();
		return InternalTabText;
	}
	
	public String FactoryAdditionTab() {
		String FactoryAdditionTabText=FactoryAdditionTab.getText();
		return FactoryAdditionTabText;
	}
	
	public String OrdersOfTheftRelevantPartsTab() {
		String OrdersOfTheftRelevantPartsTabText=OrdersOfTheftRelevantPartsTab.getText();
		return OrdersOfTheftRelevantPartsTabText;
	}
	
	public String InstallationDocumentationTab() {
		String InstallationDocumentationTabText=InstallationDocumentationTab.getText();
		return InstallationDocumentationTabText;
	}
	
	public String LoggingTab() {
		String LoggingTabText=LoggingTab.getText();
		return LoggingTabText;
	}
	
	
}
