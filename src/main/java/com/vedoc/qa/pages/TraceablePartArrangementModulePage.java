package com.vedoc.qa.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.vedoc.qa.base.TestBase;

public class TraceablePartArrangementModulePage extends TestBase {

	@FindBy(id="ProtectedControlUnitVerificationList_755_search")
	WebElement SearchButton;

	@FindBy(xpath="//tr[contains(@class,'ng-scope selected')]")
	List<WebElement> FirstEntry;

	@FindBy(xpath="//span[@class='cell-icon rc-i-line-delegate-circle']")
	WebElement FirstArrowlink;

	@FindBy(xpath="//*[@id='MajAssySearch_002']/div/div[2]/form/div[1]/div[2]/span")
	WebElement Engineno;

	@FindBy(xpath="//*[@id='MajAssySearch_002']/div/div[2]/form/div[2]/div[2]/span")
	WebElement VarientNo;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[4]/div[2]")
	WebElement PartNo;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[6]/div[2]/div")
	WebElement currently_VIN;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[3]/div[2]/div/span[1]")
	WebElement pageVarient;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[11]/div/div[1]/div[2]/span")
	WebElement lastmodification;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[2]/div[4]")
	WebElement OrderNumber;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[3]/div[4]")
	WebElement ProductionNumber;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[11]/div/div[1]/div[4]")
	WebElement instanceversion;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[4]/div[4]")
	WebElement ProductionPlant;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[6]/div[4]")
	WebElement ShipmentDate;

	@FindBy(xpath="//*[@id='MajAssyEngineIdentification_400']/div/div[2]/form/div[8]/div[4]/span")
	WebElement Status;

	@FindBy(xpath="//button[contains(@data-ng-click,'toggleFilter')]")
	WebElement FilterButton;

	@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
	WebElement FilterSearchText;

