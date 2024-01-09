package com.vedoc.qa.pages;

import java.util.ArrayList;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.vedoc.qa.base.TestBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import junit.framework.Assert;

public class MajorAssemblyPage extends TestBase {
	

	// Page Object Factory for search
	@FindBy(xpath = "//*[@id='mainwrapper']/div[4]/div/div[2]/div/span[2]")
	WebElement alerttext;

	@FindBy(xpath = "//*[@id='mainwrapper']/div[4]/div/div[2]/button/span[1]")
	WebElement Alertclick;
	@FindBy(xpath = "//input[@list='majAssySearchAutoComplete']")
	WebElement Searchfield;

	@FindBy(xpath = "//span[@class='sym rc-i-line-search ']")
	WebElement SearchButton;

	// Page Factory (or) Object Repository of Major Assemblies Identification Tab
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.id')]")
	WebElement EngineNumber;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.objectNumberVariant')]")
	WebElement Variant;
	@FindBy(xpath = "//div[@class='mdsd-control fcol']/span[contains(@data-ng-bind,'viewDataObject.engine.objectNumber')]")
	WebElement PartNumber;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeVehicle')]")
	WebElement VIN;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.retrofittedFrom')]")
	WebElement MotorIdBefore;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.orderNumber')]")
	WebElement OrderNumber;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.productionNumber')]")
	WebElement ProductionNumber;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.plant')]")
	WebElement ProductionPlant;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeProductDate.technicalApprovalDate')]")
	WebElement FinalAcceptate;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeProductDate.shipmentDate')]")
	WebElement ShipmentDate;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.retrofittedTo')]")
	WebElement MotorIdAfter;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.status')]")
	WebElement Status;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.reconditionedEngine')]")
	WebElement RecondEngine;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.luNumber')]")
	WebElement LUNumber;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.eecStandard801269')]")
	WebElement OneEEC;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.eecStandard88195')]")
	WebElement TwoEEC;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.ece24')]")
	WebElement ECE;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.basicSettings')]")
	WebElement BasicSetting;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'activeConfiguration.certificationId')]")
	WebElement CertificationDesignation;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.din70020')]")
	WebElement DIN;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.standardPower')]")
	WebElement DINStandardPower;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.overloadPower')]")
	WebElement DINOverloadPower;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.din3046')]")
	WebElement DINTwo;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.activeState.idStamping')]")
	WebElement EngineNumberStamping;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.lastModificationDate')]")
	WebElement LastModification;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.engine.instanceVersion')]")
	WebElement InstanceVersion;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.outboundSupplyProtocol.publishingTime')]")
	WebElement LastOutputSupply;
	@FindBy(xpath = "//span[contains(@data-ng-bind,'viewDataObject.outboundSupplyProtocol.restrictedSupply')]")
	WebElement RestrictedSupply;

	// Page Factory (or) Object Repository of Major Assemblies Codes Tab
	@FindBy(xpath = "//*[@id='codeTable']/tbody")
	WebElement CodesTableContent;
	@FindBy(xpath = "(//span[@class='sym rc-i-line-download-document'])[1]")
	WebElement CodesDownloadDocument;
	@FindBy(xpath = "//span[@class='sym rc-i-line-filter ']")
	WebElement CodesFilter;
	@FindBy(xpath = "//button[contains(@data-ng-click,'hideDesignation')]")
	WebElement CodesHideDesignation;

	// Page Factory (or) Object Repository of Major Assemblies SAA Tab
	@FindBy(xpath = "//*[@id='dgTableSaa']/tbody")
	WebElement SAATableBodyLeft;
	@FindBy(xpath = "//*[@id='saaTable']/tbody")
	WebElement SAATableBodyRight;
	@FindBy(xpath = "(//span[@class='sym rc-i-line-download-document'])[3]")
	WebElement SAADownloadDocument;

	// Page Factory (or) Object Repository of Major Assemblies FOText Tab
	@FindBy(xpath = "//*[@id='dgTableFO']/tbody")
	WebElement FOTableLeft;
	@FindBy(xpath = "//*[@id='foTable']/tbody")
	WebElement FOTableRight;
	@FindBy(xpath = "(//span[@class='sym rc-i-line-download-document'])[5]")
	WebElement FODownloadDocument;

	// Page Factory (or) Object Repository of Major Assemblies ControlUnit Tab
	@FindBy(xpath = "//*[@id='controlUnitTable']/tbody")
	WebElement ControlUnitTable;
	@FindBy(xpath = "//span[@class='cell-icon rc-i-line-search']")
	WebElement ControlUnitTableSearch;
	@FindBy(xpath = "//span[@class='cell-icon rc-i-line-industry']")
	WebElement ControlUnitTableIndustry;

	// Page Factory (or) Object Repository of Major Assemblies Design Groups Tab
	@FindBy(xpath = "//*[@id='dgTableMAG']/tbody")
	WebElement DesignGroupTableLeft;
	@FindBy(xpath = "//*[@id='assyGroupTable']/tbody")
	WebElement DesignGroupTableRight;

	// Page Factory (or) Object Repository of Major Assemblies History Tab
	@FindBy(xpath = "//button[contains(@data-ng-click,'showModificationsOfAssignedObjects')]")
	WebElement HistoryOfDependentObjButton;
	@FindBy(xpath = "//button[contains(@data-ng-click,'showHistoricState')]")
	WebElement HistoricalStateButton;
	@FindBy(xpath = "//button[contains(@data-ng-click,'showFirstState')]")
	WebElement InitialStateButton;
	@FindBy(xpath = "//button[contains(@data-ng-click,'showCurrentState')]")
	WebElement CurrentStateButton;
	@FindBy(xpath = "//button[contains(@data-ng-click,'showExcludedEntries')]")
	WebElement TechnicalEnteriesButton;
	@FindBy(xpath = "//button[contains(@data-ng-click,'historyTable')]/span[@class='sym rc-i-line-filter ']")
	WebElement FilterButton;
	@FindBy(xpath = "//*[@id='historyTable']/tbody")
	WebElement HistoryTable;

	// Page Factory (or) Object Repository of tabs to click
	@FindBy(xpath = "//li[@index='0']/a")
	WebElement MAIdentificationTab;
	@FindBy(xpath = "//a[text()='Codes']")
	WebElement MACodesTab;
	@FindBy(xpath = "//a[text()='SAA numbers']")
	WebElement MASAATab;
	@FindBy(xpath = "//li[@index='3']/a")
	WebElement MAElectricalVariants;
	@FindBy(xpath = "//li[@index='4']/a")
	WebElement MASalesdataTab;
	@FindBy(xpath = "//a[text()='FO texts']")
	WebElement MAFOTextTab;
	@FindBy(xpath = "//a[text()='Control units']")
	WebElement MAControlUnitsTab;
	@FindBy(xpath = "//li[@index='7']/a")
	WebElement MAPlantTextTab;
	@FindBy(xpath = "//li[@index='8']/a")
	WebElement MATheftDataTab;
	@FindBy(xpath = "//li[@index='9']/a")
	WebElement MAXFunctionsTb;
	@FindBy(xpath = "//a[text()='Design groups']")
	WebElement MADesignGroups;
	@FindBy(xpath = "//li[@index='11']/a")
	WebElement MAInternalTab;
	@FindBy(xpath = "//li[@index='12']/a")
	WebElement MAInternalText;
	@FindBy(xpath = "//li[@index='13']/a")
	WebElement MATechnicalAdviseTab;
	@FindBy(xpath = "//a[text()='Logging']")
	WebElement MALoggingTab;
	@FindBy(xpath = "//a[text()='History']")
	WebElement MAHistoryTab;
	
	// Page Factory (or) Object Repository of Edit/Add identification tab
	
	@FindBy(xpath = "//button[contains(@data-ng-click,'editEngine')]")
	WebElement EditEngineData;	
	@FindBy(xpath = "//button[contains(@data-ng-click,'editObjectNumber')]")
	WebElement EditObjNum;	
	@FindBy(xpath = "//button[contains(@data-ng-click,'editAdditionalData')]")
	WebElement EditAdditionalData;
	@FindBy(xpath = "//button[contains(@data-ng-click,'editStamping')]")
	WebElement EditStamping;
	@FindBy(xpath = "//button[contains(@data-ng-click,'retrofitMajorAssy')]")
	WebElement EditCarryOutMod;
	
	@FindBy(xpath = "//input[contains(@name,'Variant')]")
	WebElement VariantTextField;
	@FindBy(xpath = "//input[@name='engine_objectNumber']")
	WebElement PartNumTextField;	
	@FindBy(xpath = "//input[contains(@name,'engine_AS_orderNumber')]")
	WebElement OrderNumTextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_productionNumber')]")
	WebElement PrductionNumTextField;
	@FindBy(xpath = "//select[contains(@name,'engine_AS_plant')]")
	WebElement ProductionPlantDropDown;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_reconditionedEngine')]")
	WebElement RecondEngineTextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_luNumber')]")
	WebElement LUNumTextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_eecStandard801269')]")
	WebElement EEC1269TextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_eecStandard88195')]")
	WebElement EEC195TextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_ece24')]")
	WebElement ECE24TextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_basicSettings')]")
	WebElement BasicSettingTextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_din70020')]")
	WebElement din70020TextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_standardPower')]")
	WebElement StandardPowerTextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_overloadPower')]")
	WebElement OverloadPowerTextField;
	@FindBy(xpath = "//input[contains(@name,'engine_AS_din3046')]")
	WebElement din3046TextField;
	
	@FindBy(xpath = "(//button[contains(@data-ng-click,'save')])[2]")
	WebElement SaveButton;
	
	// Page Factory (or) Object Repository of Edit/Add codes tab
	
	@FindBy(xpath = "//button[contains(@data-ng-click,'addCode')]")
	WebElement AddCode;
	@FindBy(xpath = "//input[contains(@data-ng-model,'codeTable_rec.code')]")
	WebElement CodeTextField;
	@FindBy(xpath = "//button[contains(@data-ng-click,'endEditing')]")
	WebElement SaveCheckMark;
	@FindBy(xpath = "//*[@id='MajAssySearchFoot_002']/div/div[2]/form/div[2]/div/div/button[2]")
	WebElement CodesCancelButton;

	@FindBy(xpath = "//*[@id='MajAssySearchFoot_002']/div/div[2]/form/div[2]/div/div/button[1]")
	WebElement CodesSaveButton;

	@FindBy(xpath = "//button[contains(@ng-click,'saveAnyhow()')]")
	WebElement CodesSaveAnyHow;	
	@FindBy(xpath = "(//button[contains(@data-ng-click,'deleteRow')])[1]")
	WebElement DeleteCode;
	@FindBy(xpath="(//span[contains(@data-ng-bind,'codeTable_rec.code')])[1]")
	WebElement tabletext;
	
	// Page Factory (or) Object Repository of Edit/Add SAA tab
	@FindBy(xpath = "//button[contains(@data-ng-click,'addSaa')]")
	WebElement AddSaa;
	@FindBy(xpath = "//input[contains(@data-ng-model,'saaTable_rec.saaDesignation')]")
	WebElement SAATextField;
	@FindBy(xpath = "//button[contains(@data-ng-click,'endEditing')]")
	WebElement SaveCheckMarkSAA;
	@FindBy(xpath = "(//button[contains(@data-ng-click,'save')])[2]")
	WebElement SAASaveButton;
	@FindBy(xpath = "//button[contains(@ng-click,'saveAnyhow()')]")
	WebElement SAASaveAnyHow;
	@FindBy(xpath ="//*[@id='saaTable']/tbody/tr[1]/td[6]/span/button")
	WebElement saaDel;
	@FindBy(xpath ="(//span[contains(@data-ng-bind,'saaTable_rec.saaDesignation')])[1]")
	WebElement saatablefirstcol;
	
	//Page Factory (or) Object Repository of Edit/Add sales data tab
	@FindBy(xpath = "(//button[contains(@data-ng-click,'activateEdit')])[6]")
	WebElement EditSales;
	@FindBy(xpath = "//input[contains(@name,'customerNumber')]")
	WebElement salesTextField;
	@FindBy(xpath = "(//button[contains(@data-ng-click,'save')])[2]")
	WebElement SalesDataSaveButton;
	@FindBy(xpath = "(//span[contains(@data-ng-bind,'customerNumber')])[2]")
	WebElement salesData;
	
	
    //RINTTHO
    @FindBy(xpath = "//a[text()='Model plate']")
    WebElement modelPlateTab;
    
    @FindBy(xpath = "//table[@id='labelTable']/tbody/tr/td[1]")
    WebElement labelID_1;
    
    @FindBy(xpath = "//span[text()='Add value']")
    WebElement addValueButton ;
    
    @FindBy(xpath = "//select[@name='content_key']")
    WebElement keyDropdown ;
    
    @FindBy(xpath = "//input[@name='content_value']")
    WebElement contentText ;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement modelPlateSubmitTick ;
    
    @FindBy(xpath = "//button[@data-ng-click='save($event)']")
    WebElement modelPlateSaveButton ;
    
    @FindBy(xpath = "//span[text()='Add value']/parent::button/following-sibling::button")
    WebElement modelPlateKeyFilter ;
    
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement modelPlateFilter ;
    
    @FindBy(xpath = "//i[contains(@class,'ssym rc-i-line-search')]")
    WebElement modelPlateFilterSearch ;
  
    @FindBy(xpath = "//button[contains(@data-ng-click,'editRow')]")
    WebElement modelPlateEditbutton ;
    
    @FindBy(xpath = "//span[contains(@class,'trash')]")
    WebElement modelPlateDeleteButton;
    
    @FindBy(xpath = "//select[@data-ng-model='viewDataObject.majorAssemblySearchCategory']")
    WebElement majorAssembly_SearchDropDown;
    
    @FindBy(xpath = "//div[contains(@id,'MajAssyHighVoltageIdentification')]//span[text()='Variant']")
    WebElement identification_Variant;
    
    @FindBy(xpath = "(//span[contains(@data-ng-bind,'.objectNumber')])[1]")
    WebElement identification_Variant_Data;
    
    @FindBy(xpath = "//span[text()='Part number']")
    WebElement identification_PartNumber;
    
    @FindBy(xpath = "(//span[contains(@data-ng-bind,'.objectNumber')])[2]")
    WebElement identification_PartNumber_Data;
    
    @FindBy(xpath = "//span[text()='LU number']")
    WebElement identification_LuNumber;
    
    @FindBy(xpath = "//span[contains(@data-ng-bind,'.luNumber')]")
    WebElement identification_LuNumber_Data;
  
    @FindBy(xpath = "//span[text()='Production number']")
    WebElement identification_ProductionNumber;
    
    @FindBy(xpath = "//span[contains(@data-ng-bind,'.productionNumber')]")
    WebElement identification_ProductionNumber_Data;
    
    @FindBy(xpath = "//span[text()='Final acceptance date']")
    WebElement identification_finalAcceptanceDate;
    
    @FindBy(xpath = "//span[@data-ng-bind='viewDataObject.highVoltageBattery.activeProductDate.technicalApprovalDate | idate']")
    WebElement identification_finalAcceptanceDate_Data;
  
    @FindBy(xpath = "//span[text()='Shipment date']")
    WebElement identification_shipmentDate;
  
    @FindBy(xpath = "//span[@data-ng-bind='viewDataObject.highVoltageBattery.activeProductDate.shipmentDate | idate']")
    WebElement identification_shipmentDate_Data;
    
    @FindBy(xpath = "//span[@class='ura_icon rc-i-line-pdf']")
    WebElement pdf;
    
    @FindBy(xpath = "//form[contains(@name,'MajorAssemblyPdfReportOptions')]//span[text()='OK']")
    WebElement pdf_OkButton;
    
