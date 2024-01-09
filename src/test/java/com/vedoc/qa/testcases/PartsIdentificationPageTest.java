package com.vedoc.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.PartsIdentificationPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class PartsIdentificationPageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;
	PartsIdentificationPage PartsIdentifiation;
	ITestResult result;
	public static String cook4;
	
	public PartsIdentificationPageTest() {
		
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		vehicledatapage = new VehicleDataPage_S();		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		PartsIdentifiation = homePage.PartsIdentification();
	}

	@Test(priority = 0)
	public void DropdownFunctionalityOfPartsIdentificationTab(){	
		SystemMessageCheck();
		PartsIdentifiation.DropdownFunctionalityOf_PartsIdentificationTab();
		logger=extent.createTest("U-078:(AU) Dropdown test of Parts Identification module");
		logger.log(Status.INFO, "TestCaseID: TC-027");
		logger.createNode("Dropdown size and text matches with Vedoc documentation").pass("Dropdown size and text matches with Vedoc documentation. Test case passed");
	}
	  @Test(priority=1) 
	  public void CheckForSparePartTabFunctionality(){
	  
	  PartsIdentifiation.SearchInput(); 
	  logger = extent.createTest("U-078:(AU) Spare Parts Tab of Parts Identification Module  - Base Variant"); 
	  logger.log(Status.INFO, "TestCaseID: TC-028");
	  
	  PartsIdentifiation.RPObjectNumber();
	  logger.createNode("RP Object Number displayed on the ThinClient is: " +PartsIdentifiation.RPObjectNumber()).pass("RP Object Number displayed on the ThinClient is:  " +
	  PartsIdentifiation.RPObjectNumber() + ". Test case passed");
	  
	  PartsIdentifiation.RPModelDesignation();
	  logger.createNode("RP Model Designation displayed on the ThinClient is: " +PartsIdentifiation.RPModelDesignation()).pass("RP Model Designation displayed on the ThinClient is:  " +
	  PartsIdentifiation.RPModelDesignation() + ". Test case passed");
	  
	  PartsIdentifiation.PartsCode();
	  logger.createNode("Parts Code displayed on the ThinClient is: " +PartsIdentifiation.PartsCode()).pass("Parts Code displayed on the ThinClient is: " +PartsIdentifiation.PartsCode() + ". Test case passed");
	  
	  PartsIdentifiation.Designation();
	  logger.createNode("Designation displayed on the ThinClient is: " +PartsIdentifiation.Designation()).pass("Designation displayed on the ThinClient is: " +PartsIdentifiation.Designation() +". Test case passed");
	  
	  String SeriesVariant_baseVariant= PartsIdentifiation.SeriesVariant();
	  
	  if(SeriesVariant_baseVariant.isEmpty()){
		  logger.createNode("There is no Series Variant value displayed on the Thin client for this RP Object Number").pass("There is no Series Variant value displayed on the Thin client for this RP Object Number. Test case passed");
	  }
	  else{
	  logger.createNode("Series Variant displayed on the ThinClient is: " +SeriesVariant_baseVariant).pass("Series Variant displayed on the ThinClient is: " +SeriesVariant_baseVariant +". Test case passed"); }
	  
	  PartsIdentifiation.SalesDesignation();
	  logger.createNode("Sales Designation displayed on the ThinClient is: " +PartsIdentifiation.SalesDesignation()).pass("Sales Designation displayed on the ThinClient is: " +PartsIdentifiation.SalesDesignation() +". Test case passed");
	  
	  PartsIdentifiation.SparePart_Information();
	  logger.createNode("Information of the vehicle displayed on the ThinClient is: " +
	  PartsIdentifiation.SparePart_Information()).
	  pass("Information of the vehicle displayed on the ThinClient is: " +
	  PartsIdentifiation.SparePart_Information() + ". Test case passed");
	  
	  String SVmodelDesignation=PartsIdentifiation.SVmodelDesignation();
	  
	  if(SVmodelDesignation.isEmpty()){
		  logger.createNode("There is no SV model Designation value displayed on the Thin client for this RP Object Number").pass("here is no SV model Designation value displayed on the Thin client for this RP Object Number. Test case passed");
	  } else{ 
	  logger.createNode("SV model Designation value displayed on the Thin client is: " +SVmodelDesignation).pass("SV model Designation value displayed on the Thin client is: " +SVmodelDesignation+". Test case passed"); } }
	  
	  @Test(priority=2) 
	  public void SAANumbersTabOfSparePart (){
	  
	  PartsIdentifiation.SAANumbersTab(); 
	  logger =extent.createTest("U-078:(AU) SAA Numbers Tab of Parts Identification Module");
	  logger.log(Status.INFO, "TestCaseID: TC-029");
	  
	  PartsIdentifiation.SAANumbersTab_saaTable(); 
	  logger.createNode("SAA Table contents of the vehicle displayed on the ThinClient is: "+ PartsIdentifiation.SAANumbersTab_saaTable()).pass("SAA Table contents of the vehicle displayed on the ThinClient is: " +PartsIdentifiation.SAANumbersTab_saaTable()+ ". Test case passed");
	  
	  PartsIdentifiation.SAANumbersTab_FilterButton();
	  logger.createNode("Filter button is clicked and the data entered in the search field is 310").pass("Filter button is clicked and the data entered in the search field is 310. Test case passed"); 
	  logger.createNode("SAA Table Number Table is rearranged in the descending order after sorting").pass("SAA Table Number Table is rearranged in the descending order after sorting. Test case passed");
	  }
	  
	  @Test(priority=3)
	  public void FootNoteTabOfSparePart(){

	  PartsIdentifiation.FoorNoteTab();
	  logger =extent.createTest("U-078:(AU) FootNote Tab of Parts Identification Module");
	  logger.log(Status.INFO, "TestCaseID: TC-030");
	  PartsIdentifiation.FootNoteTab_Sort();
	  logger.createNode("FootNote Table is reaaranged in the descending order after sorting").pass("SAA Table Number Table is rearranged in the descending order after sorting. Test case passed");
	  }

	  @Test(priority=4)  
	  public void SparePartMajorAssemblyPartOfSparePartTab(){
	  
	  PartsIdentifiation.SparePartMajorAssembly(); 
	  logger = extent.createTest("U-078:(AU) Spare Part MajorAssembly of Parts Identification Module for Link out Variant"); 
	  logger.log(Status.INFO, "TestCaseID: TC-031");
	  
	  PartsIdentifiation.RPObjectNumber();
	  logger.createNode("RP Object Number displayed on the ThinClient is: " +PartsIdentifiation.RPObjectNumber()).pass("RP Object Number displayed on the ThinClient is:  " +PartsIdentifiation.RPObjectNumber() + ". Test case passed");
	  
	  PartsIdentifiation.RPModelDesignation();
	  logger.createNode("RP Model Designation displayed on the ThinClient is: " +PartsIdentifiation.RPModelDesignation()).pass("RP Model Designation displayed on the ThinClient is:  " +PartsIdentifiation.RPModelDesignation() + ". Test case passed");
	  
	  PartsIdentifiation.PartsCode();
	  logger.createNode("Parts Code displayed on the ThinClient is: " +PartsIdentifiation.PartsCode()).pass("Parts Code displayed on the ThinClient is: " +PartsIdentifiation.PartsCode() + ". Test case passed");
	  
	  PartsIdentifiation.Designation();
	  logger.createNode("Designation displayed on the ThinClient is: " +PartsIdentifiation.Designation()).pass("Designation displayed on the ThinClient is: " +PartsIdentifiation.Designation() +". Test case passed");
	  
	  String SeriesVariant=PartsIdentifiation.SeriesVariant();
	  
	  if(SeriesVariant.isEmpty()){ 
		 logger.createNode("There is no Series Variant value displayed on the Thin client for this RP Object Number").pass("There is no Series Variant value displayed on the Thin client for this RP Object Number. Test case passed"); 
	  } else{
	  logger.createNode("Series Variant displayed on the ThinClient is: " +SeriesVariant).pass("Series Variant displayed on the ThinClient is: " +SeriesVariant +". Test case passed"); }
	  
	  PartsIdentifiation.SalesDesignation();
	  logger.createNode("Sales Designation displayed on the ThinClient is: " +PartsIdentifiation.SalesDesignation()).pass("Sales Designation displayed on the ThinClient is: " +PartsIdentifiation.SalesDesignation() +". Test case passed");
	  
	  PartsIdentifiation.SparePart_Information(); 
	  logger.createNode("Information of the vehicle displayed on the ThinClient is: " +PartsIdentifiation.SparePart_Information()).pass("Information of the vehicle displayed on the ThinClient is: " +PartsIdentifiation.SparePart_Information() + ". Test case passed"); }
	  
	  @Test(priority=5)
	  public void SAANumbersTab_saaTable_Arrowlink(){
	  PartsIdentifiation.SAANumbersTab();
	  logger =extent.createTest("U-078:(AU) SAA Numbers Tab of link out variant");
	  logger.log(Status.INFO, "TestCaseID: TC-031");

	  PartsIdentifiation.SAANumbersTab_saaTable();
	  logger.createNode("SAA Table contents of the vehicle displayed on the ThinClient is:  "+ PartsIdentifiation.SAANumbersTab_saaTable()).pass("SAA Table contents of the vehicle displayed on the ThinClient is:  " +PartsIdentifiation.SAANumbersTab_saaTable()+". Test case passed");

	  PartsIdentifiation.SAANumbersTab_FilterButton();
	  logger.createNode("Filter button is clicked and the data entered in the search field is 310").pass("Filter button is clicked and the data entered in the search field is 310. Test case passed");
	  logger.createNode("SAA Table Number Table is rearranged in the descending order after sorting").pass("SAA Table Number Table is rearranged in the descending order after sorting. Test case passed");
	  }

	  @Test(priority=6)
	  public void LastModificationTab_Arrowlink(){
	  PartsIdentifiation.LastModificationTab();
	  }

	  @Test(priority=7) 
	  public void SparePartMajorAssembly_Arrowlink(){
	  PartsIdentifiation.SparePartMajorAssembly_Arrowlink(); 
	  } 
	  
	  @Test(priority=8) 
	  public void LastModificationTab(){ 
	  PartsIdentifiation.LastModificationTab(); 
	  logger = extent.createTest("U-078:(AU) Last Modification tab of Parts Identification Module");
	  logger.log(Status.INFO, "TestCaseID: TC-035");
	  // System.out.println(PartsIdentifiation.LastModification_Contents());
	  String LastModification_Contents=PartsIdentifiation.LastModification_Contents();
	  
	  if(LastModification_Contents.isEmpty()){ 
		logger.createNode("Last Modification contents is not displayed in the Thin client").fail("Test case failed");
		  } else{ 
		logger.createNode("Last Modification contents is displayed in the Thin client" +LastModification_Contents).pass("Last Modification contents is displayed in the Thin client" +LastModification_Contents + ". Test case passed"); } }
	  
