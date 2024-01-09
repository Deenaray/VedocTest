package com.vedoc.qa.testcases;

import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.Dimension;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage;
import com.vedoc.qa.testdata.json;

public class PassengerCar_WriteAccess_RU extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage vehicledatapage;
	ITestResult result;
	public static String cook4;

	public PassengerCar_WriteAccess_RU() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		vehicledatapage = new VehicleDataPage();
		logger = extent.createTest("U-002: (RU) Identification Tab of Vehicle Data Module with RU rights");
		homePage = loginPage.login(prop.getProperty("stduser"), prop.getProperty("stdPassword"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData();
	}

	@Test(priority = 1)
	public void VehiclePageTest() {
		logger = extent.createTest("(RU) Check if the vehicle data page is getting loaded");
		try {
			boolean flag = vehicledatapage.validateVehicleDataPage();
			if (flag = true) {
				logger.createNode("Check if vehicle data page is getting loaded")
						.pass("Vehicle data page is getting loaded. Testcase Passed");
			} else {
				logger.createNode("Check if vehicle data page is getting loaded")
						.pass("Vehicle data page is not getting loaded. Testcase Passed");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}

//	@Test(priority = 2)
//	public void searchFinForReadingUser() throws InterruptedException {
//		vehicledatapage.searchfin_PassengerCarWithRightAccessRU();
//		logger.createNode("FIN field is provided with the input - WDB9634272L992621")
//				.pass("FIN field is provided with the input - WDB9634272L992621. Test Case Passed");
//	}
//
//	@Test(priority = 3)
//	public void OrdersOfTheftRelevantPartsTab_ReadingUser() throws InterruptedException {
//		logger = extent.createTest("U-102: (RU) Orders of theft-relevant parts Tab of Vehicle Data Module");
//		vehicledatapage.OrdersOfTheftRelevantPartsTab_ReadinguserRights();
//		logger.createNode("Orders of theft-relevant parts tab is clicked")
//				.pass("Orders of theft-relevant parts tab is clicked");
//	}
//
//	@Test(priority = 4)
//	public void OrdersOfTheftRelevantPartsTab_EditButtonReadingUser() throws InterruptedException {
//
//		try {
//			boolean flag = vehicledatapage.validateVehicleDataPage();
//			if (flag = true) {
//				logger.createNode(
//						"Edit button is not displayed in the Orders of theft-relevant parts Tab for reading use")
//						.pass("Edit button is not displayed in the Orders of theft-relevant parts Tab for reading use. Test Case Passed");
//			} else {
//				logger.createNode("Edit button is displayed in the Orders of theft-relevant parts Tab for reading use")
//						.pass("Edit button is displayed in the Orders of theft-relevant parts Tab for reading use. Test Case Passed");
//			}
//		} catch (NoSuchElementException e) {
//			logger.log(Status.SKIP, "Something wrong with the webelement.");
//		}
//	}

	@Test(priority = 5)
	public void RightArrow_ReadingUser() throws InterruptedException {
		logger = extent.createTest("U-002: (RU) Entering 3 characters of Fin and clicking on Right arrow ");
		warmup1();
		vehicledatapage.searchfin_PassengerCarWithRightAccess_ForRightArrowbuttons();
		logger.createNode("FIN number entered in the Thinclient is WDB9 and right arrow button is clicked").pass(
				"FIN number entered in the Thinclient is WDB9 and right arrow button is clicked. Test Case Passed");
		vehicledatapage.searchfin_PassengerCarWithRightAccess_ForlefttArrowbuttons();
		logger.createNode("FIN number entered in the Thinclient is WDB9 and left arrow button is clicked").pass(
				"FIN number entered in the Thinclient is WDB9 and left arrow button is clicked. Test Case Passed");
	}

//	@Test(priority = 6)
//	public void ControlUnit_PCID() throws InterruptedException {
//		logger = extent.createTest("U-256: (RU) Show provisioning certificate id");
//		warmup1();
//		vehicledatapage.searchfin_PassengerCarWithRightAccess_Obc();
//		logger.createNode("For OBC : VIN Number W1A4533911K441899 is searched")
//				.pass("For OBC : VIN Number W1A4533911K441899 is searched. Test Case Passed");
//		vehicledatapage.ControlUnitTab_PassengerCar();
//		logger.createNode("Control unit Tab is clicked")
//				.pass("Control unit button is clicked successfully. Test Case Passed");
//		vehicledatapage.controlUnit_Obc();
//		logger.createNode("A OBC control unit is chosen").pass("A OBC control unit is chosen. Test Case Passed");
//		logger.createNode("Reading User dont have the access to see the PCID")
//				.pass("Reading User dont have the access to see the PCID. Test Case Passed");
//	}

	@Test(priority = 7)
	public void controlUnits_MCM_ProductionStatus_RU() {
		try {
			logger = extent.createTest("U-258: (RU) Show control unit production status");
			vehicledatapage.validateVehicleDataPage();
			vehicledatapage.searchfin_PassengerCarWithRightAccessMCM();
			logger.createNode("For MCM : VIN Number WDB9630021L859303 is searched")
					.pass("For MCM : VIN Number WDB9630021L859303 is searched. Test Case Passed");
			vehicledatapage.ControlUnitTab_PassengerCar();
			vehicledatapage.controlUnit_MCM();
			logger.createNode("A MCM control unit is chosen").pass("A MCM control unit is chosen. Test Case Passed");
			vehicledatapage.controlUnitTable_ProductionStatus();
			logger.createNode("Display production status for MCM is clicked")
					.pass("Display production status for MCM is clicked. Test Case Passed");
			vehicledatapage.controlUnitTable_MajorAssemblyNumber();
			logger.createNode("Major assembly number field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_MajorAssemblyNumber())
					.pass("Major assembly number field is displayed with the data "
							+ vehicledatapage.controlUnitTable_MajorAssemblyNumber() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_EcuName();
			logger.createNode(
					"ECU name field is displayed with the data - " + vehicledatapage.controlUnitTable_EcuName())
					.pass("ECU name field is displayed with the data " + vehicledatapage.controlUnitTable_EcuName()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_IdCode();
			logger.createNode("ID code field is displayed with the data - " + vehicledatapage.controlUnitTable_IdCode())
					.pass("ID code field is displayed with the data " + vehicledatapage.controlUnitTable_IdCode()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_HardwareObjectNumber();
			logger.createNode("Hardware object number field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_HardwareObjectNumber())
					.pass("Hardware object number field is displayed with the data "
							+ vehicledatapage.controlUnitTable_HardwareObjectNumber() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_CalibrationId();
			logger.createNode("Calibration ID	 field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_CalibrationId())
					.pass("Calibration ID field is displayed with the data "
							+ vehicledatapage.controlUnitTable_CalibrationId() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_PerformanceMapProtection();
			logger.createNode("Performance map protection field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_PerformanceMapProtection())
					.pass("Performance map protection field is displayed with the data "
							+ vehicledatapage.controlUnitTable_PerformanceMapProtection() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_Version();
			logger.createNode(
					"Version field is displayed with the data - " + vehicledatapage.controlUnitTable_Version())
					.pass("Version field is displayed with the data " + vehicledatapage.controlUnitTable_Version()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_ServiceStatusSince();
			logger.createNode("Service status since field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_ServiceStatusSince())
					.pass("Service status since field is displayed with the data "
							+ vehicledatapage.controlUnitTable_ServiceStatusSince()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_CbfRevision();
			logger.createNode(
					"CBF revision field is displayed with the data - " + vehicledatapage.controlUnitTable_CbfRevision())
					.pass("CBF revision field is displayed with the data "
							+ vehicledatapage.controlUnitTable_CbfRevision()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_ImmobilizerStatus();
			logger.createNode("Immobilizer status field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_ImmobilizerStatus())
					.pass("Immobilizer status field is displayed with the data "
							+ vehicledatapage.controlUnitTable_ImmobilizerStatus() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_Cvn();
			logger.createNode("CVN field is displayed with the data - " + vehicledatapage.controlUnitTable_Cvn())
					.pass("CVN field is displayed with the data " + vehicledatapage.controlUnitTable_Cvn()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_CerficateDesignation();
			logger.createNode("Certification designation field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_CerficateDesignation())
					.pass("Certification designation field is displayed with the data "
							+ vehicledatapage.controlUnitTable_CerficateDesignation() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_Plant();
			logger.createNode("Plant field is displayed with the data - " + vehicledatapage.controlUnitTable_Plant())
					.pass("Plant field is displayed with the data " + vehicledatapage.controlUnitTable_Plant()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_LastModification();
			logger.createNode("Last modification field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_LastModification())
					.pass("Last modification field is displayed with the data "
							+ vehicledatapage.controlUnitTable_LastModification() + ". Test Case Passed");
			vehicledatapage.controlUnit_PerformanceChange();
			logger.createNode("Performance change field is displayed with the data - "
					+ vehicledatapage.controlUnit_PerformanceChange())
					.pass("Performance change field is displayed with the data "
							+ vehicledatapage.controlUnit_PerformanceChange() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_SpecialProperties();
			logger.createNode("Special properties field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_SpecialProperties())
					.pass("Special properties field is displayed with the data "
							+ vehicledatapage.controlUnitTable_SpecialProperties() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_DiagVersion();
			logger.createNode(
					"Diag version field is displayed with the data - " + vehicledatapage.controlUnitTable_DiagVersion())
					.pass("Diag version field is displayed with the data "
							+ vehicledatapage.controlUnitTable_DiagVersion()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnit_Used();
			logger.createNode("Used field is displayed with the data - " + vehicledatapage.controlUnit_Used())
					.pass("Used field is displayed with the data " + vehicledatapage.controlUnit_Used()
							+ ". Test Case Passed");
			vehicledatapage.controlUnit_DataRecordTable();
			logger.createNode(
					"Data Record Table is displayed with the data - " + vehicledatapage.controlUnit_DataRecordTable())
					.pass("Data Record Table is displayed with the data "
							+ vehicledatapage.controlUnit_DataRecordTable() + ". Test Case Passed");
			vehicledatapage.controlUnit_VarCodingDomainTable();
			logger.createNode("Var Coding Domain table is displayed with the data - "
					+ vehicledatapage.controlUnit_VarCodingDomainTable())
					.pass("Var Coding Domain table is displayed with the data "
							+ vehicledatapage.controlUnit_VarCodingDomainTable() + ". Test Case Passed");
			vehicledatapage.controlUnit_ParameterTable();
			logger.createNode(
					"Parameter table is displayed with the data - " + vehicledatapage.controlUnit_ParameterTable())
					.pass("Parameter table is displayed with the data " + vehicledatapage.controlUnit_ParameterTable()
							+ ". Test Case Passed");
			vehicledatapage.controlUnit_Close();
			logger.createNode("Display production status for MCM is closed")
					.pass("Display production status for MCM is closed. Test Case Passed");
		} catch (Exception e) {
			logger.createNode("MCM control unit details are not displayed")
					.fail("MCM control unit details are not displayed");
		}
	}

	@Test(priority = 8)
	public void controlUnits_ACM_ProductionStatus_RU() {
		try {
			logger = extent.createTest("U-258: (RU) Show control unit production status");
			warmup5();
			vehicledatapage.controlunitTab_ACMclick();
			warmup5();
			vehicledatapage.controlUnitTable_ProductionStatus_ACM();
			logger.createNode("Display production status for ACM is clicked")
					.pass("Display production status for ACM is clicked. Test Case Passed");
			vehicledatapage.controlUnitTable_MajorAssemblyNumber();
			logger.createNode("Major assembly number field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_MajorAssemblyNumber())
					.pass("Major assembly number field is displayed with the data "
							+ vehicledatapage.controlUnitTable_MajorAssemblyNumber() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_EcuName();
			logger.createNode(
					"ECU name field is displayed with the data - " + vehicledatapage.controlUnitTable_EcuName())
					.pass("ECU name field is displayed with the data " + vehicledatapage.controlUnitTable_EcuName()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_IdCode();
			logger.createNode("ID code field is displayed with the data - " + vehicledatapage.controlUnitTable_IdCode())
					.pass("ID code field is displayed with the data " + vehicledatapage.controlUnitTable_IdCode()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_HardwareObjectNumber();
			logger.createNode("Hardware object number field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_HardwareObjectNumber())
					.pass("Hardware object number field is displayed with the data "
							+ vehicledatapage.controlUnitTable_HardwareObjectNumber() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_CalibrationId();
			logger.createNode("Calibration ID	 field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_CalibrationId())
					.pass("Calibration ID field is displayed with the data "
							+ vehicledatapage.controlUnitTable_CalibrationId()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_PerformanceMapProtection();
			logger.createNode("Performance map protection field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_PerformanceMapProtection())
					.pass("Performance map protection field is displayed with the data "
							+ vehicledatapage.controlUnitTable_PerformanceMapProtection() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_Version();
			logger.createNode(
					"Version field is displayed with the data - " + vehicledatapage.controlUnitTable_Version())
					.pass("Version field is displayed with the data " + vehicledatapage.controlUnitTable_Version()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_ServiceStatusSince();
			logger.createNode("Service status since field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_ServiceStatusSince())
					.pass("Service status since field is displayed with the data "
							+ vehicledatapage.controlUnitTable_ServiceStatusSince()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_CbfRevision();
			logger.createNode(
					"CBF revision field is displayed with the data - " + vehicledatapage.controlUnitTable_CbfRevision())
					.pass("CBF revision field is displayed with the data "
							+ vehicledatapage.controlUnitTable_CbfRevision()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_ImmobilizerStatus();
			logger.createNode("Immobilizer status field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_ImmobilizerStatus())
					.pass("Immobilizer status field is displayed with the data "
							+ vehicledatapage.controlUnitTable_ImmobilizerStatus() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_Cvn();
			logger.createNode("CVN field is displayed with the data - " + vehicledatapage.controlUnitTable_Cvn())
					.pass("CVN field is displayed with the data " + vehicledatapage.controlUnitTable_Cvn()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnitTable_CerficateDesignation();
			logger.createNode("Certification designation field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_CerficateDesignation())
					.pass("Certification designation field is displayed with the data "
							+ vehicledatapage.controlUnitTable_CerficateDesignation() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_Plant();
			logger.createNode("Plant field is displayed with the data - " + vehicledatapage.controlUnitTable_Plant())
					.pass("Plant field is displayed with the data " + vehicledatapage.controlUnitTable_Plant()
							+ ". Test Case Passed");
			vehicledatapage.controlUnitTable_LastModification();
			logger.createNode("Last modification field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_LastModification())
					.pass("Last modification field is displayed with the data "
							+ vehicledatapage.controlUnitTable_LastModification() + ". Test Case Passed");
			vehicledatapage.controlUnit_PerformanceChange();
			logger.createNode("Performance change field is displayed with the data - "
					+ vehicledatapage.controlUnit_PerformanceChange())
					.pass("Performance change field is displayed with the data "
							+ vehicledatapage.controlUnit_PerformanceChange() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_SpecialProperties();
			logger.createNode("Special properties field is displayed with the data - "
					+ vehicledatapage.controlUnitTable_SpecialProperties())
					.pass("Special properties field is displayed with the data "
							+ vehicledatapage.controlUnitTable_SpecialProperties() + ". Test Case Passed");
			vehicledatapage.controlUnitTable_DiagVersion();
			logger.createNode(
					"Diag version field is displayed with the data - " + vehicledatapage.controlUnitTable_DiagVersion())
					.pass("Diag version field is displayed with the data "
							+ vehicledatapage.controlUnitTable_DiagVersion()
							+ "& its different from additional data. Test Case Passed");
			vehicledatapage.controlUnit_Used();
			logger.createNode("Used field is displayed with the data - " + vehicledatapage.controlUnit_Used())
					.pass("Used field is displayed with the data " + vehicledatapage.controlUnit_Used()
							+ ". Test Case Passed");
			vehicledatapage.controlUnit_DataRecordTable();
			logger.createNode(
					"Data Record Table is displayed with the data - " + vehicledatapage.controlUnit_DataRecordTable())
					.pass("Data Record Table is displayed with the data "
							+ vehicledatapage.controlUnit_DataRecordTable() + ". Test Case Passed");
			vehicledatapage.controlUnit_VarCodingDomainTable();
			logger.createNode("Var Coding Domain table is displayed with the data - "
					+ vehicledatapage.controlUnit_VarCodingDomainTable())
					.pass("Var Coding Domain table is displayed with the data "
							+ vehicledatapage.controlUnit_VarCodingDomainTable() + ". Test Case Passed");
			vehicledatapage.controlUnit_ParameterTable();
			logger.createNode(
					"Parameter table is displayed with the data - " + vehicledatapage.controlUnit_ParameterTable())
					.pass("Parameter table is displayed with the data " + vehicledatapage.controlUnit_ParameterTable()
							+ ". Test Case Passed");
			vehicledatapage.controlUnit_Close();
			logger.createNode("Display production status for ACM is closed")
					.pass("Display production status for ACM is closed. Test Case Passed");
		} catch (Exception e) {
			logger.createNode("ACM control unit details are not displayed")
					.fail("ACM control unit details are not displayed");
		}
	}

	@Test(priority = 9)
	public void closeTab_RU() {
		vehicledatapage.logout();
		logger.createNode("Tab which is logged in using (RU) credentials is logged out")
				.pass("Tab which is logged in using (RU) credentials is logged out successfully. Test case passed");
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
	public void teardown() throws IOException {

		driver.quit();

	}

}
