package com.vedoc.qa.testcases;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.LogsPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class LogsTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	LogsPage logsdatapage;
	public static String cook4;
	
	public LogsTest() {
		super();
	}
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		warmup1();
		logsdatapage= new LogsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
        Thread.sleep(30000);
		logsdatapage = homePage.LogsModule();
	}


	@Test(priority = 1)
	public void conflictLog() throws InterruptedException {
		logger = extent.createTest("CHROME - Check if the vehicle data page is getting loaded");
		warmup1();
		logsdatapage.conflictLog();
		logger.createNode("'Conflict Log' tab is clicked").pass("'Conflict Log' tab is clicked. Test case is passed");
     	logsdatapage.search();
		logger.createNode("Data's are searched").pass("Data's are searched. Test case is passed");
	}
	
	@Test(priority = 2)
	public void newToResolveStatus() throws InterruptedException {
		logsdatapage.conflictMessages();
		logger = extent.createTest("Select the conflict message from 'New' status and move to 'Resolve' status");
		logger.createNode("A conflict message is which is in 'New' selected").pass("A conflict message is which is in 'New' selected. Test case is passed");;
		logger.createNode("Conflict message which is in 'New' status:  " + logsdatapage.conflictMessages()).pass("Conflict message which is in 'New' status:" + logsdatapage.conflictMessages()+"Test case passed.");
		logsdatapage.resolvedIcon();
		logger.createNode("Resolved Icon is clicked").pass("Resolved Icon is clicked. Test case is passed");
		logsdatapage.save();
		logger.createNode("Save Icon is clicked").pass("Save Icon is clicked. Test case is passed");
		warmup1();
		logsdatapage.resolvedOption();
		logger.createNode("'Resolved' option is selected from 'Status' drop down menu").pass("'Resolved' option is selected from 'Status' drop down menu. Test case is passed");
     	logsdatapage.search();
		logger.createNode("'Search' button is clicked").pass("'Search' button is clicked. Test case is passed");
		warmup1();
		logsdatapage.statusChangeCheck();
		logger.createNode("The conflict message which was in 'New' staus is moved to 'Resolved' status").pass("The conflict message which was in 'New' staus is moved to 'Resolved' status. Test case is passed");
	} 

	@Test(priority = 3)
	public void resolveToIgnore() throws InterruptedException {
		logsdatapage.conflictMessages();
		logger = extent.createTest("Select the conflict message from 'Resolve' status and move to 'Ignore' status");
		logger.createNode("Conflict message which is in 'Resolve' status:  " + logsdatapage.conflictMessages()).pass("Conflict message which is in 'Resolve' status:" + logsdatapage.conflictMessages()+" Test case is passed");
		logsdatapage.ignoreIcon();
		logger.createNode("Ignore Icon is clicked").pass("Ignore Icon is clicked. Test case is passed");
		logsdatapage.save();
		logger.createNode("Save Icon is clicked").pass("Save Icon is clicked. Test case is passed");
		warmup1();
		logsdatapage.ignoredOption();
		logger.createNode("'Ignore' option is selected from 'Status' drop down menu").pass("'Ignore' option is selected from 'Status' drop down menu. Test case is passed");
     	logsdatapage.search();
		logger.createNode("'Search' button is clicked").pass("'Search' button is clicked. Test case is passed");
		warmup1();
		logsdatapage.statusChangeCheck();
		logger.createNode("The conflict message which was in 'Resolved' staus is moved to 'Ignore' status").pass("The conflict message which was in 'Resolved' staus is moved to 'Ignore' status. Test case is passed");
	}

	@Test(priority = 4)
	public void ignoreToNew() throws InterruptedException {
		logsdatapage.conflictMessages();
		logger = extent.createTest("Select the conflict message from 'Ignore' status and move to 'New' status").pass("Select the conflict message from 'Ignore' status and move to 'New' status. Test case is passed");
		logger.createNode("Conflict message which is in 'Ignore' status:  " + logsdatapage.conflictMessages()).pass("Conflict message which is in 'Ignore' status:" + logsdatapage.conflictMessages()+" Test case is passed");
		logsdatapage.resetIcon();
		logger.createNode("Reset Icon is clicked").pass("Reset Icon is clicked. Test case is passed");
		logsdatapage.save();
		logger.createNode("Save Icon is clicked").pass("Save Icon is clicked. Test case is passed");
		warmup1();
		logsdatapage.newOption();
		logger.createNode("'New' option is selected from 'Status' drop down menu").pass("'New' option is selected from 'Status' drop down menu. Test case is passed");
		logsdatapage.scrollToSearch();
     	logsdatapage.search();
		logger.createNode("'Search' button is clicked").pass("'Search' button is clicked. Test case is passed");
		warmup1();
		logsdatapage.statusChangeCheck();
		logger.createNode("The conflict message which was in 'Ignore' staus is moved to 'New' status").pass("The conflict message which was in 'Ignore' staus is moved to 'New' status. Test case is passed");
	}
	@Test(priority = 5)
	public void acknowledgmentLogExport() throws InterruptedException {
		logger = extent.createTest("U-261 : (AU) Show outbound acknowledge log");
		logsdatapage.acknowledgementLog();
		logger.createNode("'Acknowledgement Log' tab is clicked").pass("'Acknowledgement Log' tab is clicked. Test case is passed");
     	logsdatapage.acknowledgementLogSearch();
		logger.createNode("Data is searched").pass("Data is searched. Test case is passed");
		warmup6();
		logsdatapage.acknowledgementLogDate();
		logger.createNode("From & To dates are entered").pass("From & To dates are entered. Test case is passed");
		warmup6();
		logsdatapage.acknowledgementLogSearch();
		logger.createNode("Data is searched with new input values").pass("Data is searched with new input values. Test case is passed");
		warmup6();
		logsdatapage.acknowledgementLogExport();
	    logger.createNode("Export table button is clicked & CSV File gets downloaded").pass("Count of rows in CSV File is matched. Test Case Passed");
	}
	@Test(priority = 6)
	public void acknowledgmentLog() throws InterruptedException {
		logsdatapage.acknowledgementLogProductId();
		logsdatapage.acknowledgementLogSearch();
		logger.createNode("Data is searched based on Product id").pass("Data is searched based on Product id. Test case is passed");
		logsdatapage.acknowledgementLogTechnicalId();
		logsdatapage.acknowledgementLogSearch();
		logger.createNode("Data is searched based on Technical id").pass("Data is searched based on Technical id. Test case is passed");
		logsdatapage.acknowledgementLogClearFields();
		warmup6();
		logsdatapage.acknowledgementLogSearch();
		warmup6();
		logsdatapage.acknowledgementLogFilter();
		logger.createNode("Filter is clicked & data is searched").pass("Filter is clicked & data is searched. Test case is passed");
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