//	  @Test(priority=9)
//	  public void CheckForPDFOfPartsIdentificationModule() throws InterruptedException{
//
//	  ClickingOnURLButtons();
//	  logger=extent.createTest("U-118:(AU) Generate Spare part pdf of Parts Identification Module");
//	  logger.log(Status.INFO, "TestCaseID: TC-032");
//	  logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass("Clicking on Print button works as expected and opens PDF in new tab. Test case passed");
//	  logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab. Test case passed");
//	  logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass("Clicking on System Message button works as expected and opens a dialog. Test case passed");
//	  }
//
	//Vishakha
		@Test(priority = 10)
		public void CheckForSparePartTabFunctionalityBySV_SVModelDesignation(){
			
			PartsIdentifiation.SearchInput_BySV_SVModelDesignation();
			logger = extent.createTest("U-076:(AU) Determine spare part variants");
			logger.log(Status.INFO, "TestCaseID: TC-028");
			
			PartsIdentifiation.RPObjectNumber();
			logger.createNode("Data verification pending -- " + "RP Object Number displayed on the ThinClient is: " + PartsIdentifiation.RPObjectNumber()).pass("Data verification pending -- " + "RP Object Number displayed on the ThinClient is:  " + PartsIdentifiation.RPObjectNumber() +". Test case passed");		
			PartsIdentifiation.RPModelDesignation();
			logger.createNode("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is: " + PartsIdentifiation.RPModelDesignation()).pass("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is:  " + PartsIdentifiation.RPModelDesignation()+ ". Test case passed");
			PartsIdentifiation.PartsCode();
			logger.createNode("Data verification pending -- " + "Parts Code displayed on the ThinClient is: " + PartsIdentifiation.PartsCode()).pass("Data verification pending -- " + "Parts Code displayed on the ThinClient is: " + PartsIdentifiation.PartsCode() + ". Test case passed");
			PartsIdentifiation.Designation();
			logger.createNode("Data verification pending -- " + "Designation displayed on the ThinClient is: " + PartsIdentifiation.Designation()).pass("Data verification pending -- " + "Designation displayed on the ThinClient is:  " + PartsIdentifiation.Designation() + ". Test case passed");
			PartsIdentifiation.SeriesVariant();
			logger.createNode("Data verification pending -- " + "Series Variant displayed on the ThinClient is: " + PartsIdentifiation.SeriesVariant()).pass("Data verification pending -- " + "Series Variant displayed on the ThinClient is:  " + PartsIdentifiation.SeriesVariant() + ". Test case passed");
			PartsIdentifiation.SalesDesignation();
			logger.createNode("Data verification pending - " + "Sales Designation displayed on the ThinClient is: " + PartsIdentifiation.SalesDesignation()).pass("Data verification pending -- " + "Sales Designation displayed on the ThinClient is:  " + PartsIdentifiation.SalesDesignation() + ". Test case passed");
			PartsIdentifiation.SVmodelDesignation();
			logger.createNode("Data verification pending - " + "Sales Designation displayed on the ThinClient is: " + PartsIdentifiation.SVmodelDesignation()).pass("Data verification pending -- " + "Sales Designation displayed on the ThinClient is:  " + PartsIdentifiation.SVmodelDesignation() + ". Test case passed");
			String SparePartInformation_Contents=PartsIdentifiation.SparePart_Information();
			if(SparePartInformation_Contents.isEmpty()){
				logger.createNode("Spare Part Information contents are not displayed in the ThinClient").pass("Spare Part Information contents are not displayed in the ThinClient. Test case passed");
			}else{
				logger.createNode("Data verification pending -- " + "Spare Part Information_Contents contents displayed in the ThinClient is:  " + PartsIdentifiation.SparePart_Information()).pass("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is: " + PartsIdentifiation.SparePart_Information()+". Test case passed");
			}}
		@Test(priority=11) 
		public void SAANumbersTabOfSparePartBySV_SVModelDesignation(){
			
			PartsIdentifiation.SAANumbersTab();
			logger = extent.createTest("U-076:(AU) SAA Numbers Tab of Parts Identification Module for SV+SVModel Designation");
			logger.log(Status.INFO, "TestCaseID: TC-029");
			
			PartsIdentifiation.SAANumbersTab_saaTable();
			logger.createNode("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()).pass("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()+ ". Test case passed");

			PartsIdentifiation.SAANumbersTab_FilterButton();
			logger.createNode("Filter button is clicked and the data entered in the search field is 310").pass("Filter button is clicked and the data entered in the search field is 310. Test case passed");
			logger.createNode("SAA Table Number Table is rearranged in the descending order after sorting").pass("SAA Table Number Table is rearranged in the descending order after sorting. Test case passed");		
		}
		
		@Test(priority=12) 
		public void FootNoteTabOfSparePartBySV_SVModelDesignation(){
			
			PartsIdentifiation.FoorNoteTab();
			logger = extent.createTest("U-076:(AU) FootNote Tab of Parts Identification Module for SV+SVModelDesignation");
			logger.log(Status.INFO, "TestCaseID: TC-030");

		String FottNoteTab_Contents=PartsIdentifiation.FottNoteTab_Contents();
		
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
		@Test(priority=13)
		  public void SeriesSubVariantBySV_SVModelDesignation(){
		  
		  PartsIdentifiation.SeriesSubVariantTab(); 
		  logger = extent.createTest("U-076:(AU) Series Sub-Variant of Parts Identification Module for SV+SVModelDesignation");
		  logger.log(Status.INFO, "TestCaseID: TC-031");
		  
		  String SeriesSubVariantTab_Contents=PartsIdentifiation.SeriesSubVariantTab_Contents();
		  	if(SeriesSubVariantTab_Contents.isEmpty()){
				logger.createNode("Series Sub-variant contents are not displayed in the ThinClient").pass("Series Sub-variant contents are not displayed in the ThinClient. Test case passed");
			}else{
				logger.createNode("Data verification pending -- " + "Series Sub-variant contents displayed in the ThinClient is:  " + PartsIdentifiation.SeriesSubVariantTab_Contents()).pass("Data verification pending -- " + "Series Sub-variant contents displayed in the ThinClient is: " + PartsIdentifiation.SeriesSubVariantTab_Contents()+". Test case passed");
			}
			String SeriesSubVariantDesignationTab_Contents=PartsIdentifiation.SeriesSubVariantDesignationTab_Contents();
			if(SeriesSubVariantDesignationTab_Contents.isEmpty()){
				logger.createNode("Series Designation of parts code contents are not displayed in the ThinClient").pass("Series Designation of parts code contents are not displayed in the ThinClient. Test case passed");
			}else{
				logger.createNode("Data verification pending -- " + "Series Designation of parts code contents displayed in the ThinClient is:  " + SeriesSubVariantDesignationTab_Contents).pass("Data verification pending -- " + "Series Designation of parts code contents displayed in the ThinClient is:  " + SeriesSubVariantDesignationTab_Contents + ". Test case passed");
			}
		  }
		@Test(priority=14)
		public void RPSubVariantTabOfSparePartBySV_SVModelDesignation(){
			
		PartsIdentifiation.RPSubVariantsTab();
		logger = extent.createTest("U-076:(AU) RP sub-variants Tab of Parts Identification Module for SV+SVModelDesignation");
		logger.log(Status.INFO, "TestCaseID: TC-030");
		
		String RPSubVariantsTab_Contents=PartsIdentifiation.RPSubVariantsTab_Contents();
		if(RPSubVariantsTab_Contents.isEmpty()){
			logger.createNode("RP Sub-variant contents are not displayed in the ThinClient").pass("RP Sub-variant contents are not displayed in the ThinClient. Test case passed");
		}else{
			logger.createNode("Data verification pending -- " + "RP Sub-variant contents displayed in the ThinClient is:  " + PartsIdentifiation.RPSubVariantsTab_Contents()).pass("Data verification pending -- " + "RP Sub-variant contents displayed in the ThinClient is: " + PartsIdentifiation.RPSubVariantsTab_Contents()+". Test case passed");
		}
		String RPSubVariantDesignationTab_Contents=PartsIdentifiation.RPSubVariantsDesignationTab_Contents();
		if(RPSubVariantDesignationTab_Contents.isEmpty()){
			logger.createNode("RP Designation of parts code contents are not displayed in the ThinClient").pass("RP Designation of parts code contents are not displayed in the ThinClient. Test case passed");
		}else{
			logger.createNode("RP Data verification pending -- " + "RP Designation of parts code contents displayed in the ThinClient is:  " + RPSubVariantDesignationTab_Contents).pass("Data verification pending -- " + "RP Designation of parts code contents displayed in the ThinClient is:  " + RPSubVariantDesignationTab_Contents + ". Test case passed");
		}
		}
		@Test(priority=15)
		public void LastModificationTabBySV_SVModelDesignation(){
			
			PartsIdentifiation.LastModificationTab();
			logger = extent.createTest("U-076:(AU) Last Modification tab of Parts Identification Module");	
			logger.log(Status.INFO, "TestCaseID: TC-035");
				
			PartsIdentifiation.LastModification_Contents();
			logger.createNode("Last Modification contents is displayed in the Thin client" + PartsIdentifiation.LastModification_Contents()).pass("Last Modification contents is displayed in the Thin client" + PartsIdentifiation.LastModification_Contents() + ". Test case passed");		
			}
		@Test(priority=16) 
		  public void CheckForPDFOfPartsIdentificationModuleBySV_SVModelDeisgnation() throws InterruptedException{
		  
		  ClickingOnURLButtons(); 
		  logger=extent.createTest("U-118:(AU) Generate Spare part pdf of Parts Identification Module");
		  logger.log(Status.INFO, "TestCaseID: TC-032"); 
		  logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass("Clicking on Print button works as expected and opens PDF in new tab. Test case passed"); 
		  logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab. Test case passed");
		  logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass("Clicking on System Message button works as expected and opens a dialog. Test case passed");
		  }
//		@Test(priority = 17)
//	public void CheckForSparePartTabFunctionalityByPartsCode(){
//
//		PartsIdentifiation.SearchInput_ByPartsCode();
//		logger = extent.createTest("U-076:(AU) Determine spare part variants");
//		logger.log(Status.INFO, "TestCaseID: TC-028");
//
//		PartsIdentifiation.RPObjectNumber();
//		logger.createNode("Data verification pending -- " + "RP Object Number displayed on the ThinClient is: " + PartsIdentifiation.RPObjectNumber()).pass("Data verification pending -- " + "RP Object Number displayed on the ThinClient is:  " + PartsIdentifiation.RPObjectNumber() +". Test case passed");
//
//		String RPModelDesignation= PartsIdentifiation.RPModelDesignation();
//		if(RPModelDesignation.isEmpty()){
//			logger.createNode("RP Model Designation is not displayed on the ThinClient").pass("RP Model Designation is not displayed on the ThinClient. Test case passed");
//		}else{
//			logger.createNode("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is: " + PartsIdentifiation.RPModelDesignation()).pass("Data verification pending -- " + "RP Model Designation displayed on the ThinClient is:  " + PartsIdentifiation.RPModelDesignation()+ ". Test case passed");
//		}
//		PartsIdentifiation.PartsCode();
//		logger.createNode("Data verification pending -- " + "Parts Code displayed on the ThinClient is: " + PartsIdentifiation.PartsCode()).pass("Data verification pending -- " + "Parts Code displayed on the ThinClient is: " + PartsIdentifiation.PartsCode() + ". Test case passed");
//		logger.log(Status.INFO, "Parts Code entered to Search is: " + PartsIdentifiation.PartsCode());
//
//		PartsIdentifiation.Designation();
//		logger.createNode("Data verification pending -- " + "Designation displayed on the ThinClient is: " + PartsIdentifiation.Designation()).pass("Data verification pending -- " + "Designation displayed on the ThinClient is:  " + PartsIdentifiation.Designation() + ". Test case passed");
//
//	    String SeriesVariant_baseVariant=	PartsIdentifiation.SeriesVariant();
//
//		if(SeriesVariant_baseVariant.isEmpty()){
//
//			logger.createNode("There is no Series Variant value displayed on the Thin client for this RP Object Number").pass("There is no Series Variant value displayed on the Thin client for this RP Object Number. Test case passed");
//		}
//		else{
//
//			logger.createNode("Data verification pending -- " + "Series Variant displayed on the ThinClient is: " + SeriesVariant_baseVariant).pass("Data verification pending -- " + "Series Variant displayed on the ThinClient is:  " + SeriesVariant_baseVariant + ". Test case passed");
//		}
//		PartsIdentifiation.SalesDesignation();
//		logger.createNode("Data verification pending - " + "Sales Designation displayed on the ThinClient is: " + PartsIdentifiation.SalesDesignation()).pass("Data verification pending -- " + "Sales Designation displayed on the ThinClient is:  " + PartsIdentifiation.SalesDesignation() + ". Test case passed");
//
//		PartsIdentifiation.SparePart_Information();
//		logger.createNode("Data verification pending - " + "Information of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SparePart_Information()).pass("Data verification pending -- " + "Information of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SparePart_Information() + ". Test case passed");
//
//		String SVmodelDesignation=PartsIdentifiation.SVmodelDesignation();
//
//		if(SVmodelDesignation.isEmpty()){
//
//			logger.createNode("There is no SV model Designation value displayed on the Thin client for this RP Object Number").pass("There is no SV model Designation value displayed on the Thin client for this RP Object Number. Test case passed");
//		}
//		else{
//			logger.createNode("Data verification pending -- " + "SV model Designation value displayed on the Thin client is: " + SVmodelDesignation).pass("Data verification pending -- " + "SV model Designation value displayed on the Thin client is: " + SVmodelDesignation + ". Test case passed");
//		}
//	}
//
//	@Test(priority=18)
//	public void SAANumbersTabOfSparePartByPartsCode(){
//
//		PartsIdentifiation.SAANumbersTab();
//		logger = extent.createTest("U-076:(AU) SAA Numbers Tab of Parts Identification Module for Parts Code Search");
//		logger.log(Status.INFO, "TestCaseID: TC-029");
//
//		PartsIdentifiation.SAANumbersTab_saaTable();
//		logger.createNode("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()).pass("Data verification pending -- " + "SAA Table contents of the vehicle displayed on the ThinClient is:  " + PartsIdentifiation.SAANumbersTab_saaTable()+ ". Test case passed");
//
//		PartsIdentifiation.SAANumbersTab_FilterButton();
//		logger.createNode("Filter button is clicked and the data entered in the search field is 310").pass("Filter button is clicked and the data entered in the search field is 310. Test case passed");
//		logger.createNode("SAA Table Number Table is rearranged in the descending order after sorting").pass("SAA Table Number Table is rearranged in the descending order after sorting. Test case passed");
//	}
//
//	@Test(priority=19)
//	public void FootNoteTabOfSparePartByPartsCode(){
//
//		PartsIdentifiation.FoorNoteTab();
//		logger = extent.createTest("U-076:(AU) FootNote Tab of Parts Identification Module for Parts Code Search");
//		logger.log(Status.INFO, "TestCaseID: TC-030");
//
//	String FottNoteTab_Contents=PartsIdentifiation.FottNoteTab_Contents();
//
//	if(FottNoteTab_Contents.isEmpty()){
//		logger.createNode("FootNote ID contents are not displayed in the ThinClient").pass("FootNote ID contents are not displayed in the ThinClient. Test case passed");
//
//	}else{
//		logger.createNode("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is:  " + PartsIdentifiation.FottNoteTab_Contents()).pass("Data verification pending -- " + "FootNote ID contents displayed in the ThinClient is: " + PartsIdentifiation.FottNoteTab_Contents()+". Test case passed");
//	}
//	String FootNoteTextContents=PartsIdentifiation.FootNoteTextContents();
//
//	if(FootNoteTextContents.isEmpty()){
//		logger.createNode("FootNote Text contents are not displayed in the ThinClient").pass("FootNote Text contents are not displayed in the ThinClient. Test case passed");
//	}else{
//		logger.createNode("Data verification pending -- " + "FootNote Text contents displayed in the ThinClient is:  " + FootNoteTextContents).pass("Data verification pending -- " + "FootNote Text contents displayed in the ThinClient is:  " + FootNoteTextContents + ". Test case passed");
//	}
//	}
//
//	@Test(priority=20)
//	public void RPSubVariantTabOfSparePartByPartsCode(){
//
//	PartsIdentifiation.RPSubVariantsTab();
//	logger = extent.createTest("U-076:(AU) RP sub-variants Tab of Parts Identification Module for Parts code");
//	logger.log(Status.INFO, "TestCaseID: TC-030");
//
//	String RPSubVariantsTab_Contents=PartsIdentifiation.RPSubVariantsTab_Contents();
//
//	if(RPSubVariantsTab_Contents.isEmpty()){
//		logger.createNode("RP Sub-variant contents are not displayed in the ThinClient").pass("RP Sub-variant contents are not displayed in the ThinClient. Test case passed");
//	}else{
//		logger.createNode("Data verification pending -- " + "RP Sub-variant contents displayed in the ThinClient is:  " + PartsIdentifiation.RPSubVariantsTab_Contents()).pass("Data verification pending -- " + "RP Sub-variant contents displayed in the ThinClient is: " + PartsIdentifiation.RPSubVariantsTab_Contents()+". Test case passed");
//	}
//	String RPSubVariantDesignationTab_Contents=PartsIdentifiation.RPSubVariantsDesignationTab_Contents();
//
//	if(RPSubVariantDesignationTab_Contents.isEmpty()){
//		logger.createNode("RP Designation of parts code contents are not displayed in the ThinClient").pass("RP Designation of parts code contents are not displayed in the ThinClient. Test case passed");
//	}else{
//		logger.createNode("Data verification pending -- " + "RP Designation of parts code contents displayed in the ThinClient is:  " + RPSubVariantDesignationTab_Contents).pass("Data verification pending -- " + "RP Designation of parts code contents displayed in the ThinClient is:  " + RPSubVariantDesignationTab_Contents + ". Test case passed");
//	}
//
//	}
//	  @Test(priority=21)
//	  public void SparePartPartialMajorAssemblySparePartByPartsCode(){
//
//	  PartsIdentifiation.SparePartPartialMajorAssemblyTab();
//	  logger = extent.createTest("U-076:(AU) Spare Part Partial MajorAssembly of Parts Identification Module for Parts Code");
//	  logger.log(Status.INFO, "TestCaseID: TC-031");
//
//	  PartsIdentifiation.SparePartPartialMajorAssembly_Contents();
//	  logger.createNode("Spare part partial major assembly data is displayed").pass("Spare part partial major assembly data is displayed. Test case passed");
//
//	  PartsIdentifiation.SparePartPartialMajorAssembly_ShowVariant();
//	  logger.createNode("Show Variant button is clicked").pass("Show Variant button is clicked. Test case passed");
//	  }
//
//	@Test(priority=22)
//	public void LastModificationTabByPartsCode(){
//
//		PartsIdentifiation.LastModificationTab();
//		logger = extent.createTest("U-076:(AU) Last Modification tab of Parts Identification Module");
//		logger.log(Status.INFO, "TestCaseID: TC-035");
//
//		String LastModification_Contents=PartsIdentifiation.LastModification_Contents();
//
//		if(LastModification_Contents.isEmpty()){
//			logger.createNode("Last Modification contents is not displayed in the Thin client").fail("Test case failed");
//		}
//		else{
//			logger.createNode("Last Modification contents is displayed in the Thin client" + LastModification_Contents).pass("Last Modification contents is displayed in the Thin client" + LastModification_Contents + ". Test case passed");
//		}
//	}
//	@Test(priority=23)
//	  public void CheckForPDFOfPartsIdentificationModuleByPartsCode() throws InterruptedException{
//
//	  ClickingOnURLButtons();
//	  logger=extent.createTest("U-118:(AU) Generate Spare part pdf of Parts Identification Module");
//	  logger.log(Status.INFO, "TestCaseID: TC-032");
//	  logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass("Clicking on Print button works as expected and opens PDF in new tab. Test case passed");
//	  logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab. Test case passed");
//	  logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass("Clicking on System Message button works as expected and opens a dialog. Test case passed");
//	  }
	@Test(priority=24)
	public void NoteInfo_C74Tab(){
		
		PartsIdentifiation.NoteInfo_C74Tab();
		logger = extent.createTest("U-075:(AU) Note Info C74 tab of Parts Identification Module");
		logger.log(Status.INFO, "TestCaseID: TC-034");
		logger.createNode("Part Number entered in the Thin client to search is - HWA129270010080").pass("Part Number entered in the Thin client to search is - HWA129270010080. Test case passed");		
		logger.createNode("Part Number displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_PartNumber()).pass("Part Number displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_PartNumber() +". Test case passed");		
		logger.createNode("Info Text displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_InfoText()).pass("Info Text displayed on the Thin client is - " + PartsIdentifiation.NoteInfo_C74Tab_InfoText() +". Test case passed");		
////		logger.createNode("Part Recoding Tab is not displayed on the Thinclient");
	}
	
//	@Test(priority=25)
//	public void CheckForPartRecordingTabFunctionality(){
//		logger = extent.createTest("U-078:(AU) Part Recoding Tab of Parts Identification Module");
//		PartsIdentifiation.PartRecodingTab_Visibility();
//		logger.createNode("Part Recoding Tab is not displayed on the Thinclient").pass("Part Recoding Tab is not displayed on the Thinclient. Test case passed");
//		logger.log(Status.INFO, "TestCaseID : TC-033");
//		logger.createNode("Filter button is clicked and 456 input is searched");
//		logger.createNode("Scrolled to the 150th element in the Table");
//	}
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