package com.vedoc.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vedoc.qa.base.TestBase;

public class PartsIdentificationPage extends TestBase{
	
	@FindBy(xpath="//input[@name='_localSearchCrit1']")
	WebElement SearchInput;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'pISearchNext($event)')]")
	WebElement NextButton;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.sparePartVariant.variantObjectNumber')]")
	WebElement RPObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.sparePartVariant.modelDesignationBase')]")
	WebElement RPModelDesignation;
	
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.sparePartVariant.partsCode')]")
	WebElement PartsCode;
	
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.sparePartVariant.designation')]")
	WebElement Designation;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.seriesVariant.variantObjectNumber')]")
	WebElement SeriesVariant;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.sparePartVariant.salesDesignation')]")
	WebElement SalesDesignation;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.seriesVariant.modelDesignationBase')]")
	WebElement SVmodelDesignation;	
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.titles.PIShortblock_515')]")
	WebElement SparePartMajorAssembly;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.sparePartVariant.infoText[0].text')]")
	WebElement SparePart_Information;
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.PISaaNumbers_513.visible')]")
	WebElement SAANumbersTab;
	
	@FindBy(id="saaTable")
	WebElement SAANumbersTab_saaTable;
	
	@FindBy(xpath="//*[@id=\"PISaaNumbers_513\"]/div/div[2]/form/div[1]/div/button/span[2]")
	WebElement SAANumbersTab_FilterButton;
	
	@FindBy(xpath="//*[@id=\"PISaaNumbers_513\"]/div/div[2]/form/div[2]/div/div/ng-form/div/div/input")
	WebElement SAANumbersTab_SearchText;
	
	@FindBy(xpath="//*[@id=\"PISaaNumbers_513\"]/div/div[2]/form/div[1]/div/button/span[2]")
	WebElement SAANumbersTab_CancelFilterButton;
	
	@FindBy(xpath="//*[@id=\"saaTable\"]/thead/tr/th[1]/div[1]/a")
	WebElement SAANumbersTab_Sort;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.ExchangePartsArrangement.visible')]")
	WebElement SpartPartTab;
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.PIFootnotes_514.visible')]")
	WebElement FootNoteTab;
	
	@FindBy(id="footnotes")
	WebElement FottNoteTab_Contents;
	
	@FindBy(id="footnoteText")
	WebElement FootNoteTextContents;
	
	@FindBy(xpath="//span[contains(@data-ng-show,'footnotes_desc')]")
	WebElement FootNoteTab_Sort;
	//Vishakha-U-076:
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.PIEtuv_526.visible')]")
	WebElement RPSubVariantsTab;
	
	@FindBy(xpath="//span[contains(@data-ng-show,\\\"!sparePartVariant_variantElement_desc && sparePartVariant_variantElement_sort === 'elementId'\\\")]")
	WebElement RPSubVariantsTab_Sort;
	
	@FindBy (xpath="//span[contains(@data-ng-show,\"sparePartVariant_variantElement_desc && sparePartVariant_variantElement_sort === 'partsCode.designation[0].text'\")]")
	WebElement RPSubVariantDesignationTab_Sort;
	
	@FindBy(xpath="//table[@id='sparePartVariant_variantElement']/thead/tr/th")
	WebElement RPSubVariantsTab_Contents;
	
	@FindBy(xpath="//table[@id='sparePartVariant_variantElement']/thead/tr/th[2]")
	WebElement RPSubVariantsDesignationTab_Contents;
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.PIBasicMajorAssembly_515.visible')]")
	WebElement SparePartPartialMajorAssemblyTab;
	
	@FindBy(xpath="//div[@class='tab-pane active']")
	WebElement SparePartPartialMajorAssembly_Contents;
	
	@FindBy(id="PIBasicMajorAssembly_515_search")
	WebElement SparePartPartialMajorAssembly_ShowVariant;
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.PISuv_525.visible')]")
	WebElement SeriesSubVariantTab;
	
	@FindBy(xpath="//table[@id='seriesVariant_variantElement']/thead/tr/th")
	WebElement SeriesSubVariantTab_Contents;
	
	@FindBy(xpath="//table[@id='seriesVariant_variantElement']/thead/tr/th[2]")
	WebElement SeriesSubVariantDesignationTab_Contents;
	//over
	@FindBy(xpath="//a[contains(@data-ng-click,'PILastModificationDate_516')]")
	WebElement LastModificationTab;
	
	@FindBy(xpath="//a[contains(@data-ng-click,'PIBasicMajorAssembly_515')]")
	WebElement SparePartPartialAssembly;
	
	@FindBy(id="PIBasicMajorAssembly_515_search")
	WebElement ShowVariant_button;
	
	String parentwindowID;
	String childwindowID;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.PIPartFamily_530.visible')]")
	WebElement NoteInfo_C74Tab;
	
	@FindBy(name="partNumber")
	WebElement NoteInfo_C74Tab_Search;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'partInFamilyResult.partNumberrr')]")
	WebElement NoteInfo_C74Tab_PartNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.partInFamilyResult.text')]")
	WebElement NoteInfo_C74Tab_InfoText;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.PIPartNumberRecoding_540.visible')]")
	WebElement PartRecosingTab;
	
	@FindBy(name="localObjectNoSupplier")
	WebElement PartRecosingTab_Search;
	
	@FindBy(xpath="//span[@data-ng-bind='viewControl.lastModificationDates']")
	WebElement LastModification_Content;
	
	@FindBy(name="sPObjectNumber")
	WebElement RPObjectnumber_Checkbox;
	
	@FindBy(xpath="//span[@data-ng-bind='::viewUIObject.titles.PIFdokAData_512']")
	WebElement InformationTab;
	
	
	
	
	public PartsIdentificationPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void DropdownFunctionalityOf_PartsIdentificationTab(){
		
		String arr[]={"RP object number", "SV model designation", "Series variant + SV model designation", "Parts code" };
		warmup();

		Select s1=new Select(driver.findElement(By.name("searchType")));

		
		List<WebElement>search_list=s1.getOptions();
		System.out.println("Size of the dropdown list is: "+search_list.size());
		int count=0;
		int i;
		for (i=0;i<search_list.size();i++){
			

			if((arr[i].equals(search_list.get(i).getText()))){
				count++;

			}

		}

		if(count==arr.length){
			System.out.println("The search list items are displayed as expected & they are"+ Arrays.asList(arr));
		}
		else{
			System.out.println("The search list items not displayed as expected: " +arr[i]);

		}
	}
	
	public void SearchInput(){
		
		warmup();
		
		SearchInput.click();
		
		SearchInput.sendKeys("X009890098");
		
		SearchInput.sendKeys(Keys.ENTER);
		
		
	}
	
	public void SearchInput_ByPartsCode(){
		
		warmup();
		
		Select partsCode=new Select(driver.findElement(By.name("searchType")));
		
		partsCode.selectByValue("string:SPObjectNumber");
		
		warmup();
		
		SearchInput.click();
		
		SearchInput.sendKeys("X210800209");
		
		SearchInput.sendKeys(Keys.ENTER);
		warmup4();   
		
		
		
	}
	public void searchInput_ByRPObjectNo(){

		warmup();

		Select partsCode=new Select(driver.findElement(By.name("searchType")));

		partsCode.selectByValue("string:SPObjectNumber");

		warmup();

		SearchInput.click();

		SearchInput.sendKeys("X210800064");

		SearchInput.sendKeys(Keys.ENTER);
		warmup4();



	}
	
	public void SearchInput_ByModelDesignation(){
		
		warmup();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
//
		js.executeScript("arguments[0].scrollIntoView();", SpartPartTab);
		
		warmup();
		
		Select partsCode=new Select(driver.findElement(By.name("searchType")));
		
		partsCode.selectByValue("string:SVModelDesignation");
		
		warmup();
		
		RPObjectnumber_Checkbox.click();
		
		warmup();
		
		SearchInput.click();
		
		SearchInput.sendKeys("542960");
		
		warmup();
		
	//	SearchInput.sendKeys(Keys.ENTER);
		
		NextButton.click();
		}
	
