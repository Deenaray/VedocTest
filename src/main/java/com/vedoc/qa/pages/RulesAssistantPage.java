package com.vedoc.qa.pages;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vedoc.qa.base.TestBase;

public class RulesAssistantPage extends TestBase {
	
	@FindBy(xpath="//a[text()='Rule basis']")
	WebElement ruleBasisTab;

	@FindBy(xpath="//span[text()='Show current rule basis']//parent::button")
	WebElement showCurrentRuleBasis;
	
	@FindBy(xpath="//div[contains(@class,'mdsd-tree ng-scope angular-ui-tree')]/div/ol/li[1]/div/a")
	WebElement arrowAxle;
	
	@FindBy(xpath="//div[contains(@class,'mdsd-tree ng-scope angular-ui-tree')]/div/ol/li[1]/ol/li[1]/div/a")
	WebElement arrowAxle7;
	
	@FindBy(xpath="//div[contains(@class,'mdsd-tree ng-scope angular-ui-tree')]/div/ol/li[1]/ol/li[1]/ol/li[1]/div/a")
	WebElement arrowAxle73;
	
	@FindBy(xpath="//div[contains(@class,'mdsd-tree ng-scope angular-ui-tree')]/div/ol/li[1]/ol/li[1]/ol/li[1]/ol/li[1]/div/input")
	WebElement arrowAxle739;
	
	@FindBy(xpath="//*[@id='ValidationRuleSet_812']/div/div[2]/form/div[3]/div[1]/div/div/ol/li[5]/div/a")
	WebElement arrowTransmission;
	
	@FindBy(xpath="//*[@id='ValidationRuleSet_812']/div/div[2]/form/div[3]/div[1]/div/div/ol/li[5]/ol/li/div/a/span")
	WebElement arrowTransmission7;
	
	@FindBy(xpath="//*[@id=\"ValidationRuleSet_812\"]/div/div[2]/form/div[3]/div[1]/div/div/ol/li[5]/ol/li/ol/li[1]/div/a/span")
	WebElement arrowTransmission71;
	
	@FindBy(xpath="//*[@id='ValidationRuleSet_812']/div/div[2]/form/div[3]/div[1]/div/div/ol/li[5]/ol/li/ol/li[1]/ol/li[4]/div/input")
	WebElement arrowTransmission715;
	
	@FindBy(xpath="//div[contains(@class,'mdsd-tree ng-scope angular-ui-tree')]/div/ol/li[5]/div/input")
	WebElement arrowVehicle;
	
	@FindBy(xpath="//*[@id='ValidationRuleSet_812']/div/div[2]/form/div[3]/div[1]/div/div/ol/li[6]/ol/li[7]/div/a/span")
	WebElement arrowVehicle9;
	
	@FindBy(xpath="//*[@id='ValidationRuleSet_812']/div/div[2]/form/div[3]/div[1]/div/div/ol/li[6]/ol/li[7]/ol/li[6]/div/a/span")
	WebElement arrowVehicle96;
	
	@FindBy(xpath="//*[@id='ValidationRuleSet_812']/div/div[2]/form/div[3]/div[1]/div/div/ol/li[6]/ol/li[7]/ol/li[6]/ol/li[1]/div/input")
	WebElement arrowVehicle963;
	
	@FindBy(xpath="//button[contains(@data-ng-disabled,'isEmpty() || !listHasData(viewDataObject.ruleGroups[0].rules)')]")
	WebElement filterRuleAssistant;
	
	@FindBy(xpath="//input[contains(@input-binding,'viewControl.ruleTable_filterExpression')]")
	WebElement filterRuleAssistantInput;
	
	@FindBy(xpath="//table[@id='ruleTable']//following::td[8]/span/button[1]")
	WebElement showRuleIcon;
	
	@FindBy(xpath="//form[@name='fValidationRule_813']//following::div[2]/button[1]")
	WebElement editRuleButton;
	
	@FindBy(xpath="//table[@id='codeTable1']//following::tr[1]/td[3]/span/button[2]")
	WebElement deleteCodesFromRule;
	
