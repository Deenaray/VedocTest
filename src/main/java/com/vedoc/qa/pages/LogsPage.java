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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.vedoc.qa.base.TestBase;


public class LogsPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Conflict log']")
	WebElement conflictLog;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind,'logTable_rec.messageIds | messageFormatter:$index : this : logTable_rec')])[1]")
	WebElement conflictMessages;
	
	@FindBy(xpath="(//span[text()='Search'])[2]")
	WebElement search;
	
	@FindBy(xpath="(//select[@data-ng-change='statusNameChanged()']")
	WebElement statusDropdown;
	
	@FindBy(xpath="(//span[@class='cell-icon rc-i-line-check'])[1]")
	WebElement resolvedIcon;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement save;
	
	@FindBy(xpath="//option[text()='Resolved']")
	WebElement resolvedOption;
	
	@FindBy(xpath="(//span[@class='cell-icon rc-i-line-close'])[1]")
	WebElement ignoreIcon;
	
	@FindBy(xpath="(//span[@class='cell-icon rc-i-line-reset'])[1]")
	WebElement resetIcon;
	
	@FindBy(xpath="//option[@label='New']")
	WebElement newOption;
	
	@FindBy(xpath="//option[text()='Ignored']")
	WebElement ignoredOption;
	
	@FindBy(xpath="//a[text()='My modifications']")
	WebElement myModifications;
	
	@FindBy(xpath="//button[@id='MyModifications_930_search']")
	WebElement search_MyModifications;
	
	@FindBy(xpath="//a[contains(@ng-click,'launchPrint()')]/span")
	WebElement PDFIcon;
	
	@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
	WebElement dateModified_columnHeader;
	
	@FindBy(xpath="//table//tbody//tr[1]//td//a")
	WebElement getRow1_dateModified;
	
	@FindBy(xpath="//a[text()='Acknowledgment log']")
	WebElement acknowledgementLog;
	
	@FindBy(xpath="//button[@id='OutboundAcknowledgements_960_search']")
	WebElement acknowledgementLogSearch;
	
	@FindBy(xpath="//input[contains(@data-ng-model,'viewDataObject.outboundAckReportSearchCriteria.fromSendDate')]")
	WebElement acknowledgementLogSendingDateFrom;
	
	@FindBy(xpath="//input[contains(@data-ng-model,'viewDataObject.outboundAckReportSearchCriteria.toSendDate')]")
	WebElement acknowledgementLogSendingDateTo;
	
	@FindBy(xpath="//*[@id='ackTable']//following::button")
	WebElement acknowledgementLogExport;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.outboundAckProtocol)')]")
	WebElement acknowledgementLogTotalRecords;
	
	@FindBy(xpath="//input[contains(@name,'outboundAckReportSearchCriteria_productId')]")
	WebElement acknowledgementLogProductId;
	
	@FindBy(xpath="//input[contains(@name,'outboundAckReportSearchCriteria_technicalId')]")
	WebElement acknowledgementLogTechnicalId;
	
	@FindBy(xpath="//*[@id='OutboundAcknowledgements_960']/div/div[2]/form/div[1]/div/button[4]")
	WebElement acknowledgementLogFilter;
	
	@FindBy(xpath="//input[contains(@input-binding,'viewControl.ackTable_filterExpression')]")
	WebElement acknowledgementLogFilterText;
	
	@FindBy(xpath="//*[@id='OutboundAcknowledgements_960']/div/div[2]/form/div[2]/div[2]/div/span/button/i")
	WebElement acknowledgementLogSendingDateCalender;
	
	
	
	public void conflictLog()  {
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(conflictLog));
		conflictLog.click();
		warmup5();
	}
	
	public void statusDropdown()  {
		wait.until(ExpectedConditions.elementToBeClickable(statusDropdown));
		statusDropdown.click();
	}
	
	public void newOption()  {
		wait.until(ExpectedConditions.elementToBeClickable(newOption));
		newOption.click();
	}	
	
	public void search()  {
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		warmup5();
	}
	
	public String conflictMessages() {
		wait.until(ExpectedConditions.elementToBeClickable(conflictMessages));
		String message=conflictMessages.getText();
		return message;
	}
	
	public void resolvedIcon()  {
		wait.until(ExpectedConditions.elementToBeClickable(resolvedIcon));
		resolvedIcon.click();
	}
	
	public void save()  {
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
	}
	
	public void resolvedOption()  {
		wait.until(ExpectedConditions.elementToBeClickable(resolvedOption));
		resolvedOption.click();
	}
	
	public void ignoredOption()  {
		wait.until(ExpectedConditions.elementToBeClickable(ignoredOption));
		ignoredOption.click();
	}
	
	
	public void statusChangeCheck()  {
		String actual = conflictMessages();
		System.out.println(actual);
		String expect = actual.substring(0, actual.length() - 5);
		System.out.println(expect);
		WebElement msg = driver.findElement(By.xpath("//*[contains(text(),'" + expect + "')]"));
		msg.click();
		String expected = msg.getText();
		System.out.println(expected);
	    Assert.assertEquals(actual, expected);
	}
	
//	public void resolveToIgnoreStatus()  {
//		String actual = conflictMessages();
//		System.out.println(actual);
//		WebElement msg = driver.findElement(By.xpath("//*[text()='" + actual + "']"));
//		msg.click();
//		String expected = msg.getText();
//		System.out.println(expected);
//		Assert.assertEquals(actual, expected);
//	}
	
public void ignoreIcon() {
	ignoreIcon.click();		
	}

public void resetIcon() {
	resetIcon.click();		
	}