public void SearchInput_BySV_SVModelDesignation(){
		
		warmup();
		
		Select partsCode=new Select(driver.findElement(By.name("searchType")));
		
		partsCode.selectByValue("string:SeriesVariantAndSVModelDesignation");
		
		warmup();
		
		SearchInput.click();
		
		SearchInput.sendKeys("X410000003");
		
		SearchInput.sendKeys(Keys.ENTER);
		
		
	}
	
	public String RPObjectNumber(){
		
		warmup1();
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(RPObjectNumber));

		
		String RPObjectNumber_ThinClient=RPObjectNumber.getText();
		return RPObjectNumber_ThinClient;
	}
	
	public String RPModelDesignation(){
		
		warmup();
		
		String RPModelDesignation_ThinClient=RPModelDesignation.getText();
		
		return RPModelDesignation_ThinClient;
	}
	
	public String PartsCode(){
		
		warmup();
		
		String PartsCode_ThinClient=PartsCode.getText();
		return PartsCode_ThinClient;
	}

	public String Designation(){
		
		warmup();
		
		String Designation_ThinClient=Designation.getText();
		return Designation_ThinClient;
	}
	
	public String SeriesVariant(){
		
		warmup();
		
		String SeriesVariant_ThinClient=SeriesVariant.getText();
		return SeriesVariant_ThinClient;
	}
	
	public String SalesDesignation(){
		
		warmup();
		
		String SalesDesignation_ThinClient=SalesDesignation.getText();
		return SalesDesignation_ThinClient;
	}
	
	public String SVmodelDesignation(){
		
		warmup();
		
		String SVmodelDesignation_ThinClient=SVmodelDesignation.getText();
		return SVmodelDesignation_ThinClient;
	}
	
	public String SparePart_Information(){
		
		warmup();
		
		String SparePart_Information_ThinClient=SparePart_Information.getText();
		
		return SparePart_Information_ThinClient;
		
	}
	
	public void SAANumbersTab(){
		warmup4();
		
		wait.until(ExpectedConditions.visibilityOf(SAANumbersTab));

		SAANumbersTab.click();
	}
	
	public String SAANumbersTab_saaTable(){
		
		warmup();
		
		String SAANumbersTab_saaTable_ThinClient=SAANumbersTab_saaTable.getText();
		return SAANumbersTab_saaTable_ThinClient;
	}
	
	public void SAANumbersTab_FilterButton(){
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(SAANumbersTab_FilterButton));
		
		SAANumbersTab_FilterButton.click();
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(SAANumbersTab_SearchText));
		
		SAANumbersTab_SearchText.sendKeys("310");
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(SAANumbersTab_CancelFilterButton));
		
		SAANumbersTab_CancelFilterButton.click();
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(SAANumbersTab_Sort));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//	SAANumbersTab_Sort.click();
		js.executeScript("arguments[0].click();", SAANumbersTab_Sort);
		
		js.executeScript("arguments[0].scrollIntoView();", SpartPartTab);	
	}
	
	public void FoorNoteTab(){
		
		warmup6();
		
		wait.until(ExpectedConditions.visibilityOf(FootNoteTab));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", FootNoteTab);

		
		FootNoteTab.click();
	}
	
	public String FottNoteTab_Contents(){
		
		warmup5();
		
		String FottNoteTab_Contents_ThinClient=FottNoteTab_Contents.getText();
		
	String Expected_FottNoteTab_Contents_ThinClient=FottNoteTab_Contents_ThinClient.substring(11);
		
		return Expected_FottNoteTab_Contents_ThinClient;
	}
	
	public void FootNoteTab_Sort(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(FootNoteTab_Sort));
		FootNoteTab_Sort.click();
	}
	//VIshakha
