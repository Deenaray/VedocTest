package com.vedoc.qa.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.vedoc.qa.base.TestBase;

public class AdministrationPage extends TestBase {

	@FindBy(xpath="//button[contains(@data-ng-click,'createVehicle')]")
	WebElement CreateVehicle;

	@FindBy(xpath="//input[contains(@name,'createFin')]")
	WebElement Vehicle_Fin;

	@FindBy(xpath="//input[contains(@name,'technicalApprovalDate')]")
	WebElement Vehicle_ApprovalDate;

	@FindBy(xpath="//span[contains(@data-ng-bind-html,'save_label')]")
	WebElement Vehicle_SaveButton;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.AdminMajorAssy_915')]")
	WebElement MajorAssembliesTab;

	@FindBy(xpath="//button[contains(@data-ng-click,'createMajorAssy')]")
	WebElement createMajorAssembliesTab;

	@FindBy(xpath="//select[contains(@name,'createType')]")
	WebElement MajorAssemblyType;

	@FindBy(xpath="//input[contains(@name,'createId')]")
	WebElement AssemblyIDNumber;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'save_label')])[2]")
	WebElement MajorAssembly_SaveButton;

	@FindBy(xpath="//*[@id='mainwrapper']/div[4]/div/div[2]/button")
	WebElement Technicaladviso;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataSystemNewsflash_780')]")
	WebElement systemMessage;

	@FindBy(xpath="//button[contains(@id,'MasterDataSystemNewsflash_780_search')]")
	WebElement systemMessage_ShowDataButton;

	@FindBy(xpath="//button[contains(@data-ng-click,'createNewsflash($event)')]")
	WebElement systemMessage_CreateMessage;

	@FindBy(xpath="//input[contains(@name,'newsflash_title')]")
	WebElement systemMessage_MessageTitle;

	@FindBy(xpath="//input[contains(@name,'newsflash_validFrom')]")
	WebElement systemMessage_ValidFrom;

	@FindBy(xpath="//input[contains(@name,'newsflash_validTo')]")
	WebElement systemMessage_ValidTo;

	@FindBy(xpath="//div[contains(@id,'taTextElemen')]")
	WebElement systemMessage_messagecontent;
	
	@FindBy(xpath="//button[contains(@name,'h1')]")
	WebElement systemMessage_messagecontent_Heading1;
	
	@FindBy(xpath="//button[contains(@name,'h2')]")
	WebElement systemMessage_messagecontent_Heading2;
	
	@FindBy(xpath="//button[contains(@name,'quote')]")
	WebElement systemMessage_MessageQuote;
	
	@FindBy(xpath="//button[contains(@name,'h4')]")
	WebElement systemMessage_messagecontent_Heading4;

	@FindBy(xpath="//*[@id='MasterDataSystemNewsflash_780']/div/div[2]/form/div[4]/div/div/button[1]")
	WebElement systemMessage_SaveButton;

	@FindBy(xpath="(//button[contains(@data-ng-click,'toggleFilter')])")
	WebElement systemMessage_FilterButton;

	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement systemMessage_FilterText;

	@FindBy(xpath="(//button[contains(@data-ng-click,'editRow')])")
	WebElement systemMessage_EditTitle;

	@FindBy(xpath="(//button[contains(@data-ng-click,'endEditing')])")
	WebElement systemMessage_Checkmarkbutton;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.AdminVehicle_910')]")
	WebElement VehiclesTab;
	
	@FindBy(xpath="//i[contains(@class,'rc-i-line-warning')]")
	WebElement WarningMessage_VehiclesTab;
	
	@FindBy(xpath="//span[contains(@data-ng-bind-html,'cancel_label')]")
	WebElement VehicleTab_CancelButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'cancel_label')])[2]")
	WebElement MajorAssembliesTab_CancelButton;

	@FindBy(xpath="//a[contains(@ng-click,'launchSystemNews()')]")
	WebElement systemMessage_button;
	
	//@FindBy(xpath="//button[@data-ng-click='okAction($event)'])")
	@FindBy(xpath="(//button[contains(@type,'button')])[2]")
	WebElement SystemMessage_OkButton;

	@FindBy(xpath="//input[@list='localSearchAutoComplete']")
	WebElement searchInput;

	@FindBy(xpath="//button[starts-with(@id,'VehicleSearch')]")
	WebElement searchButton;

	String ActualIdCode;
	String parentwindowID;
	String childwindowID;
	String childwindowID2;

	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.fin')]")
	WebElement VehicleDataFIN;
	
	@FindBy(xpath="//a[contains(@href,'MajorAssemblyArrangement')]")
	WebElement MajorAssemblyModule;

	@FindBy(xpath = "//*[@id='sidebar,]/li[12]/a")
	WebElement AdministrationModule;
	@FindBy(xpath="//select[contains(@name,'majorAssemblySearchCategory')]")
	WebElement MajorAssemblyModule_dropdown;
	
	@FindBy(xpath="//input[contains(@name,'majAssySearch')]")
	WebElement MajorAssemblyModule_Search;
	
	@FindBy(xpath="//button[contains(@id,'MajAssySearch_002_search')]")
	WebElement MajorAssemblyModule_SearchButton;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.highVoltageBattery.id')]")
	WebElement MajorAssemblyModule_highVoltageBattery;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'deleteRow')]")
	WebElement systemMessageDelete;
	
	@FindBy(xpath="//input[contains(@name,'createVin')]")
	WebElement VINNumber;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.AdminConflictSummaryConfiguration_941')]")
	WebElement ConflictSummaryTab;
	
	@FindBy(xpath="//button[contains(@id,'AdminConflictSummaryConfiguration_941_search')]")
	WebElement ConflictSummaryTab_ShowDataButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'addConfiguration($event)')]")
	WebElement ConflictSummaryTab_AddConfigurationButton;
	
	@FindBy(xpath="//input[contains(@name,'conflictSummaryConfiguration_configurationId')]")
	WebElement ConflictSummaryTab_ConfigurationID;
	
	@FindBy(xpath="//select[contains(@name,'conflictSummaryConfiguration_conflictCriteria_status')]")
	WebElement ConflictSummaryTab_Status;
	
	@FindBy(xpath="//input[contains(@name,'conflictSummaryConfiguration_conflictCriteria_parameter1')]")
	WebElement ConflictSummaryTab_Description1;
	
	@FindBy(xpath="//input[contains(@name,'conflictSummaryConfiguration_conflictCriteria_messageIds')]")
	WebElement ConflictSummaryTab_ConflictMessageID;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'endEditing')])")
	WebElement ConflictSummaryTab_CheckmarkButton;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'save($event)')])[4]")
	WebElement ConflictSummaryTab_SaveButton;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'addEmailRecipient($event)')])")
	WebElement ConflictSummaryTab_AddEmailAddressButton;
	
	@FindBy(xpath="(//input[contains(@name,'conflictSummaryConfiguration_cur_emailRecipients_recipient')])")
	WebElement ConflictSummaryTab_EmailAddress;
	
	@FindBy(xpath="(//select[contains(@name,'conflictSummaryConfiguration_cur_emailRecipients_language')])")
	WebElement ConflictSummaryTab_languageSelect;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'AdminConflictSummaryConfiguration_941')])[4]")
	WebElement ConflictSummaryTab_Filterbutton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
	WebElement ConflictSummaryTab_FilterText;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'localConfigurations_rec')]")
	WebElement ConflictSummaryTab_EditButton;
	
	@FindBy(xpath="//input[contains(@name,'conflictSummaryConfiguration_conflictCriteria_parameter2')]")
	WebElement ConflictSummaryTab_Description2;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'localConfigurations_rec')])[2]")
	WebElement ConflictSummaryTab_DeleteButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'localEmailRecipients')]")
	WebElement ConflictSummary_EmailAddress_CheckmarkButton;
	
	// Swedha
	
	@FindBy(xpath="//a[text()='Timer and parameter configuration']")
	WebElement timerAndParameterConfiguration_Tab;

	@FindBy(xpath="//span[contains(@class,'sym rc-i-line-search')]")
	WebElement searchIcon_TimerAndParameter_Tab;
	
	@FindBy(xpath="//div[contains(@id,'ManageTimerAndParameterConfiguration')]//span[text()='Show data']")
	WebElement timerAndParameterTab_ShowDataButton;
	
	@FindBy(xpath="//table[@id='timerAndParameterConfigurationTable']//tr[@tabindex='0']")
	WebElement timerAndParameterTab_FirstRow;
	
	@FindBy(xpath="//tr[@class='ng-scope selected']//span[@class='in-cell']")
	WebElement timerAndParameterTab_Edit;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement timerAndParameterTab_Interval;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement timerAndParameterTab_Timeout;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement timerAndParameterTab_StartingTime;
	
	@FindBy(xpath="//select[@type='text']")
	WebElement timerAndParameterTab_MemberDropDown;
	
	@FindBy(xpath="//select[@type='text']//option[3]")
	WebElement timerAndParameterTab_Member;
	
	@FindBy(xpath="//span[@class='cell-icon rc-i-line-check-circle']")
	WebElement submit_Icon;
	
	@FindBy(xpath="//div[contains(@id,'ManageTimerAndParameterConfiguration')]//span[contains(text(),'Save')]")
	WebElement timerAndParameterTab_Save;
	
	@FindBy(xpath="//span[contains(@class,'sym rc-i-line-filter')]")
	WebElement filter_Button;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement timerAndParameterTab_SearchInput;
	
	@FindBy(xpath="(//table[@id='timerAndParameterConfigurationTable']//tr[@tabindex='0']/td)[4]")
	WebElement timerAndParameterTab_FilterStartingTime;
	
	@FindBy(xpath="//a[text()='External service configuration']")
	WebElement externalServiceConfiguration_Tab;
	
	@FindBy(xpath="//form[contains(@name,'ManageExternalServiceConfiguration')]//span[text()='Show data']")
	WebElement externalServiceConfigurationTab_showDataButton;
	
	@FindBy(xpath="//table[@id='externalServiceConfigurationTable']//tr[@tabindex='0']")
	WebElement externalServiceConfigurationTab_FirstRow;

	@FindBy(xpath = "//*[@id='externalServiceConfigurationTable']/tbody/tr[11]")
	WebElement externalServiceConfigurationTab_FDKRow;
	@FindBy(xpath="//tr[@class='ng-scope selected']//span[@class='in-cell']")
	WebElement externalServiceConfigurationTab_Edit;
	
	@FindBy(xpath="(//div[contains(@id,'ManageExternalServiceConfiguration')]//input[@type='text'])[1]")
	WebElement externalServiceConfigurationTab_ServiceDescription;
	
	@FindBy(xpath="(//select[@type='text'])[1]")
	WebElement externalServiceConfigurationTab_GroupDropDown;
	
	@FindBy(xpath="(//select[@type='text'])[1]//option[2]")
	WebElement externalServiceConfigurationTab_GroupInput;
	
	@FindBy(xpath="(//select[@type='text'])[2]")
	WebElement externalServiceConfigurationTab_StatusDropDown;
	
	@FindBy(xpath="(//select[@type='text'])[2]//option[1]")
	WebElement externalServiceConfigurationTab_StatusInput;
	
	@FindBy(xpath="//input[@name='externalServiceConfiguration_deactivationLimit']")
	WebElement externalServiceConfigurationTab_deactivationLimit;
	
	@FindBy(xpath="//input[@name='externalServiceConfiguration_timeout']")
	WebElement externalServiceConfigurationTab_TimeoutTime;
	
	@FindBy(xpath="//div[contains(@id,'ManageExternalServiceConfiguration')]//span[contains(text(),'Save')]")
	WebElement externalServiceConfigurationTab_Save;
	
	@FindBy(xpath="//div[contains(@id,'ManageExternalServiceConfiguration')]//input[@type='text']")
	WebElement searchInput_ExternalServiceTab;
	
	@FindBy(xpath="//div[contains(@id,'ManageExternalServiceConfiguration')]//*[text()='Filter']")
	WebElement externalServiceConfigurationTab_FilterButton;
	
	@FindBy(xpath="(//table[@id='externalServiceConfigurationTable']//tr[@tabindex='0']//span)[2]")
	WebElement  externalServiceConfigurationTab_FilterServiceDescription;
	
	@FindBy(xpath="//table[@id='externalServiceConfigurationTable']//tr[@tabindex='0']")
	WebElement externalServiceTab_FirstRow;
	
	@FindBy(xpath="//div[contains(@id,'ManageExternalServiceConfiguration')]//input[@type='text']")
	WebElement externalServiceTab_SearchInput;
	
	@FindBy(xpath="//a[text()='Automatic conflict status']")
	WebElement automaticConflictStatusTab;
	
	@FindBy(xpath="//button[contains(@id,'AdminConflictAutoStatusConfiguration')]//*[text()='Show data']")
	WebElement automaticConflictStatusTab_ShowData;
	
	@FindBy(xpath="//div[contains(@id,'AdminConflictAutoStatusConfiguration')]//span[text()='Add configuration']")
	WebElement automaticConflictStatusTab_AddConfiguration;
	
	@FindBy(xpath="//input[@name='conflictAutoStatusConfiguration_configurationId']")
	WebElement automaticConflictStatusTab_ConfigurationID;
	
	@FindBy(xpath="//select[@name='conflictAutoStatusConfiguration_conflictCriteria_causation']")
	WebElement automaticConflictStatusTab_Cause;
	
	@FindBy(xpath="//input[@name='conflictAutoStatusConfiguration_conflictCriteria_actorId']")
	WebElement automaticConflictStatusTab_UserId;
	
	@FindBy(xpath="//select[@name='conflictAutoStatusConfiguration_conflictCriteria_conflictType']")
	WebElement automaticConflictStatusTab_ConflictType;
	
	@FindBy(xpath="//input[@name='conflictAutoStatusConfiguration_conflictCriteria_parameter1']")
	WebElement automaticConflictStatusTab_Description1;
	
	@FindBy(xpath="//input[@name='conflictAutoStatusConfiguration_conflictCriteria_parameter2']")
	WebElement automaticConflictStatusTab_Description2;
	
	@FindBy(xpath="//input[@name='conflictAutoStatusConfiguration_conflictCriteria_messageIds']")
	WebElement automaticConflictStatusTab_ConflictMessageId;
	
	@FindBy(xpath="//select[@name='conflictAutoStatusConfiguration_autoStatus']")
	WebElement automaticConflictStatusTab_TargetStatus;
	
	@FindBy(xpath="//div[contains(@id,'AdminConflictAutoStatusConfiguration')]//span[contains(text(),'Save')]")
	WebElement automaticConflictStatusTab_Save;
	
	@FindBy(xpath="//div[contains(@id,'AdminConflictAutoStatusConfiguration')]//span[text()='Filter']")
	WebElement automaticConflictStatusTab_FilterButton;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement automaticConflictStatusTab_FilterData;
	
	@FindBy(xpath="//div[contains(@id,'AdminConflictAutoStatusConfiguration')]//span[@class='cell-icon rc-i-line-pencil']")
	WebElement automaticConflictStatusTab_EditButton;
	
	@FindBy(xpath="//div[contains(@id,'AdminConflictAutoStatusConfiguration')]//span[@class='cell-icon rc-i-line-trash']")
	WebElement automaticConflictStatusTab_TrashButton;

	@FindBy(xpath="//div[contains(@id,'AdminConflictAutoStatusConfiguration')]//tr[@tabindex='0']")
	WebElement automaticConflictStatusTab_FilteredResult;
	
	@FindBy(xpath="//span[text()='Vehicle data']/following-sibling::span")
	WebElement vehicleData_Page;
	
	@FindBy(xpath="//a[@ng-click='closeMenu()']//span[text()='Vehicle data']")
	WebElement vehicleData_Page1;
	
	@FindBy(xpath="//a[text()='Theft message']")
	WebElement theftMessageTab;
	
	@FindBy(xpath="//span[text()='Create theft']")
	WebElement theftMessage_CreateTheftButton;
	
	@FindBy(xpath="//input[@name='theftDate']")
	WebElement theftMessage_TheftDate;
	
	@FindBy(xpath="//input[@name='country']")
	WebElement theftMessage_TheftCountry;
	
	@FindBy(xpath="//input[@name='location']")
	WebElement theftMessage_TheftLocation;
	
	@FindBy(xpath="//input[@name='licensePlateNumber']")
	WebElement theftMessage_LicensePlateNumber;
	
	@FindBy(xpath="//input[@name='bkaDeleteDate']")
	WebElement theftMessage_BkaDeletionDate;
	
	@FindBy(xpath="//select[@name='bkaDeleteReason']")
	WebElement theftMessage_BkareasonOfDeletion;
	
	@FindBy(xpath="//input[@name='policeStation']")
	WebElement theftMessage_PoliceAuthorities;
	
	@FindBy(xpath="//input[@name='policeReference']")
	WebElement theftMessage_PoliceReference;
	
	@FindBy(xpath="//input[@name='policeContactTelFax']")
	WebElement theftMessage_PoliceContacttDetails;
	
	@FindBy(xpath="//input[@name='insurance']")
	WebElement theftMessage_Insurer;
	
	@FindBy(xpath="//input[@name='damageNumber']")
	WebElement theftMessage_DamageNumber;
	
	@FindBy(xpath="//input[@name='insuranceContactTelFax']")
	WebElement theftMessage_InsurercontactDetails;
	
	@FindBy(xpath="//input[@name='internalRemarks']")
	WebElement theftMessage_InternalNote;

	@FindBy(xpath="//textarea[@name='editorComment']")
	WebElement theftMessage_EditingText;
	
	@FindBy(xpath="//*[contains(@name,'fVehicleSearchFoot')]//*[text()='Save']")
	WebElement theftMessage_Save;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'logout')]/following-sibling::span")
	WebElement logout;
	
	@FindBy(xpath="//span[@data-ng-bind-html='::alert.msg']")
	WebElement theftAlert;
	
	@FindBy(xpath="//span[@id='main_icon']")
	WebElement mainIcon;
	
	@FindBy(xpath="//tr[@tabindex='0']")
	WebElement filteredResult;
	
	@FindBy(xpath="//a[text()='Message duplicator configuration']")
	WebElement messageDuplicatorTab;
	
	@FindBy(xpath="//button[contains(@id,'ManageMessageDuplicatorConfiguration')]//*[text()='Show data']")
	WebElement messageDuplicatorTab_ShowData;
	
	@FindBy(xpath="//table[contains(@id,'mDConfigurationTable')]//tr[@tabindex='0']")
	WebElement messageDuplicatorTab_FirstRow;
	
	@FindBy(xpath="//tr[@class='ng-scope selected']//span[@class='cell-icon rc-i-line-pencil']")
	WebElement messageDuplicatorTab_EditIcon;
	
	@FindBy(xpath="//input[@name='mDConfiguration_group']")
	WebElement messageDuplicatorTab_Group;
	
	@FindBy(xpath="//input[@name='mDConfiguration_validFrom']")
	WebElement messageDuplicatorTab_ValidFrom;
	
	@FindBy(xpath="//input[@name='mDConfiguration_validTo']")
	WebElement messageDuplicatorTab_ValidUntil;
	
	@FindBy(xpath="//input[@name='mDConfiguration_maxCount']")
	WebElement messageDuplicatorTab_MaximumNumber;
	
	@FindBy(xpath="//div[contains(@id,'ManageMessageDuplicatorConfiguration')]//button[@type='submit']")
	WebElement messageDuplicatorTab_Submit;
	
	@FindBy(xpath="//div[contains(@id,'ManageMessageDuplicatorConfiguration')]//*[text()='Save']")
	WebElement messageDuplicatorTab_Save;
	
	@FindBy(xpath="//div[contains(@id,'ManageMessageDuplicatorConfiguration')]//*[text()='Filter']")
	WebElement messageDuplicatorTab_FilterButton;
	
	@FindBy(xpath="//div[contains(@id,'ManageMessageDuplicatorConfiguration')]//*[@placeholder='Search the table']")
	WebElement messageDuplicatorTab_SearchInput;
	
	@FindBy(xpath="//div[contains(@id,'ManageMessageDuplicatorConfiguration')]//tr[@tabindex='0']")
	WebElement messageDuplicatorTab_FilteredResult;
	
	@FindBy(xpath="//a[text()='E-mail distribution']")
	WebElement emailDistributionTab;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//span[text()='Show data']")
	WebElement emailDistributionTab_ShowData;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//span[text()='Filter']")
	WebElement emailDistributionTab_FilterButton;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//input[@placeholder='Search the table']")
	WebElement emailDistributionTab_SearchTheTable;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//span[contains(@class,'line-pencil')]")
	WebElement emailDistributionTab_EditEmailFrequency;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//select")
	WebElement emailDistributionTab_EmailFrequencyDropDown;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//span[contains(@class,'check-circle')]")
	WebElement emailDistributionTab_CheckMark;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//span[contains(@class,'save')]")
	WebElement emailDistributionTab_Save;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//span[contains(@class,'plus')]")
	WebElement emailDistributionTab_AddEmailList;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//input[contains(@name,'emailEventCategories')]")
	WebElement emailDistributionTab_EmailAddress;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//select[contains(@name,'emailEventCategories')]")
	WebElement emailDistributionTab_EmailLanguage;

	@FindBy(xpath="//span[text()='tata.varadharajan@mercedes-benz.com']/../..//td[3]//button[1]")
	WebElement emailDistributionTab_EditIcon_EmailList;
	
	@FindBy(xpath="//div[contains(@id,'AdminEmailDistribution')]//tr[@tabindex='0']")
	WebElement emailDistributionTab_FirstRow;
	
	@FindBy(xpath="//span[text()='tata.varadharajan@mercedes-benz.com']/../..//td[3]//button[2]")
	WebElement emailDistributionTab_Trash;
	
	@FindBy(xpath="//span[text()='tata.varadharajan@mercedes-benz.com']/../..")
	WebElement emailDistributionTab_EmailList_filteredResult;
	
	@FindBy(xpath="//a[text()='Version information']")
	WebElement versionInformationTab;
	
	@FindBy(xpath="//div[contains(@id,'AdminSystemVersionInfo')]//span[text()='Show data']")
	WebElement versionInformationTab_ShowData;
	
	@FindBy(xpath="//div[@class='lcol ilabel']")
	WebElement versionInformationTab_scriptInfo;
	
	@FindBy(xpath="//table[contains(@id,'versionTable')]//span[text()='Environment']")
	WebElement versionInformationTab_systemVersionSorting;
	
	@FindBy(xpath="//table[@id='versionTable']//button/span")
	WebElement versionInformationTab_exportSystemVersion;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.systemVersionInfo)')]")
	WebElement versionInformationTab_SystemVersiontotalRecords;
	
	@FindBy(xpath="//span[text()='System versions filter']")
	WebElement versionInformationTab_systemVersionFilter;
	
	//@FindBy(xpath="//input[@class='form-control']")
	@FindBy(xpath = "//*[@id='AdminSystemVersionInfo_970']/div/div[2]/form/div[2]/div/div/ng-form/div/div/input")
	WebElement versionInformationTab_systemVersionFilterText;
	
	@FindBy(xpath="//span[text()='Cancel system versions filter']")
	WebElement versionInformationTab_systemVersionFilterCancel;
	
	@FindBy(xpath="//table[@id='systemDbScriptLogInfo']//button/span")
	WebElement versionInformationTab_exportDBScripts;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.systemDbScriptLogInfo)')]")
	WebElement versionInformationTab_DBVersiontotalRecords;
	
	@FindBy(xpath="//table[contains(@id,'systemDbScriptLogInfo')]//span[text()='Delivery share']")
	WebElement versionInformationTab_DBScriptsSorting;
	
	@FindBy(xpath="//span[text()='DB scripts filter']")
	WebElement versionInformationTab_DBScriptsFilter;
	
	//@FindBy(xpath="//input[@class='form-control']")
	@FindBy(xpath = "//*[@id='AdminSystemVersionInfo_970']/div/div[2]/form/div[4]/div/div/ng-form/div/div/input")
	WebElement versionInformationTab_DBScriptsFilterText;
	//*[@id="AdminSystemVersionInfo_970"]/div/div[2]/form/div[4]/div/div/ng-form/div/div/input
	
	@FindBy(xpath="//span[text()='Cancel DB scripts filter']")
	WebElement versionInformationTab_DBScriptsFilterCancel;
	
	@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
	WebElement dateModified_columnHeader;
	
	@FindBy(xpath="//table//tbody//tr[1]//td//a")
	WebElement getRow1_dateModified;
	
	public AdministrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void CreateVehicle(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(CreateVehicle));
		CreateVehicle.click();
	}

	public void CreateVehicleNegativeTesting(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(CreateVehicle));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", CreateVehicle);
		js.executeScript("arguments[0].click();", CreateVehicle);
		//c.click();
	}
	
	public void Vehicle_Fin(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Vehicle_Fin));
		Vehicle_Fin.click();
		Vehicle_Fin.clear();
		Vehicle_Fin.sendKeys("W1T96342720720399");
