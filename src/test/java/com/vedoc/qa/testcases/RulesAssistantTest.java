package com.vedoc.qa.testcases;

import java.io.IOException;
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

import com.vedoc.qa.pages.RulesAssistantPage;


public class RulesAssistantTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	RulesAssistantPage rulesassistantPage;
	public static String cook4;
	
	public RulesAssistantTest() {
		super();
	}
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		warmup1();
		rulesassistantPage= new RulesAssistantPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
        Thread.sleep(30000);
        rulesassistantPage = homePage.RulesAssistantModule();
	}


	
	@Test(priority = 1)
	public void updateValiationRule() throws InterruptedException {
		logger = extent.createTest("U-193: (AU) Update validation rule");
		warmup5();
		rulesassistantPage.showCurrentRuleBasis();
		logger.createNode("Show current rule basis button is clicked").pass("Show current rule basis button is clicked. Test case is passed");
		rulesassistantPage.filterRule();
		logger.createNode("Existing rule has been filtered").pass("Existing rule has been filtered. Test case is passed");
		rulesassistantPage.showRule();
		logger.createNode("Existing rule has been edited").pass("Existing rule has been edited. Test case is passed");
		rulesassistantPage.saveRule();
		logger.createNode("Existing rule has been saved after changes").pass("Existing rule has been saved after changes. Test case is passed");

	}
	@Test(priority = 2)
	public void exportRuleAssistant() throws InterruptedException {
		//logger = extent.createTest("U-225 : (AU) Export data validation errors");
		rulesassistantPage.RuleAssistant_export();
	    logger.createNode("Export table button is clicked & CSV File gets downloaded").pass("Count of rows in CSV File is matched. Test Case Passed");
	}
	@Test(priority = 3)
	public void validationRuleExecution() throws InterruptedException {
		logger = extent.createTest("U-194 : (AU) Show product rule set");
		warmup5();
		rulesassistantPage.validationRuleExecutionTab();
	    logger.createNode("Validation rule execution tab is clicked").pass("Validation rule execution tab is clicked. Test Case Passed");
	    rulesassistantPage.validationRuleExecutionInput();
	    logger.createNode("Inputs are entered in different fields").pass("Inputs are entered in different fields. Test Case Passed");
	    rulesassistantPage.validateProducts();
	    logger.createNode("Validate Products button is clicked").pass("Validate Products button is clicked. Test Case Passed");
	    }

	@Test(priority = 4)
	public void testResults() throws InterruptedException {
		logger = extent.createTest("U-195 : (AU) Manage validation test runs");
		rulesassistantPage.testResultsTab();
	    logger.createNode("Test Results tab is clicked").pass("Test Results tab is clicked. Test Case Passed");
	    rulesassistantPage.testRunTabSearch();
	    logger.createNode("Search button is clicked").pass("Search button is clicked. Test Case Passed");
	    rulesassistantPage.testRunTabFilter();
	    logger.createNode("Data is filtered on basis of logged in user id").pass("Data is filtered on basis of logged in user id. Test Case Passed");
	    rulesassistantPage.testRunReport();
	    logger.createNode("Eye icon is clicked to verify report").pass("Eye icon is clicked to verify report. Test Case Passed");
	    rulesassistantPage.testResultsTabFilter();
	    logger.createNode("Data is filtered on basis of input provided").pass("Data is filtered on basis of input provided.Test case passed.");
	    rulesassistantPage.testResultsTabExport();
	    logger.createNode("Export table button is clicked & CSV File gets downloaded").pass("Count of rows in CSV File is matched. Test Case Passed");
		}
//	@Test(priority = 6)
//	public void snapshotAdministration() throws InterruptedException {
//		logger = extent.createTest("U-190 : (AU) Manage snapshots");
//		rulesassistantPage.snapshotAdministration();
//	    logger.createNode("Snapshot Administration tab is clicked").pass("Snapshot Administration tab is clicked. Test Case Passed");
//	    rulesassistantPage.snapshotAdministrationShow();
//	    logger.createNode("Show Data button is clicked").pass("Show Data button is clicked. Test Case Passed");
//	    rulesassistantPage.snapshotAdministrationCreate();
//	    logger.createNode("New Snapshot is created").pass("New Snapshot is created. Test Case Passed");
//	    rulesassistantPage.snapshotAdministrationFilter();
//	    logger.createNode("Data is filtered on basis of logged in user id").pass("Data is filtered on basis of logged in user id. Test Case Passed");
//	    rulesassistantPage.snapshotAdministrationProductive();
//	    logger.createNode("New snapshot is marked as productive").pass("New snapshot is marked as productive.Test case passed.");
//	    rulesassistantPage.snapshotAdministrationDeletion();
//	    logger.createNode("New snapshot is deleted").pass("New snapshot is deleted.Test case passed.");
//	    rulesassistantPage.snapshotAdministrationNonProductive();
//	    logger.createNode("Original data is reverted back to Productive state").pass("Original data is reverted back to Productive state. Test Case Passed");
//	   }
//	@Test(priority = 7)
//	public void revertOriginalRule() throws InterruptedException {
//		logger = extent.createTest("U-193: (AU) Update validation rule");
//		rulesassistantPage.ruleBasisTab();
//		logger.createNode("Navigated to rule basis tab").pass("Navigated to rule basis tab. Test case is passed");
//		rulesassistantPage.showCurrentRuleBasis();
//		logger.createNode("Show current rule basis button is clicked").pass("Show current rule basis button is clicked. Test case is passed");
//		rulesassistantPage.filterRule();
//		logger.createNode("Existing rule has been filtered").pass("Existing rule has been filtered. Test case is passed");
//		rulesassistantPage.revertRule();
//		logger.createNode("Existing rule has been reverted back to original values").pass("Existing rule has been reverted back to original values. Test case is passed");
//		rulesassistantPage.saveRule();
//		logger.createNode("Existing rule has been saved after changes").pass("Existing rule has been saved after changes. Test case is passed");
//		}
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




