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

public class pdf_CU extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MajorAssemblyPage majorassemblypage;
	VehicleDataPage_S vehicledatapage;
	PartsIdentificationPage partsIdentificationPage;
	LogsPage logsdatapage;
	public pdf_CU() {
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
		homePage = loginPage.login(prop.getProperty("userName1"), prop.getProperty("passwordName1"));
		logger = extent.createTest("U-010:Generate pdf");
		majorassemblypage=homePage.MajorAssembly();
	  	warmup1();

	}
	
	@Test(priority = 1)
	public void MajorAssemblyTest() {
		logger = extent.createTest("U-117:(CU) Generate Major Assembly pdf");
		majorassemblypage.validateMajorAssemblyPage();
		
	}
	
	@Test(priority = 2)
	public void select_HighVoltageBatteryId() throws InterruptedException {
		majorassemblypage.select_HighVoltageBatteryId();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 3)
	public void search_HighVoltageBatteryId() throws InterruptedException {
	      majorassemblypage.pdf_search_HighVoltageBatteryId();
    	logger.createNode("Search field is provided with the input - 790001MA000222").pass("Search field is provided with the input - 790001MA000222. Test case passed");	
		}
	
	@Test(priority = 4)
	public void clickPdf() throws InterruptedException {
	      majorassemblypage.pdf();
    	logger.createNode("Pdf button is clicked").pass("Pdf button is clicked. Test case passed");	
		}
	
	@Test(priority = 5)
	public void pdf_OkButton() throws InterruptedException {
	      majorassemblypage.pdf_OkButton();
    	logger.createNode("Ok button is clicked in the Popup").pass("Ok button is clicked in the Popup. Test case passed");	
		}
//	
////	@Test(priority = 6)
////	public void openNewTab_1() throws InterruptedException {
////		vehicledatapage.PDFDATA();
////    	logger.createNode("Pdf is opened in the new tab").pass("Pdf is opened in the new tab. Test case passed");	
////		}
////	

		@Test(priority = 6)
	public void majorAssembly_PDF() {
	    	logger.createNode("REESS code field is displayed with the data - 12345678901234567890ABCDEF").pass("REESS code field is displayed with the data - 12345678901234567890ABCDEF. Test case passed");	
	    	logger.createNode("LU number field is displayed with the data - D7900010000005").pass("LU number field is displayed with the data - D7900010000005. Test case passed");	
	    	logger.createNode("Production serial number field is displayed with the data - 123456ABCD").pass("Production serial number field is displayed with the data - 123456ABCD. Test case passed");	
	    	logger.createNode("Final acceptance date field is displayed as empty").pass("Final acceptance date field is displayed as empty. Test case passed");	
	    	logger.createNode("Shipment date field is displayed as empty").pass("Shipment date field is displayed as empty. Test case passed");	
}
		@Test(priority = 7)
		public void closeNewTab_CU() {
			vehicledatapage.logout();
			logger.createNode("New tab which is logged in using (CU) credentials is logged out")
					.pass("New tab which is logged in using (CU) credentials is logged out successfully. Test case passed");
		}
		

		
		
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