	@FindBy(xpath="//form[@name='fValidationRule_813']//following::div[2]/button[2]")
	WebElement applyRuleButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'save($event)')]")
	WebElement saveButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'addCodeTableCriteria($event)')]")
	WebElement codeTableRuleButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'addCode1($event)')]")
	WebElement addCodesCriterionRuleButton;
	
	@FindBy(xpath="//input[contains(@name,'extendedApplicationConstraint_codeGroups_codeConstraints_code')]")
	WebElement codesCriterionDescription;
	
	@FindBy(xpath="//button[contains(@data-ng-if,'codeTable1_rec === viewControl.editing_object')][1]")
	WebElement codesCriterionSubmit;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.ruleGroups[0].rules)')]")
	WebElement RuleAssistant_totalRecords;
	
	@FindBy(xpath="//button[contains(@class,'btn in-cell table-export')]")
	WebElement RuleAssistant_export;
	
	@FindBy(xpath="//a[text()='Validation rule execution']")
	WebElement validationRuleExecution;
	
	@FindBy(xpath="//textarea[@name='selectedRuleIds']")
	WebElement validationRulesInput;
	
	@FindBy(xpath="//textarea[@name='productIds']")
	WebElement validateIds;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'runValidation($event)')]")
	WebElement validateProducts;
		
	@FindBy(xpath="//a[text()='Test results']")
	WebElement testResultsTab;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'searchTestRuns($event)')]")
	WebElement testRunTabSearch;
	
	@FindBy(xpath="//*[@id='ValidationRuleTestResults_830']/div/div[2]/form/div[1]/div/button[3]")
	WebElement testRunTabFilter;
	
	@FindBy(xpath="//input[contains(@input-binding,'viewControl.testRunsTable_filterExpression')]")
	WebElement testRunTabFilterInput;
	
	@FindBy(xpath="//table[@id='testRunsTable']//following::tbody/tr[1]/td[5]/span/button[1]")
	WebElement testRunTabEyeIcon;
	
	@FindBy(xpath="//form[@class='ng-pristine ng-valid ng-scope ng-valid-required ng-valid-pattern']/div/div/button[2]")
	WebElement testResultsTabFilter;
	
	@FindBy(xpath="//input[contains(@input-binding,'validationResults_filterExpression')]")
	WebElement testResultsTabFilterInput;
	
	@FindBy(xpath="//table[@id='validationResults']//following::button")
	WebElement testResultsTabExport;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.ruleValidationReportForSelectedTestRun)')]")
	WebElement testRun_totalRecords;
	
	@FindBy(xpath="//a[text()='Snapshot administration']")
	WebElement snapshotAdministration;
	
	@FindBy(xpath="//button[contains(@id,'ValidationSelectSnapshot_811_search')]")
	WebElement snapshotAdministrationShow;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'createSnapshot($event)')]")
	WebElement snapshotAdministrationCreate;
	
	@FindBy(xpath="//input[contains(@name,'ruleSnapshots_name')]")
	WebElement snapshotAdministrationName;
	
	@FindBy(xpath="//input[contains(@name,'ruleSnapshots_description')]")
	WebElement snapshotAdministrationDescription;
	
	@FindBy(xpath="//button[contains(@data-ng-if,'ruleSnapshotTable_rec === viewControl.editing_object')][1]")
	WebElement snapshotAdministrationSubmit;
	
	@FindBy(xpath="//*[@id='ValidationSelectSnapshot_811']//following::form/div[3]/div/div/button[1]")
	WebElement snapshotAdministrationSave;
	
	@FindBy(xpath="w//*[@id='ValidationSelectSnapshot_811']//following::form/div[1]/div/button[4]")
	WebElement snapshotAdministrationFilter;
	
	@FindBy(xpath="//input[contains(@input-binding,'viewControl.ruleSnapshotTable_filterExpression')]")
	WebElement snapshotAdministrationFilterInput;
	
	@FindBy(xpath="//*[@id='ruleSnapshotTable']/tbody/tr[1]/td[6]/span/button[3]")
	WebElement snapshotAdministrationProductive;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'enableDeleteSnapshots($event)')]")
	WebElement snapshotAdministrationDeletion;
	
	@FindBy(xpath="//*[@id='ruleSnapshotTable']/tbody/tr[1]/td[1]/span/input")
	WebElement snapshotAdministrationDeleteFirstRow;
	
	@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
	WebElement dateModified_columnHeader;
	
	@FindBy(xpath="//table//tbody//tr[1]//td//a")
	WebElement getRow1_dateModified;

public RulesAssistantPage() {
		PageFactory.initElements(driver, this);
	}	
public void ruleBasisTab() {
	warmup5();
	wait.until(ExpectedConditions.elementToBeClickable(ruleBasisTab));
	warmup5();
	ruleBasisTab.click();
	warmup5();
}
public void showCurrentRuleBasis()  {
	warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(showCurrentRuleBasis));
		warmup5();
		showCurrentRuleBasis.click();
		warmup5();
		warmup5();
	}

