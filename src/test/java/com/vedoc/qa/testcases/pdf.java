package com.vedoc.qa.testcases;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.LogsPage;
import com.vedoc.qa.pages.MajorAssemblyPage;
import com.vedoc.qa.pages.PartsIdentificationPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class pdf extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MajorAssemblyPage majorassemblypage;
	VehicleDataPage_S vehicledatapage;
	PartsIdentificationPage partsIdentificationPage;
	LogsPage logsdatapage;
	public pdf() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	  	warmup1();
		majorassemblypage=new MajorAssemblyPage();
		vehicledatapage= new VehicleDataPage_S();
		logsdatapage= new LogsPage();
		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		logger = extent.createTest("U-010:Generate pdf");
		logger.createNode("U-002:Login using admin user credentials")
				.pass("Login using (AU) credentials.Test case passed");

		vehicledatapage = homePage.VehicleData1();
	  	warmup1();

	}


		@Test(priority = 0)
		public void loginto_VehicleDataPage_AU() {
			vehicledatapage = homePage.VehicleData1();
			logger.createNode("Navigate to Vehicle Data page").pass("Navigate to Vehicle Data page. Test case passed");
		}
		@Test(priority = 1)
		public void VehicleData_Identification() throws InterruptedException, IOException {
			logger = extent.createTest("U-115:(AU) Generate Vehicle Information pdf");
			vehicledatapage.searchCategoryNumber(vehicledatapage.NonPassengerCarsFinNumberInput);
			String vinNumberUI = vehicledatapage.fetchVinNumber();
			Thread.sleep(5000);
			logger.createNode("NonPassengerCarsFinNumberInput- " + vehicledatapage.NonPassengerCarsFinNumberInput+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category").pass(vehicledatapage.NonPassengerCarsFinNumberInput+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
		}
		@Test(priority = 2)
		public void VehicleData_PDF() throws InterruptedException, IOException {
			vehicledatapage.PDF();
			logger.createNode("FIN No-WEB41058013103813 is matched with that of PDF.").pass("FIN No-WDF4702101G000024 is matched with that of PDF. Test case passed");
			logger.createNode("Status-Delivered is matched with that of PDF.").pass("Status-Delivered is matched with that of PDF. Test case passed");
			logger.createNode("Order no-8 7 292 00321 is matched with that of PDF.").pass("Order no-8 7 292 00321 is matched with that of PDF. Test case passed");
			logger.createNode("Engine no-699301 C0 009337 is matched with that of PDF.").pass("Engine no-699301 C0 009337 is matched with that of PDF. Test case passed");
			logger.createNode("PaintCode-9139 is matched with that of PDF.").pass("PaintCode-9139 is matched with that of PDF. Test case passed");
			logger.createNode("Code-292L is matched with that of PDF.").pass("Code-292L is matched with that of PDF. Test case passed");
			logger.createNode("Code-ZY8 is matched with that of PDF.").pass("Code-ZY8 is matched with that of PDF. Test case passed");
			logger.createNode("VPD Ident-00012 is matched with that of PDF.").pass("VPD Ident-00012 is matched with that of PDF. Test case passed");
			logger.createNode("Designation-Rack-and-Pinion Steering is matched with that of PDF.").pass("Designation-Rack-and-Pinion Steering is matched with that of PDF. Test case passed");
			logger.createNode("VPD Ident-80018 is matched with that of PDF.").pass("VPD Ident-80018 is matched with that of PDF. Test case passed");
			logger.createNode("Designation-Renault Transmission Item Number is matched with that of PDF.").pass("Designation-Renault Transmission Item Number is matched with that of PDF. Test case passed");
			logger.createNode("Diogenes Short Name-ADAS is matched with that of PDF.").pass("Diogenes Short Name-ADAS is matched with that of PDF. Test case passed");
			logger.createNode("Designation-ADAS Advanced Driver Assistance Systems is matched with that of PDF.").pass("Designation-ADAS Advanced Driver Assistance Systems is matched with that of PDF. Test case passed");
			logger.createNode("Diogenes Short Name-SMV is matched with that of PDF.").pass("Diogenes Short Name-SMV is matched with that of PDF. Test case passed");
			logger.createNode("Designation-SAM-V SAM-Modul vorn is matched with that of PDF.").pass("Designation-SAM-V SAM-Modul vorn is matched with that of PDF. Test case passed");
			logger.createNode("Object Type-ControlUnitStateType is matched with that of PDF.").pass("Object Type-ControlUnitStateType is matched with that of PDF. Test case passed");
			logger.createNode("New Value-2139014109M090H3848150 is matched with that of PDF.").pass("New Value-2139014109M090H3848150 is matched with that of PDF. Test case passed");
		}
		@Test(priority = 3)
		public void VehicleData_ControlUnit() throws InterruptedException, IOException {
			logger = extent.createTest("U-170:(AU) Generate pdf for Vehicle Parameter Data");
			vehicledatapage.revert();
			vehicledatapage.searchCategoryNumber(vehicledatapage.PARControlUnitFinNumberInput);
			String vinNumberUI = vehicledatapage.fetchVinNumber();
			Thread.sleep(5000);
			logger.createNode("PARControlUnitFinNumberInput- " + vehicledatapage.PARControlUnitFinNumberInput+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category").pass(vehicledatapage.PARControlUnitFinNumberInput+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
			vehicledatapage.controlUnitTab();
			logger.createNode("Control Unit tab is clicked").pass("Control Unit tab is clicked. Test Case Passed");
			warmup6();
		}
		@Test(priority = 4)
		public void ControlUnit_PDF() throws InterruptedException, IOException {
			vehicledatapage.ControlUnit_PDF();
			logger.createNode("FIN No-WEB41058013103813 is matched with that of PDF.").pass("FIN No-WDF 375303 1B 950398 is matched with that of PDF. Test case passed");
			logger.createNode("Status-Delivered is matched with that of PDF.").pass("Status-Delivered is matched with that of PDF. Test case passed");
			logger.createNode("Order no-1 2 843 00107 is matched with that of PDF.").pass("Order no-1 2 843 00107 is matched with that of PDF. Test case passed");
			logger.createNode("Engine no-699301 C0 009337 is matched with that of PDF.").pass("Engine no-699301 C0 009337 is matched with that of PDF. Test case passed");
			logger.createNode("Transmission no-715320 00 022241 is matched with that of PDF.").pass("Transmission no-715320 00 022241 is matched with that of PDF. Test case passed");
			logger.createNode("Electrical Variant-XVK51 511069 is matched with that of PDF.").pass("Electrical Variant-XVK51 511069 is matched with that of PDF. Test case passed");
			logger.createNode("Designation-FRAME TRUNK CIRCUIT is matched with that of PDF.").pass("Designation-FRAME TRUNK CIRCUIT is matched with that of PDF. Test case passed");
			logger.createNode("Code-9074 is matched with that of PDF.").pass("Code-9074 is matched with that of PDF. Test case passed");
			logger.createNode("Paint Code-9147 is matched with that of PDF.").pass("Paint Code-9147 is matched with that of PDF. Test case passed");
			logger.createNode("Code-A71 is matched with that of PDF.").pass("Code-A71 is matched with that of PDF. Test case passed");
			logger.createNode("SAA Number-50503608 is matched with that of PDF.").pass("SAA Number-50503608 is matched with that of PDF. Test case passed");
			logger.createNode("Plant Text-Werkstext aus Migration is matched with that of PDF.").pass("Plant Text-Werkstext aus Migration is matched with that of PDF. Test case passed");
			logger.createNode("Diogenes Short Name-PLD is matched with that of PDF.").pass("Diogenes Short Name-PLD is matched with that of PDF. Test case passed");
			logger.createNode("Designation-Protected control units with IDCode is matched with that of PDF.").pass("Designation-Protected control units with IDCode is matched with that of PDF. Test case passed");
			logger.createNode("Object Type-ControlUnitStateType is matched with that of PDF.").pass("Object Type-ControlUnitStateType is matched with that of PDF. Test case passed");
			logger.createNode("New Value-0200 is matched with that of PDF.").pass("New Value-0200 is matched with that of PDF. Test case passed");
		}
		@Test(priority = 5)
		public void VehicleData_OrdersOfTheftRelevantParts() throws InterruptedException, IOException {
			logger = extent.createTest("U-214:(AU) Generate pdf for Theft Relevant Parts Order");
			vehicledatapage.revert();
			vehicledatapage.searchCategoryNumber(vehicledatapage.PDFTheftRelvnt);
			String vinNumberUI = vehicledatapage.fetchVinNumber();
			Thread.sleep(5000);
			logger.createNode("GClassOldFinNumberInput- " + vehicledatapage.TruckFinInput+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category").pass(vehicledatapage.TruckFinInput+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
			vehicledatapage.OrderOfTheftReleventTab();
			logger.createNode("Orders of theft relevant parts tab is clicked").pass("Orders of theft relevant parts tab is clicked. Test case passed.");
			warmup6();
			}
		@Test(priority = 6)
		public void OrdersOfTheftRelevantParts_PDF() throws InterruptedException, IOException {
			vehicledatapage.OrdersOfTheftRelevantParts_PDF();
			logger.createNode("FIN No-WDCZG9CH4GX264293 is matched with that of PDF.").pass("FIN No-WDCZG9CH4GX264293 is matched with that of PDF. Test case passed");
			logger.createNode("Status-Delivered is matched with that of PDF.").pass("Status-Delivered is matched with that of PDF. Test case passed");
			logger.createNode("Order no-6 6 807 00008 is matched with that of PDF.").pass("Order no-6 6 807 00008 is matched with that of PDF. Test case passed");
			//logger.createNode("Engine no-642884 41 907220 is matched with that of PDF.").pass("Engine no-642884 41 907220 is matched with that of PDF. Test case passed");
			//logger.createNode("Transmission no-722638 20 248499 is matched with that of PDF.").pass("Transmission no-722638 20 248499 is matched with that of PDF. Test case passed");
			//logger.createNode("VPD Ident-10037 is matched with that of PDF.").pass("VPD Ident-10037 is matched with that of PDF. Test case passed");
			logger.createNode("Designation-Brake Unit is matched with that of PDF.").pass("Designation-Brake Unit is matched with that of PDF. Test case passed");
			logger.createNode("Code-040U is matched with that of PDF.").pass("Code-040U is matched with that of PDF. Test case passed");
			//logger.createNode("Paint Code-9040 is matched with that of PDF.").pass("Paint Code-9040 is matched with that of PDF. Test case passed");
			logger.createNode("Code-ZE0 is matched with that of PDF.").pass("Code-ZE0 is matched with that of PDF. Test case passed");
			//logger.createNode("SAA Number-50400240 is matched with that of PDF.").pass("SAA Number-50400240 is matched with that of PDF. Test case passed");
			//logger.createNode("Plant Text-Werkstexte aus dem Aggregatewerk is matched with that of PDF.").pass("Plant Text-Werkstexte aus dem Aggregatewerk is matched with that of PDF. Test case passed");
			logger.createNode("Diogenes Short Name-MSG is matched with that of PDF.").pass("Diogenes Short Name-MSG is matched with that of PDF. Test case passed");
			logger.createNode("Designation-MSG Motor-Steuergerä is matched with that of PDF.").pass("Designation-MSG Motor-Steuergerä is matched with that of PDF. Test case passed");
			logger.createNode("Object Type-ControlUnitStateType is matched with that of PDF.").pass("Object Type-ControlUnitStateType is matched with that of PDF. Test case passed");
			//logger.createNode("New Value-38363439333032323531 is matched with that of PDF.").pass("New Value-38363439333032323531 is matched with that of PDF. Test case passed");
		}

		//KELKARK
//		@Test(priority = 7)
//		public void loginto_PartsIdentification_AU() {
//			vehicledatapage.revert();
//			partsIdentificationPage = homePage.PartsIdentification();
//			logger = extent.createTest("U-118 :(AU) Print: Generate parts identification pdf for reconditioned parts");
//			logger.createNode("Navigate to parts identification page").pass("Navigate to parts identification page. Test case passed");
//		}
//		@Test(priority = 8)
//		public void GeneratePartsIdentificationPDF_ReconditionedParts() throws Exception {
//			partsIdentificationPage.SpareParts_tab();
//			logger.createNode("Parts code tab is displayed").pass("Parts code tab is clicked. Test case passed.");
//			partsIdentificationPage.SearchInput_ByPartsCode();
//			logger.createNode("Parts code option selected from dropdown").pass("Pass part code as- 01001 & click on search button. Test case passed.");
//			partsIdentificationPage.ClickOn_Print_pdf();
//			warmup5();
//			//To get pdf file name
//				String pdfFileName= partsIdentificationPage.GetDownloadedFileName_NewTab();
//				System.out.println("url 1-"+driver.getCurrentUrl());
//				String fetchAllPDFData =partsIdentificationPage.FetchAllPDFData(pdfFileName);
//				logger.createNode("Print icon is displayed").pass("Print icon is clicked & PDF File gets downloaded. Test case passed");
//				//Assert.assertTrue(fetchAllPDFData.contains("Spare parts"));
//			   	//logger.createNode("Section- Spare parts is matched with that of PDF").pass("Section- Spare parts is matched with that of PDF. Test case passed");
//				//Assert.assertTrue(fetchAllPDFData.contains("A 402 010 45 02 80"));
//				//logger.createNode("RP object number is matched with that of PDF").pass("RP object number- A402010450280 is matched with that of PDF. Test case passed");
//				//Assert.assertTrue(fetchAllPDFData.contains("01001"));
//				//logger.createNode(" Parts code is matched with that of PDF").pass("Parts code- 01001 is matched with that of PDF. Test case passed");
//				Assert.assertTrue(fetchAllPDFData.contains("SAA numbers"));
//				logger.createNode("Section- SAA number is matched with that of PDF").pass("Section- SAA number is matched with that of PDF. Test case passed");
//				//Assert.assertTrue(fetchAllPDFData.contains("08313112"));
//				//logger.createNode("SAA number is matched with that of PDF").pass("SAA number- 08313112 is matched with that of PDF. Test case passed");
//				//Assert.assertTrue(fetchAllPDFData.contains("ELIMINATION POWER STEERING PUMP"));
//				//logger.createNode("Designation is matched with that of PDF").pass("Designation- ELIMINATION POWER STEERING PUMP is matched with that of PDF. Test case passed");
//
//			//open PDF in newtab for screenshot
//			String dest= partsIdentificationPage.OpenPDF_InNewTab_AndTakeScreenshot(pdfFileName, "xyz");
//			logger.addScreenCaptureFromPath(dest);
//
//		}
//
//		@Test(priority = 9)
//		public void GeneratePartsIdentificationPDF_PartsFamily_C74s() throws Exception {
//			logger = extent.createTest("U-231 :(AU) Print: Generate parts identification pdf for parts family C74");
//			partsIdentificationPage.NoteInfoC74_tab();
//			logger.createNode("Note info C74 tab is displayed").pass("Note info C74 tab is clicked. Test case passed.");
//			partsIdentificationPage.Pass_NoteInfo_C74Tab_Search();
//			partsIdentificationPage.ClickOn_Print_pdf();
//			warmup5();
//			//To get pdf file name
//				String pdfFileName= partsIdentificationPage.GetDownloadedFileName_NewTab();
//				System.out.println("url 1-"+driver.getCurrentUrl());
//				String fetchAllPDFData =partsIdentificationPage.FetchAllPDFData(pdfFileName);
//				logger.createNode("Print icon is displayed").pass("Print icon is clicked & PDF File gets downloaded. Test case passed");
//				Assert.assertTrue(fetchAllPDFData.contains("Note info C74"));
//				logger.createNode("Section- Note info C74 is matched with that of PDF").pass("Section- Note info C74 is matched with that of PDF. Test case passed");
//				Assert.assertTrue(fetchAllPDFData.contains("HWA 129 270 01 00 80"));
//				logger.createNode("Part number is matched with that of PDF").pass("Part number- HWA 129 270 01 00 80 is matched with that of PDF. Test case passed");
//				Assert.assertTrue(fetchAllPDFData.contains("Info text"));
//				logger.createNode("Info text is matched with that of PDF").pass("Info text is matched with that of PDF. Test case passed");
//				//open PDF in newtab for screenshot
//			String dest= partsIdentificationPage.OpenPDF_InNewTab_AndTakeScreenshot(pdfFileName, "xyz1");
//			logger.addScreenCaptureFromPath(dest);
//		}
		@Test(priority = 10)
		public void loginto_Logs_AU() {
			logsdatapage.revert();
			logsdatapage = homePage.LogsModule();
			logger = extent.createTest("U-150 :(AU) Generate pdf for Personal Change Log");
			logger.createNode("Navigate to Logs page").pass("Navigate to Logs page. Test case passed");
			logsdatapage.search_MyModifications();
			logger.createNode("Search button is clicked & logs are displayed").pass("Search button is clicked & logs are displayed. Test case passed");
			warmup6();
		}
		@Test(priority = 11)
		public void Logs_PDF() throws InterruptedException, IOException {
			logsdatapage.Logs_PDF();
			logger.createNode("Type Of Modification-Change is matched with that of PDF.").pass("Type Of Modification-Change is matched with that of PDF. Test case passed");
			logger.createNode("Tab-Vehicle State is matched with that of PDF.").pass("Tab-Vehicle State is matched with that of PDF. Test case passed");
			logger.createNode("Engine no-642884 41 907220 is matched with that of PDF.").pass("Engine no-642884 41 907220 is matched with that of PDF. Test case passed");
			logger.createNode("Attribute Name-Status is matched with that of PDF.").pass("Attribute Name-Status is matched with that of PDF. Test case passed");
			logger.createNode("Old Value-Delivered is matched with that of PDF.").pass("Old Value-Delivered is matched with that of PDF. Test case passed");
			logger.createNode("New Value-Stolen is matched with that of PDF.").pass("New Value-Stolen is matched with that of PDF. Test case passed");
			}

////	@Test(priority = 7)
////	public void a() throws InterruptedException, IOException {
////	     URL url = new URL("C://Users//swvarad//Downloads//790001MA000222_D0X12967_2022-04-18_184255.pdf");	
////	     InputStream is = is = url.openStream();
////	     BufferedInputStream fileParse = new BufferedInputStream(is);
////	     PDDocument document = null;
////	     document = PDDocument.load(fileParse);
////	     String pdfContent = new PDFTextStripper().getText(document);
////	     System.out.println(pdfContent);
////	     Assert.assertTrue(pdfContent.contains("High-voltage battery number"));
////		}
////	
//	
////	@Test(priority = 4)
////	public void identification_Variant_Data() throws InterruptedException {
////	if(majorassemblypage.identification_Variant_Data().length()>0) {
////		logger.createNode("Variant field is displayed with the data - " + majorassemblypage.identification_Variant_Data()).pass("Variant field is displayed with the data - " + majorassemblypage.identification_Variant_Data() + ". Test case passed");
////	}else {
////		logger.createNode("Variant field is displayed as blank").warning("Variant field is displayed as blank");
////	}
////	}
////	
////	@Test(priority = 5)
////	public void identification_PartNumber_Data() throws InterruptedException {
////	if(majorassemblypage.identification_PartNumber_Data().length()>0) {
////		logger.createNode("Part Number field is displayed with the data - " + majorassemblypage.identification_PartNumber_Data()).pass("Part Number field is displayed with the data - " + majorassemblypage.identification_PartNumber_Data() + ". Test case passed");
////	}else {
////		logger.createNode("Part Number field is displayed as blank").warning("Part Number field is displayed as blank");
////	}
////	}
////	
////	@Test(priority = 6)
////	public void identification_LuNumber_Data() throws InterruptedException {
////	if(majorassemblypage.identification_LuNumber_Data().length()>0) {
////		logger.createNode("LU Number field is displayed with the data - " + majorassemblypage.identification_LuNumber_Data()).pass("LU Number field is displayed with the data - " + majorassemblypage.identification_LuNumber_Data() + ". Test case passed");
////	}else {
////		logger.createNode("LU Number field is displayed as blank").warning("LU Number field is displayed as blank");
////	}
////	}
////	
////	
////	@Test(priority = 7)
////	public void identification_ProductionNumber_Data() throws InterruptedException {
////	if(majorassemblypage.identification_ProductionNumber_Data().length()>0) {
////		logger.createNode("Production Number field is displayed with the data - " + majorassemblypage.identification_ProductionNumber_Data()).pass("Production Number field is displayed with the data - " + majorassemblypage.identification_ProductionNumber_Data() + ". Test case passed");
////	}else {
////		logger.createNode("Production Number field is displayed as blank").warning("Production Number field is displayed as blank");
////	}
////	}
		@AfterMethod
		public void teardown1(ITestResult result) throws IOException {

			if (result.getStatus() == ITestResult.SUCCESS) {
				logger.log(Status.PASS, "Test Case passed is " + result.getName());
				String screenshotPath = VehicleDataPageTest.getScreenshot(driver, result.getName());
				logger.addScreenCaptureFromPath(screenshotPath);
			}

			else if (result.getStatus() == ITestResult.FAILURE) {
				logger.log(Status.FAIL, "Test Case Failed is " + result.getName());
				logger.log(Status.FAIL, result.getThrowable());
				String screenshotPath = VehicleDataPageTest.getScreenshot(driver, result.getName());
				logger.addScreenCaptureFromPath(screenshotPath);
			}
		}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}	
