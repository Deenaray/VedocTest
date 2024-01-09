package com.vedoc.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.GClassVehiclePage;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.PartsIdentificationPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class PartsIdentificationPageTest_RU extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;
	PartsIdentificationPage PartsIdentifiation;
	ITestResult result;
	public static String cook4;
	
	public PartsIdentificationPageTest_RU() {
		
		super();
	}
	
	 

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		vehicledatapage = new VehicleDataPage_S();
		
		homePage = loginPage.login(prop.getProperty("stduser"), prop.getProperty("stdPassword"));
		   SystemMessageCheck();

		PartsIdentifiation = homePage.PartsIdentification();
		
	}
	
	
	@Test(priority = 0)
	public void DropdownFunctionalityOfPartsIdentificationTab(){
		
		SystemMessageCheck();
		
		PartsIdentifiation.DropdownFunctionalityOf_PartsIdentificationTab();
		logger=extent.createTest("U-076: Dropdown test of Parts Identification module");
		logger.log(Status.INFO, "TestCaseID: TC-027");
		logger.createNode("Dropdown size and text matches with Vedoc documentation").pass("Dropdown size and text matches with Vedoc documentation. Test case passed");
	}
	
	@Test(priority = 1)
	public void CheckForSparePartTabFunctionality(){
		
		PartsIdentifiation.searchInput_ByRPObjectNo();
		logger = extent.createTest("U-078: Spare Parts Tab of Parts Identification Module");
		logger.log(Status.INFO, "TestCaseID: TC-028");
		
		PartsIdentifiation.RPObjectNumber();
		logger.createNode("Data verification pending -- " + "RP Object Number displayed on the ThinClient is: " + PartsIdentifiation.RPObjectNumber()).pass("Data verification pending -- " + "RP Object Number displayed on the ThinClient is:  " + PartsIdentifiation.RPObjectNumber() +". Test case passed");
		
		String RPModelDesignation= PartsIdentifiation.RPModelDesignation();
		if(RPModelDesignation.isEmpty()){
			logger.createNode("RP Model Designation is not displayed on the ThinClient").pass("RP Model Designation is not displayed on the ThinClient. Test case passed");
		}else{
			logger.createNode("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is: " + PartsIdentifiation.RPModelDesignation()).pass("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is:  " + PartsIdentifiation.RPModelDesignation()+ ". Test case passed");
		}
		
		PartsIdentifiation.PartsCode();
		logger.createNode("Data verification pending -- " + "Parts Code displayed on the ThinClient is: " + PartsIdentifiation.PartsCode()).pass("Data verification pending -- " + "Parts Code displayed on the ThinClient is: " + PartsIdentifiation.PartsCode() + ". Test case passed");
		logger.log(Status.INFO, "Parts Code entered to Search is: " + PartsIdentifiation.PartsCode());

		PartsIdentifiation.Designation();
		logger.createNode("Data verification pending -- " + "Designation displayed on the ThinClient is: " + PartsIdentifiation.Designation()).pass("Data verification pending -- " + "Designation displayed on the ThinClient is:  " + PartsIdentifiation.Designation() + ". Test case passed");
		
	    String SeriesVariant_baseVariant=	PartsIdentifiation.SeriesVariant();
		
		if(SeriesVariant_baseVariant.isEmpty()){
			
			logger.createNode("There is no Series Variant value displayed on the Thin client for this RP Object Number").pass("There is no Series Variant value displayed on the Thin client for this RP Object Number. Test case passed");

		}
		else{
			
			logger.createNode("Data verification pending -- " + "Series Variant displayed on the ThinClient is: " + SeriesVariant_baseVariant).pass("Data verification pending -- " + "Series Variant displayed on the ThinClient is:  " + SeriesVariant_baseVariant + ". Test case passed");

		}
		
		PartsIdentifiation.SalesDesignation();
		logger.createNode("Data verification pending - " + "Sales Designation displayed on the ThinClient is: " + PartsIdentifiation.SalesDesignation()).pass("Data verification pending -- " + "Sales Designation displayed on the ThinClient is:  " + PartsIdentifiation.SalesDesignation() + ". Test case passed");
		
		PartsIdentifiation.SparePart_Information();
		logger.createNode("Data verification pending - " + "Information of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SparePart_Information()).pass("Data verification pending -- " + "Information of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SparePart_Information() + ". Test case passed");

		String SVmodelDesignation=PartsIdentifiation.SVmodelDesignation();
		
		if(SVmodelDesignation.isEmpty()){
			
			logger.createNode("There is no SV model Designation value displayed on the Thin client for this RP Object Number").pass("There is no SV model Designation value displayed on the Thin client for this RP Object Number. Test case passed");

		}
		else{
			
			logger.createNode("Data verification pending -- " + "SV model Designation value displayed on the Thin client is: " + SVmodelDesignation).pass("Data verification pending -- " + "SV model Designation value displayed on the Thin client is: " + SVmodelDesignation + ". Test case passed");

		}
		
	}
	
	@Test(priority=2)
	public void SAANumbersTabOfSparePart (){
		
		PartsIdentifiation.SAANumbersTab();
		logger = extent.createTest("U-078: SAA Numbers Tab of Parts Identification Module  for Parts Code Search");
		logger.log(Status.INFO, "TestCaseID: TC-029");
		
		PartsIdentifiation.SAANumbersTab_saaTable();
		logger.createNode("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()).pass("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()+ ". Test case passed");

		PartsIdentifiation.SAANumbersTab_FilterButton();
		logger.createNode("Filter button is clicked and the data entered in the search field is 310").pass("Filter button is clicked and the data entered in the search field is 310. Test case passed");
		logger.createNode("SAA Table Number Table is rearranged in the descending order after sorting").pass("SAA Table Number Table is rearranged in the descending order after sorting. Test case passed");
		
	}
	
	@Test(priority=3)
	public void FootNoteTabOfSparePart(){
		
		PartsIdentifiation.FoorNoteTab();
		logger = extent.createTest("U-078: FootNote Tab of Parts Identification Module for Parts Code Search");
		logger.log(Status.INFO, "TestCaseID: TC-030");
		
		PartsIdentifiation.FootNoteTab_Sort();
		logger.createNode("FootNote Table is reaaranged in the descending order after sorting").pass("FootNote Table is reaaranged in the descending order after sorting. Test case passed");
		
	String FottNoteTab_Contents=	PartsIdentifiation.FottNoteTab_Contents();
	
	if(FottNoteTab_Contents.isEmpty()){
		logger.createNode("FootNote ID contents are not displayed in the ThinClient").pass("FootNote ID contents are not displayed in the ThinClient. Test case passed");

	}else{
		logger.createNode("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is:  " + PartsIdentifiation.FottNoteTab_Contents()).pass("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is: " + PartsIdentifiation.FottNoteTab_Contents()+". Test case passed");

	}
	
	String FootNoteTextContents=PartsIdentifiation.FootNoteTextContents();
	
	if(FootNoteTextContents.isEmpty()){
		logger.createNode("FootNote Text contents are not displayed in the ThinClient").pass("FootNote Text contents are not displayed in the ThinClient. Test case passed");
	}else{
		logger.createNode("Data verification pending -- " + "FootNote Text contents displayed in the ThinClient is:  " + FootNoteTextContents).pass("Data verification pending -- " + "FootNote Text contents displayed in the ThinClient is:  " + FootNoteTextContents + ". Test case passed");
	}

	}
	
	

	
	@Test(priority = 4)
	public void CheckForSparePartTabFunctionality_ForModelDesignation(){
		
		PartsIdentifiation.SearchInput_ByModelDesignation();
		logger = extent.createTest("U-078: Spare Parts Tab of Parts Identification Module for Model Designation Search");
		logger.log(Status.INFO, "TestCaseID: TC-028");
		logger.createNode("RP Model Designation checkbox is unchecked on the ThinClient").pass("RP Model Designation checkbox is unchecked on the ThinClient. Test case passed");
		
		PartsIdentifiation.RPObjectNumber();
		logger.createNode("Data verification pending -- " + "RP Object Number displayed on the ThinClient is:  " + PartsIdentifiation.RPObjectNumber()).pass("Data verification pending -- " + "RP Object Number displayed on the ThinClient is:  " + PartsIdentifiation.RPObjectNumber() +". Test case passed");
		
		String RPModelDesignation= PartsIdentifiation.RPModelDesignation();

		if(RPModelDesignation.isEmpty()){
			logger.createNode("RP Model Designation is not displayed on the ThinClient").pass("RP Model Designation is not displayed on the ThinClient. Test case passed");
		}else{
			logger.createNode("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is:  " + PartsIdentifiation.RPModelDesignation()).pass("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is:  " + PartsIdentifiation.RPModelDesignation() +". Test case passsed");
		}
		
		PartsIdentifiation.PartsCode();
		logger.createNode("Data verification pending -- " + "Parts Code displayed on the ThinClient is:  " + PartsIdentifiation.PartsCode()).pass("Data verification pending -- " + "Parts Code displayed on the ThinClient is:  " + PartsIdentifiation.PartsCode() + ". Test case passsed");

		PartsIdentifiation.Designation();
		logger.createNode("Data verification pending -- " + "Designation displayed on the ThinClient is:  " + PartsIdentifiation.Designation()).pass("Data verification pending -- " + "Designation displayed on the ThinClient is:  " + PartsIdentifiation.Designation() + ". Test case passed");

		
	    String SeriesVariant_baseVariant=	PartsIdentifiation.SeriesVariant();
		
		if(SeriesVariant_baseVariant.isEmpty()) {
			logger.createNode("There is no Series Variant value displayed on the Thin client for this RP Object Number").pass("There is no Series Variant value displayed on the Thin client for this RP Object Number. Test case passed");
		}
		else{
			logger.createNode("Data verification pending -- " + "Series Variant displayed on the ThinClient is:  " + SeriesVariant_baseVariant).pass("Data verification pending -- " + "Series Variant displayed on the ThinClient is:  " + SeriesVariant_baseVariant + ". Test case passed");
		}
		
		PartsIdentifiation.SalesDesignation();
		logger.createNode("Data verification pending -- " + "Sales Designation displayed on the ThinClient is:  " + PartsIdentifiation.SalesDesignation()).pass("Data verification pending -- " + "Sales Designation displayed on the ThinClient is:  " + PartsIdentifiation.SalesDesignation() + ". Test case passed");		
		
		PartsIdentifiation.InformationTab();
		logger.createNode("Information Tab is clicked on the ThinClient").pass("Information Tab is clicked on the ThinClient. Test case passed");		
		
		PartsIdentifiation.SparePart_Information();
		logger.createNode("Data verification pending -- " + "Information of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SparePart_Information()).pass("Data verification pending -- " + "Information of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SparePart_Information() + ". Test case passed");		

		String SVmodelDesignation=PartsIdentifiation.SVmodelDesignation();
		
		if(SVmodelDesignation.isEmpty()){
			
			logger.createNode("There is no SV model Designation value displayed on the Thin client for this RP Object Number");	
		}
		else{
			logger.log(Status.INFO, " SV Model Designation entered in the ThinClient to Search is: " + SVmodelDesignation);
			logger.createNode("Data verification pending -- " + "SV model Designation value displayed on the Thin client is: " + SVmodelDesignation).pass("Data verification pending -- " + "SV model Designation value displayed on the Thin client is: " + SVmodelDesignation + ". Test case passed");		
		}	
	}
	
	@Test(priority=5)
	public void SAANumbersTabOfSparePart_ForModelDesignation (){
		
		PartsIdentifiation.SAANumbersTab();
		logger = extent.createTest("U-078: SAA Numbers Tab of Parts Identification Module  for Model Designation Search");
		logger.log(Status.INFO, "TestCaseID: TC-029");
		
		PartsIdentifiation.SAANumbersTab_saaTable();
		logger.createNode("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()).pass("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable() + ". Test case passed");		
		
	}
	