//		warmup6();
//		VINNumber.click();
//		VINNumber.clear();
//		VINNumber.sendKeys(RandomVINNumber);
	}

	public void Vehicle_ApprovalDate(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Vehicle_ApprovalDate));
		Actions a=new Actions(driver);
		a.moveToElement(Vehicle_ApprovalDate).build().perform();
		a.click().build().perform();
		Vehicle_ApprovalDate.click();
		Vehicle_ApprovalDate.sendKeys("08/30/2023");
	}

	public void Vehicle_SaveButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Vehicle_SaveButton));
		Vehicle_SaveButton.click();
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(Technicaladviso));
		Technicaladviso.click();
	}

	public void MajorAssembliesTab(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssembliesTab));
		MajorAssembliesTab.click();
	}

	public void createMajorAssembliesTab(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(createMajorAssembliesTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", createMajorAssembliesTab);
		js.executeScript("arguments[0].click();", createMajorAssembliesTab);
//		Actions a=new Actions(driver);
//		a.moveToElement(createMajorAssembliesTab).build().perform();
//		a.click().build().perform();
//		createMajorAssembliesTab.click();
	}

	public void MajorAssemblyType(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssemblyType));
		MajorAssemblyType.click();
		Select s=new Select(MajorAssemblyType);
		s.selectByValue("string:highVoltageBattery");
	}

	public void AssemblyIDNumber(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(AssemblyIDNumber));
		AssemblyIDNumber.click();
		AssemblyIDNumber.clear();
		AssemblyIDNumber.sendKeys("93080060295924");
	}
	
	public void AssemblyIDNumber_ForNegativeTesting(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(AssemblyIDNumber));
		AssemblyIDNumber.click();
		AssemblyIDNumber.clear();
		AssemblyIDNumber.sendKeys("1111111111111111111111111111.@=!!#$%^");
	}

	public void MajorAssembly_SaveButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssembly_SaveButton));
		MajorAssembly_SaveButton.click();
		warmup5();
	}

	public void systemMessage(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage));
		systemMessage.click();
	}

	public void systemMessage_ShowDataButton(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", systemMessage_ShowDataButton);
//		systemMessage_ShowDataButton.click();
	}

	public void systemMessage_CreateMessage(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_CreateMessage));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", systemMessage_CreateMessage);
	//	systemMessage_CreateMessage.click();
	}

	public void systemMessage_MessageTitle(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_MessageTitle));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", systemMessage_MessageTitle);
		systemMessage_MessageTitle.click();
		systemMessage_MessageTitle.clear();
		systemMessage_MessageTitle.sendKeys("Random Message");
	}

	public void systemMessage_ValidFrom(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_ValidFrom));
		systemMessage_ValidFrom.click();
		systemMessage_ValidFrom.clear();
		systemMessage_ValidFrom.sendKeys("07/12/2020");
	}

	public void systemMessage_ValidTo(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_ValidTo));
		systemMessage_ValidTo.click();
		systemMessage_ValidTo.clear();
		systemMessage_ValidTo.sendKeys("07/12/2080");
	}

	public void systemMessage_messagecontent(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_messagecontent));
		Actions b=new Actions(driver);
        b.moveToElement(systemMessage_messagecontent).build().perform();
		b.click().build().perform();
		systemMessage_messagecontent.sendKeys("Created By DTICI");
		warmup();
		b.click().build().perform();
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_messagecontent_Heading1).build().perform();
		a.click().build().perform();
		
	}
	
	public void systemMessage_messagecontent_Heading2(){
		warmup5();
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_messagecontent).build().perform();
		a.click().build().perform();
		systemMessage_messagecontent.sendKeys(Keys.ENTER);
		systemMessage_messagecontent.sendKeys("Random Data");
		systemMessage_messagecontent.click();
		a.moveToElement(systemMessage_messagecontent_Heading2).build().perform();
		a.click().perform();
	}
	
	public void systemMessage_messagecontent_systemMessage_MessageQuote(){
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_messagecontent).build().perform();
		a.click().build().perform();
		systemMessage_messagecontent.sendKeys(Keys.ENTER);
		systemMessage_messagecontent.sendKeys("â€‹Hello all. This system message is generated for testing system message functionality. Kindly ignore if not in use. Thanks and Regards. DTICI Colleagues.");
		systemMessage_messagecontent.click();
		a.moveToElement(systemMessage_MessageQuote).build().perform();
		a.click().perform();
			
	}
	
	public void systemMessage_messagecontent_systemMessage_messagecontent_Heading4(){
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_messagecontent).build().perform();
		a.click().build().perform();
		systemMessage_messagecontent.sendKeys(Keys.ENTER);
		systemMessage_messagecontent.sendKeys("Mercedez Benz");
		systemMessage_messagecontent.click();
		a.moveToElement(systemMessage_messagecontent_Heading4).build().perform();
		a.click().perform();		
	}
	
	

	public void systemMessage_SaveButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_SaveButton));
		systemMessage_SaveButton.click();
		warmup5();
	}

	public void systemMessage_FilterButton(){
		warmup5();
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_FilterButton));
		// updated 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", systemMessage_FilterButton);
		//
	//	systemMessage_FilterButton.click();
	}

	public void systemMessage_FilterText(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_FilterText));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", systemMessage_FilterText);
		systemMessage_FilterText.click();
		systemMessage_FilterText.clear();
		systemMessage_FilterText.sendKeys("Random Message");
		systemMessage_FilterText.sendKeys(Keys.ENTER);
	}

	public void systemMessage_EditTitle(){
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_EditTitle).build().perform();
		a.click().build().perform();
	}

	public void systemMessage_EditMessageTitle(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_MessageTitle));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", systemMessage_MessageTitle);
		systemMessage_MessageTitle.click();
		systemMessage_MessageTitle.clear();
		systemMessage_MessageTitle.sendKeys("Random Message edited");
	}

	public void systemMessage_Checkmarkbutton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_Checkmarkbutton));
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_Checkmarkbutton).build().perform();
		a.click().build().perform();
	}

	public void systemMessage_button(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(systemMessage_button));
		Actions a=new Actions(driver);
		a.moveToElement(systemMessage_button).build().perform();
		a.click().build().perform();
	}

	public void SystemMessage_OkButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(SystemMessage_OkButton));
		Actions a=new Actions(driver);
		a.moveToElement(SystemMessage_OkButton).build().perform();
		a.click().build().perform();
	}

	public Boolean validateVehicleDataPage() {
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		return searchInput.isDisplayed();
	}

	public Boolean SystemMessage_OkButton_VehicleDataPage(){

		warmup4();
		wait.until(ExpectedConditions.elementToBeClickable(SystemMessage_OkButton));
		return SystemMessage_OkButton.isDisplayed();
	}

	public void searchfin() throws InterruptedException {
		warmup5();
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		searchInput.click();
		searchInput.sendKeys("W1T96342720720399");
		searchButton.click();
		Thread.sleep(5000);
	}
	public void searchfin1() throws InterruptedException {
		warmup5();
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		searchInput.click();
		searchInput.sendKeys("WDB4371051W168663");
		searchButton.click();
		Thread.sleep(5000);
	}

	public void OpenNewTab(){
		warmup4();
		warmup4();
		((JavascriptExecutor)driver).executeScript("window.open(arguments[0])", "https://mbag-test.core-t.public.vedoc.daimlertruck.com/ui/homepage.html");

		Set<String> handles=driver.getWindowHandles();		
		Iterator<String> it=	handles.iterator();
				
		parentwindowID=it.next();
		childwindowID=it.next();					
		warmup5();                   
		driver.switchTo().window(childwindowID);
		WebElement vecldat=driver.findElement(By.xpath("//*[@id='sidebar']/li[2]/a"));
		vecldat.click();
	
	}

	public String VehicleDataFIN(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(VehicleDataFIN));
		String FIN=	VehicleDataFIN.getText();
		return FIN;
	}
	
	public void MajorAssemblyModule(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssemblyModule));
		MajorAssemblyModule.click();
	}
	public void administationClick(){
		warmup6();
		WebElement home=driver.findElement(By.xpath("//*[@id='home']/a/span[2]"));
		home.click();
		warmup5();
		WebElement adminpage=driver.findElement(By.xpath("//*[@id='sidebar']/li[12]/a"));
		adminpage.click();
		warmup5();
//		wait.until(ExpectedConditions.elementToBeClickable(AdministrationModule));
//		AdministrationModule.click();
		//warmup5();
//		emailDistributionTab.click();
//		warmup5();
//		wait.until(ExpectedConditions.visibilityOf(emailDistributionTab_ShowData));
	}
	public void MajorAssemblyModule_dropdown(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssemblyModule_dropdown));
		Select s=new Select(MajorAssemblyModule_dropdown);
		s.selectByValue("string:highVoltageBatteryID");

	}
	
	public void MajorAssemblyModule_Search(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssemblyModule_Search));
		MajorAssemblyModule_Search.click();
		MajorAssemblyModule_Search.clear();
		MajorAssemblyModule_Search.sendKeys("790001MA000201");
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssemblyModule_SearchButton));
		MajorAssemblyModule_SearchButton.click();
	}
	
	public String MajorAssemblyModule_highVoltageBattery(){
		warmup6();
		String IDNum=MajorAssemblyModule_highVoltageBattery.getText();
		return IDNum;
	}
	
	public void switchBackToAdministrationModule(){
		warmup6();
		Set<String> handles=driver.getWindowHandles();			
		Iterator<String> it=	handles.iterator();			
		parentwindowID=it.next();
		childwindowID=it.next();
		warmup6();                     
		driver.switchTo().window(parentwindowID);
	}
	
	public void systemMessageDelete(){
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(systemMessageDelete).build().perform();
		a.click().build().perform();
	}
	
	public void VehiclesTab(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(VehiclesTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		VehiclesTab.click();
	}
	
	public void Vehicle_Fin_ForNegativeTesting(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Vehicle_Fin));
		Vehicle_Fin.click();
		Vehicle_Fin.clear();
		Vehicle_Fin.sendKeys("111!!!!@&..,,//////");
	}

	public void Vehicle_ApprovalDate_ForNegativeTesting(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Vehicle_ApprovalDate));
		Actions a=new Actions(driver);
		a.moveToElement(Vehicle_ApprovalDate).build().perform();
		a.click().build().perform();
		Vehicle_ApprovalDate.click();
		Vehicle_ApprovalDate.sendKeys("22-21-2022");
	}
	
	public Boolean WarningMessage_VehiclesTab(){
		warmup6();
		return WarningMessage_VehiclesTab.isDisplayed();
	}
	
	public void VehicleTab_CancelButton(){
		warmup6();
		VehicleTab_CancelButton.click();
		warmup6();
		driver.switchTo().alert().accept();
		warmup();
		VehicleTab_CancelButton.click();
	}
	
	public void MajorAssembliesTab_CancelButton(){
		warmup6();
		MajorAssembliesTab_CancelButton.click();
		warmup6();
		driver.switchTo().alert().accept();
		warmup();
		MajorAssembliesTab_CancelButton.click();
	}
	
	public void ConflictSummaryTab(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab));
		ConflictSummaryTab.click();
	}
	
	public void ConflictSummaryTab_ShowDataButton(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_ShowDataButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ConflictSummaryTab_ShowDataButton);
		js.executeScript("arguments[0].click();", ConflictSummaryTab_ShowDataButton);
	}
	
	public void ConflictSummaryTab_AddConfigurationButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_AddConfigurationButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ConflictSummaryTab_AddConfigurationButton);
		js.executeScript("arguments[0].click();", ConflictSummaryTab_AddConfigurationButton);