	@FindBy(xpath="//a[contains(@data-ng-click,'AccessLogging_382')]")
	WebElement LoggingOf_Xfunction;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'AccessLogging_382')])[2]")
	WebElement LoggingOf_Function_FilterButton;
	
	@FindBy(xpath="(//input[contains(@input-binding,'accessLog_filterExpression')])")
	WebElement LoggingOfXFunction_FilterText;

	@FindBy(name="IdCodeUsage")
	WebElement Logging_Dropdown;

	@FindBy(id="AccessLogging_382_search")
	WebElement Logging_SearchButton;

	@FindBy(xpath="//tr[contains(@data-ng-click,'accessLog_rec')]")
	List<WebElement> LoggingOf_Xfunction_FirstEntry;

	@FindBy(xpath="//a[contains(@data-ng-click,'ModificationHistory_282')]")
	WebElement HistoryTab;

	@FindBy(xpath="//form[contains(@name,'ModificationHistory')]//input[@name='IdCode']")
	WebElement History_IdCode;
	
	@FindBy(id="ModificationHistory_282_search")
	WebElement HistorySearch_button;

	@FindBy(xpath="(//select[@data-ng-model='viewControl.IdCodeUsage'])[2]")
	WebElement History_Dropdown;

	@FindBy(xpath="//tr[contains(@data-ng-click,'historyTable_rec')]")
	List<WebElement> HistoryTable_FirstEntry;

	@FindBy(xpath="//button[contains(@data-ng-click,'showExcludedEntries($event)')]")
	WebElement TechnicalEntryButton;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'ModificationHistory_282')])[3]")
	WebElement HistoryTable_FilterButton;
	
	@FindBy(xpath="(//input[contains(@input-binding,'historyTable_filterExpression')])")
	WebElement HistoryTable_FilterText;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.XfunctionsArrangement.visible')]")
	WebElement XfunctionsTab;

	@FindBy(name="randomNumber")
	WebElement FourCharacterNumber;

	@FindBy(xpath="(//input[contains(@name,'idCode')])[2]")
	WebElement IDCode;

	@FindBy(xpath="//select[contains(@name,'calculationType')]")
	WebElement CalculationType;

	@FindBy(xpath="//button[contains(@data-ng-click,'generate($event)')]")
	WebElement GenerateNumberButton;

	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.encryptedRandomNumber')]")
	WebElement RandomNumberGenerated;

	@FindBy(xpath="//button[contains(@data-ng-click,'reset($event)')]")
	WebElement ResetEntryButton;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.SeedAndKeyArrangement.visible')]")
	WebElement SeedandKeyButton;

	@FindBy(xpath="//input[contains(@name,'toolId')]")
	WebElement LEDToolID;

	@FindBy(xpath="//input[contains(@name,'majorAssemblyId')]")
	WebElement MajorAssemblyNumber;

	@FindBy(xpath="(//input[@name='idCode'])[2]")
	WebElement SeedandKey_IDCode_button;

	@FindBy(xpath="(//input[contains(@name,'oemId')])")
	WebElement LEDOEMID;

	@FindBy(xpath="(//input[contains(@name,'dtcEraseData')])")
	WebElement DTC_DeletionDates;

	@FindBy(xpath="(//input[contains(@name,'myId')])")
	WebElement MyID;

	@FindBy(xpath="(//input[contains(@name,'seed')])")
	WebElement Seed;

	@FindBy(xpath="(//input[contains(@name,'comment')])")
	WebElement Comment;

	@FindBy(xpath="(//button[contains(@data-ng-click,'generate($event)')])[1]")
	WebElement GenerateKey;

	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.unlockKey')])")
	WebElement KeyText;

	@FindBy(xpath="//span[contains(@data-ng-bind,'::viewUIObject.titles.AccessLogging_383')]")
	WebElement LoggingSKTab;

	@FindBy(xpath="//input[contains(@name,'majorAssemblyIdComponent')]")
	WebElement MajorAssemblyID;

	@FindBy(xpath="//button[contains(@id,'AccessLogging_383_search')]")
	WebElement SearchButton_MajorAssemblyID;

	@FindBy(xpath="//tr[contains(@data-ng-click,'protocolTable_rec')]")
	List<WebElement> Contents_LoggingSKTab;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'AccessLogging_383')])[2]")
	WebElement LoggingSKTab_FilterButton;
	
	@FindBy(xpath="(//input[contains(@input-binding,'protocolTable_filterExpression')])")
	WebElement LoggingSKTab_FilterText;
	
	@FindBy(xpath="//input[@name='numberOfKeys']")
	WebElement xfunction_NumberofKeys;
	
	@FindBy(xpath="//input[@name='keyTransponderCode']")
	WebElement xfunction_Transponder;
	
	@FindBy(xpath="//input[@name='checksum']")
	WebElement xfunction_Checksum;

	@FindBy(xpath="//span[@data-ng-bind-html='::alert.msg']")
	WebElement controlUnit_AlertMsg;
	
	@FindBy(xpath="//span[@data-ng-bind-html='::alert.msg']")
	WebElement controlUnit_AlertMsg_Close;
	@FindBy(xpath = "//*[@id='-65bb54bc:12f500f055c:-7fff']")
	WebElement ID_Code;

	public void SearchButton(){
		wait.until(ExpectedConditions.visibilityOf(SearchButton));
		SearchButton.click();
	}
    public void passIdCode(){
		ID_Code.sendKeys("00 00 00 03");
	}
	public String FirstEntryValidation(){
		String FirstEntryContents=null;
		for(WebElement FirstEntryText: FirstEntry){
			FirstEntryContents=	FirstEntryText.getText();
		}
		return FirstEntryContents;
	}

	public void FirstArrowlink() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(FirstArrowlink));
		FirstArrowlink.click();
		Thread.sleep(45000);
	}

	public TraceablePartArrangementModulePage() {
		PageFactory.initElements(driver, this);
	}

	public String EngineNo() {
		wait.until(ExpectedConditions.visibilityOf(Engineno));
		String Engine_value=Engineno.getText();
		return Engine_value;
	}

	public String VarientNo() {
		String VarientNo_value=VarientNo.getText();
		return VarientNo_value;
	}

	public String partNo() {
		String PartNo_value=PartNo.getText();
		System.out.println(PartNo_value);
		return PartNo_value;
	}

	public String currently_VINNumber() {
		String currently_VIN_value=currently_VIN.getText();
		return currently_VIN_value;
	}

	public String pageVarient() {
		String pageVarient_value=pageVarient.getText();
		return pageVarient_value;
	}

	public String lastmodificationDate() {
		String lastmodification_value=lastmodification.getText();
		return lastmodification_value;
	}

	public String OrderNumber() {
		String OrderNumber_value=OrderNumber.getText();
		return OrderNumber_value;
	}

	public String ProductionNumber() {
		String ProductionNumber_value=ProductionNumber.getText();
		return ProductionNumber_value;
	}

	public String instanceversionNumber() {
		String instanceversion_value=instanceversion.getText();
		return instanceversion_value;
	}

	public String ProductionPlant() {
		String ProductionPlant_value=ProductionPlant.getText();
		return ProductionPlant_value;
	}

	public String ShipmentDate() {
		String ShipmentDate_value=ShipmentDate.getText();
		return ShipmentDate_value;
	}

	public String Status() {
		String Status_value=Status.getText();
		return Status_value;
	}

	public void SwitchingWindow(){

		Set<String> handles=driver.getWindowHandles();

		Iterator<String> it=	handles.iterator();

		//			
		String parentwindowID=it.next();
		String childwindowID=it.next();

		warmup();

		//			driver.switchTo().window(childwindowID);

		//			warmup1();

		driver.switchTo().window(childwindowID);

	}

	public void SwitchingToParentWindow(){

		Set<String> handles=driver.getWindowHandles();

		Iterator<String> it=	handles.iterator();

		//			
		String parentwindowID=it.next();
		String childwindowID=it.next();

		warmup();

		//			driver.switchTo().window(childwindowID);

		//			warmup1();

		driver.switchTo().window(parentwindowID);

	}

	public void FilterButtonFunctionality(){

		warmup();

		wait.until(ExpectedConditions.visibilityOf(FilterButton));
		FilterButton.click();
	}

	public void FilterSearchText(){
		wait.until(ExpectedConditions.visibilityOf(FilterSearchText));
		FilterSearchText.sendKeys("541");
		FilterSearchText.sendKeys(Keys.ENTER);

	}

	public void CancelFilterButtonFunctionality(){
		wait.until(ExpectedConditions.visibilityOf(FilterButton));
		FilterButton.click();
	}

	public void LoggingOf_Xfunction(){
		wait.until(ExpectedConditions.visibilityOf(LoggingOf_Xfunction));
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();", LoggingOf_Xfunction);
		js.executeScript("arguments[0].click();", LoggingOf_Xfunction);

	}

	public void Logging_Dropdown(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(Logging_Dropdown));
		Select dropdown=new Select(Logging_Dropdown);
		dropdown.selectByValue("string:C");	
	}

	public void Logging_SearchButton(){
		wait.until(ExpectedConditions.visibilityOf(Logging_SearchButton));
		Logging_SearchButton.click();
	}

	public String LoggingOf_Xfunction_FirstEntry(){
		warmup5();
		String FirstEntry=null;
		for(WebElement LoggingOf_Xfunction_FirstEntry_Content : LoggingOf_Xfunction_FirstEntry){
			FirstEntry=LoggingOf_Xfunction_FirstEntry_Content.getText();
		}
		return FirstEntry;
	}


	public void Logging_DropdownUsage(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(Logging_Dropdown));
		Select dropdown=new Select(Logging_Dropdown);
		dropdown.selectByValue("string:R");	
	}

	public void HistoryTab(){
		wait.until(ExpectedConditions.visibilityOf(HistoryTab));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", HistoryTab);
		js.executeScript("arguments[0].click();", HistoryTab);
	}

	public void History_IdCode(){
		wait.until(ExpectedConditions.visibilityOf(History_IdCode));
		History_IdCode.sendKeys("11111111");
	}
	
	public void HistorySearch_button(){
		wait.until(ExpectedConditions.visibilityOf(HistorySearch_button));
		HistorySearch_button.click();
	}

	public void History_Dropdown(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(History_Dropdown));
		js.executeScript("arguments[0].click();", History_Dropdown);
		Select dropdown1=new Select(History_Dropdown);
		dropdown1.selectByValue("string:R");
	}

	public String HistoryTable_FirstEntry() throws InterruptedException{
		warmup();
		String Contents=null;
		for(WebElement HistoryTable_FirstEntry_Contents: HistoryTable_FirstEntry){
			Contents= HistoryTable_FirstEntry_Contents.getText();
		}
		return Contents;
	}

	public void TechnicalEntryButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(TechnicalEntryButton));
		TechnicalEntryButton.click();
	}

	public void XfunctionsTab(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(XfunctionsTab));
		js.executeScript("arguments[0].scrollIntoView();", HistoryTab);
