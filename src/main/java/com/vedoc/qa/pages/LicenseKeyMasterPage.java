package com.vedoc.qa.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.vedoc.qa.base.TestBase;

import junit.framework.Assert;

public class LicenseKeyMasterPage extends TestBase{

	@FindBy(xpath="//button[@id='MapVersions_361_search']")
	WebElement MapVersionsButton;

	@FindBy(xpath="//button[@data-ng-click='addData($event)']")
	WebElement AddEntryButton;

	@FindBy(xpath="//input[@name='mapVersion_eStand']")
	WebElement DevelopmentStatus;

	@FindBy(xpath="//select[@name='mapVersion_languageFlag']")
	WebElement LanguageSelect;

	@FindBy(xpath="//input[@name='mapVersion_softwareId']")
	WebElement SoftwareID;

	@FindBy(xpath="(//button[contains(@data-ng-click,'MapVersionTable')])[2]")
	WebElement Checkmarkbutton;

	@FindBy(xpath="(//button[contains(@data-ng-click,'save($event)')])")
	WebElement SaveButton;

	@FindBy(xpath="(//input[contains(@name,'mapVersion_tradeName')])")
	WebElement MapVersion;

	@FindBy(xpath="(//button[contains(@data-ng-click,'toggleFilter')])")
	WebElement FilterButton;

	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement FilterText;

	@FindBy(xpath="(//button[contains(@data-ng-click,'deleteRow')])")
	WebElement TrashButton;

	@FindBy(xpath="(//li[contains(@data-ng-show,'viewControl.RulesArrangement.visible')])")
	WebElement RulesTab;