public void RPSubVariantsTab(){
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(RPSubVariantsTab));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", RPSubVariantsTab);

		RPSubVariantsTab.click();
	}

public void RPSubVariantTab_Sort(){
	warmup();
	wait.until(ExpectedConditions.visibilityOf(RPSubVariantsTab_Sort));
	RPSubVariantsTab_Sort.click();
	}
	
public void RPSubVariantDesignationTab_Sort(){
	warmup();
	wait.until(ExpectedConditions.visibilityOf(RPSubVariantDesignationTab_Sort));
	RPSubVariantDesignationTab_Sort.click();
	}

public String RPSubVariantsTab_Contents(){
	
	warmup5();
	
	String RPSubVariantsTab_Contents_ThinClient=RPSubVariantsTab_Contents.getText();
	
String Expected_RPSubVariantsTab_Contents_ThinClient=RPSubVariantsTab_Contents_ThinClient.substring(11);
	
	return Expected_RPSubVariantsTab_Contents_ThinClient;
}

public String RPSubVariantsDesignationTab_Contents(){
	
	warmup5();
	
	String RPSubVariantsDesignationTab_Contents_ThinClient=RPSubVariantsDesignationTab_Contents.getText();
	
String Expected_RPSubVariantsDesignationTab_Contents_ThinClient=RPSubVariantsDesignationTab_Contents_ThinClient.substring(25);
	
	return Expected_RPSubVariantsDesignationTab_Contents_ThinClient;
}

