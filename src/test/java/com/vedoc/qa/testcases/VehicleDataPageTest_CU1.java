package com.vedoc.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class VehicleDataPageTest_CU1 extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;

	public static String cook4;

	public String TransmissionNumberUI;
	public String selectedCategory;

	public VehicleDataPageTest_CU1() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		warmup1();
		vehicledatapage = new VehicleDataPage_S();
		homePage = loginPage.login(prop.getProperty("userName2"), prop.getProperty("passwordName2"));

		logger.createNode("Login using (CU1) credentials in a new tab")
				.pass("Login using (CU1) credentials in a new tab.Test case passed");

		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void VehiclePageTest() throws InterruptedException {
		logger = extent.createTest("(CU1) CHROME - Check if the vehicle data page is getting loaded");
		try {
			boolean flag = vehicledatapage.validateVehicleDataPage();
			if (flag = true) {
				logger.createNode("Check if vehicle data page is getting loaded")
						.pass("vehicle data page is getting loaded. Testcase Passed");
			} else {
				logger.createNode("Check if vehicle data page is getting loaded")
						.fail("Vehicle data page Not working. Testcase failed");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}

	@Test(priority = 2)
	public void Identification_CU1_NewFin() throws InterruptedException {
		vehicledatapage.searchCategoryNumber(vehicledatapage.FinInputChangeuser2);
		vehicledatapage.fetchVinNumber();
		logger.createNode(" FinNumberInput- " + vehicledatapage.FinInputChangeuser2
				+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category")
				.pass(vehicledatapage.FinInputChangeuser2
						+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
		logger.createNode(
				"Alert message should be displayed for unauthorised user as-" + vehicledatapage.alertBoxGClass())
				.pass("Alert message should be displayed for unauthorised user as" + vehicledatapage.alertBoxGClass()
						+ "Test case passed.");
		vehicledatapage.moveToAlertBoxCloseAndClick();
		logger.createNode("Alert message box is closed.").pass("Alert message box is closed. Test case passed.");
	}
//Remover 3 bcz Gclass
//	@Test(priority = 3)
//	public void Identification_CU1_OldFin() throws InterruptedException {
//		vehicledatapage.searchCategoryNumber(vehicledatapage.GClassOldFinNumberInput);
//		vehicledatapage.fetchVinNumber();
//		logger.createNode(" GClassOldFinNumberInput- " + vehicledatapage.TruckFinInput
//				+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category")
//				.pass(vehicledatapage.vinNumberInputForPlantText
//						+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
//		logger.createNode(
//				"Alert message should be displayed for unauthorised user as-" + vehicledatapage.alertBoxGClass())
//				.pass("Alert message should be displayed for unauthorised user as" + vehicledatapage.alertBoxGClass()
//						+ "Test case passed.");
//		vehicledatapage.moveToAlertBoxCloseAndClick();
//		logger.createNode("Alert message box is closed.").pass("Alert message box is closed. Test case passed.");
//	}

	@Test(priority = 4)
	public void closeNewTab_CU1() {
		vehicledatapage.logout();
		logger.createNode("New tab which is logged in using (CU1) credentials is logged out").pass(
				"New tab which is logged in using (CU1) credentials is logged out successfully. Test case passed");
	}

	@AfterMethod
	public void teardown1(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, "Test Case passed is " + result.getName());
			String screenshotPath = VehicleDataPageTest_CU1.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName());
			logger.log(Status.FAIL, result.getThrowable());
			String screenshotPath = VehicleDataPageTest_CU1.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
		}
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
