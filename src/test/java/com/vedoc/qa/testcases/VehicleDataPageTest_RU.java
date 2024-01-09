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

public class VehicleDataPageTest_RU extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;

	public static String cook4;

	public String TransmissionNumberUI;
	public String selectedCategory;

	public VehicleDataPageTest_RU() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		warmup1();
		vehicledatapage = new VehicleDataPage_S();
		homePage = loginPage.login(prop.getProperty("stduser"), prop.getProperty("stdPassword"));

		logger = extent.createTest(
				"U-015: (RU) Login using Reading User credentials in a new tab and search for previously accessed 'WDDGF4HB7EA953094' Vin number. Last access by technical advisor popup is not displayed");
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void VehiclePageTest() throws InterruptedException {
		logger = extent.createTest("(AU) CHROME - Check if the vehicle data page is getting loaded");
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

	// *****Test from vehicle data page_ReadingUser****

	@Test(priority = 2)
	public void search() throws InterruptedException {
		vehicledatapage.searchfin();
		logger = extent.createTest("(RU) Vin number 'W1T96763720433506' is entered and search button is clicked");
		logger.createNode("Vin number 'W1T96763720433506' is entered and search button is clicked")
				.pass("Vin number 'W1T96763720433506' is entered and search button is clicked. Test case passed");
	}

	@Test(priority = 3)
	public void controlUnitsTab_EditButton() throws InterruptedException {
		logger = extent.createTest("U-005, U-014: Check whether edit button is displayed in the Control Unit table");
		vehicledatapage.controlUnitTab();
		logger.createNode("Control unit Tab is clicked")
				.pass("Control unit button is clicked successfully. Test Case Passed");
		try {
			boolean displayFlag = vehicledatapage.controlUnitsTab_EditButton();
			if (displayFlag)
				logger.createNode("Edit button in the Control Unit table is displayed")
						.fail("Edit button in the Control Unit table is displayed. Test case failed");
			else
				logger.createNode("Edit button in the Control Unit table is not displayed")
						.pass("Edit button in the Control Unit table is not displayed. Test case passed");
		} catch (NoSuchElementException e) {
			logger.createNode("Edit button in the Control Unit table is not available")
					.pass("Edit button in the Control Unit table is not available. Test case passed");

		}
	}

//********* Navigation Tab *************//

//	@Test(priority = 4)
//	public void existingMapversionsTable() throws InterruptedException {
//		logger = extent.createTest(
//				"U-171: (RU) Check whether the data is displayed inside the 'Existing Map Versions' table under 'Navigation' tab");
//		vehicledatapage.navigation();
//		try {
//			vehicledatapage.existingMapVersionTableData();
//			List<WebElement> elements = vehicledatapage.emvFetchRows();
//			System.out.println(elements.size());
//			logger.createNode("Rows displayed in the table : " + elements.size())
//					.pass(elements.size() + " - are the numbers of rows displayed in the table");
//			for (WebElement emvTabledata : elements) {
//				System.out.println(emvTabledata.getText());
//				logger.createNode(emvTabledata.getText()
//						+ " are the values displayed under 'Map Version' , 'DVD Object Number' and 'License object number' columns")
//						.pass(emvTabledata.getText()
//								+ "   -   are the values displayed under 'Map Version' , 'DVD Object Number' and 'License object number' columns respectively");
//			}
//		} catch (Exception e) {
//			logger.createNode("'Existing Map Version' table is empty")
//					.pass("Values are not displayed in the Existing Map Version table");
//		}
//	}
//
//	@Test(priority = 5)
//	public void possibleMapversionsTable() throws InterruptedException {
//		logger = extent.createTest(
//				"U-171: (RU) Check whether the data is displayed inside 'Possible Map Versions' table under 'Navigation' tab");
//		try {
//			vehicledatapage.existingMapVersionTableData();
//			vehicledatapage.showExpandedView();
//			List<WebElement> elements = vehicledatapage.pmvFetchRows();
//			System.out.println(elements.size());
//			logger.createNode("Rows displayed in the table : " + elements.size())
//					.pass(elements.size() + " - are the numbers of rows displayed in the table");
//			for (WebElement pmvTableData : elements) {
//				System.out.println(pmvTableData.getText());
//				logger.createNode(pmvTableData.getText()
//						+ " are the values displayed under 'Map Version' , 'DVD Object Number' and 'License object number' columns")
//						.pass(pmvTableData.getText()
//								+ "   -   are the values displayed under 'Map Version' , 'DVD Object Number' and 'License object number' columns respectively");
//			}
//		} catch (Exception e) {
//			logger.createNode("'Possible Map Version' table is empty")
//					.pass("Values are not displayed in the Possible Map Version table");
//		}
//	}
//
//	@Test(priority = 6)
//	public void editMajorVersionsButton() throws InterruptedException {
//		logger = extent.createTest(
//				"U-171: (RU) Check whether 'Edit major versions' button is displayed for editing row in 'Navigation CompatabilityIdentifier (Major Versions)' table under the 'Vehicle Data' module");
//		try {
//			boolean displayFlag = vehicledatapage.editMajorVersionsButton();
//			if (displayFlag)
//				logger.createNode("'Edit major versions' button is displayed")
//						.fail("'Edit major versions' button is displayed");
//			else
//				logger.createNode("'Edit major versions' button is not displayed")
//						.pass("'Edit major versions' button is not displayed");
//		} catch (NoSuchElementException e) {
//			logger.createNode("'Edit major versions' button is not available")
//					.pass("'Edit major versions' button is not available");
//		}
//	}
//
//	@Test(priority = 7)
//	public void navigationCompatibilityIdentifier_Table() throws InterruptedException {
//		logger = extent.createTest(
//				"U-171: (RU) Check whether 'Navigation CompatabilityIdentifier (Major Versions)' table under the 'Vehicle Data' module");
//		try {
//			boolean displayFlag = vehicledatapage.navigationCompatibilityIdentifier_Table();
//			if (displayFlag)
//				logger.createNode("'Navigation CompatabilityIdentifier (Major Versions)' table is displayed")
//						.fail("'Navigation CompatabilityIdentifier (Major Versions)' table is displayed");
//			else
//				logger.createNode("'Navigation CompatabilityIdentifier (Major Versions)' table is not displayed")
//						.pass("'Navigation CompatabilityIdentifier (Major Versions)' table is not displayed");
//		} catch (NoSuchElementException e) {
//			logger.createNode("'Navigation CompatabilityIdentifier (Major Versions)' table is not available")
//					.pass("'Navigation CompatabilityIdentifier (Major Versions)' table is not available");
//		}
//	}

//	@Test(priority = 8)
//	public void addActivationcodeInfoButton() throws InterruptedException {
//		logger = extent.createTest(
//				"U-171: (RU) Check whether 'Add Activation Code Info' button is displayed for editing row in 'Navigation CompatabilityIdentifier (Major Versions)' table under the 'Vehicle Data' module");
//		try {
//			boolean displayFlag = vehicledatapage.addActivationcodeInfoButton();
//			if (displayFlag)
//				logger.createNode("'Add Activation Code Info' button is displayed")
//						.fail("'Add Activation Code Info' button is displayed");
//			else
//				logger.createNode("'Add Activation Code Info' button is not displayed")
//						.pass("'Add Activation Code Info' button is not displayed");
//		} catch (NoSuchElementException e) {
//			logger.createNode("'Add Activation Code Info' button is not available")
//					.pass("'Add Activation Code Info' button is not available");
//		}
//	}
//
//	@Test(priority = 9)
//	public void informationOnLicenseKeyGenearation_Table() throws InterruptedException {
//		logger = extent.createTest(
//				"U-171: (RU) Check whether 'Information On License Key Genearation' table under the 'Vehicle Data' module");
//		try {
//			boolean displayFlag = vehicledatapage.informationOnLicenseKeyGenearation_Table();
//			if (displayFlag)
//				logger.createNode("'Information On License Key Genearation' table is displayed")
//						.fail("'Information On License Key Genearation' table is displayed");
//			else
//				logger.createNode("'Information On License Key Genearation' table is not displayed")
//						.pass("'Information On License Key Genearation' table is not displayed");
//		} catch (NoSuchElementException e) {
//			logger.createNode("'Information On License Key Genearation' table is not available")
//					.pass("'Information On License Key Genearation' table is not available");
//		}
//	}

////********* FO Tab *************//
//
////         @Test(priority=9)
////         public void addTextButton() throws InterruptedException {
////                        logger = extent
////                                                      .createTest("U-171 : Check whether 'Add Text' button is displayed under 'Fo Texts' tab");
////                            vehicledatapage.foTexts();
////                                       logger.createNode("'Fo Texts' tab is clicked");
////                                       vehicledatapage.addTextButton();
////                                       logger.createNode("'Add text' button is clicked");
////                                       vehicledatapage.engineCaseClick();
////                                       logger.createNode("'Engine case' option is selected from 'DG table FO'");
////                                       vehicledatapage.textContent_Enter();
////                                       logger.createNode("'Text content' field is entered with the data - Create Engine Case");
////                                       vehicledatapage.submit();
////                                       vehicledatapage.save();
////                                       logger.createNode("Click on 'Save' button");
////                                       vehicledatapage.createdEngineCase_Click();
////                                       vehicledatapage.removeAddedText();
////                                       logger.createNode("Created FO Table row is deleted");
////                                       vehicledatapage.save();
////                                       logger.createNode("'Save' button is clicked");
////}

	@Test(priority = 10)
	public void edit() throws InterruptedException {
		logger = extent.createTest(
				"U-171: (RU) Check whether 'Edit' button is displayed for editing row in 'FO' table under 'Fo Texts' tab");
		try {
			// vehicledatapage.foTexts();
			// logger.createNode("'Fo Texts' tab is clicked");
			boolean displayFlag = vehicledatapage.edit();
			if (displayFlag)
				logger.createNode("'Edit' button is displayed").fail("'Edit' button is displayed");
			else
				logger.createNode("'Edit' button is not displayed").pass("'Edit' button is not displayed");
		} catch (NoSuchElementException e) {
			logger.createNode("'Edit' button is not available").pass("'Edit' button is not available");
		}
	}

	@Test(priority = 11)
	public void dgTableFoFetchRows() throws InterruptedException {
		logger = extent.createTest(
				"U-136: (RU) Check whether the data is displayed in 'DG table FO' table under 'Fo Texts' tab");
		vehicledatapage.foTexts();
		vehicledatapage.dgTableFOTableData();
		try {
			List<WebElement> elements = vehicledatapage.dgTableFoFetchRows();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the table");
			for (WebElement dgTableFodata : elements) {
				System.out.println(dgTableFodata.getText());
				logger.createNode(
						dgTableFodata.getText() + " are the values displayed under 'DG' and 'Designation' columns")
						.pass(dgTableFodata.getText()
								+ "   -   are the values displayed under 'DG' and 'Designation' columns respectively");
			}
		} catch (Exception e) {
			logger.createNode("DG Table FO is empty").pass("Values are not displayed in the DG Table FO");
		}
	}

	@Test(priority = 12)
	public void foTableFetchRows() throws InterruptedException {
		logger = extent
				.createTest("U-136: (RU) Check whether the data is displayed in 'FO' table under 'Fo Texts' tab");
		try {
			vehicledatapage.foTableData();
			List<WebElement> elements = vehicledatapage.foTableFetchRows();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the table");
			for (WebElement foTableData : elements) {
				System.out.println(foTableData.getText());
				logger.createNode(foTableData.getText()
						+ " are the values displayed under the columns 'Text content' , 'DG' , 'Data' , 'Author' , 'Usage' , 'Automatically generated' respectively")
						.pass(foTableData.getText()
								+ "   -   are the values displayed under 'Text content' , 'DG' , 'Data' , 'Author' , 'Usage' , 'Automatically generated' columns respectively");
			}
		} catch (Exception e) {
			logger.createNode("FO table is empty").pass("Values are not displayed in the FO Table");
		}
		Thread.sleep(4000);
	}

	@Test(priority = 13)
	public void prodOrder_PlantText() throws InterruptedException {
		logger = extent.createTest(
				"U-002: (RU) Check whether the data is displayed inside 'Prod Order Text Table' table under 'Plant Text' tab");
		Thread.sleep(3000);
		vehicledatapage.plantTextTab();
		try {
			vehicledatapage.prodOptionTableData();
			List<WebElement> elements = vehicledatapage.prodOrderFetchRows();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the table");
			for (WebElement prodOrderTableData : elements) {
				System.out.println(prodOrderTableData.getText());
				logger.createNode(prodOrderTableData.getText()
						+ " are the values displayed under the columns 'Date', 'Text content' , 'Confidential' and 'Usage' respectively")
						.pass(prodOrderTableData.getText()
								+ "   -   are the values displayed under 'Date', 'Text content' , 'Confidential' and 'Usage' columns respectively");
			}
		} catch (Exception e) {
			logger.createNode("Prod Order Text Table is empty")
					.pass("Values are not displayed in the Prod Order Text Table");
		}
	}

	@Test(priority = 14)
	public void prodOrderPos_PlantText() throws InterruptedException {
		logger = extent.createTest(
				"U-002: (RU) Check whether the data is displayed inside 'Prod Order Pos Text Table' table  under 'Plant Text' tab");
		try {
			vehicledatapage.prodOrderPosTextTableData();
			List<WebElement> elements = vehicledatapage.prodOrderPosFetchRows();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the table");
			for (WebElement prodOrderPosTableData : elements) {
				System.out.println(prodOrderPosTableData.getText());
				logger.createNode(prodOrderPosTableData.getText()
						+ " are the values displayed under the columns 'No', 'Object Number' and 'Text Content' respectively")
						.pass(prodOrderPosTableData.getText()
								+ "   -   are the values displayed under 'No', 'Object Number' and 'Text Content'  columns respectively");
			}
		} catch (Exception e) {
			logger.createNode("Prod Order Pos Text Table is empty")
					.pass("Values are not displayed in the Prod Order Pos Text Table");
		}
	}

	// **** Test case from vehicle data page RU*****

	@Test(priority = 15)
	public void Truck_search_Ru() throws InterruptedException {
		vehicledatapage.searchfin();
		logger.createNode("Vin number of Vehicle Data 'W1T96763720433506' is entered and search button is clicked")
				.pass("Vin number of Vehicle Data 'W1T96763720433506' is entered and search button is clicked. Test case passed");
	}

	@Test(priority = 16)
	public void alert_Ru() {
		try {
			boolean displayFlag = vehicledatapage.alert();
			if (displayFlag) {
				logger.createNode("Last access by technical advisor popup is displayed")
						.fail("Last access by technical advisor popup is displayed successfully. Test case passed");
			} else
				logger.createNode("Last access by technical advisor popup is not displayed")
						.pass("Last access by technical advisor popup is not displayed. Test case passed");
		} catch (NoSuchElementException e) {
			logger.createNode("Last access by technical advisor popup is not available")
					.pass("Last access by technical advisor popup is not available. Test case passed");
		}
	}

	// KELKARK
	// *********Sales Tab check for RU
	@Test(priority = 17)
	public void SalesTab_ModifyCustomerServiceData_RU() throws InterruptedException {
		logger = extent.createTest("U-083:(RU) Sales tab: Modify Customer Service Data for (RU) reading User");
		vehicledatapage.searchCategoryNumber(vehicledatapage.SalesTabFinNumberInput);
		warmup5();
		logger.createNode("VIN number input- " + vehicledatapage.SalesTabFinNumberInput
				+ "\t is entered and clicked on the Search button")
				.pass(vehicledatapage.SalesTabFinNumberInput
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		warmup6();
		vehicledatapage.SalesDataTab();
		logger.createNode("Sales tab is displayed").pass("Sales tab is clicked. Test case passed.");
		warmup5();

		/* show Sales data section-RU */
		ExtentTest LoggerSalesDataRU = logger.createNode("Data fetch from section- SALES DATA");
		for (int r = 1; r <= 8; r++) {
			int elementSizeInRow = vehicledatapage.Fetch_ElementCountInRow_SalesData(r);
			String ar[] = new String[elementSizeInRow + 1];

			for (int c = 1; c <= elementSizeInRow; c++) {
				// int row = r;
				// int column = c;
				String value = vehicledatapage.Fetch_SalesData(r, c);
				ar[c] = value;
			}
			if (elementSizeInRow == 2) {
				LoggerSalesDataRU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
			} else if (elementSizeInRow == 3) {
				LoggerSalesDataRU.pass(ar[1] + " - " + ar[2] + " - " + ar[3] + ". Test case passed.");
			} else if (elementSizeInRow == 4) {
				LoggerSalesDataRU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
				LoggerSalesDataRU.pass(ar[3] + "-" + ar[4] + ". Test case passed.");
			} else if (elementSizeInRow == 5) {
				LoggerSalesDataRU.pass(ar[1] + " - " + ar[2] + " - " + ar[3] + ". Test case passed.");
				LoggerSalesDataRU.pass(ar[4] + " - " + ar[5] + ". Test case passed.");
			}
		}
		// to check edit access for-RU
		warmup6();
		try {
			boolean RUflag = vehicledatapage.editSalesDataButton_DesplayedOrNot_sd();
			if (RUflag == true) {
				logger.createNode("Edit sales data button is displayed for user- (RU) reading user")
						.fail("Reading user has the access to modify sales data. Test case passed.");

			} else {
				logger.createNode("Edit sales data button is not displayed for user- (RU) reading user")
						.pass("Reading user do not have access to modify sales data. Test case passed.");
				System.out.println("Reading user do not have access to modify sales data");
			}
		} catch (NoSuchElementException e) {
			logger.createNode("Edit sales data button is not displayed for user- (RU) reading user")
					.pass("Reading user do not have access to modify sales data. Test case passed");
			System.out.println("Reading user do not have access to modify sales data");
		}

		warmup6();

		/* show Customer service data section */
		ExtentTest LoggerCustomerServiceDataRU = logger.createNode("Data fetch from section- CUSTOMER SERVICE DATA");
		for (int r = 1; r <= 1; r++) {
			int elementSizeInRow = vehicledatapage.Fetch_ElementCountInRow_CustomerServiceData(r);
			String ar[] = new String[elementSizeInRow + 1];

			for (int c = 1; c <= elementSizeInRow; c++) {
				// int row = r;
				// int column = c;
				String value = vehicledatapage.Fetch_CustomerServiceData(r, c);
				ar[c] = value;
			}
			if (elementSizeInRow == 2) {
				LoggerCustomerServiceDataRU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
			} else if (elementSizeInRow == 4) {
				LoggerCustomerServiceDataRU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
				LoggerCustomerServiceDataRU.pass(ar[3] + "-" + ar[4] + ". Test case passed.");
			}

			// to check edit access for-RU
			try {
				boolean RUflag1 = vehicledatapage.editCustomerServiceDataButton_DesplayedOrNot_sd();
				if (RUflag1 == true) {
					logger.createNode("Edit customer service data button is displayed for user- (RU) reading user")
							.fail("Reading user has the access to modify customer service data. Test case passed.");

				} else {
					logger.createNode("Edit Customer service data button is not displayed for user- (RU) reading user")
							.pass("Reading user do not have access to modify Customer service data. Test case passed.");
					System.out.println("Reading user do not have access to modify Customer service data");
				}
			} catch (NoSuchElementException e) {
				logger.createNode("Edit Customer service data button is not displayed for user- (RU) reading user")
						.pass("Reading user do not have access to modify Customer service data. Test case passed");
				System.out.println("Reading user do not have access to modify Customer service data");
			}
		}
	}
	// KELKARK over

	// *****Test case from administrator page test*****//
	@Test(priority = 18)
	public void IdentificationTab() throws InterruptedException {
		logger = extent.createTest("U-069: (RU) Show theft message");

		vehicledatapage.searchRandomfin();
		logger.createNode("FIN Number field is provided as input into the search field - " + 1111111111
				+ RandomLabelData_FINNumber)
				.pass(1111111111 + RandomLabelData_FINNumber
						+ " is given as input into the search field successfully. Test Case Passed");
	}

	@Test(priority = 19)
	public void TheftAlert() throws InterruptedException {
		String alertMSG = vehicledatapage.theftAlert();
		logger.createNode(alertMSG + " - message is displayed")
				.pass(alertMSG + " - message is displayed. Test Case Passed");
	}

	@Test(priority = 20)
	public void closeNewTab_Ru() {
		logger = extent.createTest("U-015: (RU) New tab which is logged in using (RU) credentials is logged out");
		vehicledatapage.logout();
		logger.createNode("New tab which is logged in using (RU) credentials is logged out")
				.pass("New tab which is logged in using (RU) credentials is logged out successfully. Test case passed");
	}

	@AfterMethod
	public void teardown1(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, "Test Case passed is " + result.getName());
			String screenshotPath = VehicleDataPageTest_RU.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName());
			logger.log(Status.FAIL, result.getThrowable());
			String screenshotPath = VehicleDataPageTest_RU.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
		}
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