//		js.executeScript("arguments[0].click();", XfunctionsTab);
		XfunctionsTab.click();
	}

	public void FourCharacterNumber(){
		FourCharacterNumber.click();
		FourCharacterNumber.sendKeys(RandomPaintCode);
	}

	public WebElement IDCode(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(IDCode));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", IDCode);
		//		IDCode.click();
		IDCode.sendKeys("00000009");
		warmup5();
		return IDCode;
	}

	public void calculationType_X1(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:X1");
	}
	
	public void calculationType_X2(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:X2");
	}
	
	public void calculationType_X5(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:X5");
	}
	
	public void calculationType_X6(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:X6");
	}
	
	public void calculationType_X7(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:X7");
	}
	
	public void calculationType_X8(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:X8");
	}
	
	public void calculationType_XA(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:XA");
	}
	
	public void calculationType_XN(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:XN");
	}
	
	public void calculationType_XT(){
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		option.selectByValue("string:XT");
	}
	
	public ArrayList<String> CalculationType_Dropdown(){
		warmup();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(CalculationType));
		js.executeScript("arguments[0].click();", CalculationType);
		Select option=new Select(CalculationType);
		String dropdownOptions=null;
	    ArrayList<String> dropdown = new ArrayList<String>();
	    List<WebElement> allOptions = option.getOptions();