public void search_MyModifications() {
	search_MyModifications.click();	
}
public void revert(){
    warmup5();
    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get("https://mbag-test.core-t.public.vedoc.daimlertruck.com/ui/homepage.html");
}

public void scrollToSearch() {
	JavascriptExecutor js=(JavascriptExecutor)driver;	
 js.executeScript("arguments[0].scrollIntoView();", myModifications);
}

	public LogsPage() {
		PageFactory.initElements(driver, this);
	}
	public void Logs_PDF(String url){
		warmup5();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	   driver.get(url);
	}
	public void Logs_PDF() throws InterruptedException, IOException {;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.elementToBeClickable(PDFIcon));
		js.executeScript("arguments[0].click();", PDFIcon);
		warmup5();
		warmup5();
		warmup6();
		warmup6();
		warmup6();
		String fileName= GetDownloadedFileName_PDF();
		String url= getRecordsPDF(fileName);
		Logs_PDF(url);
		warmup6();
		String ProductIdFromPDF=getPdfContent(url);
		String TypeOfModificationFromPDF=getPdfContent(url);
		String TabFromPDF=getPdfContent(url);
		String AttributeNameFromPDF=getPdfContent(url);
		String OldValueFromPDF=getPdfContent(url);
		String NewValueFromPDF=getPdfContent(url);
//		System.out.println("Verifying data from PDF");
//		Assert.assertTrue(TypeOfModificationFromPDF.contains("Change"));
//		Assert.assertTrue(TabFromPDF.contains("Vehicle state"));
//		Assert.assertTrue(AttributeNameFromPDF.contains("Status"));
//		Assert.assertTrue(OldValueFromPDF.contains("Delivered"));
//		Assert.assertTrue(NewValueFromPDF.contains("Stolen"));
}
public String getRecordsPDF(String FileName) {
	String downloadPath = "C:\\Users\\deenara\\Downloads";
			String filePath =	downloadPath + System.getProperty("file.separator") + FileName;
			System.out.println(filePath);
			File file = new File(filePath);
			if (file.exists()) {
				System.out.println("File found :" +FileName);
				} else {
				System.out.println("File does not exists");
			}
	String url="file:///" +filePath;
			return url;
	}

public static String getPdfContent(String url) throws IOException {
    URL pdfURL = new URL(url);
	InputStream is = pdfURL.openStream();
	BufferedInputStream bis = new BufferedInputStream(is);
	PDDocument doc = PDDocument.load(bis);
	int pages=doc.getNumberOfPages();
	System.out.println("The total number of pages "+pages);
	PDFTextStripper strip = new PDFTextStripper();
	strip.setStartPage(1);
	strip.setEndPage(9);
	String stripText = strip.getText(doc);
	System.out.println(stripText);
	doc.close();
	return stripText;
	}
public String GetDownloadedFileName_PDF(){
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
		driver.switchTo().window(opentabs.get(1));
		return name;
	}
public void acknowledgementLog()  {
	wait.until(ExpectedConditions.elementToBeClickable(acknowledgementLog));
	acknowledgementLog.click();
}
public void acknowledgementLogSearch()  {
	wait.until(ExpectedConditions.elementToBeClickable(acknowledgementLogSearch));
	acknowledgementLogSearch.click();
	warmup6();
}
public void acknowledgementLogDate()  {
	acknowledgementLogSendingDateFrom.clear();
	warmup6();
	acknowledgementLogSendingDateFrom.sendKeys("01/01/2022 12:00:00 am");
	acknowledgementLogSendingDateTo.clear();
	warmup6();
	acknowledgementLogSendingDateTo.sendKeys("09/30/2022 11:59:59 pm");
}
public void acknowledgementLogExport()  {
	wait.until(ExpectedConditions.elementToBeClickable(acknowledgementLogExport));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", acknowledgementLogExport);
	warmup6();
	String fileName= GetDownloadedFileName_NewTab();
	int dataCountInCSV= getRecordsCountInCSV(fileName);
	System.out.println("Verifying total records in table with number of entries in csv");
	Assert.assertEquals(getNumberOfEntries(), dataCountInCSV);
}
public String acknowledgementLogTotalRecords() {
	String records=acknowledgementLogTotalRecords.getText().trim();
	System.out.println(records);
	return records;
}
public void acknowledgementLogProductId()  {
	acknowledgementLogProductId.clear();
	acknowledgementLogProductId.sendKeys("02AFD52E");
}
public void acknowledgementLogTechnicalId() {
	acknowledgementLogTechnicalId.clear();
	acknowledgementLogTechnicalId.sendKeys("12662001");
}
public void acknowledgementLogClearFields() {
	warmup6();
	acknowledgementLogTechnicalId.clear();
	warmup6();
	acknowledgementLogProductId.clear();
	warmup6();
}
public void acknowledgementLogFilter() {
	acknowledgementLogFilter.click();
	acknowledgementLogFilterText.sendKeys("1006B9A1");
	warmup6();
	acknowledgementLogFilter.click();
}
public int getNumberOfEntries() {
	
	String entriesTxt = acknowledgementLogTotalRecords();
	String[] aEntriesText = entriesTxt.split(" / ");
	System.out.println(aEntriesText.length);
	String totalEntriesText = aEntriesText[0];//1
	int i=Integer.parseInt(totalEntriesText);
	System.out.println(totalEntriesText);
	return i;
}
public String GetDownloadedFileName_NewTab(){
	warmup5();
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("window.open()");
		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(opentabs.get(1));
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
//	The processing of the object MQFILEQUEUETRIGGER03TIMER resulted in an error. Technical details: {1}	
//	The processing of the object MQFILEQUEUETRIGGER03TIMER resulted in an error. Technical details: {1}}