	@FindBy(xpath="(//button[contains(@id,'RuleParameterCountryException_362_search')])")
	WebElement RulesTab_ShowData;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'addData_label')])[2]")
	WebElement RulesTab_AddEntry;
	
	@FindBy(xpath="//button[contains(@ng-click,'CountryExeptionsTable')]")
	WebElement RulesTab_countryExeptionsTable;

	@FindBy(xpath="(//input[contains(@name,'parameterCountryExceptions_exceptionCountry')])")
	WebElement RulesTab_ExceptionCountry;

	@FindBy(xpath="(//input[contains(@name,'parameterCountryExceptions_dvdMarket')])")
	WebElement RulesTab_DVDRegion;

	@FindBy(xpath="(//button[contains(@data-ng-click,'endEditing')])")
	WebElement RulesTab_CheckmarkButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterCountryException_362')])[4]")
	WebElement RulesTab_SaveButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'filter_label')])[2]")
	WebElement RulesTab_FilterButton;

	@FindBy(xpath="(//button[contains(@data-ng-click,'CountryExeptionsTable_rec')])[2]")
	WebElement RulesTabTrashButton;

	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement RulesTab_FilterText;

	
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.RuleParameterEDP_363.visible')]")
	WebElement EDPParameterTab;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MapVersions_361.visible')]")
	WebElement MapVersionTab;

	@FindBy(xpath="//button[contains(@id,'RuleParameterEDP_363_search')]")
	WebElement EDPParameter_ShowDataButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterEDP_363')])[2]")
	WebElement EDPParameter_AddEntryButton;

	@FindBy(xpath="(//input[contains(@name,'parameterEdp_edpCountry')])")
	WebElement EDPParameter_Country;

	@FindBy(xpath="(//button[contains(@data-ng-click,'EdpParameterTable')])[2]")
	WebElement EDPParameter_checkmarkButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterEDP_363')])[4]")
	WebElement EPDParameter_SaveButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterEDP_363')])[3]")
	WebElement EDPParameter_FilterButton;

	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement EDPParameter_FilterText;

	@FindBy(xpath="(//button[contains(@data-ng-click,'EdpParameterTable_rec')])[2]")
	WebElement EDPParameter_TrashButton;

	@FindBy(xpath="(//a[contains(@data-ng-show,'viewControl.RuleParameterFirstUpdate_364')])")
	WebElement GoodWillPeriodTab;

	@FindBy(xpath="(//button[contains(@id,'RuleParameterFirstUpdate_364_search')])")
	WebElement GoodWillPeriodTab_ShowDataButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterFirstUpdate_364')])[2]")
	WebElement GoodWillPeriodTab_AddEntryButton;

	@FindBy(xpath="(//input[contains(@name,'parameterFirstUpdate_destinationCountry')])")
	WebElement GoodWillPeriodTab_DesignationCountry;

	@FindBy(xpath="(//input[contains(@name,'parameterFirstUpdate_modelSeries')])")
	WebElement GoodWillPeriodTab_ModelSeries;

	@FindBy(xpath="(//button[contains(@data-ng-click,'parameterFirstUpdateTable')])[2]")
	WebElement GoodWillPeriodTab_CheckMarkButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterFirstUpdate_364')])[4]")
	WebElement GoodWillPeriodTab_SaveButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterFirstUpdate_364')])[3]")
	WebElement GoodWillPeriodTab_FilterButton;

	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement GoodWillPeriodTab_FilterText;

	@FindBy(xpath="(//button[contains(@data-ng-click,'parameterFirstUpdateTable_rec')])[2]")
	WebElement GoodWillPeriodTab_TrashButton;
	
	@FindBy(xpath="//a[contains(@data-ng-click,'RuleParameterHardship_365')]")
	WebElement HardshipCase_Tab;
	
	@FindBy(xpath="//span[contains(@data-ng-bind-html,'RuleParameterHardship_365')]")
	WebElement HardshipCaseTab_ShowDataButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterHardship_365')])[2]")
	WebElement HardshipCaseTab_AddEntryButton;
	
	@FindBy(xpath="(//input[contains(@name,'parameterHardship_finOrVin')])")
	WebElement HardshipCaseTab_FINNumber;
	
	@FindBy(xpath="(//input[contains(@name,'parameterHardship_softwareId')])")
	WebElement HardshipCaseTab_SoftwareID;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'HardshipTable')])[2]")
	WebElement HardshipCaseTab_CheckmarkButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterHardship_365')])[5]")
	WebElement HardshipCaseTab_SaveButton;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'HardshipTable')])")
	WebElement HardshipCaseTab_FilterButton;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement HardshipCaseTab_FilterText;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'HardshipTable_rec')])[2]")
	WebElement HardshipCaseTab_TrashButton;
	
	@FindBy(xpath="(//a[contains(@data-ng-show,'viewControl.RuleParameterMultiYearUpdate_367')])")
	WebElement MultiYearUpdateTab;
	
	@FindBy(xpath="(//button[contains(@id,'RuleParameterMultiYearUpdate_367_search')])")
	WebElement MultiYearUpdateTab_ShowDataButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterMultiYearUpdate_367')])[2]")
	WebElement MultiYearUpdateTab_AddEntryButton;
	
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_modelSeries')])")
	WebElement MultiYearUpdateTab_ModelSeries;
	
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_modelYearCodeFrom')])")
	WebElement MultiYearUpdateTab_ModelYearCode;
	//Vishakha
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_modelYearCodeTo')])")
	WebElement MultiYearUpdateTab_ModelYearCodeTo;
	
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_countryInformation1')])")
	WebElement MultiYearUpdateTab_Country1;
	
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_multiYearSpecialEquipmentCode')])")
	WebElement MultiYearUpdateTab_SACode;
	
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_multiYearPeriod')])")
	WebElement MultiYearUpdateTab_MyPeriodDays;
	//over
	@FindBy(xpath="(//input[contains(@name,'parameterMultiYearUpdate_freeDvdMarket')])")
	WebElement MultiYearUpdateTab_DVDRegion;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'MultiYearUpdateTable')])[2]")
	WebElement MultiYearUpdateTab_CheckmarkButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterMultiYearUpdate_367')])[5]")
	WebElement MultiYearUpdateTab_SaveButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'RuleParameterMultiYearUpdate_367')])[4]")
	WebElement MultiYearUpdateTab_FilterButton;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement MultiYearUpdateTab_FilterText;
	//Vishakha
	@FindBy(xpath="//*[@id='MultiYearUpdateTable']//following::td[10]/span/button[1]")
	WebElement MultiYearUpdateTab_Updateicon;
	//over
	@FindBy(xpath="//button[contains(@data-ng-click,'MultiYearUpdateTable_rec')][2]")
	WebElement MultiYearUpdateTab_TrashButton;

	@FindBy(xpath="//table[@id='MapVersionTable']//span[@class='cell-icon rc-i-line-pencil']")
	WebElement mapVersions_EditButton;
	
	@FindBy(xpath="//input[@name='mapVersion_softwareObjectNumber']")
	WebElement mapVersions_DvdObjectNumber;
	
	@FindBy(xpath="//input[@name='mapVersion_licenceObjectNumber']")
	WebElement mapVersions_LicenseObjectNumber;
	
	@FindBy(xpath="//table[@id='MapVersionTable']//tr[@tabindex='0']")
	WebElement mapVersions_FilteredResult;
	
	public void MapVersionsButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(MapVersionsButton));
		MapVersionsButton.click();
	}

	public void AddEntryButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(AddEntryButton));
		AddEntryButton.click();
	}

	public void DevelopmentStatus(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(DevelopmentStatus));
		DevelopmentStatus.click();
		DevelopmentStatus.clear();
		DevelopmentStatus.sendKeys("1111111111111111111111111111");
	}

	public void LanguageSelect(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(LanguageSelect));
		LanguageSelect.click();
		Select language=new Select(LanguageSelect);
		language.selectByValue("string:en");
	}

	public void SoftwareID(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(SoftwareID));
		SoftwareID.click();
		SoftwareID.clear();
		SoftwareID.sendKeys("00012C04");
	}

	public void Checkmarkbutton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(Checkmarkbutton));
		Checkmarkbutton.click();
	}

	public void SaveButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
		SaveButton.click();
		warmup1();
	}

	public void DevelopmentStatus_2ndEntry(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(DevelopmentStatus));
		DevelopmentStatus.click();
		DevelopmentStatus.clear();
		DevelopmentStatus.sendKeys("2222222222222222222222222222");
	}

	public void MapVersion(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(MapVersion));
		MapVersion.click();
		MapVersion.clear();
		MapVersion.sendKeys("Created By MBRDI");
	}

	public void FilterButton(){
		//warmup5();
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(FilterButton));
		FilterButton.click();
	}

	public void FilterText(){
		warmup();
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(FilterText));
		FilterText.click();
		FilterText.clear();
		FilterText.sendKeys("1111111111111111111111111111");
	}

	public void FilterText_2ndEntry(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(FilterText));
		FilterText.click();
		FilterText.clear();
		FilterText.sendKeys("2222222222222222222222222222");
	}

	public void TrashButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(TrashButton));
		TrashButton.click();
	}

	public void mapVersions_EditButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(mapVersions_EditButton));
		mapVersions_EditButton.click();
	}

	public void softwareId_Edit(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(SoftwareID));
		SoftwareID.click();
		SoftwareID.clear();
		SoftwareID.sendKeys("00011107");
	}
	
	public void mapVersion_Edit(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(MapVersion));
		MapVersion.click();
		MapVersion.clear();
		MapVersion.sendKeys("Edited By MBRDI");
	}
	
	public void mapVersions_DvdObjectNumber(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(mapVersions_DvdObjectNumber));
		mapVersions_DvdObjectNumber.click();
		mapVersions_DvdObjectNumber.clear();
		mapVersions_DvdObjectNumber.sendKeys("11111");
	}
	
	public void mapVersions_LicenseObjectNumber(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(mapVersions_LicenseObjectNumber));
		mapVersions_LicenseObjectNumber.click();
		mapVersions_LicenseObjectNumber.clear();
		mapVersions_LicenseObjectNumber.sendKeys("11111");
	}

	
	public void RulesTab(){
		warmup();
		RulesTab.click();
	}

	public void RulesTab_ShowData(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_ShowData));
		RulesTab_ShowData.click();
		warmup5();
	}

	public void RulesTab_AddEntry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_AddEntry));
		RulesTab_AddEntry.click();
	}
	//KELKARK
	@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
	WebElement dateModified_columnHeader;
	@FindBy(xpath="//table//tbody//tr[1]//td//a")
	WebElement getRow1_dateModified;
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.RuleParameterCountryException_362.visible')]")
	WebElement CountryException_subTab;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.parameterCountryExceptions)')]")
	WebElement RuleTab_CountryExceptionsTotalRecords;
	
	public void CountryException_SubTab(){
		warmup();
		CountryException_subTab.click();
		warmup();
	}
	
	public void RulesTab_CountryExceptions_ExportButton() throws InterruptedException {
		warmup6();
		RulesTab_countryExeptionsTable.click();
		warmup5();
		 String fileName= GetDownloadedFileName_NewTab(1, 0);
		 int dataCountInCSV= getRecordsCountInCSV(fileName);
		 System.out.println("Verifying total records in table with number of entries in csv is--"+dataCountInCSV);
		 Assert.assertEquals(getNumberOfEntries_DataValidation(), dataCountInCSV);
}
	public String GetDownloadedFileName_NewTab(int DownloadWindo, int RevertWindo){
    	warmup5();
    	JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
   		driver.switchTo().window(opentabs.get(DownloadWindo));
   		driver.get(prop.getProperty("downloadedFilePath"));
   		warmup6();
   		dateModified_columnHeader.click();
   		warmup6();
   		String name= getRow1_dateModified.getText();
   		System.out.println("file name-"+name);
   		driver.close();
   		driver.switchTo().window(opentabs.get(RevertWindo));//1   0      /1
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
	 public int getNumberOfEntries_DataValidation() throws InterruptedException {
		 	String entriesTxt = RulesTab_TotalRecords();
			int i=Integer.parseInt(entriesTxt);
			return i;
		}
	 public String RulesTab_TotalRecords() {
		    RuleTab_CountryExceptionsTotalRecords.click();
		    warmup();
			String records=RuleTab_CountryExceptionsTotalRecords.getText().trim();
			warmup6();
			System.out.println("Country records in table--"+records);
			return records;	} 
	//KELKARK End
	
	
	
	
	
	
	
	

	public void RulesTab_ExceptionCountry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_ExceptionCountry));
		RulesTab_ExceptionCountry.click();
		RulesTab_ExceptionCountry.clear();
		RulesTab_ExceptionCountry.sendKeys("991");
	}
	public void RulesTab_ExceptionCountry_2ndEntry(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_ExceptionCountry));
		RulesTab_ExceptionCountry.click();
		RulesTab_ExceptionCountry.clear();
		RulesTab_ExceptionCountry.sendKeys("992");
	}

	public void RulesTab_DVDRegion(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_DVDRegion));
		RulesTab_DVDRegion.click();
		RulesTab_DVDRegion.clear();
		RulesTab_DVDRegion.sendKeys("AUS");
	}

	public void RulesTab_CheckmarkButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_CheckmarkButton));
		RulesTab_CheckmarkButton.click();
	}

	public void RulesTab_SaveButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_SaveButton));
		RulesTab_SaveButton.click();
		warmup6();
	}

	public void RulesTab_FilterButton(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_FilterButton));
		RulesTab_FilterButton.click();
	}

	public void RulesTabTrashButton(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTabTrashButton));
		RulesTabTrashButton.click();
	}

	public void RulesTab_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_FilterText));
		RulesTab_FilterText.click();
		RulesTab_FilterText.clear();
		RulesTab_FilterText.sendKeys("991");
	}

	public void RulesTab_FilterText_2ndEntry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(RulesTab_FilterText));
		RulesTab_FilterText.click();
		RulesTab_FilterText.clear();
		RulesTab_FilterText.sendKeys("992");
	}

	public void EDPParameterTab(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameterTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", MapVersionTab);
		EDPParameterTab.click();
	}

	public void EDPParameter_ShowDataButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_ShowDataButton));
		EDPParameter_ShowDataButton.click();
	}

	public void EDPParameter_AddEntryButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_AddEntryButton));
		EDPParameter_AddEntryButton.click();
	}

	public void EDPParameter_Country(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_Country));
		EDPParameter_Country.click();
		EDPParameter_Country.clear();
		EDPParameter_Country.sendKeys("993");
	}

	public void EDPParameter_Country_For2ndEntry(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_Country));
		EDPParameter_Country.click();
		EDPParameter_Country.clear();
		EDPParameter_Country.sendKeys("994");
	}

	public void EDPParameter_checkmarkButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_checkmarkButton));
		EDPParameter_checkmarkButton.click();
	}

	public void EPDParameter_SaveButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EPDParameter_SaveButton));
		EPDParameter_SaveButton.click();
		warmup6();
	}

	public void EDPParameter_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_FilterButton));
		EDPParameter_FilterButton.click();
	}

	public void EDPParameter_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_FilterText));
		EDPParameter_FilterText.click();
		EDPParameter_FilterText.clear();
		EDPParameter_FilterText.sendKeys("993");
	}

	public void EDPParameter_FilterText_For2ndEntry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_FilterText));
		EDPParameter_FilterText.click();
		EDPParameter_FilterText.clear();
		EDPParameter_FilterText.sendKeys("994");
	}

	public void EDPParameter_TrashButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EDPParameter_TrashButton));
		EDPParameter_TrashButton.click();
	}

	public void GoodWillPeriodTab(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", MapVersionTab);
		GoodWillPeriodTab.click();
	}

	public void GoodWillPeriodTab_ShowDataButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_ShowDataButton));
		GoodWillPeriodTab_ShowDataButton.click();
	}

	public void GoodWillPeriodTab_AddEntryButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_AddEntryButton));
		GoodWillPeriodTab_AddEntryButton.click();
	}

	public void GoodWillPeriodTab_DesignationCountry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_DesignationCountry));
		GoodWillPeriodTab_DesignationCountry.click();
		GoodWillPeriodTab_DesignationCountry.clear();
		GoodWillPeriodTab_DesignationCountry.sendKeys("12");
	}

	public void GoodWillPeriodTab_ModelSeries(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_DesignationCountry));
		GoodWillPeriodTab_ModelSeries.click();
		GoodWillPeriodTab_ModelSeries.clear();
		GoodWillPeriodTab_ModelSeries.sendKeys("771");
	}

	public void GoodWillPeriodTab_CheckMarkButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_CheckMarkButton));
		GoodWillPeriodTab_CheckMarkButton.click();
	}

	public void GoodWillPeriodTab_DesignationCountry_For2ndEntry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_DesignationCountry));
		GoodWillPeriodTab_DesignationCountry.click();
		GoodWillPeriodTab_DesignationCountry.clear();
		GoodWillPeriodTab_DesignationCountry.sendKeys("14");
	}

	public void GoodWillPeriodTab_ModelSeries_For2ndEntry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_DesignationCountry));
		GoodWillPeriodTab_ModelSeries.click();
		GoodWillPeriodTab_ModelSeries.clear();
		GoodWillPeriodTab_ModelSeries.sendKeys("772");
	}

	public void GoodWillPeriodTab_SaveButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_SaveButton));
		GoodWillPeriodTab_SaveButton.click();
		warmup6();
	}

	public void GoodWillPeriodTab_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_FilterButton));
		GoodWillPeriodTab_FilterButton.click();
	}

	public void GoodWillPeriodTab_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_FilterText));
		GoodWillPeriodTab_FilterText.click();
		GoodWillPeriodTab_FilterText.clear();
		GoodWillPeriodTab_FilterText.sendKeys("771");
	}
	
	public void GoodWillPeriodTab_FilterText_For2ndEntry(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_FilterText));
		GoodWillPeriodTab_FilterText.click();
		GoodWillPeriodTab_FilterText.clear();
		GoodWillPeriodTab_FilterText.sendKeys("772");
	}

	public void GoodWillPeriodTab_TrashButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(GoodWillPeriodTab_TrashButton));
		GoodWillPeriodTab_TrashButton.click();

	}
	
	public void HardshipCase_Tab(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCase_Tab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", MapVersionTab);
		HardshipCase_Tab.click();
	}
	
	public void HardshipCaseTab_ShowDataButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_ShowDataButton));
		HardshipCaseTab_ShowDataButton.click();
	}
	
	public void HardshipCaseTab_AddEntryButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_AddEntryButton));
		HardshipCaseTab_AddEntryButton.click();
	}
	
	public void HardshipCaseTab_FINNumber(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_FINNumber));
		HardshipCaseTab_FINNumber.click();
		HardshipCaseTab_FINNumber.clear();
		HardshipCaseTab_FINNumber.sendKeys("11111111111111111");
	}
	
	public void HardshipCaseTab_SoftwareID(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_SoftwareID));
		HardshipCaseTab_SoftwareID.click();
		HardshipCaseTab_SoftwareID.clear();
		HardshipCaseTab_SoftwareID.sendKeys("0001100F");
	}
	
	public void HardshipCaseTab_CheckmarkButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_CheckmarkButton));
		HardshipCaseTab_CheckmarkButton.click();
	}
	
	public void HardshipCaseTab_SaveButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_SaveButton));
		HardshipCaseTab_SaveButton.click();
		warmup6();
	}
	
	public void HardshipCaseTab_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_FilterButton));
		HardshipCaseTab_FilterButton.click();
	}
	
	public void HardshipCaseTab_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_FilterText));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", HardshipCaseTab_FilterText);
		js.executeScript("arguments[0].click();", HardshipCaseTab_FilterText);