public void SparePartPartialMajorAssemblyTab(){
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(SparePartPartialMajorAssemblyTab));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].scrollIntoView();", SparePartPartialMajorAssemblyTab);

	SparePartPartialMajorAssemblyTab.click();
}


public String SparePartPartialMajorAssembly_Contents(){
	warmup();
	
	String SparePartPartialMajorAssembly_Contents_ThinClient=SparePartPartialMajorAssembly_Contents.getText();
	
	return SparePartPartialMajorAssembly_Contents_ThinClient;
	
}

public void SparePartPartialMajorAssembly_ShowVariant() {
	warmup();
	wait.until(ExpectedConditions.visibilityOf(SparePartPartialMajorAssembly_ShowVariant));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", SparePartPartialMajorAssembly_ShowVariant);
	SparePartPartialMajorAssembly_ShowVariant.click();	
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();		
	parentwindowID=it.next();
	childwindowID=it.next();
	driver.switchTo().window(childwindowID);
	warmup1();
	warmup6();
	warmup1();
	driver.switchTo().window(parentwindowID);
}

public void SeriesSubVariantTab(){
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(SeriesSubVariantTab));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments[0].scrollIntoView();", SeriesSubVariantTab);

	SeriesSubVariantTab.click();
}
public String SeriesSubVariantTab_Contents(){
	
	warmup5();
	
	String SeriesSubVariantTab_Contents_ThinClient=SeriesSubVariantTab_Contents.getText();
	
String Expected_SeriesSubVariantTab_Contents_ThinClient=SeriesSubVariantTab_Contents_ThinClient.substring(11);
	
	return Expected_SeriesSubVariantTab_Contents_ThinClient;
}