//	    Iterator<WebElement> itr = allOptions.iterator();
//	    while (itr.hasNext()) {
//	        String st = itr.next().getText();
//	        dropdown.add(st);
//	     }
//	    System.out.println(dropdown);
	    int i=1;
	    for(WebElement e: allOptions){
	    dropdownOptions=	e.getText();
	    System.out.println(dropdownOptions);
	    i++;
	    dropdown.add(dropdownOptions);

	    }
		return dropdown;

		
	}

	public void GenerateNumberButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(GenerateNumberButton));
		GenerateNumberButton.click();
	}

	public String RandomNumberGenerated(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(RandomNumberGenerated));
		String number=	RandomNumberGenerated.getText();
		return number;
	}

	public void ResetEntryButton(){
		warmup5();
		ResetEntryButton.click();
		warmup1();
	}

	public void SeedandKeyButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(SeedandKeyButton));
		SeedandKeyButton.click();
	}

	public void LEDToolID(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(LEDToolID));
		LEDToolID.click();
		LEDToolID.clear();
		LEDToolID.sendKeys("1111111111");
	}

	public void MajorAssemblyNumber(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(MajorAssemblyNumber));
		js.executeScript("arguments[0].click();", MajorAssemblyNumber);
		//		MajorAssemblyNumber.click();
		MajorAssemblyNumber.clear();
		MajorAssemblyNumber.sendKeys("54192200006017");
	} 


	public void SeedandKey_IDCode_button(){
		Comment.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOf(SeedandKey_IDCode_button));
		js.executeScript("arguments[0].click();", SeedandKey_IDCode_button);
		SeedandKey_IDCode_button.clear();
		SeedandKey_IDCode_button.sendKeys("00000001");
	}  

	public void LEDOEMID(){
		wait.until(ExpectedConditions.visibilityOf(LEDOEMID));
		LEDOEMID.click();
		LEDOEMID.clear();
		LEDOEMID.sendKeys("111111111");
	}  


	public void DTC_DeletionDates(){
		wait.until(ExpectedConditions.visibilityOf(DTC_DeletionDates));
		DTC_DeletionDates.click();
		DTC_DeletionDates.clear();
		DTC_DeletionDates.sendKeys("08/28/2013 9:15:12 AM");
	}  

	public WebElement MyID(){
		wait.until(ExpectedConditions.visibilityOf(MyID));
		MyID.click();
		Seed.clear();
		MyID.sendKeys("C0");
		return MyID;
	} 

	public void Seed(){
		wait.until(ExpectedConditions.visibilityOf(Seed));
		Seed.click();
		Seed.clear();
		Seed.sendKeys("2121");
	} 

	public void Comment(){
		wait.until(ExpectedConditions.visibilityOf(Comment));
		Comment.click();
		Comment.clear();
		Comment.sendKeys("Customized message by MBRDI");
	} 

	public void GenerateKey(){
		wait.until(ExpectedConditions.visibilityOf(GenerateKey));
		GenerateKey.click();
		warmup5();
	} 

	public String KeyText(){
		wait.until(ExpectedConditions.visibilityOf(KeyText));
		String Key=	KeyText.getText();
		return Key;
	}

	public void LoggingSKTab(){
		wait.until(ExpectedConditions.visibilityOf(LoggingSKTab));					
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", LoggingSKTab);
		js.executeScript("arguments[0].click();", LoggingSKTab);	
	}

	public void MajorAssemblyID(){
		wait.until(ExpectedConditions.visibilityOf(MajorAssemblyID));
		MajorAssemblyID.click();
		MajorAssemblyID.sendKeys("54192200006017");
	}

	public void SearchButton_MajorAssemblyID(){
		wait.until(ExpectedConditions.visibilityOf(SearchButton_MajorAssemblyID));
		SearchButton_MajorAssemblyID.click();
	}

	public String Contents_LoggingSKTab(){
		warmup();
		String TableContents=null;
		for(WebElement contents: Contents_LoggingSKTab){
			TableContents=contents.getText();
		}
		return TableContents;
	}
	
	public void LoggingOf_Function_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(LoggingOf_Function_FilterButton));
		LoggingOf_Function_FilterButton.click();
	}
	
	public void LoggingOfXFunction_FilterText(){
		warmup();
		LoggingOfXFunction_FilterText.click();
		LoggingOfXFunction_FilterText.sendKeys("92692000629138");
		LoggingOfXFunction_FilterText.sendKeys(Keys.ENTER);
		warmup5();
	}
	
	public void HistoryTable_FilterButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(HistoryTable_FilterButton));
		HistoryTable_FilterButton.click();
	}
	
	public void HistoryTable_FilterText(){
		warmup();
		HistoryTable_FilterText.click();
		HistoryTable_FilterText.sendKeys("C-factor");
		HistoryTable_FilterText.sendKeys(Keys.ENTER);
	}
	
	public void LoggingSKTab_FilterButton(){
		warmup();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		wait.until(ExpectedConditions.visibilityOf(LoggingSKTab_FilterButton));
////		js.executeScript("arguments[0].scrollIntoView();", LoggingSKTab);
//		js.executeScript("arguments[0].click();", LoggingSKTab_FilterButton);
		LoggingSKTab_FilterButton.click();
	}
	
	public void LoggingSKTab_FilterText(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(LoggingSKTab_FilterText));
		LoggingSKTab_FilterText.click();
		LoggingSKTab_FilterText.sendKeys("00000001");
		LoggingSKTab_FilterText.sendKeys(Keys.ENTER);
	}
	
	public void xfunction_NumberofKeys(){
		xfunction_NumberofKeys.sendKeys("1");
	}
	
	public void xfunction_transponder(){
		xfunction_Transponder.sendKeys("1211111111");
	}
	
	public void xfunction_Checksum(){
		xfunction_Checksum.sendKeys("XXX");
	}
	
	public boolean controlUnit_AlertMsg() {
		if (controlUnit_AlertMsg.isDisplayed()) {
						return true;
					} else {
						return false;
					}
				}
	
public  void controlUnit_AlertMsg_Close() {
	controlUnit_AlertMsg_Close.click();
}

public String controlUnit_AlertMsg_GetText() {
	String alertMsg=controlUnit_AlertMsg.getText();
	return alertMsg;
}
}