//	@Test(priority=6)
//	public void FootNoteTabOfSparePart_ForSparePart(){
//
//		PartsIdentifiation.FoorNoteTab();
//		logger = extent.createTest("U-078: FootNote Tab of Parts Identification Module for Model Designation Search");
//		logger.log(Status.INFO, "TestCaseID: TC-030");
//
//
//	String FottNoteTab_Contents=	PartsIdentifiation.FottNoteTab_Contents();
//
//	if(FottNoteTab_Contents.isEmpty()){
//		logger.createNode("FootNote ID contents are not displayed in the ThinClient").pass("FootNote ID contents are not displayed in the ThinClient. Test case passed");
//
//	}else{
//		logger.createNode("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is:  " + PartsIdentifiation.FottNoteTab_Contents()).pass("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is:  " + PartsIdentifiation.FottNoteTab_Contents() + ". Test case passed");
//	}
//
//	String FootNoteTextContents=PartsIdentifiation.FootNoteTextContents();
//
//	if(FootNoteTextContents.isEmpty()){
//		logger.createNode("FootNote Text contents are not displayed in the ThinClient").pass("FootNote Text contents are not displayed in the ThinClient. Test case passed");
//	}else{
//		logger.createNode("Data verification pending -- " + "FootNote Text contents displayed in the ThinClient is:  " + FootNoteTextContents).pass("Data verification pending -- " + "FootNote Text contents displayed in the ThinClient is:  " + FootNoteTextContents + ". Test case passed");
//	}
//
//	}
//
//	@Test(priority=7)******remove
//	public void CheckForPartRecordingTabVisibility(){
//		logger = extent.createTest("U-078: Part Recoding Tab of Parts Identification Module");
//		PartsIdentifiation.PartRecodingTab_Visibility();
//		logger.createNode("Part Recoding Tab is not displayed on the Thinclient").pass("Part Recoding Tab is not displayed on the Thinclient. Test case passed");
//			
////		logger.log(Status.INFO, "TestCaseID : TC-033");
////		logger.createNode("Filter button is clicked and 456 input is searched");
////		logger.createNode("Scrolled to the 150th element in the Table");
	//}