//		ConflictSummaryTab_AddConfigurationButton.click();
	}
	
	public void ConflictSummaryTab_ConfigurationID(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_ConfigurationID));
		ConflictSummaryTab_ConfigurationID.click();
		ConflictSummaryTab_ConfigurationID.clear();
		ConflictSummaryTab_ConfigurationID.sendKeys(CUGroup_Identifier);
	}
	
	public void ConflictSummaryTab_Status(){
		warmup6();
		Select s=new Select(ConflictSummaryTab_Status);
		s.selectByValue("string:active");
	}
	
	public void ConflictSummaryTab_Description1(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_Description1));
		ConflictSummaryTab_Description1.click();
		ConflictSummaryTab_Description1.clear();
		ConflictSummaryTab_Description1.sendKeys("Random message inserted");
	}
	
	public void ConflictSummaryTab_ConflictMessageID(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_ConflictMessageID));
		ConflictSummaryTab_ConflictMessageID.click();
		ConflictSummaryTab_ConflictMessageID.clear();
		ConflictSummaryTab_ConflictMessageID.sendKeys("Added by MBRDI colleagues for testing the functionality of this Tab");
	}
	
	public void ConflictSummaryTab_CheckmarkButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_CheckmarkButton));
		ConflictSummaryTab_CheckmarkButton.click();
	}
	
	public void ConflictSummaryTab_SaveButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_AddEmailAddressButton));
		ConflictSummaryTab_AddEmailAddressButton.click();
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_EmailAddress));
		ConflictSummaryTab_EmailAddress.click();
		ConflictSummaryTab_EmailAddress.clear();
		ConflictSummaryTab_EmailAddress.sendKeys("vedoc@daimlertruck.com");
		warmup6();
		Select s=new Select(ConflictSummaryTab_languageSelect);
		s.selectByValue("string:en");
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummary_EmailAddress_CheckmarkButton));
		ConflictSummary_EmailAddress_CheckmarkButton.click();
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_SaveButton));
		ConflictSummaryTab_SaveButton.click();
		warmup5();

	}
	
	public void ConflictSummaryTab_Filterbutton(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_Filterbutton));
		ConflictSummaryTab_Filterbutton.click();
	}
	
	public void ConflictSummaryTab_FilterText(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_FilterText));
		ConflictSummaryTab_FilterText.click();
		ConflictSummaryTab_FilterText.sendKeys(CUGroup_Identifier);
	}
	
	public void ConflictSummaryTab_EditButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_EditButton));
		ConflictSummaryTab_EditButton.click();
	}
	
	public void ConflictSummaryTab_Description2(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_Description2));
		ConflictSummaryTab_Description2.click();
		ConflictSummaryTab_Description2.clear();
		ConflictSummaryTab_Description2.sendKeys("Random Description");
	}
	
	public void ConflictSummaryTab_DeleteButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_DeleteButton));
		ConflictSummaryTab_DeleteButton.click();
	}
	
	public void ConflictSummaryTab_SaveButton_ToDeleteEntry(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ConflictSummaryTab_SaveButton));
		ConflictSummaryTab_SaveButton.click();
		warmup5();
	}
	
	
	// Swedha
	
	public void timerAndParameterConfiguration_Tab(){
		timerAndParameterConfiguration_Tab.click();
	}
	
	public void timerAndParameterTab_ShowDataButton(){
		wait.until(ExpectedConditions.elementToBeClickable(timerAndParameterConfiguration_Tab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", timerAndParameterTab_ShowDataButton);
		warmup6();
	}
	
	public void timerAndParameterTab_FirstRow(){
		wait.until(ExpectedConditions.elementToBeClickable(timerAndParameterTab_FirstRow));
		timerAndParameterTab_FirstRow.click();
	}
	
	public void timerAndParameterTab_Edit(){
		timerAndParameterTab_Edit.click();
	}
	
		public void timerAndParameterTab_Interval(){
			timerAndParameterTab_Interval.clear();
			timerAndParameterTab_Interval.sendKeys(randomNumbers_6);
		}
		
		public void timerAndParameterTab_Timeout(){
			timerAndParameterTab_Timeout.clear();
			timerAndParameterTab_Timeout.sendKeys(randomNumbers_4);
		}
		
		public void timerAndParameterTab_StartingTime(){
			timerAndParameterTab_StartingTime.clear();
			timerAndParameterTab_StartingTime.sendKeys("030433");
		}
		
		public void timerAndParameterTab_Member(){
			timerAndParameterTab_MemberDropDown.click();
			timerAndParameterTab_Member.click();
		}
		
		public void submit_Icon(){
			submit_Icon.click();
		}
		
		public void timerAndParameterTab_Save(){
			timerAndParameterTab_Save.click();
			warmup5();
		}
		
		public void filter_Button(){
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
			warmup6();
			filter_Button.click();
			warmup5();
		}
		
	public String timerAndParameterTab_FilterData(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		warmup6();
		String filterData = timerAndParameterTab_FilterStartingTime.getAttribute("outerText");
	    timerAndParameterTab_SearchInput.sendKeys(filterData);
		timerAndParameterTab_SearchInput.sendKeys(Keys.ENTER);
		timerAndParameterTab_SearchInput.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(timerAndParameterTab_FilterStartingTime));
		String filteredResult = timerAndParameterTab_FilterStartingTime.getAttribute("outerText");
		Assert.assertEquals(filterData,filteredResult);
        return filterData;
	}
	
	public void timerAndParameterTab_FilterText(){
		wait.until(ExpectedConditions.visibilityOf(timerAndParameterTab_SearchInput));
		timerAndParameterTab_SearchInput.sendKeys("03:04:33");
		timerAndParameterTab_SearchInput.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(timerAndParameterTab_FirstRow));
	}
	
	public String timerAndParameterTab_FilteredResult(){
		String filteredResult = timerAndParameterTab_FirstRow.getText();
		return filteredResult;
	}
	
	public void externalServiceConfiguration_Tab(){
		    //KELKARK
		    warmup();
			Actions act=new Actions(driver);
			act.moveToElement(VehiclesTab).perform();
			warmup();
			act.moveToElement(externalServiceConfiguration_Tab).click().build().perform();				
	}
	
	public void externalServiceConfigurationTab_showDataButton(){
		wait.until(ExpectedConditions.elementToBeClickable(externalServiceConfigurationTab_showDataButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", externalServiceConfigurationTab_showDataButton);
		warmup6();
	}
	
	public void externalServiceConfigurationTab_FirstRow(){
		externalServiceConfigurationTab_FDKRow.click();
	}
	
	public void externalServiceConfigurationTab_Edit(){
		externalServiceConfigurationTab_Edit.click();
	}
	
	public void externalServiceConfigurationTab_ServiceDescription(){
		warmup5();
		externalServiceConfigurationTab_ServiceDescription.clear();
		externalServiceConfigurationTab_ServiceDescription.sendKeys("Created by MBRDI");
	}
	
	public void externalServiceConfigurationTab_GroupDropDown(){
		externalServiceConfigurationTab_GroupDropDown.click();
		externalServiceConfigurationTab_GroupInput.click();
	}
	
	public void externalServiceConfigurationTab_Status(){
		externalServiceConfigurationTab_StatusDropDown.click();
		externalServiceConfigurationTab_StatusInput.click();
	}
	
	public void externalServiceConfigurationTab_deactivationLimit(){
		externalServiceConfigurationTab_deactivationLimit.clear();
		externalServiceConfigurationTab_deactivationLimit.sendKeys(randomNumbers_4);
	}
	
	public void externalServiceConfigurationTab_TimeoutTime(){
		externalServiceConfigurationTab_TimeoutTime.clear();
		externalServiceConfigurationTab_TimeoutTime.sendKeys(randomNumbers_4);
	}

	public void externalServiceConfigurationTab_Save(){
		externalServiceConfigurationTab_Save.click();
		warmup5();
	}
	
	public void externalServiceConfigurationTab_FilterButton(){
		externalServiceConfigurationTab_FilterButton.click();
	}
	
	
	public String externalServiceConfigurationTab_FilterData(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		warmup6();
		String filterData = externalServiceConfigurationTab_FilterServiceDescription.getAttribute("textContent");
		searchInput_ExternalServiceTab.sendKeys(filterData);
		searchInput_ExternalServiceTab.sendKeys(Keys.ENTER);
		searchInput_ExternalServiceTab.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(externalServiceConfigurationTab_FilterServiceDescription));
		String filteredResult = externalServiceConfigurationTab_FilterServiceDescription.getAttribute("textContent");
		Assert.assertEquals(filterData,filteredResult);
		return filterData;
	}
	
	public void externalServiceConfigurationTab_FilterText(){
		wait.until(ExpectedConditions.visibilityOf(externalServiceTab_SearchInput));
		externalServiceTab_SearchInput.sendKeys("Created by MBRDI");
		externalServiceTab_SearchInput.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(externalServiceTab_FirstRow));
	}
	
	public String externalServiceConfigurationTab_FilteredResult(){
		String filteredResult = externalServiceTab_FirstRow.getText();
		return filteredResult;
	}
	
	
	public void automaticConflictStatusTab(){
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", automaticConflictStatusTab);
	}
	
	public void automaticConflictStatusTab_ShowData(){
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", automaticConflictStatusTab_ShowData);
		}
	
	public void automaticConflictStatusTab_AddConfiguration(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab_AddConfiguration));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", automaticConflictStatusTab_AddConfiguration);
	}
	
	public void automaticConflictStatusTab_Add_ConfigurationID(){
		automaticConflictStatusTab_ConfigurationID.sendKeys(randomNumbers_6);
	}
	
	public void automaticConflictStatusTab_Add_Cause(){
		Select s=new Select(automaticConflictStatusTab_Cause);
		s.selectByValue("string:flash");
	}
	
	public void automaticConflictStatusTab_Add_UserId(){
		automaticConflictStatusTab_UserId.sendKeys("Add User ID");
	}
	
	public void automaticConflictStatusTab_Add_ConflictType(){
		Select s=new Select(automaticConflictStatusTab_ConflictType);
		s.selectByValue("string:inconsistency");
	}
	
	public void automaticConflictStatusTab_Add_Description1(){
		automaticConflictStatusTab_Description1.sendKeys("Add description1");
	}
	
	public void automaticConflictStatusTab_Add_Description2(){
		automaticConflictStatusTab_Description2.sendKeys("Add description2");
	}
	
	public void automaticConflictStatusTab_Add_ConflictMessageId(){
		automaticConflictStatusTab_ConflictMessageId.sendKeys("Add conflict message ID");
	}

	public void automaticConflictStatusTab_Add_TargetStatus(){
		Select s=new Select(automaticConflictStatusTab_TargetStatus);
		s.selectByValue("string:inactive");
	}
	
	public void automaticConflictStatusTab_Save(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab_Save));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", automaticConflictStatusTab_Save);
		warmup5();
	}
	
	public void automaticConflictStatusTab_FilterButton(){
		automaticConflictStatusTab_FilterButton.click();
	}
	
	public void automaticConflictStatusTab_FilterData(){
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab_FilterData));
		automaticConflictStatusTab_FilterData.sendKeys(randomNumbers_6);
		automaticConflictStatusTab_FilterData.sendKeys(Keys.ENTER);
		warmup5();
	}
	
	public void automaticConflictStatusTab_EditButton(){
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab_EditButton));
		automaticConflictStatusTab_EditButton.click();
	}
	
	public void automaticConflictStatusTab_Edit_ConfigurationID(){
		automaticConflictStatusTab_ConfigurationID.clear();
		automaticConflictStatusTab_ConfigurationID.sendKeys(randomNumbers_5);
	}
	
	public void automaticConflictStatusTab_Edit_Cause(){
		Select s=new Select(automaticConflictStatusTab_Cause);
		s.selectByValue("string:online");
	}
	
	public void automaticConflictStatusTab_Edit_UserId(){
		automaticConflictStatusTab_UserId.clear();
		automaticConflictStatusTab_UserId.sendKeys("Edit User ID");
	}
	
	public void automaticConflictStatusTab_Edit_ConflictType(){
		Select s=new Select(automaticConflictStatusTab_ConflictType);
		s.selectByValue("string:fatalRights");
	}
	
	public void automaticConflictStatusTab_Edit_Description1(){
		automaticConflictStatusTab_Description1.clear();
		automaticConflictStatusTab_Description1.sendKeys("Edit description1");
	}
	
	public void automaticConflictStatusTab_Edit_Description2(){
		automaticConflictStatusTab_Description2.clear();
		automaticConflictStatusTab_Description2.sendKeys("Edit description2");
	}
	
	public void automaticConflictStatusTab_Edit_ConflictMessageId(){
		automaticConflictStatusTab_ConflictMessageId.clear();
		automaticConflictStatusTab_ConflictMessageId.sendKeys("Edit conflict message ID");
	}

	public void automaticConflictStatusTab_Edit_TargetStatus(){
		Select s=new Select(automaticConflictStatusTab_TargetStatus);
		s.selectByValue("string:ignored");
	}
	
	public void automaticConflictStatusTab_Edit_FilterData(){
		wait.until(ExpectedConditions.elementToBeClickable(automaticConflictStatusTab_FilterData));
		automaticConflictStatusTab_FilterData.sendKeys(randomNumbers_5);
		automaticConflictStatusTab_FilterData.sendKeys(Keys.ENTER);
		warmup5();
	}
	
	public void automaticConflictStatusTab_TrashButton(){
		automaticConflictStatusTab_TrashButton.click();
	}
	
	public String automaticConflictStatusTab_FilteredResult(){
		String filteredResult = automaticConflictStatusTab_FilteredResult.getText();
		return filteredResult;
	}
	
	public Boolean filteredResult(){
		warmup6();
		return filteredResult.isDisplayed();
	}
	
	public void vehicleData_Page(){
		warmup4();
		Actions a=new Actions(driver);
		a.moveToElement(vehicleData_Page).build().perform();
		warmup5();
		vehicleData_Page.click();
		warmup1();
	}
	
	public void theftMessageTab(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(theftMessageTab));
		warmup5();
		warmup5();