public void filterRule() {
	warmup5();
	warmup5();
	arrowVehicle.click();
	warmup5();
	filterRuleAssistant.click();
	warmup5();
	filterRuleAssistantInput.sendKeys("00003465");
	//003862
	warmup5();
}
public void showRule() {
	warmup5();
	showRuleIcon.click();
	warmup5();
	editRuleButton.click();
	warmup5();
//	deleteCodesFromRule.click();
	warmup5();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,-350)", "");			
	applyRuleButton.click();
	warmup5();
}
public void saveRule() {
	warmup5();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	warmup5();
	jse.executeScript("arguments[0].scrollIntoView()", saveButton);
	warmup5();
//	Actions act=new Actions(driver);
	warmup5();
	//act.moveToElement(saveButton).click().build().perform();
	saveButton.click();
	warmup5();
	filterRuleAssistant.click();
	warmup5();
	warmup5();
//	warmup5();
//	warmup5();
	arrowAxle.click();
	warmup5();
	warmup5();
	arrowAxle7.click();
	warmup5();
	warmup5();
	arrowAxle73.click();
	warmup5();
	warmup5();
	arrowAxle739.click();
	warmup5();
	warmup5();
}

//public void arrowAxle() {
//	warmup5();
//	warmup5();
//	warmup5();
//	arrowAxle.click();
//	warmup5();
//	warmup5();
//	arrowAxle7.click();
//	warmup5();
//	warmup5();
//	arrowAxle73.click();
//	warmup5();
//	warmup5();
//	arrowAxle739.click();
//	warmup5();
//	warmup5();
//}
public void arrowTransmission() {
	arrowTransmission.click();
	warmup5();
	arrowTransmission7.click();
	warmup5();
	warmup5();
	arrowTransmission71.click();
	warmup5();
	warmup5();
	arrowTransmission715.click();
	warmup5();
}
public void arrowVehicle() {
	warmup5();
	warmup5();
	arrowVehicle.click();
	warmup5();
	warmup5();
	arrowVehicle9.click();
	warmup5();
	warmup5();
	arrowVehicle96.click();
	warmup5();
	warmup5();
	arrowVehicle963.click();
	warmup5();
	warmup5();
}
public void filterRuleAssistant() {
	filterRuleAssistant.click();
	warmup5();
	warmup5();
	filterRuleAssistantInput.sendKeys("739");
	warmup5();
	warmup5();
	filterRuleAssistant.click();
	warmup5();
	warmup5();
}
public void RuleAssistant_export() {
	wait.until(ExpectedConditions.elementToBeClickable(RuleAssistant_export));
	warmup5();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", RuleAssistant_export);
	warmup6();
	String fileName= GetDownloadedFileName_NewTab();
	int dataCountInCSV= getRecordsCountInCSV(fileName);
	System.out.println("Verifying total records in table with number of entries in csv");
	Assert.assertEquals(getNumberOfEntries(), dataCountInCSV);
	warmup5();
	}
public int getNumberOfEntries() {
	String entriesTxt = RuleAssistant_totalRecords();
//	String[] aEntriesText = entriesTxt.split(" / ");
//	System.out.println(aEntriesText.length);
//	String totalEntriesText = aEntriesText[0];//1
	int i=Integer.parseInt(entriesTxt);
	System.out.println(entriesTxt);
	return i;
}
public String RuleAssistant_totalRecords() {
	String records=RuleAssistant_totalRecords.getText().trim();
	System.out.println(records);
	return records;
}
public void validationRuleExecutionTab() {
	warmup5();
	wait.until(ExpectedConditions.elementToBeClickable(validationRuleExecution));
	warmup5();
	validationRuleExecution.click();
	warmup5();
}
public void validationRuleExecutionInput() {
	Select dropdown =new Select(driver.findElement(By.name("validationAction")));
	dropdown.selectByIndex(4);
	warmup6();
	validationRulesInput.clear();
	warmup5();
	validationRulesInput.sendKeys("00003862");
	validateIds.clear();
	validateIds.sendKeys("WDD2054872Z000004,WDD2054872Z712459,WDD2054872Z000001,WDD2054872Z000002");
	warmup5();
	}