//		HardshipCaseTab_FilterText.click();
		HardshipCaseTab_FilterText.clear();
		HardshipCaseTab_FilterText.sendKeys("11111111111111111");
	}
	
	public void HardshipCaseTab_TrashButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HardshipCaseTab_TrashButton));
		HardshipCaseTab_TrashButton.click();
	}
	
	public void MultiYearUpdateTab(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", MapVersionTab);
		MultiYearUpdateTab.click();
	}
	
	public void MultiYearUpdateTab_ShowDataButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_ShowDataButton));
		MultiYearUpdateTab_ShowDataButton.click();
	}
	
	public void MultiYearUpdateTab_AddEntryButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_AddEntryButton));
		MultiYearUpdateTab_AddEntryButton.click();
	}
	
	public void MultiYearUpdateTab_ModelSeries(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_ModelSeries));
		MultiYearUpdateTab_ModelSeries.click();
		MultiYearUpdateTab_ModelSeries.clear();
		MultiYearUpdateTab_ModelSeries.sendKeys("157");
	}

	public void MultiYearUpdateTab_ModelYearCode (){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_ModelYearCode));
		MultiYearUpdateTab_ModelYearCode.click();
		MultiYearUpdateTab_ModelYearCode.clear();
		MultiYearUpdateTab_ModelYearCode.sendKeys("805");
	}
	//Vishakha
	public void MultiYearUpdateTab_ModelYearCodeTo(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_ModelYearCodeTo));
		MultiYearUpdateTab_ModelYearCodeTo.click();
		MultiYearUpdateTab_ModelYearCodeTo.clear();
		MultiYearUpdateTab_ModelYearCodeTo.sendKeys("807");
	}
	public void MultiYearUpdateTab_Country1(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_Country1));
		MultiYearUpdateTab_Country1.click();
		MultiYearUpdateTab_Country1.clear();
		MultiYearUpdateTab_Country1.sendKeys("920");
	}
	public void MultiYearUpdateTab_SACode(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_SACode));
		MultiYearUpdateTab_SACode.click();
		MultiYearUpdateTab_SACode.clear();
		MultiYearUpdateTab_SACode.sendKeys("503");
	}
	public void MultiYearUpdateTab_MyPeriodDays(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_MyPeriodDays));
		MultiYearUpdateTab_MyPeriodDays.click();
		MultiYearUpdateTab_MyPeriodDays.clear();
		MultiYearUpdateTab_MyPeriodDays.sendKeys("1186");
	}
	//over
	public void MultiYearUpdateTab_DVDRegion(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_DVDRegion));
		MultiYearUpdateTab_DVDRegion.click();
		MultiYearUpdateTab_DVDRegion.clear();
		MultiYearUpdateTab_DVDRegion.sendKeys("SEA");
	}
	
	public void MultiYearUpdateTab_CheckmarkButton(){
		warmup5();
//		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_CheckmarkButton));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", MultiYearUpdateTab_CheckmarkButton);
//		warmup6();
//		js.executeScript("arguments[0].click();", MultiYearUpdateTab_CheckmarkButton);
		Actions act=new Actions(driver);
		act.moveToElement(MultiYearUpdateTab_CheckmarkButton).build().perform();
		MultiYearUpdateTab_CheckmarkButton.click();
//		MultiYearUpdateTab_CheckmarkButton.click();
	}
		
	public void MultiYearUpdateTab_SaveButton(){
		warmup5();
//		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_SaveButton));
////		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_CheckmarkButton));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", MultiYearUpdateTab_SaveButton);
		
		Actions act=new Actions(driver);
		act.moveToElement(MultiYearUpdateTab_SaveButton).build().perform();
		MultiYearUpdateTab_SaveButton.click();
		warmup6();
	}
	
	public void MultiYearUpdateTab_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_FilterButton));
		MultiYearUpdateTab_FilterButton.click();
	}
	
	public void MultiYearUpdateTab_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_FilterText));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", MultiYearUpdateTab_FilterText);
		MultiYearUpdateTab_FilterText.click();
		MultiYearUpdateTab_FilterText.clear();
		MultiYearUpdateTab_FilterText.sendKeys("157");
	}
	//Vishakha
	public void MultiYearUpdateTab_Updateicon(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_Updateicon));
		MultiYearUpdateTab_Updateicon.click();
	}
	public void UpdateMultiYearUpdateTab_ModelYearCodeTo(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_ModelYearCodeTo));
		MultiYearUpdateTab_ModelYearCodeTo.click();
		MultiYearUpdateTab_ModelYearCodeTo.clear();
		MultiYearUpdateTab_ModelYearCodeTo.sendKeys("806");
	}
	public void MultiYearUpdateTab_UpdateCountry1(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_Country1));
		MultiYearUpdateTab_Country1.click();
		MultiYearUpdateTab_Country1.clear();
		MultiYearUpdateTab_Country1.sendKeys("921");
		}
	public void MultiYearUpdateTab_UpdateSACode(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_SACode));
		MultiYearUpdateTab_SACode.click();
		MultiYearUpdateTab_SACode.clear();
		MultiYearUpdateTab_SACode.sendKeys("504");
		}
	public void MultiYearUpdateTab_UpdateMyPeriodDays(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_MyPeriodDays));
		MultiYearUpdateTab_MyPeriodDays.click();
		MultiYearUpdateTab_MyPeriodDays.clear();
		MultiYearUpdateTab_MyPeriodDays.sendKeys("1187");
		}
	//over
	public void MultiYearUpdateTab_TrashButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(MultiYearUpdateTab_TrashButton));
		MultiYearUpdateTab_TrashButton.click();
	}
	
	public String mapVersions_FilteredResult(){
		String filteredResult = mapVersions_FilteredResult.getText();
		return filteredResult;
	}
	
	public Boolean mapVersions_CheckDisplayOfFilteredResult(){
		warmup1();
		warmup1();
		return mapVersions_FilteredResult.isDisplayed();
	}
	

	public LicenseKeyMasterPage() {

		PageFactory.initElements(driver, this);
	}

}