//		openNewTab_RU();
		theftMessageTab.click();
		warmup5();
	}
	
	public void theftMessage_CreateTheftButton(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", theftMessage_CreateTheftButton);
	}
	
	public void theftMessage_TheftDate(){
		theftMessage_TheftDate.sendKeys("03/03/2022");
		warmup5();
	}
	
	public void theftMessage_TheftCountry(){
		theftMessage_PoliceAuthorities.click();
		theftMessage_TheftCountry.sendKeys("IND");
	}
	
	public void theftMessage_TheftLocation(){
		theftMessage_TheftLocation.sendKeys("Bangalore");
	}
	
	public void theftMessage_LicensePlateNumber(){
		theftMessage_LicensePlateNumber.sendKeys("TN09 A1000");
	}
	
	public void theftMessage_BkaDeletionDate(){
		theftMessage_BkaDeletionDate.sendKeys("03/03/2022");
	}
	
	public void theftMessage_BkareasonOfDeletion(){
		Select s=new Select(theftMessage_BkareasonOfDeletion);
		s.selectByValue("string:E");
	}
	
	public void theftMessage_PoliceAuthorities(){
		theftMessage_PoliceAuthorities.sendKeys("S9");
	}
	
	public void theftMessage_PoliceReference(){
		theftMessage_PoliceReference.sendKeys("Reference");
	}

	public void theftMessage_PoliceContacttDetails(){
		theftMessage_PoliceContacttDetails.sendKeys("9999999999");
	}

	public void theftMessage_Insurer(){
		theftMessage_Insurer.sendKeys("DTICI");
	}

	public void theftMessage_DamageNumber(){
		theftMessage_DamageNumber.sendKeys("222");
	}

	public void theftMessage_InsurercontactDetails(){
		theftMessage_InsurercontactDetails.sendKeys("888888888");
	}

	public void theftMessage_InternalNote(){
		theftMessage_InternalNote.sendKeys("Stolen");
		warmup5();
	}

	public void theftMessage_Save(){
		theftMessage_Save.click();
		warmup5();
	}
	
	public void logout(){
		logout.click();
	}
	
	public void openNewTab_RU(){
		warmup5();
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	    driver.get("https://test1.core-n.public.vedoc.i.mercedes-benz.com/ui/homepage.html");
	}
	

	public String theftAlert(){
		wait.until(ExpectedConditions.visibilityOf(theftAlert));
		String alert = theftAlert.getAttribute("textContent");
		return alert;
	}
	
	public void mainIcon(){
		warmup5();
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	    driver.get("https://mbag-test.core-t.public.vedoc.daimlertruck.com/ui/homepage.html");
		warmup5();
		WebElement vecldat=driver.findElement(By.xpath("//*[@id='sidebar']/li[2]/a"));
		vecldat.click();
	}
	
	public void messageDuplicatorTab(){
		messageDuplicatorTab.click();
		warmup5();
	}
	
	public void messageDuplicatorTab_ShowData(){
		wait.until(ExpectedConditions.elementToBeClickable(messageDuplicatorTab_ShowData));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", messageDuplicatorTab_ShowData);
		warmup5();
	}
	
	public void messageDuplicatorTab_FirstRow(){
		messageDuplicatorTab_FirstRow.click();
	}
	
	public void messageDuplicatorTab_EditIcon(){
		messageDuplicatorTab_EditIcon.click();
	}
	
	public void messageDuplicatorTab_Group(){
		messageDuplicatorTab_Group.clear();
		messageDuplicatorTab_Group.sendKeys("A_MBRDI");
	}

	public void messageDuplicatorTab_ValidFrom(){
		messageDuplicatorTab_ValidFrom.sendKeys(Keys.CONTROL+"A");
		messageDuplicatorTab_ValidFrom.sendKeys(Keys.CONTROL+"X");
		messageDuplicatorTab_ValidFrom.clear();
		messageDuplicatorTab_ValidFrom.sendKeys("01/01/2022 7:44:47 AM");
	}
	
	public void messageDuplicatorTab_ValidUntil(){
		messageDuplicatorTab_ValidUntil.sendKeys(Keys.CONTROL+"A");
		messageDuplicatorTab_ValidUntil.sendKeys(Keys.CONTROL+"X");
		messageDuplicatorTab_ValidUntil.clear();
		messageDuplicatorTab_ValidUntil.sendKeys("01/01/2023 7:30:00 AM");
	}
	
	public void messageDuplicatorTab_MaximumNumber(){
		messageDuplicatorTab_MaximumNumber.clear();
		messageDuplicatorTab_MaximumNumber.sendKeys("10");
	}
	
	public void messageDuplicatorTab_Submit(){
		messageDuplicatorTab_Submit.click();
	}
	
	public void messageDuplicatorTab_Save(){
		messageDuplicatorTab_Save.click();
		warmup5();
	}
	
	public void messageDuplicatorTab_FilterButton(){
		messageDuplicatorTab_FilterButton.click();
	}
	
	public void messageDuplicatorTab_FilterText(){
		wait.until(ExpectedConditions.visibilityOf(messageDuplicatorTab_SearchInput));
		messageDuplicatorTab_SearchInput.sendKeys("A_MBRDI");
		messageDuplicatorTab_SearchInput.sendKeys(Keys.ENTER);
		warmup5(); // added newly 
		wait.until(ExpectedConditions.visibilityOf(messageDuplicatorTab_FirstRow));
	}
	
	public String  messageDuplicatorTab_FilteredResult(){
		String filteredResult = messageDuplicatorTab_FilteredResult.getText();
		return filteredResult;
	}
	
