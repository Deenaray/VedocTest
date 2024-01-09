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

public class VehicleDataPageTest_CU extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;

	public static String cook4;

	public String TransmissionNumberUI;
	public String selectedCategory;

	public VehicleDataPageTest_CU() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		warmup1();
		vehicledatapage = new VehicleDataPage_S();
		homePage = loginPage.login(prop.getProperty("userName1"), prop.getProperty("passwordName1"));

		logger.createNode("Login using (CU) credentials in a new tab")
				.pass("Login using (CU) credentials in a new tab.Test case passed");

		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void VehiclePageTest() throws InterruptedException {
		logger = extent.createTest("(CU) CHROME - Check if the vehicle data page is getting loaded");
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
	public void Identification_CU_NewFin() throws InterruptedException {
		vehicledatapage.searchCategoryNumber(vehicledatapage.FinInput);
		vehicledatapage.fetchVinNumber();
		logger.createNode(" FinNumberInput- " + vehicledatapage.FinInput
				+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category")
				.pass(vehicledatapage.SupportAndFeedbackFINnumber
						+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
		String fin = vehicledatapage.fin();
		if (fin.isEmpty()) {
			logger.createNode("FIN No. is not displayed for MB Commercial Vehicle.")
					.pass("FIN No. is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode("FIN No. is not displayed for MB Commercial Vehicle as: " + vehicledatapage.fin())
					.pass("FIN No. is not displayed for MB Commercial Vehicle as: " + vehicledatapage.fin()
							+ ". Test case passed");
		}
		String vin = vehicledatapage.vin();
		if (vin.isEmpty()) {
			logger.createNode("VIN No. is not displayed for for MB Commercial Vehicle.")
					.pass("VIN No. is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode("VIN No. is displayed for for MB Commercial Vehicle as:  " + vehicledatapage.vin())
					.pass("VIN No. is displayed for MB Commercial Vehicle. as: " + vehicledatapage.vin()
							+ ". Test case passed");
		}
		String brand = vehicledatapage.brand();
		if (brand.isEmpty()) {
			logger.createNode("Brand is not displayed for MB Commercial Vehicle.")
					.pass("Brand is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode("Brand is displayed for MB Commercial Vehicle as: " + vehicledatapage.brand())
					.pass("Brand is displayed for MB Commercial Vehicle as:" + vehicledatapage.brand()
							+ ". Test case passed");
		}
		String category = vehicledatapage.category();
		if (category.isEmpty()) {
			logger.createNode("Category is not displayed for MB Commercial Vehicle.")
					.pass("Category is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode("Category is displayed for MB Commercial Vehicle as-" + vehicledatapage.category())
					.pass("Category is displayed for MB Commercial Vehicle as-" + vehicledatapage.category()
							+ ". Test case passed");
		}
		String vehicleModel = vehicledatapage.VehicleModel();
		if (vehicleModel.isEmpty()) {
			logger.createNode("Vehicle Model is not displayed for MB Commercial Vehicle.")
					.pass("Vehicle Model is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode(
					"Vehicle Model is displayed for MB Commercial Vehicle as-" + vehicledatapage.VehicleModel())
					.pass("Vehicle Model is displayed for MB Commercial Vehicle as-" + vehicledatapage.VehicleModel()
							+ ". Test case passed");
		}
		String orderno = vehicledatapage.OrderNumber();
		if (orderno.isEmpty()) {
			logger.createNode("Order No. is not displayed for MB Commercial Vehicle.")
					.pass("Order No. is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode(
					"Order No. is not displayed for MB Commercial Vehicle as: " + vehicledatapage.OrderNumber())
					.pass("Order No. is not displayed for MB Commercial Vehicle as: " + vehicledatapage.OrderNumber()
							+ ". Test case passed");
		}
		String productionNo = vehicledatapage.ProductionNumber();
		if (productionNo.isEmpty()) {
			logger.createNode("Production No. is not displayed for for MB Commercial Vehicle.")
					.pass("Production No. is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode("Production No. is displayed for for MB Commercial Vehicle as:  "
					+ vehicledatapage.ProductionNumber())
					.pass("Production No. is displayed for MB Commercial Vehicle. as: "
							+ vehicledatapage.ProductionNumber() + ". Test case passed");
		}
		String productionPlant = vehicledatapage.ProductionPlant();
		if (productionPlant.isEmpty()) {
			logger.createNode("Production Plant is not displayed for MB Commercial Vehicle.")
					.pass("Production Plant is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode(
					"Production Plant is displayed for MB Commercial Vehicle as: " + vehicledatapage.ProductionPlant())
					.pass("Production Plant is displayed for MB Commercial Vehicle as:"
							+ vehicledatapage.ProductionPlant() + ". Test case passed");
		}
		String shipmentDate = vehicledatapage.ShipmentDate();
		if (shipmentDate.isEmpty()) {
			logger.createNode("Shipment Date is not displayed for MB Commercial Vehicle.")
					.pass("Shipment Date is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode(
					"Shipment Date is displayed for MB Commercial Vehicle as-" + vehicledatapage.ShipmentDate())
					.pass("Shipment Date is displayed for MB Commercial Vehicle as-" + vehicledatapage.ShipmentDate()
							+ ". Test case passed");
		}
		String status = vehicledatapage.VehicleModel();
		if (status.isEmpty()) {
			logger.createNode("Status is not displayed for MB Commercial Vehicle.")
					.pass("Status is not displayed for MB Commercial Vehicle. Test case failed");
		} else {
			logger.createNode("Status is displayed for MB Commercial Vehicle as-" + vehicledatapage.Status())
					.pass("Status is displayed for MB Commercial Vehicle as-" + vehicledatapage.Status()
							+ ". Test case passed");
		}
	}

	@Test(priority = 3)
	public void MajorAssemblies_CU_OldFin() throws InterruptedException {
		logger = extent.createTest("U-113:(CU) Show major assembly");
		vehicledatapage.searchCategoryNumber(vehicledatapage.ChangeuserMajorAssembly);
		vehicledatapage.fetchVinNumber();
		logger.createNode(" GClassOldFinNumberInput- " + vehicledatapage.ChangeuserMajorAssembly
				+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category")
				.pass(vehicledatapage.SupportAndFeedbackFINnumber
						+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
		vehicledatapage.fetchTransmissionNumber();
		logger.createNode("Navigate to Major assemblies page")
				.pass("Navigate to Major assemblies page. Test case passed");

		String BodyData=vehicledatapage.changeUserMABody();
		if (BodyData.isEmpty()){
			logger.createNode("Body value is not displayed for  FIN no."+vehicledatapage.ChangeuserMajorAssembly ).pass(
					"Body value is not displayed for  FIN no. Test case passed");
		}else {
			logger.createNode("Body value is displayed for  FIN no. as:  "
					+ vehicledatapage.changeUserMABody()).fail("Body value is displayed for  FIN no. as: "	+ vehicledatapage.changeUserMABody() + ". Test case failed");
		}
		String TcaseNumber=vehicledatapage.trnsferCaseNo();
		if (TcaseNumber.isEmpty()){
			logger.createNode("Transfer Case No. is not displayed for  FIN no.").fail(
					"Transfer Case No. is not displayed for  FIN no. Test case passed");
		}else {
			logger.createNode("Transfer Case No. is displayed for  FIN no. as:  "
					+ vehicledatapage.trnsferCaseNo()).pass("Transfer Case No. is displayed for  FIN no. as: "	+ vehicledatapage.trnsferCaseNo() + ". Test case failed");
		}


//		String AllWheelDriveTransferCaseNo = vehicledatapage.AllWheelDriveTransferCaseNo();
//		if (AllWheelDriveTransferCaseNo.isEmpty()) {
//			logger.createNode("All-Wheel Drive Transfer Case No. is not displayed for  FIN no.").pass(
//					"All-Wheel Drive Transfer Case No. is not displayed for  FIN no. Test case passed");
//		} else {
//			logger.createNode("All-Wheel Drive Transfer Case No. is displayed for  FIN no. as:  "
//					+ vehicledatapage.AllWheelDriveTransferCaseNo())
//					.fail("All-Wheel Drive Transfer Case No. is displayed for  FIN no. as: "
//							+ vehicledatapage.AllWheelDriveTransferCaseNo() + ". Test case failed");
//		}
//		String AllWheelDriveFrontAxleTransmission = vehicledatapage.AllWheelDriveFrontAxleTransmission();
//		if (AllWheelDriveFrontAxleTransmission.isEmpty()) {
//			logger.createNode("All-Wheel Drive Front Axle Transmission No. is not displayed for G Class Old FIN no.")
//					.pass("All-Wheel Drive Front Axle Transmission No. is not displayed for G Class Old FIN no. Test case passed");
//		} else {
//			logger.createNode("All-Wheel Drive Front Axle Transmission No. is displayed for G Class Old FIN no. as:  "
//					+ vehicledatapage.AllWheelDriveFrontAxleTransmission())
//					.fail("All-Wheel Drive Front Axle Transmission No. is displayed for G Class Old FIN no. as: "
//							+ vehicledatapage.AllWheelDriveFrontAxleTransmission() + ". Test case failed");
//		}
	}

//	@Test(priority = 4)
//	public void MajorAssemblies_CU_NewFin() throws InterruptedException {
//		vehicledatapage.searchCategoryNumber(vehicledatapage.GClassNewFinNumberInput);
//		vehicledatapage.fetchVinNumber();
//		logger.createNode(" GClassNewFinNumberInput- " + vehicledatapage.GClassNewFinNumberInput
//				+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category")
//				.pass(vehicledatapage.vinNumberInputForPlantText
//						+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
//		vehicledatapage.fetchTransmissionNumber();
//		logger.createNode("Navigate to Major assemblies page")
//				.pass("Navigate to Major assemblies page. Test case passed");
//		String AllWheelDriveTransferCaseNo = vehicledatapage.AllWheelDriveTransferCaseNo();
//		if (AllWheelDriveTransferCaseNo.isEmpty()) {
//			logger.createNode("All-Wheel Drive Transfer Case No. is not displayed for G Class New FIN no.").fail(
//					"All-Wheel Drive Transfer Case No. is not displayed for G Class New FIN no. Test case failed");
//		} else {
//			logger.createNode("All-Wheel Drive Transfer Case No. is displayed for G Class New FIN no. as: "
//					+ vehicledatapage.AllWheelDriveTransferCaseNo())
//					.pass("All-Wheel Drive Transfer Case No. is displayed for G Class New FIN no. as:"
//							+ vehicledatapage.AllWheelDriveTransferCaseNo() + ". Test case passed");
//		}
//		String AllWheelDriveFrontAxleTransmission = vehicledatapage.AllWheelDriveFrontAxleTransmission();
//		if (AllWheelDriveFrontAxleTransmission.isEmpty()) {
//			logger.createNode("All-Wheel Drive Front Axle Transmission No. is not displayed for G Class New FIN no.")
//					.pass("All-Wheel Drive Front Axle Transmission No. is not displayed for G Class New FIN no. Test case passed");
//		} else {
//			logger.createNode("All-Wheel Drive Front Axle Transmission No. is displayed for G Class New FIN no. as-"
//					+ vehicledatapage.AllWheelDriveFrontAxleTransmission())
//					.fail("All-Wheel Drive Front Axle Transmission No. is displayed for G Class New FIN no. as-"
//							+ vehicledatapage.AllWheelDriveFrontAxleTransmission() + ". Test case failed");
//		}
//	}

	// KELKARK
	// *******Sales Tab check for CU
	@Test(priority = 5)
	public void SalesTab_ModifyCustomerServiceData_CU() throws InterruptedException {
		logger = extent.createTest("U-083:(CU) Sales tab: Modify Customer Service Data for (CU) Changing User");
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

		/* show Sales data section-CU */
		ExtentTest LoggerSalesDataCU = logger.createNode("Data fetch from section- SALES DATA");
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
				LoggerSalesDataCU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
			} else if (elementSizeInRow == 3) {
				LoggerSalesDataCU.pass(ar[1] + " - " + ar[2] + " - " + ar[3] + ". Test case passed.");
			} else if (elementSizeInRow == 4) {
				LoggerSalesDataCU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
				LoggerSalesDataCU.pass(ar[3] + "-" + ar[4] + ". Test case passed.");
			} else if (elementSizeInRow == 5) {
				LoggerSalesDataCU.pass(ar[1] + " - " + ar[2] + " - " + ar[3] + ". Test case passed.");
				LoggerSalesDataCU.pass(ar[4] + " - " + ar[5] + ". Test case passed.");
			}
		}
		// to check edit access for-CU
		warmup6();
		try {
			boolean CUflag = vehicledatapage.editSalesDataButton_DesplayedOrNot_sd();
			if (CUflag == true) {
				logger.createNode("Edit sales data button is displayed for user- (CU) changing user")
						.fail("Changing user has the access to modify sales data. Test case passed.");

			} else {
				logger.createNode("Edit sales data button is not displayed for user- (CU) changing user")
						.pass("Changing user do not have access to modify sales data. Test case passed.");
				System.out.println("Changing user do not have access to modify sales data. Test case passed");
			}
		} catch (NoSuchElementException e) {
			logger.createNode("Edit sales data button is not displayed for user- (RU) changing user")
					.pass("Changing user do not have access to modify sales data. Test case passed");
			System.out.println("Changing user do not have access to modify sales data. Test case passed");
		}

		warmup6();

		/* show Customer service data section */
		ExtentTest LoggerCustomerServiceDataCU = logger.createNode("Data fetch from section- CUSTOMER SERVICE DATA");
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
				LoggerCustomerServiceDataCU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
			} else if (elementSizeInRow == 4) {
				LoggerCustomerServiceDataCU.pass(ar[1] + "-" + ar[2] + ". Test case passed.");
				LoggerCustomerServiceDataCU.pass(ar[3] + "-" + ar[4] + ". Test case passed.");
			}

			// to check edit access for-RU
			try {
				boolean CUflag1 = vehicledatapage.editCustomerServiceDataButton_DesplayedOrNot_sd();
				if (CUflag1 == true) {
					logger.createNode("Edit customer service data button is displayed for user- (CU) changing user")
							.fail("Reading user has the access to modify customer service data. Test case passed.");
				} else {
					logger.createNode("Edit Customer service data button is not displayed for user- (CU) changing user")
							.pass("Reading user do not have access to modify Customer service data. Test case passed.");
					System.out.println("Changing user do not have access to modify Customer service data");
				}
			} catch (NoSuchElementException e) {
				logger.createNode("Edit Customer service data button is not displayed for user- (RU) changing user")
						.pass("Changing user do not have access to modify Customer service data. Test case passed");
				System.out.println("Changing user do not have access to modify Customer service data");
			}
		}

	}
	// KELKARK over

	@AfterMethod
	public void teardown1(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, "Test Case passed is " + result.getName());
			String screenshotPath = VehicleDataPageTest_CU.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName());
			logger.log(Status.FAIL, result.getThrowable());
			String screenshotPath = VehicleDataPageTest_CU.getScreenshot(driver, result.getName());
			logger.addScreenCaptureFromPath(screenshotPath);
		}
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