// --start 2871
    
    
    @FindBy(xpath="//input[@name='majAssySearch']")
	WebElement searchInput;
    
    @FindBy(xpath="//select[@data-ng-model='viewDataObject.majorAssemblySearchCategory']")
	WebElement searchInput_category;
    
    @FindBy(xpath="//button[starts-with(@id,'MajAssySearch')]")
	WebElement searchButton;
    
    @FindBy(xpath="(//span[text()='Engine no.'])/parent::label/parent::div/following-sibling::div[1]")
   	WebElement engineNumber;
    
    @FindBy(xpath="//select[@name='majorAssemblySearchCategory']")
	WebElement dropdownMajorAssemblyCategory;
    
    @FindBy(xpath="//span[text()='Recond. engine']/parent::label/parent::div/following-sibling::div[1]/span")
	WebElement recondNumber;
    
    @FindBy(xpath="//span[text()='Transmission no.']/parent::label/parent::div/following-sibling::div[1]/span")
	WebElement transmissionNumber;
    

    
    @FindBy(xpath="(//span[text()='Axle number'])/parent::label/parent::div/following-sibling::div[1]/span")
   	WebElement axleNumber;
    
    @FindBy(xpath="(//span[text()='Cab number'])/parent::label/parent::div/following-sibling::div[1]/span")
 	WebElement cabNumber;
    @FindBy(xpath="(//span[text()='Production number'])/parent::label/parent::div/following-sibling::div[1]/span")
	WebElement productionNumber;
    @FindBy(xpath="(//span[text()='Variant'])/parent::label/parent::div/following-sibling::div[1]/span")
	WebElement variant ;
    @FindBy(xpath="//span[text()='LU number']/parent::label/parent::div/following-sibling::div[1]/span")
	WebElement lUNumber;
    
    @FindBy(xpath="//span[text()='EAT number']/parent::label/parent::div/following-sibling::div[1]/span")
   	WebElement eATNumber;
    
    @FindBy(xpath="//table[@id='dpfTable']/tbody/tr[1]")
   	WebElement idOfDieselParticulate;
    
    @FindBy(xpath="//span[text()='High-voltage battery number']/parent::label/parent::div/following-sibling::div[1]/span")
   	WebElement highVoltageBatteryNumber;
    
    @FindBy(xpath="//span[text()='REESS code']/parent::label/parent::div/following-sibling::div[1]/span")
   	WebElement rEESSCode;
    @FindBy(xpath="//span[text()='Order number']/parent::label/parent::div/following-sibling::div[1]/span")
   	WebElement orderNumber;
    
    
    public String  engineNumberInput = "780997F0076269";
    public String engineEndInputNumber = "2742930604849";
    public String orderNumberInput ="7353170709";
    public String  recondNumberInput = "44490150509094212";
    public String transmissionNumberInput =  "71161210000083";
    public String  axleNumberInput =  "739528A878114";
    public String  axleEndNumberInput = "1234567";
    public String cabNumberInput = "042684882000";
    public String  productionNumberInput = "8536571";
    public String variantNumberInput = "C004003421";
    public String  lUNumberInput = "D9009100000002";
    public String  eatNumberInput = "53396562949381";
    public String idOfDieselParticulateInput = "100000000101";// and 100000000155
    public String  highVoltageBatteryInputNumber = "790001MA000201";
    public String  highVoltageBatteryReesCodeInputNumber = "08XPE20310011199T0000014";
 //KELKARK- Used in U-139
    public String  engineNumberInput_2 = "471926C0376941";
    public String  TransmissionNumberInput_2 = "71535201646043";
	public String  TransmissionNumberInput_3 = "71535201646043";
    public String  CabNumberInput_2 = "9729801X001576";
    public String  AfterTreatmentNumberInput_2 = "93075010286793";
    //Used in U-207
    public String  engineNumberInput_3 = "471926C0376933";
	public String  engineNumberInput_4 = "471926C0376940";

	public String  engineNumberInput_5 = "471926C0376943";

	public String  engineNumberInput_6 = "471926C0376940";
    
    
    
  //KELKARK- Start U-139  
    @FindBy(xpath="//a[text()='Sales data']")
  	WebElement salesData_tab;
      
      @FindBy(xpath="//form[contains(@data-ng-if,'create_copy_delete_product')]//span[contains(@data-ng-bind,'Customer.customerNumber')]")
  	WebElement fatchCustomerNumber;
      
      @FindBy(xpath="//span[@data-ng-bind='viewDataObject.majAssyReferences.majorAssembly.activeCustomer.addressOld']")
    	WebElement fatchFlowOfMaterial;
      
      //U-083
      @FindBy(xpath="//button[contains(@data-ng-click,'modifySalesData')]")
      WebElement editSalesData_button;
      
      @FindBy(xpath="//input[@data-ng-model='viewDataObject.majAssyReferences.majorAssembly.activeCustomer.customerNumber']")
      WebElement edit_customerNo;
      
      @FindBy(xpath="//button[contains(@data-ng-click,'save')]")
      WebElement saveButton_salesTab;
      
  	//VIAGARW
		@FindBy(xpath="//span[contains(@class,'ura_icon rc-i-line-support')]")
		WebElement Feedback;
		@FindBy(xpath="//button/span[text()='Edit object numbers']")
		WebElement edit_ObjectNo;
		@FindBy(xpath="//input[contains(@name,'engine_objectNumberVariant')]")
		WebElement Identification_VariantEngine;
		@FindBy(xpath="//input[contains(@name,'axle_objectNumberVariant')]")
		WebElement Identification_VariantAxle;
		@FindBy(xpath="//input[contains(@name,'cab_objectNumberVariant')]")
		WebElement Identification_VariantCab;
		@FindBy(xpath="//input[contains(@name,'transmission_objectNumberVariant')]")
		WebElement Identification_VariantTransmission;
		@FindBy(xpath="//input[contains(@name,'afterTreatmentSystem_objectNumberVariant')]")
		WebElement Identification_VariantEAT;
		@FindBy(xpath="//form/div[4]/div[2]/div/input")
		WebElement Identification_PartNumber;
		@FindBy(xpath="//a[text()='Data error']")
		WebElement dataErrorTab;
		@FindBy(xpath="//button[contains(@data-ng-click,'toggleAllOpen($event)')]")
		WebElement dataErrorTab_ShowAllError;
		@FindBy(xpath="//*[@id='ruleViolations']//following::button")
		WebElement dataErrorTab_Export;
		@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
    	WebElement dateModified_columnHeader;
		@FindBy(xpath="//table//tbody//tr[1]//td//a")
    	WebElement getRow1_dateModified;
		@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.validationResult.ruleViolations)')]")
		WebElement dataErrorTab_totalrecords;
		@FindBy(xpath="//*[@id='ruleViolations']/tbody/tr[1]/td[11]/span/button[2]")
		WebElement dataErrorTab_NavigateIcon;
		@FindBy(xpath="//*[@id='ruleViolations']/tbody/tr[1]/td[7]")
		WebElement dataErrorTab_Highlightrow;
      public  void EditSalseData_Button_sd() {
    	  warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(editSalesData_button));																	 
    	  editSalesData_button.click();
  		}  
      public  void Send_CustomerNo(String value) {
    	  edit_customerNo.clear();
    	  edit_customerNo.sendKeys(value);
  		}
      public  void SaveButton_salesTab() {
    	  saveButton_salesTab.click();
    	  warmup5();
  		}
      
      
    public  void SalesData_Tab() {
			wait.until(ExpectedConditions.elementToBeClickable(salesData_tab));															
    	salesData_tab.click();
	}
    
    public String FatchCustomerNumber_SalesTab() {
    	String CustomerNo=fatchCustomerNumber.getText();
    	
    	return CustomerNo;
	}
    public String FatchFlowOfMaterial_SalesTab() {
    	String value=fatchFlowOfMaterial.getText();
    	return value;
    }
    //end U-139
    
    
    
    public void searchCategoryNumber(String CategoryNumberInput)
    {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		searchInput.clear();
		searchInput.sendKeys(CategoryNumberInput);
		warmup6();
		searchButton.click();
		warmup6();
	
	}
    public void searchCategoryNumber_withCategory(String Category, String CategoryNumberInput)
    {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput_category));
		Select mode = new Select(searchInput_category);
		mode.selectByVisibleText(Category);
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		searchInput.clear();
		searchInput.sendKeys(CategoryNumberInput);
		
		searchButton.click();
		warmup6();
	
	}
    
    public String fetchEngineNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String engineNumberWithSpace = engineNumber.getText();
		System.out.println(engineNumberWithSpace);
		String engineNumberUI = engineNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(engineNumberUI);
		return engineNumberUI;

	}
    
	public String fetchRecondNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String recondNumberWithSpace = recondNumber.getText();
		System.out.println(recondNumberWithSpace);
		String recondNumberUI = recondNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(recondNumberUI);
		return recondNumberUI;
	}
	public String fetchOrderNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String orderNumberWithSpace = orderNumber.getText();
		System.out.println(orderNumberWithSpace);
		String orderNumberUI = orderNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(orderNumberUI);
		return orderNumberUI;
	}
	
	public void searchVehicleCategory(String category) {
		Select drpVehicleCategory = new Select(dropdownMajorAssemblyCategory);
		drpVehicleCategory.selectByVisibleText(category);

	}
	public String fetchTransmissionNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String transmissionNumberWithSpace = transmissionNumber.getText();
		System.out.println(transmissionNumberWithSpace);
		String transmissionNumberUI = transmissionNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(transmissionNumberUI);
		return transmissionNumberUI;
	}
	
	
	public String fetchAxleNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String axleNumberWithSpace = axleNumber.getText();
		System.out.println(axleNumberWithSpace);
		String axleNumberUI = axleNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(axleNumberUI);
		return axleNumberUI;
	}
	
	public String fetchAxleEndNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String axleEndNumberWithSpace = axleNumber.getText();
		System.out.println(axleEndNumberWithSpace);
		String axleEndNumberUI = axleEndNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(axleEndNumberUI);
		return axleEndNumberUI;
	
	}
	
	public String fetchCabNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String cabNumberWithSpace = cabNumber.getText();
		System.out.println(cabNumberWithSpace);
		String cabNumberUI = cabNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(cabNumberUI);
		return cabNumberUI;
	
	}
	

	public String fetchProductionNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String productionNumberWithSpace = productionNumber.getText();
		System.out.println(productionNumberWithSpace);
		String  productionNumberUI = productionNumberWithSpace.replaceAll("\\s+", "");
		System.out.println( productionNumberUI);
		return productionNumberUI;
	
	}
	public String fetchVariant() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String variantWithSpace = variant.getText();
		System.out.println(variantWithSpace);
		String  variantUI = variantWithSpace.replaceAll("\\s+", "");
		System.out.println(variantUI);
		return variantUI;
	
	}
	
	public String fetchLUNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String lUNumberWithSpace = lUNumber.getText();
		System.out.println(lUNumberWithSpace);
		String  lUNumberUI = lUNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(lUNumberUI);
		return lUNumberUI;
	
	}
	
	public String fetchEATNumber() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String eATNumberWithSpace = eATNumber.getText();
		System.out.println(eATNumberWithSpace);
		String  eATNumberUI = eATNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(eATNumberUI);
		return eATNumberUI;
		}
	
	public String fetchIdOfDieselParticulate() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String idOfDieselParticulateWithSpace = idOfDieselParticulate.getText();
		System.out.println(idOfDieselParticulateWithSpace);
		String  idOfDieselParticulateUI = idOfDieselParticulateWithSpace.replaceAll("\\s+", "");
		System.out.println(idOfDieselParticulateUI);
		return idOfDieselParticulateUI;
		}
	
	
	public String fetchHighVoltageBatteryID() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String highVoltageBatteryNumberWithSpace = highVoltageBatteryNumber.getText();
		System.out.println(highVoltageBatteryNumberWithSpace);
		String  highVoltageBatteryNumberUI = highVoltageBatteryNumberWithSpace.replaceAll("\\s+", "");
		System.out.println(highVoltageBatteryNumberUI);
		return highVoltageBatteryNumberUI;
		}
	
	public String fetchHighVoltageBatteryREESSCode() {
		//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		warmup1();
		String rEESSCodeWithSpace = rEESSCode.getText();
		System.out.println(rEESSCodeWithSpace);
		String  rEESSCodeUI = rEESSCodeWithSpace.replaceAll("\\s+", "");
		System.out.println(rEESSCodeUI);
		return rEESSCodeUI;
		}
	
	public boolean autoSearcHistory() {

		warmup5();
		

		String arr[] = { highVoltageBatteryReesCodeInputNumber , highVoltageBatteryInputNumber , idOfDieselParticulateInput ,
				eatNumberInput , lUNumberInput , variantNumberInput , productionNumberInput ,
				cabNumberInput , axleEndNumberInput , axleNumberInput  };
		warmup();
		searchInput.click();

		warmup();

		List<WebElement> search_listHistory = driver
				.findElements(By.xpath("//datalist[@id='majAssySearchAutoComplete']/option"));
		int size = search_listHistory.size();
		System.out.println(size);
		System.out.println("Size of the dropdown list is: " + search_listHistory.size());

		int count = 0;
		int i;
		for (i = 0; i < search_listHistory.size(); i++) {

			if ((arr[i].equals(search_listHistory.get(i).getAttribute("value")))) {
				count++;
			
				System.out.println(search_listHistory.get(i).getAttribute("value"));

			}

		}
		System.out.println(count);
		System.out.println(arr.length);

		Assert.assertEquals(count, arr.length);
		return true;
		

	}
	
	public boolean autoSearcHistoryAfterNewSearch() {

		warmup5();

		String arr[] = {engineNumberInput ,highVoltageBatteryReesCodeInputNumber , highVoltageBatteryInputNumber , idOfDieselParticulateInput ,
				eatNumberInput , lUNumberInput , variantNumberInput , productionNumberInput ,
				cabNumberInput , axleEndNumberInput  };
		warmup();
		searchInput.click();

		warmup();

		List<WebElement> search_listHistory = driver
				.findElements(By.xpath("//datalist[@id='majAssySearchAutoComplete']/option"));
		int size = search_listHistory.size();
		System.out.println(size);
		System.out.println("Size of the dropdown list is: " + search_listHistory.size());

		int count = 0;
		int i;
		for (i = 0; i < search_listHistory.size(); i++) {
			String value = search_listHistory.get(i).getAttribute("value");
			System.out.println(value);
			if ((arr[i].equals(search_listHistory.get(i).getAttribute("value")))) {
				count++;

			}

		}

		Assert.assertEquals(count, arr.length);
		return true;

	}
	
	public void enterCategoryNumber(String CategoryNumberInput) {

		warmup1();
	
		
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));

	searchInput.clear();
		warmup5();
		searchInput.sendKeys(CategoryNumberInput,Keys.DOWN,Keys.ENTER);
		warmup6();
	
		
	}

	public String fetchMajorAssemblyCategorySelected() {
		//warmup5();
		Select select = new Select(dropdownMajorAssemblyCategory);
		WebElement option = select.getFirstSelectedOption();
		warmup5();
		String selectedCategory = option.getText();
		System.out.println(selectedCategory);
		warmup5();
		return selectedCategory;

	}


	