//	public void mainIcon(){
//		warmup5();
//		Actions a=new Actions(driver);
//		a.moveToElement(mainIcon).build().perform();
//		warmup5();
//		vehicleData_Page1.click();
//		warmup1();
//	}
	

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
	
	public void emailDistributionTab(){
		warmup5();
		emailDistributionTab.click();
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(emailDistributionTab_ShowData));
	}
	
	public void emailDistributionTab_ShowData(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", emailDistributionTab_ShowData);
		warmup5();
	}
	
	public void emailDistributionTab_FilterButton(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", emailDistributionTab_FilterButton);
	}
	
	public void emailDistributionTab_SearchTheTable(){
		emailDistributionTab_SearchTheTable.clear();
		emailDistributionTab_SearchTheTable.sendKeys("Access to stolen passenger car");
		emailDistributionTab_SearchTheTable.sendKeys(Keys.ENTER);
		warmup6();
	}
	
	public void emailDistributionTab_EditEmailFrequency(){
		emailDistributionTab_EditEmailFrequency.click();
	}
	
	public void emailDistributionTab_EmailFrequencyDropDown_Daily(){
		Select s=new Select(emailDistributionTab_EmailFrequencyDropDown);
		s.selectByValue("string:daily");
	}
	
	public void emailDistributionTab_EmailFrequencyDropDown_EachTime(){
		Select s=new Select(emailDistributionTab_EmailFrequencyDropDown);
		s.selectByValue("string:eachTime");
	}
	
	public void emailDistributionTab_CheckMark(){
		emailDistributionTab_CheckMark.click();
	}
	
	public void emailDistributionTab_Save(){
		emailDistributionTab_Save.click();
		warmup5();
	}
	
	public void emailDistributionTab_Add_EmailList(){
		emailDistributionTab_AddEmailList.click();
	}
	
	public void emailDistributionTab_Add_EmailAddress(){
		emailDistributionTab_EmailAddress.sendKeys("tata.varadharajan@mercedes-benz.com");
	}
	
	public void emailDistributionTab_Add_EmailLanguage(){
		Select s=new Select(emailDistributionTab_EmailLanguage);
		s.selectByValue("string:de");
	}
	
	public void emailDistributionTab_EditIcon_EmailList(){
		emailDistributionTab_FirstRow.click();
		emailDistributionTab_EditIcon_EmailList.click();
	}
	
	public void emailDistributionTab_Edit_EmailAddress(){
		emailDistributionTab_EmailAddress.clear();
		emailDistributionTab_EmailAddress.sendKeys("test@mercedes-benz.com");
	}
	
	public void emailDistributionTab_Edit_EmailLanguage(){
		Select s=new Select(emailDistributionTab_EmailLanguage);
		s.selectByValue("string:en");
	}
	
	public void emailDistributionTab_Trash(){
		emailDistributionTab_Trash.click();
	}
	
	public Boolean emailDistributionTab_EmailList_filteredResult(){
		emailDistributionTab_FirstRow.click();
		return emailDistributionTab_EmailList_filteredResult.isDisplayed();
	}
	

	public String emailDistributionTab_FirstRow(){
		String firstRow=	emailDistributionTab_FirstRow.getText();
		return firstRow;
	}
	
	public String emailDistributionTab_EmailList_filteredResult_FirstRow(){
		emailDistributionTab_FirstRow.click();
		String firstRow=	emailDistributionTab_EmailList_filteredResult.getText();
		return firstRow;
	}
	
	public void searchfin_Ru() throws InterruptedException {
		warmup5();
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		searchInput.click();
		searchInput.sendKeys("WDD2030545L000342");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void versionInformation_Tab(){
	    warmup();
		Actions act=new Actions(driver);
		act.moveToElement(VehiclesTab).perform();
		warmup();
		act.moveToElement(versionInformationTab).click().build().perform();				
}
	public void versionInformationTab_showDataButton(){
		wait.until(ExpectedConditions.elementToBeClickable(versionInformationTab_ShowData));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", VehiclesTab);
		js.executeScript("arguments[0].click();", versionInformationTab_ShowData);
		warmup6();
	}
	public void versionInformationTab_exportButton(){
		wait.until(ExpectedConditions.elementToBeClickable(versionInformationTab_exportSystemVersion));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", versionInformationTab_exportSystemVersion);
		warmup6();
		String fileName= GetDownloadedFileName_NewTab();
		 int dataCountInCSV= getRecordsCountInCSV(fileName);
		 System.out.println("Verifying total records in table with number of entries in csv");
		// Assert.assertEquals(getNumberOfEntries(), dataCountInCSV);
	}
	
	public void versionInformationTab_systemVersionSorting(){
		warmup5();
		versionInformationTab_systemVersionSorting.click();
		warmup6();
	}
	public String versionInformationTab_scriptInfo(){
		String scriptInfo=versionInformationTab_scriptInfo.getText();
		return scriptInfo;
	}
	public void versionInformationTab_systemVersionFilter(){
		warmup5();
		versionInformationTab_systemVersionFilter.click();
		warmup5();
		versionInformationTab_systemVersionFilterText.sendKeys("VEDOCEG8");
		warmup6();
	}
	public void versionInformationTab_systemVersionFilterCancel(){
		versionInformationTab_systemVersionFilterCancel.click();
	}
	public void versionInformationTab_DBScriptsSorting(){
		versionInformationTab_DBScriptsSorting.click();
		warmup6();
	}
	public void versionInformationTab_exportDBScripts(){
		wait.until(ExpectedConditions.elementToBeClickable(versionInformationTab_exportDBScripts));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", versionInformationTab_exportDBScripts);
		warmup5();
		String fileName= GetDownloadedFileName_NewTab();
		 int dataCountInCSV= getRecordsCountInCSV(fileName);
		 System.out.println("Verifying total records in table with number of entries in csv");
		// Assert.assertEquals(getNumberOfEntries_DB(), dataCountInCSV);
		warmup5();
	}
	public void versionInformationTab_DBVersionFilter(){
		warmup5();
		warmup5();
		versionInformationTab_DBScriptsFilter.click();
		warmup5();
		versionInformationTab_DBScriptsFilterText.sendKeys("4_REPAIR");
		warmup6();
	}
	public void versionInformationTab_DBVersionFilterCancel(){
	versionInformationTab_DBScriptsFilterCancel.click();
	}
	public String GetDownloadedFileName_NewTab(){
    	warmup5();
    	JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
   		driver.switchTo().window(opentabs.get(2));
   		driver.get("C:\\Users\\deenara\\Downloads");
   		warmup6();
   		dateModified_columnHeader.click();
   		warmup6();
   		String name= getRow1_dateModified.getText();
   		System.out.println("file name-"+name);
   		driver.close();
   		driver.switchTo().window(opentabs.get(0));
   		return name;
    	}
	
	public String versionInformationTab_totalRecords() {
		String records=versionInformationTab_SystemVersiontotalRecords.getText().trim();
		System.out.println(records);
		return records;	
}
	public String versionInformationTab_DBVersiontotalRecords() {
		String records=versionInformationTab_DBVersiontotalRecords.getText().trim();
		System.out.println(records);
		return records;	
}
	public int getNumberOfEntries() {
		
		String entriesTxt = versionInformationTab_totalRecords();
		String[] aEntriesText = entriesTxt.split(" / ");
		System.out.println(aEntriesText.length);
		String totalEntriesText = aEntriesText[1];
		int i=Integer.parseInt(totalEntriesText);
		System.out.println(totalEntriesText);
		return i;
	}
public int getNumberOfEntries_DB() {
		
		String entriesTxt = versionInformationTab_DBVersiontotalRecords();
		String[] aEntriesText = entriesTxt.split(" / ");
		System.out.println(aEntriesText.length);
		String totalEntriesText = aEntriesText[1];
		int i=Integer.parseInt(totalEntriesText);
		System.out.println(totalEntriesText);
		return i;
	}
	public int getRecordsCountInCSV(String csvFileName) {
		String downloadPath = "C:\\Users\\KELKARK\\Downloads";
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
//	@FindBy(xpath="(//input[@type='text'])[3]")
//	WebElement timeoutTime_Input;
	
}