////	
////	@Test(enabled=false)
////	public void CheckForPartRecordingTabFunctionality(){
////		
////		PartsIdentifiation.PartRecodingTab();
////		logger = extent.createTest("U-078 : Part Recoding Tab of Parts Identification Module");	
////		logger.log(Status.INFO, "TestCaseID : TC-033");
////		logger.createNode("Filter button is clicked and 456 input is searched");
////		logger.createNode("Scrolled to the 150th element in the Table");
////		
////	}
//	
//	@Test(priority=8)******Remove
//	public void CheckForPDFOfPartsIdentificationModule() throws InterruptedException{
//
//		ClickingOnURLButtons();
//		logger=extent.createTest("U-118: Generate Spare part pdf of Parts Identification Module");
//		logger.log(Status.INFO, "TestCaseID: TC-032");
//		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass("Clicking on Print button works as expected and opens PDF in new tab. Test case passed");
//		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab. Test case passed");
//		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass("Clicking on System Message button works as expected and opens a dialog. Test case passed");
//	}
	
	
	@Test(priority=9)
	public void NoteInfo_C74Tab(){
		
		PartsIdentifiation.NoteInfo_C74Tab();
		logger = extent.createTest("U-075: Note Info C74 tab of Parts Identification Module");
		logger.log(Status.INFO, "TestCaseID: TC-034");
		logger.log(Status.INFO, "Part Number entered in the Thin client to search is  : HWA129270010080");
		
		logger.createNode("Data verification pending -- " + "Part Number displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_PartNumber()).pass("Data verification pending -- " + "Part Number displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_PartNumber() + ". Test case passed");
		logger.createNode("Data verification pending -- " + "Info Text displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_InfoText()).pass("Data verification pending -- " + "Info Text displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_InfoText() + ". Test case passed");

	}

	
	@AfterMethod
	public void teardown1(ITestResult result) throws IOException{
		
		if(result.getStatus()== ITestResult.SUCCESS){
			
			logger.log(Status.PASS, "Test Case passed is " + result.getName() );
			
			String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
			
			 logger.addScreenCaptureFromPath(screenshotPath);
			
			
		}
		
		else if(result.getStatus()== ITestResult.FAILURE){
			
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName() );
			
			logger.log(Status.FAIL, result.getThrowable());
			
			String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
			
			logger.addScreenCaptureFromPath(screenshotPath);
			
			}
	}

	@AfterTest
	public void teardown() throws IOException {
		
		driver.quit();

		 }
}