// end 2871
    
    public void SearchEngineNumModelPlate() throws InterruptedException {
       // Searchfield.click();
        Searchfield.sendKeys("936971C0223834");
        SearchButton.click();
        Thread.sleep(5000);
    }
        public void clickModelPlateTab() 
        {
            wait.until(ExpectedConditions.visibilityOf(modelPlateTab));
            modelPlateTab.click();
        }
        public void clickLabelID_1() 
        {
            wait.until(ExpectedConditions.visibilityOf(labelID_1));
            labelID_1.click();
        }
        public void clickaddValueButton() 
        {
            wait.until(ExpectedConditions.visibilityOf(addValueButton));
            addValueButton.click();
        }
        public void selectDropdownValue() 
        {
            warmup5();
        Select drpCountry = new Select(keyDropdown);
         drpCountry.selectByVisibleText("9030 - zgheLibAGw");       
        }
    
        public void contentValueInput() 
        {
            contentText.sendKeys("Add Value");   
        }
        public void modelPlateTickButton()
        {
            wait.until(ExpectedConditions.visibilityOf(modelPlateSubmitTick));
            modelPlateSubmitTick.click();
          
        }
        public void modelPlateSave()
        {
          
            modelPlateSaveButton.click();
        }
        public void modelPlateFilter()
        {
            wait.until(ExpectedConditions.visibilityOf(modelPlateKeyFilter));
            modelPlateKeyFilter.click();
            modelPlateFilter.sendKeys("9030");
            warmup5();
          //  modelPlateFilterSearch.click();
            
        }
        public void modelPlateFilterwithcontent()
        {
            warmup5();
            wait.until(ExpectedConditions.visibilityOf(modelPlateKeyFilter));
            modelPlateKeyFilter.click();
            modelPlateFilter.sendKeys("Edited Value");
           
         
            
        }
        public void modelPlateEdit()
        {
            wait.until(ExpectedConditions.visibilityOf(modelPlateEditbutton));
            modelPlateEditbutton.click();
            
        }
        
        public void contentValueEdit() throws InterruptedException 
        {
            contentText.click();
          
            contentText.clear();
            contentText.sendKeys("Edited Value");   
        }
        
        
        

        public void modelPlateDelete()
        {
            warmup5();
            wait.until(ExpectedConditions.visibilityOf(modelPlateDeleteButton));
          modelPlateDeleteButton.click(); 
        }
        
        
        
        public boolean DeleteValidation()
        {
            warmup5();
         
            try {
                 driver.findElement(By.xpath("//span[contains(@class,'trash')]"));
                 
                 return true;
                
             } catch (org.openqa.selenium.NoSuchElementException e) {
                 return false;
             }

        }
        

	// Initializing the page objects
	public MajorAssemblyPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Edit Sales tab
	public void EditSales() {
		EditSales.click();
	}
	public String alertText(){
		  String alert_text=alerttext.getText();
		  return alert_text;
	  }
	  public void alerttextClick(){
		  Alertclick.click();
	  }
	public void salesTextField() {
		salesTextField.click();
		salesTextField.clear();
		salesTextField.sendKeys(givensalesData);
		warmup5();
	}
	
	public void SalesDataSaveButton() {
		SalesDataSaveButton.click();
	}
	
	public String salesData() {
		String salesDatavalue=salesData.getText();
		return salesDatavalue;
	}
	
	//Edit SAA tab
	public void addsaa() {
		AddSaa.click();
	}
	
	public void SAATextField() {
		SAATextField.sendKeys("53700010");
	}
	
	public void SaveCheckMarkSAA() {
		SaveCheckMarkSAA.click();
	}
	
	public void SAASaveButton() {
		SAASaveButton.click();
	}
	
	public void saaDel() {
		saaDel.click();
	}
	
	public String saatabletext() {
		String text=saatablefirstcol.getText();
		return text;
	}
	
	//Edit Codes tab
	public void addcode() {
		AddCode.click();
	}
	
	public void entercode() {
		CodeTextField.sendKeys("GL"+givencode);
	}
	
	public void clickcheck() {
		SaveCheckMark.click();
	}
	
	public void codesCancel() {
		CodesCancelButton.click();
	}
	public void codesSave(){
		CodesSaveButton.click();
	}
	public void CodesSaveAnyHow() {
		CodesSaveAnyHow.click();
	}
	
	public void DeleteCode() {
		DeleteCode.click();
	}
	
	public String tabletext() {
		String text=tabletext.getText();
		return text;
	}
	
	//Edit Actions	
	public void clickEditEngineData() {
		EditEngineData.click();
	}

	public void clickEditObjNum() {
		EditObjNum.click();
	}
	
	public void clickEditAdditionalData() {
		EditAdditionalData.click();
	}
	
	public void clickEditStamping() {
		EditStamping.click();
	}
	
	public void clickEditCarryOutMod() {
		EditCarryOutMod.click();
	}
	

	
	//Actions of adding texts
	public void EnterVariant() {
		VariantTextField.clear();
		
	    VariantTextField.sendKeys(givenvariant);
	}
	
	public void EnterPartNum() {
		PartNumTextField.clear();
		PartNumTextField.sendKeys(givenPartNum);
	}
	
	public void EnterPrductionNum() {		
		PrductionNumTextField.clear();
		PrductionNumTextField.sendKeys(givenPrductionNum);
	}
	
	public void EnterOrderNum() {
		OrderNumTextField.clear();
		OrderNumTextField.sendKeys(givenOrderNum);
	}
	
	public void EnterRecondEngine() {
		RecondEngineTextField.clear();
		RecondEngineTextField.sendKeys(givenRecondEngine);
	}
	
	public void EnterLUNum() {
		LUNumTextField.clear();
		LUNumTextField.sendKeys(givenLUNum);
	}
	
	public void EnterEEC1269() {
		EEC1269TextField.clear();
		EEC1269TextField.sendKeys(givenEEC1269);
	}
	
	public void EnterEEC195() {	
		EEC195TextField.clear();
		EEC195TextField.sendKeys(givenEEC195);
	}
	
	public void EnterECE24() {
		ECE24TextField.clear();
		ECE24TextField.sendKeys(givenECE24);
	}
	
	public void EnterBasicSetting() {	
		BasicSettingTextField.clear();
		BasicSettingTextField.sendKeys(givenBasicSetting);
	}
	
	public void Enterdin70020() {
		din70020TextField.clear();
		din70020TextField.sendKeys(givendin70020);
	}
	
	public void EnterStandardPower() {
		StandardPowerTextField.clear();
		StandardPowerTextField.sendKeys(givenStandardPower);
	}
	
	public void EnterOverloadPower() {
		OverloadPowerTextField.clear();
		OverloadPowerTextField.sendKeys(givenOverloadPower);
	}
	
	public void Enterdin3046() {
		din3046TextField.clear();
		din3046TextField.sendKeys(givendin3046);
	}
	
	public void EnterSaveButton() {		
		SaveButton.click();
	}
	

	// Actions of Page Objects
	public Boolean validateMajorAssemblyPage() {
		wait.until(ExpectedConditions.elementToBeClickable(Searchfield));
		return Searchfield.isDisplayed();
	}

	public void clickIdentificationTab() {
		MAIdentificationTab.click();
	}

	public void SearchEngineNum() throws InterruptedException {
		Searchfield.sendKeys("471976C0176315");
		SearchButton.click();
		Thread.sleep(5000);
	}
	public void SearchEngineNum2() throws InterruptedException {
		Searchfield.sendKeys("471926C0376941");
		SearchButton.click();
		Thread.sleep(5000);
	}

	public void clickMACodesTab() throws InterruptedException {
		Thread.sleep(1000);
		MACodesTab.click();
		//Thread.sleep(1000);
	}

	public void clickMASAATab() throws InterruptedException {
		MASAATab.click();
		Thread.sleep(1000);
	}

	public void clickMAElectricalVariants() throws InterruptedException{
		MAElectricalVariants.click();
		Thread.sleep(1000);
	}

	public void clickMASalesdataTab() throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(MASalesdataTab));															  
		MASalesdataTab.click();
		Actions act=new Actions(driver);
		act.moveToElement(SearchButton).build().perform();						  
		Thread.sleep(1000);
	}

	public void clickMAFOTextTab() throws InterruptedException{
		MAFOTextTab.click();
		Thread.sleep(1000);
	}

	public void clickMAControlUnitsTab() throws InterruptedException{
		MAControlUnitsTab.click();
		Thread.sleep(1000);
	}

	public void clickMAPlantTextTab() throws InterruptedException {
		MAPlantTextTab.click();
		Thread.sleep(1000);
	}

	public void clickMATheftDataTab() throws InterruptedException {
		MATheftDataTab.click();
		Thread.sleep(1000);
	}

	public void clickMAXFunctionsTb() throws InterruptedException {
		MAXFunctionsTb.click();
		Thread.sleep(1000);
	}

	public void clickMADesignGroups() throws InterruptedException {
		MADesignGroups.click();
		Thread.sleep(1000);
	}

	public void clickMAInternalTab() throws InterruptedException {
		MAInternalTab.click();
		Thread.sleep(1000);
	}

	public void clickMAInternalText() throws InterruptedException {
		MAInternalText.click();
		Thread.sleep(1000);
	}

	public void clickMATechnicalAdviseTab() throws InterruptedException {
		MATechnicalAdviseTab.click();
		Thread.sleep(1000);
	}

	public void clickMALoggingTab() throws InterruptedException {
		MALoggingTab.click();
		Thread.sleep(1000);
	}

	public void clickMAHistoryTab() throws InterruptedException {
		MAHistoryTab.click();
		Thread.sleep(1000);
	}
	

	public String EngineNumber() {
		String EngineNumber_value = EngineNumber.getText();
		return EngineNumber_value;
	}

	public String Variant() {
		String Variant_value = Variant.getText();
		return Variant_value;
	}

	public String PartNumber() {
		String PartNumber_value = PartNumber.getText();
		return PartNumber_value;
	}

	public String VIN() {
		String VIN_value = VIN.getText();
		return VIN_value;
	}

	public String MotorIdBefore() {
		String MotorIdBefore_value = MotorIdBefore.getText();
		return MotorIdBefore_value;
	}

	public String OrderNumber() {
		String OrderNumber_value = OrderNumber.getText();
		return OrderNumber_value;
	}

	public String ProductionNumber() {
		String ProductionNumber_value = ProductionNumber.getText();
		return ProductionNumber_value;
	}

	public String ProductionPlant() {
		String ProductionPlant_value = ProductionPlant.getText();
		return ProductionPlant_value;
	}

	public String FinalAcceptate() {
		String FinalAcceptate_value = FinalAcceptate.getText();
		return FinalAcceptate_value;
	}

	public String ShipmentDate() {
		String ShipmentDate_value = ShipmentDate.getText();
		return ShipmentDate_value;
	}

	public String MotorIdAfter() {
		String MotorIdAfter_value = MotorIdAfter.getText();
		return MotorIdAfter_value;
	}

	public String Status() {
		String Status_value = Status.getText();
		return Status_value;
	}

	public String RecondEngine() {
		String RecondEngine_value = RecondEngine.getText();
		return RecondEngine_value;
	}

	public String LUNumber() {
		String LUNumber_value = LUNumber.getText();
		return LUNumber_value;
	}

	public String OneEEC() {
		String OneEEC_value = OneEEC.getText();
		return OneEEC_value;
	}

	public String TwoEEC() {
		String TwoEEC_value = TwoEEC.getText();
		return TwoEEC_value;
	}

	public String ECE() {
		String ECE_value = ECE.getText();
		return ECE_value;
	}

	public String BasicSetting() {
		String BasicSetting_value = BasicSetting.getText();
		return BasicSetting_value;
	}

	public String CertificationDesignation() {
		String CertificationDesignation_value = CertificationDesignation.getText();
		return CertificationDesignation_value;
	}

	public String DIN() {
		String DIN_value = DIN.getText();
		return DIN_value;
	}

	public String DINStandardPower() {
		String DINStandardPower_value = DINStandardPower.getText();
		return DINStandardPower_value;
	}

	public String DINOverloadPower() {
		String DINOverloadPower_value = DINOverloadPower.getText();
		return DINOverloadPower_value;
	}

	public String DINTwo() {
		String DINTwo_value = DINTwo.getText();
		return DINTwo_value;
	}

	public String EngineNumberStamping() {
		String EngineNumberStamping_value = EngineNumberStamping.getText();
		return EngineNumberStamping_value;
	}

	public String LastModification() {
		String LastModification_value = LastModification.getText();
		return LastModification_value;
	}

	public String InstanceVersion() {
		String InstanceVersion_value = InstanceVersion.getText();
		return InstanceVersion_value;
	}

	public String LastOutputSupply() {
		String LastOutputSupply_value = LastOutputSupply.getText();
		return LastOutputSupply_value;
	}

	public String RestrictedSupply() {
		String RestrictedSupply_value = RestrictedSupply.getText();
		return RestrictedSupply_value;
	}

	public boolean codestablecontent() {
		if (CodesTableContent.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String codestablecontentString() {
		String codestablecontentString=CodesTableContent.getText();
		return codestablecontentString;
	}

	public boolean CodesDownloadDocument() {
		if (CodesDownloadDocument.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean CodesFilter() {
		if (CodesFilter.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean CodesHideDesignation() {
		if (CodesHideDesignation.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean SAATableBodyLeft() {
		if (SAATableBodyLeft.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String SAATableBodyLeftString() {
		String SAATableBodyLeftcontentvalue=SAATableBodyLeft.getText();
		return SAATableBodyLeftcontentvalue;
	}

	public boolean SAATableBodyRight() {
		if (SAATableBodyRight.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String SAATableBodyRightString() {
		String SAATableBodyRightcontentvalue=SAATableBodyRight.getText();
		return SAATableBodyRightcontentvalue;
	}

	public boolean SAADownloadDocument() {
		if (SAADownloadDocument.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean FOTableLeft() {
		if (FOTableLeft.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String FOTableLeftString() {
		String FOTableLeftString=FOTableLeft.getText();
		return FOTableLeftString;
	}

	public boolean FOTableRight() {
		if (FOTableRight.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String FOTableRightString() {
		String FOTableRightString=FOTableRight.getText();
		return FOTableRightString;
	}

	public boolean FODownloadDocument() {
		if (FODownloadDocument.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ControlUnitTable() {
		if (ControlUnitTable.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ControlUnitTableSearch() {
		if (ControlUnitTableSearch.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ControlUnitTableIndustry() {
		if (ControlUnitTableIndustry.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean DesignGroupTableLeft() {
		if (DesignGroupTableLeft.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String DesignGroupTableLeftString() {
		String DesignGroupTableLeftString=DesignGroupTableLeft.getText();
		return DesignGroupTableLeftString;
	}

	public boolean DesignGroupTableRight() {
		if (DesignGroupTableRight.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String DesignGroupTableRightString() {
		String DesignGroupTableRightString=DesignGroupTableRight.getText();
		return DesignGroupTableRightString;
	}

	public boolean HistoryOfDependentObjButton() {
		if (HistoryOfDependentObjButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean HistoricalStateButton() {
		if (HistoricalStateButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean InitialStateButton() {
		if (InitialStateButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean CurrentStateButton() {
		if (CurrentStateButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean TechnicalEnteriesButton() {
		if (TechnicalEnteriesButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean FilterButton() {
		if (FilterButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean HistoryTable() {
		if (HistoryTable.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
    public void select_HighVoltageBatteryId() 
    {
    Select drpCountry = new Select(majorAssembly_SearchDropDown);
     drpCountry.selectByValue("string:highVoltageBatteryID");       
    }

    public void search_HighVoltageBatteryId() throws InterruptedException {
        Searchfield.sendKeys("790001MA000201");
        SearchButton.click();
        Thread.sleep(5000);
    }
    
    public void pdf_search_HighVoltageBatteryId() throws InterruptedException {
        Searchfield.sendKeys("790001MA000222");
        SearchButton.click();
        Thread.sleep(5000);
    }
    
    public boolean identification_Variant() {
		if (identification_Variant.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
    
	public String identification_Variant_Data() {
		String variant=identification_Variant_Data.getText();
		return variant;
	}
	
    public boolean identification_PartNumber() {
		if (identification_PartNumber.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
    
	public String identification_PartNumber_Data() {
		String variant=identification_PartNumber_Data.getText();
		return variant;
	}
	
	
    public boolean identification_LuNumber() {
		if (identification_LuNumber.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
    
	public String identification_LuNumber_Data() {
		String variant=identification_LuNumber_Data.getText();
		return variant;
	}
	
    public boolean identification_ProductionNumber() {
		if (identification_ProductionNumber.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
    
	public String identification_ProductionNumber_Data() {
		String variant=identification_ProductionNumber_Data.getText();
		return variant;
	}
	
	   public boolean identification_finalAcceptanceDate() {
			if (identification_finalAcceptanceDate.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
	    
		public String identification_finalAcceptanceDate_Data() {
			String variant=identification_finalAcceptanceDate_Data.getText();
			return variant;
		}

		
		   public boolean identification_shipmentDate() {
				if (identification_shipmentDate.isDisplayed()) {
					return true;
				} else {
					return false;
				}
			}
		    
			public String identification_shipmentDate_Data() {
				String variant=identification_shipmentDate_Data.getText();
				return variant;
			}

			public void pdf() {
				pdf.click();
			  	warmup1();
			}
			
			public void pdf_OkButton() {
				pdf_OkButton.click();
			  	warmup1();
			  	warmup1();
			}
			
			public void openNewTab_1(){
				warmup5();
			    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));
			}
			
			//2848 start
			
			@FindBy(xpath = "//a[text()='Flexible data']")
			WebElement MAFlexiblDataTab;
			
			@FindBy(xpath = "//span[text()='Add']")
			WebElement MAFlexiblDataAddButton;
			@FindBy(xpath = "//span[text()='Filter']")
			WebElement MAFlexiblDataFilterButton;
			
			@FindBy(xpath = "//input[contains(@name,'key')]")
			WebElement MAKeyInput;
			
			@FindBy(xpath = "//input[contains(@name,'serialNumber')]")
			WebElement MASerialInput;
			//input[contains(@name,'partNumber')]
			
			@FindBy(xpath = "//input[contains(@name,'partNumber')]")
			WebElement MAPartInput;
			
			@FindBy(xpath = "//input[contains(@name,'hardware')]")
			WebElement MAHardwareInput;
			@FindBy(xpath = "//input[contains(@name,'software')]")
			WebElement MASoftwareInput;
			
			@FindBy(xpath = "//button[@type='submit']")
			WebElement checkButton;
			
			@FindBy(xpath = "//span[contains(@class,'trash')]")
			WebElement trashButton;
			
			@FindBy(xpath = "(//span[contains(@class,'save')])[2]")
			WebElement saveButton;
			
			@FindBy(xpath = "//span[contains(@class,'close')]")
			WebElement cancelButton;
			
			@FindBy(xpath = "//span[contains(@class,'pencil')]")
			WebElement editButton;
			@FindBy(xpath = "(//input[@type='text'])[2]")
			WebElement MFSearchTextButton;
			@FindBy(xpath = "//i[contains(@class,'search')]")
			WebElement MFSearchIcon;
			
			public void mAFlexibleDataTab()
			{
				MAFlexiblDataTab.click();
				warmup1();
			}
			
			
			public void mAFlexibleDataClickAddButon()
			{
			warmup6();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", MAFlexiblDataAddButton);
			js.executeScript("arguments[0].click();", MAFlexiblDataAddButton);
			//wait.until(ExpectedConditions.visibilityOf(MAFlexiblDataAddButton));
			warmup5();
			//MAFlexiblDataAddButton.click();
			warmup5();

			}
			
			public void mAFlexibleDataEnterValues()
			{
				MAKeyInput.sendKeys("39");
				MASerialInput.sendKeys("39");
				MAPartInput.sendKeys("39");
				MAHardwareInput.sendKeys("39");
				MASoftwareInput.sendKeys("39");
				
			}
			
			public void mAFlexibleDataCheck()
			{
				checkButton.click();
			}
			public void mAFlexibleDataSave()
			{
			
				saveButton.click();
				warmup5();
			}
			
			public void mAFlexibleDataSearchFilter()
			{
				warmup5();
				MAFlexiblDataFilterButton.click();
				warmup5();
				MFSearchTextButton.sendKeys("39");
				MFSearchIcon.click();
				
			}
			public void mAFlexibleDataUpdatedSearchFilter()
			{
				MAFlexiblDataAddButton.click();
				MFSearchTextButton.sendKeys("100");
				MFSearchIcon.click();
				
			}
			public void mAFlexibleDataEdit()
			{
				editButton.click();
				MAHardwareInput.clear();
				MAHardwareInput.sendKeys("100");
				
			}
			public void mAFlexibleDataDelete()
			{
				trashButton.click();
			}
			//end 2848
			public void revert(){
	            warmup5();
	            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	            driver.switchTo().window(tabs.get(0));
	            //driver.get("https://vedoc-test1-em1.i.daimler.com/vedocweb/");
	        }
			public void SearchEngineNumDataError(String EngineNumber) throws InterruptedException {
                Searchfield.sendKeys(EngineNumber);
                SearchButton.click();
                Thread.sleep(5000);
            }
	  		
			public void SearchEngineNumFeedback() throws InterruptedException {
                Searchfield.sendKeys("27695730855966");
                SearchButton.click();
                Thread.sleep(5000);
            }
            public void supportAndFeedback(){
                  warmup5();
                  Feedback.click();
                  warmup4();
                  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
                  driver.switchTo().window(tabs.get(1));
                  }
            //to check its displayed or not		
			public Boolean editSalesDataButton_DesplayedOrNot_sd(){
				warmup6();
				return editSalesData_button.isDisplayed();	
			}
			 public Boolean SalesDataButton_DesplayedOrNot_sd(){
					warmup6();
					return salesData_tab.isDisplayed();	
				}
			 public void edit_ObjectNoButton(){
				 edit_ObjectNo.click();
			 }
			 public void EditVariantEngine()throws InterruptedException {
				 Identification_VariantEngine.clear();
				 Identification_VariantEngine.sendKeys("X123456789");	
			 }
			 public void EditPartNumberEngine()throws InterruptedException {
				 Identification_PartNumber.clear();
				 Identification_PartNumber.sendKeys("X123456789");
			 }
			 public void EditVariantOriginalEngine()throws InterruptedException {
				 Identification_VariantEngine.clear();
				 Identification_VariantEngine.sendKeys("X110389468");	
			 }
			 public void EditPartNumberOriginalEngine()throws InterruptedException {
				 Identification_PartNumber.clear();
				 Identification_PartNumber.sendKeys("X069630919");
			 }
			 public void EditVariantAxle()throws InterruptedException {
				 Identification_VariantAxle.clear();
				 Identification_VariantAxle.sendKeys("X123456789");	
			 }
			 public void EditVariantOriginalAxle()throws InterruptedException {
				 Identification_VariantAxle.clear();
				 Identification_VariantAxle.sendKeys("X311001263");
			 }
			 public void EditPartNumberAxle()throws InterruptedException {
				 Identification_PartNumber.clear();
				 Identification_PartNumber.sendKeys("X123456789");
			 }
			 public void EditPartNumberOriginalAxle()throws InterruptedException {
				 Identification_PartNumber.clear();
				 Identification_PartNumber.sendKeys("X066501946");
			 }
			 public void EditVariantCabNo()throws InterruptedException {
				 Identification_VariantCab.clear();
				 Identification_VariantCab.sendKeys("X123456789");	
			 }
			 public void EditVariantOriginalCabNo()throws InterruptedException {
				 Identification_VariantCab.clear();
				 Identification_VariantCab.sendKeys("");	
			 }
			 public void EditVariantTransmission()throws InterruptedException {
				 Identification_VariantTransmission.clear();
				 Identification_VariantTransmission.sendKeys("X123456789");	
			 }
			 public void EditVariantOriginalTransmission()throws InterruptedException {
				 Identification_VariantTransmission.clear();
				 Identification_VariantTransmission.sendKeys("X210046688");
			 }
			 public void EditPartNumberOriginalTransmission()throws InterruptedException {
				 Identification_PartNumber.clear();
				 Identification_PartNumber.sendKeys("X062514865");
			 }
			 public void EditVariantEATNo()throws InterruptedException {
				 Identification_VariantEAT.clear();
				 Identification_VariantEAT.sendKeys("X123456789");
			 }
			 public void EditVariantOriginalEATNO()throws InterruptedException {
				 Identification_VariantEAT.clear();
				 Identification_VariantEAT.sendKeys("");
			 }
			 public void DataErrorTab()throws InterruptedException {
				 warmup6();
				 JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView();", dataErrorTab);
					js.executeScript("arguments[0].click();", dataErrorTab);
	}
			 public void dataErrorTab_ShowAllError()throws InterruptedException {
				 warmup6();
				 dataErrorTab_ShowAllError.click();
				 
	}
			 public String GetDownloadedFileName_NewTab(){
			    	warmup5();
			    	JavascriptExecutor js= ((JavascriptExecutor)driver);
			    	js.executeScript("window.open()");
			   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
			   		driver.switchTo().window(opentabs.get(2));
			   		driver.get(prop.getProperty("downloadedFilePath"));
			   		warmup6();
			   		dateModified_columnHeader.click();
			   		warmup6();
			   		String name= getRow1_dateModified.getText();
			   		System.out.println("file name-"+name);
			   		driver.close();
			   		driver.switchTo().window(opentabs.get(0));
			   		return name;
			    	}
			 public int getRecordsCountInCSV(String csvFileName) {
		    		String downloadPath = prop.getProperty("downloadedFilePath");
		    		int lineNumberCount = 0;
		    		try {
		    			if (!csvFileName.isEmpty() || csvFileName != null) {
		    				String filePath =	downloadPath + System.getProperty("file.separator") + csvFileName;
		    				System.out.println(filePath);
		    				File file = new File(filePath);
		    				if (file.exists()) {
		    					System.out.println("File found :" +csvFileName);
		    					FileReader fr = new FileReader(file);
		    					LineNumberReader linenumberreader = new LineNumberReader(fr);
		    					while (linenumberreader.readLine() != null ) {
		    						lineNumberCount++;
		    					}
		    					//To remove the header
		    					lineNumberCount=lineNumberCount-1;
		    					System.out.println("Total number of lines found in csv : " + (lineNumberCount));
		    					linenumberreader.close();
		    				} else {
		    					System.out.println("File does not exists");
		    				}
		    			}
		    		}
		    		catch (IOException e) {
		    			e.printStackTrace();
		    		}return lineNumberCount;
		    	}
			 public int getNumberOfEntries() throws InterruptedException {
				 	String entriesTxt = dataErrorTab_totalrecords();
//					String[] aEntriesText = entriesTxt.split(" / ");
//					System.out.println(aEntriesText.length);
//					String totalEntriesText = aEntriesText[1];
					int i=Integer.parseInt(entriesTxt);
					return i;
				}
			 public String dataErrorTab_totalrecords() {
					String records=dataErrorTab_totalrecords.getText().trim();
					warmup6();
					System.out.println(records);
					return records;	}
			 
			  public void dataErrorTab_Export()throws InterruptedException {
				 warmup6();
				 dataErrorTab_Export.click();
				 String fileName= GetDownloadedFileName_NewTab();
				 int dataCountInCSV= getRecordsCountInCSV(fileName);
				 System.out.println("Verifying total records in table with number of entries in csv");
				 Assert.assertEquals(getNumberOfEntries(), dataCountInCSV);
	}
			  public void dataErrorTab_Navigate() {
				  dataErrorTab_Highlightrow.click();
					warmup();
				  dataErrorTab_NavigateIcon.click();
					warmup6();	}
	//historyTab 
			 @FindBy(xpath = "//a[contains(@data-ng-click,'viewDataObject.logEntry.length')]")
				WebElement clickOnDataCountLink;
			 
			 
			 @FindBy(xpath = "//form[@name='fModificationHistory_280']//button[contains(@data-ng-click,'filter')]")
				WebElement filter_button_historyTab;
			 
			 @FindBy(xpath = "//input[@focus-on='filter']")
				WebElement passFilterText;
			 
			 @FindBy(xpath = "//button[contains(@data-ng-click,'showExcludedEntries')]")
				WebElement technicalEntry_button;
			 

			 @FindBy(xpath = "//div[@id='ModificationHistory_280']//button[contains(@data-ng-click,'toggleFilter')]")
				WebElement filter_button;
			
			 @FindBy(xpath = "//input[@focus-on='filter']")
				WebElement filtersearchBar;
			
			 @FindBy(xpath = "(//div[@class='panel sep-panel'][1]//div[1])//div[@class='row rowspace'][2]//div[2]//span")
				WebElement fetch_LuNumber;
			 
			
			 @FindBy(xpath = "//button[contains(@data-ng-click,'showFirstState')]")
				WebElement initialState_button;
			 
			
			 @FindBy(xpath = "//button[contains(@data-ng-click,'showCurrentState')]")
				WebElement currentState_button;
			 
			 public void ClickOnDataCountLink() throws InterruptedException {
				 warmup6();
				 clickOnDataCountLink.click();
				 warmup6();
				}
			
			 public boolean Check_HistoryOfDependentObjButton() {
					if (HistoryOfDependentObjButton.isEnabled()) {
						return true;
					} else {
						return false;
					}
				}
			 public void Click_HistoryOfDependentObjButton() throws InterruptedException {
				 HistoryOfDependentObjButton.click();
				}
			 
			 public int Fetch_RoWCount_HistoryTable() {
		        	warmup();
					List<WebElement> count = driver.findElements(By.xpath("//form[@name='fModificationHistory_280']//table[@id='historyTable']//tbody//tr"));
					int size = count.size();
					System.out.println("Row count is- "+size);
					
					if(size>=1) {
						return size;
					}else {
						return 0;
					}
				} 
			 public int ClickOnRoW_ToAtivateHistoricalButton(int rowCount) {
		        	warmup();
		        	int rowNohistoricatActivate=0;
		        	for(int i=1; i<=rowCount; i++) {
						WebElement row = driver.findElement(By.xpath("//form[@name='fModificationHistory_280']//table[@id='historyTable']//tbody//tr["+i+"]"));
						row.click();
						warmup();
						
						if(HistoricalStateButton.isEnabled()) {
							//HistoricalStateButton.click();
							//System.out.println("Historical state button clicked");
							rowNohistoricatActivate=i;
							break;
						}
					
					}
		        	return rowNohistoricatActivate;
				} 
			 
			 public void Click_HistoricalButton() throws InterruptedException {
				 warmup();
				 HistoricalStateButton.click();
				 warmup5();
				}
			 
			 
			 public void Filter_button_historyTab() throws InterruptedException {
				 warmup();
				 filter_button_historyTab.click();
				 warmup();
				}
			 
			 public String passFilterText() throws InterruptedException {
				 WebElement fetchdate = driver.findElement(By.xpath("//form[@name='fModificationHistory_280']//table[@id='historyTable']//tbody//tr[1]//td[1]//span"));
				 String text=fetchdate.getText();
				 passFilterText.sendKeys(text);
				 warmup();
				 return text;
				}
			 public int Fetch_ElementCountInRow_historyTabale(int row) {
					List<WebElement> count = driver.findElements(By.xpath("//form[@name='fModificationHistory_280']//table[@id='historyTable']//tbody//tr["+row+"]//td//span"));
					int size = count.size();	
					return size;
			 }
			 public String Fetch_DataFromHistoryTable(int row, int column) {
					WebElement orderingData = driver.findElement(By.xpath("//form[@name='fModificationHistory_280']//table[@id='historyTable']//tbody//tr["+row+"]//td["+column+"]//span"));
					String value=orderingData.getText();
					System.out.println(value);
					return value;
			 }
			 public void Click_InitialStateButton() throws InterruptedException {
				 InitialStateButton.click();
				 warmup();
				}
			 public void Click_CurrentStateButton() throws InterruptedException {
				 CurrentStateButton.click();
				 warmup();
				}
			 public void TechnicalEntry_Button() throws InterruptedException {
				 warmup();
				 technicalEntry_button.click();
				 warmup();
				}
			 public void FilterButton_Historytab() throws InterruptedException {
				 warmup();
				 filter_button.click();
				 warmup();
				}
			 public void Pass_FilterText_HistoryTab(String Value) throws InterruptedException {
				 warmup();
				 filtersearchBar.sendKeys(Value);
				 warmup();
				}
			 public String fetch_LuNumber() throws InterruptedException {
				 String Value= fetch_LuNumber.getText();
				 
				 return Value;
				}
			 public void InitialState_Button() throws InterruptedException {
				 initialState_button.click();
				 warmup();
				}
			 public void CurrentState_button() throws InterruptedException {
				 currentState_button.click();
				 warmup();
				}
			 
			 
			 //For U-177
			 @FindBy(xpath = "//button[contains(@data-ng-click,'addFoText')]")
				WebElement addText_button;
			 
			 @FindBy(xpath = "//textarea[@ng-append='addFoText()']")
				WebElement passTextContent;
			 
			 @FindBy(xpath = "//table[@id='dgTableFO']//tbody//tr")
				WebElement selectDGDesignation;
			 
			 @FindBy(xpath = "//button[@type='submit']")
				WebElement clickOn_submit;
			 
			 @FindBy(xpath = "//button[contains(@data-ng-click,'save')]")
				WebElement clickOn_save;
			
			 @FindBy(xpath = "//button[contains(@data-ng-click,'cancel')]")
				WebElement clickOn_cancel;
			 
			 @FindBy(xpath="//div[@data-ng-repeat='alert in alerts']")
				WebElement blueAlertBox;
			 
			 @FindBy(xpath="//div[@data-ng-repeat='alert in alerts']//div")
				WebElement alertBox;
			
			 @FindBy(xpath="//div[@data-ng-repeat='alert in alerts']//button")
				WebElement alertBox_close;
			
			 @FindBy(xpath="//form//table[@id='foTable']//button[contains(@data-ng-if,'viewControl.editing_object')][1]")
				WebElement clickOn_editIcon;
			 
			 @FindBy(xpath="//button[contains(@data-ng-if,'viewControl.editing_object')][2]")
				WebElement clickOn_deleteIcon;
			
			
			 
			 public void AddText_button() {
				 addText_button.click();
				}
			 public void PassTextContent(String value){
				 passTextContent.clear();
				 passTextContent.sendKeys(value);
				}
			 public void selectDGDesignation(int index) {
				 
				 WebElement DG= driver.findElement(By.xpath("//table[@id='dgTableFO']//tbody//tr["+index+"]"));
				 warmup5();
				 DG.click();	
				 warmup();
				}
			 public void De_selectDGDesignation() {
				 warmup();
				 WebElement DG= driver.findElement(By.xpath("//table[@id='dgTableFO']//thead//tr//th//input"));
				 DG.click();	
				 warmup();
				}
			 public void ClickOn_Submit() {
				 warmup6();
				 clickOn_submit.click();
				 warmup6();
				}
			 public boolean CheckSubmit_IsEnableOrNot() {
				 warmup6();
				 if(clickOn_submit.isEnabled()) {
					 System.out.println("Submit-true");
					 return true;
				 }
				 else {
					 System.out.println("Submit-false");
					 return false;
				 }
				}
			 
			 public void clickOn_save() {
				 warmup();
				 clickOn_save.click();
				 warmup6();
				}
			 public void clickOn_cancel() {
				 warmup();
				 clickOn_cancel.click();
				 warmup();
				}
			 
			 public  String GetText_BlueAlertBox() {
					return blueAlertBox.getText();
				}
			 public  String GetText_AlertBox() {
				 warmup();
				 String error= alertBox.getText();
				 warmup();
				return error;
				}
			 public void ErroralertBox_close() {
				 warmup();
				 alertBox_close.click();
				 warmup();
				}
			 
			 public void clickOn_editIcon() {
				 warmup();
				 clickOn_editIcon.click();
				 warmup();
				}
			 public void clickOn_DeleteIcon() {
				 clickOn_deleteIcon.click();
				 warmup();
				}
			 public void clickOn_Enter() throws AWTException {
				 driver.switchTo().alert().accept();
				 System.out.println("Alert popup accepted");
				 warmup6();
				}
			 public void Press_RightLeft() throws AWTException {
				 java.awt.Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_RIGHT);
				warmup();
				robot.keyPress(KeyEvent.VK_LEFT);
				System.out.println("Enter Release");
				 warmup6();
				}
			 
		//U-244
		@FindBy(xpath = "//form//button[contains(@data-ng-click,'editMajorAssemblyState')]")
		WebElement editMajorAssemblyStatus_InternalTab;
			 
		@FindBy(xpath = "//form//button[contains(@data-ng-click,'scrap($event)')]")
		WebElement scrapMajorAssembly_InternalTab;	
		
		@FindBy(xpath = "//form//button[contains(@data-ng-click,'editProductIndicators')]")
		WebElement editProductIndicator_InternalTab;
		
		@FindBy(xpath = "//form//button[contains(@data-ng-click,'deleteMajorAssembly($event)')]")
		WebElement deleteMajorAssembly_InternalTab;
		
		
		@FindBy(xpath = "//select[@data-ng-change='StatusChanged()']")
		WebElement statusDropdown;
		
		@FindBy(xpath = "//input[@uib-popover='Enter scrapping date']")
		WebElement selectScrapDate;
		
		@FindBy(xpath="//*[@class='close']")
		WebElement alertBoxClose;
		
		@FindBy(xpath="//input[contains(@data-ng-change,'lockIndicator')]")
		WebElement lockIndicator_ckeckBox;
		
		@FindBy(xpath="//a[text()='Internal']")
		WebElement internalTab;
		
		@FindBy(xpath="//div[@id='MajAssySearchFoot_002']//button[contains(@data-ng-click,'save')]")
		WebElement saveButton_internalTab;
		
		
		public void SaveButton_internalTab() {
			 warmup();
			 saveButton_internalTab.click();
			 warmup6();
			}
		
		public void InternalTab() {
			Actions act=new Actions(driver);
			act.moveToElement(MACodesTab).perform();
			warmup();
			internalTab.click();
			 warmup();
			}
		public void EditMajorAssemblyStatus_InternalTab() {
			editMajorAssemblyStatus_InternalTab.click();
			 warmup();
			}
		public void ScrapMajorAssemblyButton_InternalTab() {
			scrapMajorAssembly_InternalTab.click();
			 warmup();
			}
		public void EditProductIndicatorButton_InternalTab() {
			editProductIndicator_InternalTab.click();
			 warmup();
			}
		public void DeleteMajorAssemblyButton_InternalTab() {
			deleteMajorAssembly_InternalTab.click();
			 warmup();
			}
		public void SelectMajorAssemblyStatus_InternalTab(String select) {
			wait.until(ExpectedConditions.elementToBeClickable(statusDropdown));
			statusDropdown.click();
			Select status = new Select(statusDropdown);
			status.selectByVisibleText(select);
			warmup6();
			}
		public void SelectScrapDate(String date) {
			selectScrapDate.clear();
			selectScrapDate.sendKeys(date);
			 warmup();
			}
		public boolean alertBox() {
			if (alertBox.isDisplayed()) {
							return true;
						} else {
							return false;
						}
					}
		public void moveToAlertBoxCloseAndClick() throws InterruptedException {
			Thread.sleep(15000);
			Actions	act = new Actions(driver);
			act.moveToElement(alertBoxClose).click().build().perform();	
			}
		public void lockIndicator_ckeckBox() {
			lockIndicator_ckeckBox.click();
			 warmup();
			}
		@FindBy(xpath="//input[contains(@data-ng-change,'productLiabilityIndicator')]")
		WebElement productLiabilityIndicator_ckeckBox;
		public void ProductLiabilityIndicator_ckeckBox() {
			productLiabilityIndicator_ckeckBox.click();
			 warmup();
			}
		public boolean DeleteMajorAssemblyButton_Disable() {
			warmup();
			boolean flag=deleteMajorAssembly_InternalTab.isEnabled();
			 warmup();
			 if(flag==true) {
				 return flag=true;
			 }
			 else {
				 return flag=false;
			 }
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