public String SeriesSubVariantDesignationTab_Contents(){
	
	warmup5();
	
	String SeriesSubVariantDesignationTab_Contents_ThinClient=SeriesSubVariantDesignationTab_Contents.getText();
	
String Expected_SeriesSubVariantDesignationTab_Contents_ThinClient=SeriesSubVariantDesignationTab_Contents_ThinClient.substring(25);
	
	return Expected_SeriesSubVariantDesignationTab_Contents_ThinClient;
}
//over
	public void SparePartMajorAssembly(){
		
		warmup();
		wait.until(ExpectedConditions.visibilityOf(SparePartMajorAssembly));

		SparePartMajorAssembly.click();
		
	    warmup();
		
//		List<WebElement> clickOnTabs=driver.findElements(By.xpath("//button[contains(@data-ng-click,'shortblockVariant_rec')]"));
//		
//		for(int i=1;i<clickOnTabs.size();i++){
//			String openTabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			clickOnTabs.get(i).sendKeys(openTabs);
//			
//		}
	    
	    driver.findElement(By.xpath("//*[@id=\"shortblockVariant\"]/tbody/tr[1]/td[2]/span/button")).click();
	    
      	 Set<String> handles=driver.getWindowHandles();
//				
				Iterator<String> it=	handles.iterator();
		
				 parentwindowID=	parentwindowID=it.next();
				 childwindowID=it.next();
				
				driver.switchTo().window(childwindowID);
	    
	         warmup();
	    
	}
	
	public void LastModificationTab(){
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(LastModificationTab));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//
		js.executeScript("arguments[0].scrollIntoView();", LastModificationTab);
		
		LastModificationTab.click();		
			
	}
	
	public String LastModification_Contents(){
		
		warmup();
		
		String LastModification_Contents=LastModification_Content.getText();
		return LastModification_Contents;
	}
	
	public void SparePartMajorAssembly_Arrowlink(){
		
		warmup();
		wait.until(ExpectedConditions.visibilityOf(SparePartPartialAssembly));

		SparePartPartialAssembly.click();
		
	    warmup();
	    
		wait.until(ExpectedConditions.visibilityOf(ShowVariant_button));

	    
	    ShowVariant_button.click();
	    
		driver.switchTo().window(parentwindowID);
		
		warmup();
		
		
	}
	
	public void NoteInfo_C74Tab(){
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(NoteInfo_C74Tab));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", SpartPartTab);
		js.executeScript("arguments[0].click();", NoteInfo_C74Tab);
		
		NoteInfo_C74Tab.click();
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(NoteInfo_C74Tab_Search));

		
		NoteInfo_C74Tab_Search.click();
		
		NoteInfo_C74Tab_Search.sendKeys("HWA129270010080");
		
		NoteInfo_C74Tab_Search.sendKeys(Keys.ENTER);
		

		
		warmup1();
		
		
	}
	
	public String NoteInfo_C74Tab_PartNumber(){
		
		warmup();
		
		String NoteInfo_C74Tab_PartNumber_text= NoteInfo_C74Tab_PartNumber.getText();
		
		return NoteInfo_C74Tab_PartNumber_text;
		
		
	}
	
	public String NoteInfo_C74Tab_InfoText(){
		
		warmup();
		String NoteInfo_C74Tab_PartNumber_Infotext=NoteInfo_C74Tab_InfoText.getText();
		
		return NoteInfo_C74Tab_PartNumber_Infotext;
	}
	
	public void PartRecodingTab(){
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(PartRecosingTab));

		
		PartRecosingTab.click();
		
		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(PartRecosingTab_Search));

		
		PartRecosingTab_Search.click();
		
		PartRecosingTab_Search.sendKeys("456");
		
		PartRecosingTab_Search.sendKeys(Keys.ENTER);
		
		List<WebElement> objectRecordingTable=driver.findElements(By.id("objectNoRecodingTable"));

		for(WebElement expectedObjectRecordingTable: objectRecordingTable){

			
			
		}

		warmup();

		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'objectNoRecodingTable_rec in viewDataObject')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'objectNoRecodingTable_rec in viewDataObject')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}

		

		List<WebElement> rows1=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'objectNoRecodingTable_rec in viewDataObject')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows1.get(rows.size()-1));
			 List<WebElement> tempRows1 = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'objectNoRecodingTable_rec in viewDataObject')])[100]"));
			 
			  if(tempRows1.size() > rows1.size()) {
			        rows1 = tempRows1;
			    } else {
			        break;
			    }
		}


		List<WebElement> rows2=driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'objectNoRecodingTable_rec in viewDataObject')])"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows2.get(rows1.size()-1));
			 List<WebElement> tempRows2 = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'objectNoRecodingTable_rec in viewDataObject')])[150]"));
			 
			  if(tempRows2.size() > rows2.size()) {
			        rows2 = tempRows2;
			    } else {
			        break;
			    }
		}
		


	}
	
	public String FootNoteTextContents(){
		
		warmup();
		String FootNoteTextContents_ThinClient=FootNoteTextContents.getText().substring(13);
		return FootNoteTextContents_ThinClient;
	}
	
	public void InformationTab(){
		
		warmup();
		
		InformationTab.click();
	}
	
	public boolean PartRecodingTab_Visibility(){
		warmup();
		try{
		if(	PartRecosingTab.isDisplayed());
		PartRecosingTab.click();
		}		catch (Exception exp)
		{
	         System.out.println("Part Recod Tab is present in the Thinclient");
		}
		return false;
		
	}
	
	
	//kartik PDF
			@FindBy(xpath="//a[text()='Spare part']")
			WebElement spareParts_tab;
			
			@FindBy(xpath="//a[text()='Note info C74']")
			WebElement noteInfoC74_tab;
		
			@FindBy(xpath="//a[@ng-click='launchPrint()']")
			WebElement print_pdf;	
			
			@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
	    	WebElement dateModified_columnHeder;
	        
	    	@FindBy(xpath="//table//tbody//tr[1]//td//a")
	    	WebElement getRow1_dateModified;
	    	
	    	@FindBy(name="partNumber")
	    	WebElement noteInfo_C74Tab_Search;
	    	
	    	public void NoteInfoC74_tab() throws InterruptedException{
				warmup6();
				noteInfoC74_tab.click();
			}
	    	
	    	public void Pass_NoteInfo_C74Tab_Search() throws InterruptedException{
	    		wait.until(ExpectedConditions.visibilityOf(NoteInfo_C74Tab_Search));

	    		noteInfo_C74Tab_Search.click();
	    		noteInfo_C74Tab_Search.sendKeys("HWA129270010080");
	    		noteInfo_C74Tab_Search.sendKeys(Keys.ENTER);
	    		warmup5();
	    		warmup5();
	    		Thread.sleep(5000);
			}
	    	
	    	public void SpareParts_tab() throws InterruptedException{
				warmup6();
				spareParts_tab.click();
				warmup1();
			}
		
			public void ClickOn_Print_pdf() throws InterruptedException{
				
				warmup5();
				warmup5();
				Thread.sleep(5000);
				//print_pdf.click();
				WebElement print= driver.findElement(By.xpath("(//a[contains(@ng-click,'launchPrint()')])"));
				print.click();
				Thread.sleep(2000);
				warmup1();
			}

			//To get pdf file name from download folder
	    	public String GetDownloadedFileName_NewTab() throws Exception{
	    	warmup5();
	    	JavascriptExecutor js= ((JavascriptExecutor)driver);
	    	js.executeScript("window.open()");
	   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
	   		 driver.switchTo().window(opentabs.get(2));//1
	   		 driver.get("C://Users//KELKARK//Downloads");
	   		 
	   		 warmup6();
	   		dateModified_columnHeder.click();
	   		warmup6();
	   		String pdfFileName= getRow1_dateModified.getText();
	   		System.out.println("file name-"+pdfFileName);
	   		
	   		driver.close();
	   		driver.switchTo().window(opentabs.get(1));//0
	   		return pdfFileName;
	   
	    	}
	    	
	    	public String FetchAllPDFData(String pdfFileName) throws Exception{
	    	
			/* PDF validation */		
				File file =new File ("C://Users//KELKARK//Downloads//"+pdfFileName);
				//row data here
				FileInputStream fis =new FileInputStream(file);
				//convert row data in to pdf doc format
				PDDocument pdfDoc =PDDocument.load(fis);
				
				// to count downloaded pdf pages.
				int pages= pdfDoc.getPages().getCount();
				System.out.println("Pdf Pages is- "+pages);
				
				//read the data from downloaded pdf.
				PDFTextStripper pdfTextStripper= new PDFTextStripper();
				//pdfTextStripper.setStartPage(1);
				//pdfTextStripper.setEndPage(1);
				String FetchPDFData= pdfTextStripper.getText(pdfDoc);
				System.out.println(FetchPDFData);
				
				pdfDoc.close();
				fis.close();
				
				return FetchPDFData;
	    	}
	    	
	    	public String OpenPDF_InNewTab_AndTakeScreenshot(String pdfFileName, String screenshotName) throws Exception{
	        	warmup5();
	        	JavascriptExecutor js= ((JavascriptExecutor)driver);
	        	js.executeScript("window.open()");
	       		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
	       		 driver.switchTo().window(opentabs.get(5));//1
	       		 driver.get("C://Users//KELKARK//Downloads//"+pdfFileName);
	       		warmup6(); 
	       		 
	       		//zoom in pdf
	       		Robot robot = new Robot();
	       		System.out.println("About to zoom out pdf");
	       		for (int i = 0; i < 4; i++) {
	       		robot.keyPress(KeyEvent.VK_CONTROL);
	       		robot.keyPress(KeyEvent.VK_SUBTRACT);
	       		robot.keyRelease(KeyEvent.VK_SUBTRACT);
	       		robot.keyRelease(KeyEvent.VK_CONTROL);}
	       		
	       		 warmup6();
	       		String dateName = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
				  TakesScreenshot ts = (TakesScreenshot) driver;
				  File source = ts.getScreenshotAs(OutputType.FILE);
				  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
				  String destination = System.getProperty("user.dir") + "/Screenshots/"+ screenshotName + dateName + ".png";
				  File finalDestination = new File(destination);
				  FileUtils.copyFile(source, finalDestination);
	       		
	       		driver.close();
	       		driver.switchTo().window(opentabs.get(1)); //0
	       		
	       	  return destination;
			//logger.addScreenCaptureFromPath(destination);
	        }
	    
	
	
}