public void validateProducts() {
	validateProducts.click();
	warmup5();
	warmup1();
	warmup5();
}
public void testResultsTab() {
	wait.until(ExpectedConditions.elementToBeClickable(testResultsTab));
	testResultsTab.click();
	warmup6();	
}
public void testRunTabSearch() {
	warmup5();
	testRunTabSearch.click();
}
public void testRunTabFilter() {
	wait.until(ExpectedConditions.elementToBeClickable(testRunTabFilter));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", testRunTabFilter);
	warmup5();
	warmup5();
	testRunTabFilterInput.sendKeys(prop.getProperty("username"));
	warmup5();
}
public void testRunReport() {
	testRunTabEyeIcon.click();
	warmup();	
}
public void testResultsTabFilter() {
	wait.until(ExpectedConditions.elementToBeClickable(testResultsTabFilter));
	testResultsTabFilter.click();
	testResultsTabFilterInput.sendKeys("true");
	warmup5();
	testResultsTabFilter.click();
}
public void testResultsTabExport() {
	warmup5();
	wait.until(ExpectedConditions.elementToBeClickable(testResultsTabExport));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", testResultsTabExport);
	warmup6();
	String fileName= GetDownloadedFileName_NewTab();
	int dataCountInCSV= getRecordsCountInCSV(fileName);
	System.out.println("Verifying total records in table with number of entries in csv");
	Assert.assertEquals(getNumberOfEntries_Testrun(), dataCountInCSV);
	}
public int getNumberOfEntries_Testrun() {
	String entriesTxt = testRun_totalRecords();
//	String[] aEntriesText = entriesTxt.split(" / ");
//	System.out.println(aEntriesText.length);
//	String totalEntriesText = aEntriesText[0];//1
	int i=Integer.parseInt(entriesTxt);
	System.out.println(entriesTxt);
	return i;
}
public String testRun_totalRecords() {
	String records=testRun_totalRecords.getText().trim();
	System.out.println(records);
	return records;	
}
public void snapshotAdministration() {
	warmup5();
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministration));
	warmup5();
	snapshotAdministration.click();
	warmup5();
}

public void snapshotAdministrationShow() {
	warmup5();
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationShow));
	snapshotAdministrationShow.click();
	warmup6();	
}
public void snapshotAdministrationCreate() {
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationCreate));
	snapshotAdministrationCreate.click();
	warmup6();	
	snapshotAdministrationName.sendKeys("Snapshot "+date2);
	warmup6();
	snapshotAdministrationDescription.sendKeys("Test run via automation");
	warmup6();
	snapshotAdministrationSubmit.click();
	snapshotAdministrationSave.click();
	warmup4();
}
public void snapshotAdministrationFilter() {
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationFilter));
	snapshotAdministrationFilter.click();
	warmup6();	
	snapshotAdministrationFilterInput.sendKeys(prop.getProperty("username"));
	warmup6();
}
public void snapshotAdministrationProductive() {
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationProductive));
	snapshotAdministrationProductive.click();
	warmup6();	
	snapshotAdministrationFilter.click();
	warmup6();	
}
public void snapshotAdministrationDeletion() {
	snapshotAdministrationDeletion.click();
	warmup6();	
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationDeleteFirstRow));
	snapshotAdministrationDeleteFirstRow.click();
	warmup6();	
	snapshotAdministrationDeletion.click();
	warmup1();	
	warmup6();	
}
public void snapshotAdministrationNonProductive() {
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationFilter));
	snapshotAdministrationFilter.click();
	warmup6();
	snapshotAdministrationFilterInput.sendKeys("JBRAACK");
	warmup6();	
	wait.until(ExpectedConditions.elementToBeClickable(snapshotAdministrationProductive));
	snapshotAdministrationProductive.click();
	snapshotAdministrationFilter.click();
	warmup6();	
}
public void revertRule() {
	showRuleIcon.click();
	editRuleButton.click();
	warmup6();
	codeTableRuleButton.click();
	addCodesCriterionRuleButton.click();
	Select dropdown =new Select(driver.findElement(By.name("extendedApplicationConstraint_codeGroups_codeConstraints_negationFlag")));
	dropdown.selectByIndex(2);
	warmup6();
	codesCriterionDescription.sendKeys("018");
	codesCriterionSubmit.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,-350)", "");			
	applyRuleButton.click();
	warmup6();
	}

public String GetDownloadedFileName_NewTab(){
	warmup5();
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("window.open()");
		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(opentabs.get(1));
		//driver.get("C:\\Users\\Administrator.VSI-AUTOTEST-VE\\Downloads");
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
public int getRecordsCountInCSV(String csvFileName) {
	//String downloadPath = "C:\\Users\\Administrator.VSI-AUTOTEST-VE\\Downloads";
	String downloadPath = "C:\\Users\\deenara\\Downloads";
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
}
