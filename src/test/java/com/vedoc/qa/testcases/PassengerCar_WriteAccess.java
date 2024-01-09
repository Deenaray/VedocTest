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

public class PassengerCar_WriteAccess extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage vehicledatapage;
	ITestResult result;
	public static String cook4;

	public PassengerCar_WriteAccess() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		vehicledatapage = new VehicleDataPage();
		logger = extent.createTest("Login to Admin User");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData();
	}

	@Test(priority = 1)
	public void VehiclePageTest() {
		logger = extent.createTest("(AU) Check if the vehicle data page is getting loaded");
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
//
////                           @Test(priority = 2)
////                           public void IdentificationDataTest() throws InterruptedException, IOException {
////                                          String cook=driver.manage().getCookies().toString();
////                       String cook1 = cook.replaceAll(" path=/; domain=vedoc-test1-em1.i.daimler.com,", "");
////                       String cook2 = cook1.replaceAll(" path=/; domain=vedoc-test1-em1.i.daimler.com;secure;,", "");
////                       String cook3 = cook2.replaceAll("path=/; domain=vedoc-test1-em1.i.daimler.com;secure;]", "");
////                       String cooki3=cook3.replaceAll("expires=.+;", "");
////                        cook4 = cook3.replaceAll("\\[", "");
////                        
////                       json.json(cook4);
////                                          vehicledatapage.searchfin_PassengerCarWithRightAccess();
////                                          logger = extent.createTest("U-003 -Identification Tab of Vehicle Data Module");
////               
////                                          String brandw = vehicledatapage.brand();
////                                          
////                                          try {
////                                                         
////                                                         System.out.println(json.brandj);
////                                                         if (json.brandj.equalsIgnoreCase(brandw)) {
////                                                                        logger.log(Status.INFO, "Check if Vehicle Brand is displayed as expected and very the data.");
////                                                                        logger.log(Status.PASS, "Vehicle Brand is displayed and data has been verified. Testcase Passed");
////                                                         } else {
////                                                                        logger.log(Status.INFO, "Check if Vehicle Brand is displayed as expected and very the data.");
////                                                                        logger.log(Status.FAIL, "Vehicle Brand is not displayed or data is corrupted. Testcase failed.");
////                                                         }
////                                          } catch (NoSuchElementException e) {
////                                                         logger.log(Status.SKIP, "Something wrong with the webelement.");
////                                          }       
////                           }

//	@Test(priority = 3)
//	public void CheckForTheIdentificationTabDetails() throws InterruptedException {
//
//		logger = extent.createTest("U-005: (AU) Modify Vehicle");
//
//		vehicledatapage.searchfin_PassengerCarWithRightAccess();
//		// logger.createNode("Search field is editd with the data -
//		// WDD2042011F483679").pass("Search field is editd with the data -
//		// WDD2042011F483679 successfully. Test Case Passed");
//
//		logger.createNode("Search field is editd with the data - WDD2040471A953090")
//				.pass("Search field is editd with the data - WDD2040471A953090 successfully. Test Case Passed");
//		vehicledatapage.Edit_Basic_Data();
//		logger.createNode("Edit basic data button is clicked")
//				.pass("Edit basic data button is clicked succssfully. Test Case Passed");
//		vehicledatapage.VINNumber_Edit();
//		logger.createNode("VIN Number field is editd with the data - " + RandomVINNumber).pass(
//				"VIN Number field is editd with the data - " + RandomVINNumber + "successfully. Test Case Passed");
//		vehicledatapage.OrderNumber_Edit();
//		logger.createNode("Order number field is editd with the data - 1111111120")
//				.pass("Order number field is editd with the data - 1111111120 successfully. Test Case Passed");
//		vehicledatapage.ProductionNumber_Edit();
//		logger.createNode("Production number field is editd with the data - 1111121")
//				.pass("Production number field is editd with the data - 1111121 successfully. Test Case Passed");
//		vehicledatapage.Edit_ProductionPlant();
//		logger.createNode("Production plant dropdown is selected with the value - 6010 AMG")
//				.pass("Production plant dropdown is selected with the value - 6010 AMG successfully. Test Case Passed");
//
//		warmup1();
//		vehicledatapage.CancelChanges();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//		warmup5();
//		vehicledatapage.fin();
//		logger.createNode("Fin Number field is displayed with the data - " + vehicledatapage.fin())
//				.pass("Fin Number field is displayed with the data " + vehicledatapage.fin() + ". Test Case Passed");
//		vehicledatapage.vin();
//		logger.createNode("Vin Number field is displayed with the data - " + vehicledatapage.vin())
//				.pass("Vin Number field is displayed with the data " + vehicledatapage.vin() + ". Test Case Passed");
//		vehicledatapage.OrderNumber();
//		logger.createNode(
//				"After editing Order Number field is displayed with the data -  " + vehicledatapage.OrderNumber())
//				.pass("Order Number field is displayed with the data - " + vehicledatapage.vin()
//						+ ". Test Case Passed");
//		vehicledatapage.brand();
//		logger.createNode("After editing Order Number field is displayed with the data -  " + vehicledatapage.brand())
//				.pass("Brand field is displayed with the data - " + vehicledatapage.brand() + ". Test Case Passed");
//		vehicledatapage.ProductionNumber();
//		logger.createNode("Production Number field is displayed with the data -  " + vehicledatapage.ProductionNumber())
//				.pass("Production number field is displayed with the data - " + vehicledatapage.ProductionNumber()
//						+ ". Test Case Passed");
//		vehicledatapage.category();
//		logger.createNode("Category field is displayed with the data -  " + vehicledatapage.category()).pass(
//				"Category field is displayed with the data - " + vehicledatapage.category() + ". Test Case Passed");
//		vehicledatapage.ProductionPlant();
//		logger.createNode("Production Plant field is displayed with the data -  " + vehicledatapage.ProductionPlant())
//				.pass("Production Plant field is displayed with the data - " + vehicledatapage.ProductionPlant()
//						+ ". Test Case Passed");
//
//		// vehicledatapage.BodyType();
//		// logger.createNode("Body Type displayed on the ThinClient is: " +
//		// vehicledatapage.BodyType());
//
//		// vehicledatapage.VehicleModel();
//		// logger.createNode("Vehicle Model displayed on the ThinClient is: " +
//		// vehicledatapage.VehicleModel());
//
//		vehicledatapage.Status();
//		logger.createNode("Status field is displayed with the data -  " + vehicledatapage.Status())
//				.pass("Status field is displayed with the data - " + vehicledatapage.Status() + ". Test Case Passed");
//
//	}
//
//	@Test(enabled = false)
//
//	public void PDFGeneration() throws InterruptedException {
//		ClickingOnURLButtons();
//
//	}
//
//	@Test(enabled = false)
//	public void MajorAssemblyDataTest() throws InterruptedException, IOException {
//		logger = extent.createTest("U-234: (AU) Check if the Major Assemblies Tab values are getting displayed");
//
//		vehicledatapage.MajorAssembliesTab();
//
//		System.out.println(vehicledatapage.EngineNumber());
//		logger.createNode("Engine Number displayed in the Thin client is: " + vehicledatapage.EngineNumber());
//
//		System.out.println(vehicledatapage.EngineVariantNumber());
//		logger.createNode(
//				"Engine Variant Number displayed in the Thin client is: " + vehicledatapage.EngineVariantNumber());
//
//		System.out.println(vehicledatapage.ObjectNumber());
//		logger.createNode("Engine Object Number displayed in the Thin client: " + vehicledatapage.ObjectNumber());
//
//		System.out.println(vehicledatapage.ExhaustAfterTreatment());
//		logger.createNode(
//				"Exhaust After Treatment displayed in the Thin client is: " + vehicledatapage.ExhaustAfterTreatment());
//
//		System.out.println(vehicledatapage.ExhaustAfterTreatment_Variant());
//		logger.createNode("Exhaust After Treatment Variant displayed in the Thin client is: "
//				+ vehicledatapage.ExhaustAfterTreatment_Variant());
//
//		System.out.println(vehicledatapage.ExhaustAfterTreatment_ObjectNumber());
//		logger.createNode("Exhaust After Treatment Object Number displayed in the Thin client is: "
//				+ vehicledatapage.ExhaustAfterTreatment_ObjectNumber());
//
//		System.out.println(vehicledatapage.Transmission());
//		logger.createNode("Transmission Number displayed in the Thin client is: " + vehicledatapage.Transmission());
//
//		System.out.println(vehicledatapage.TransmissionVariant());
//		logger.createNode(
//				"Transmission Variant displayed in the Thin client is: " + vehicledatapage.TransmissionVariant());
//
//		System.out.println(vehicledatapage.TransmissionObjectNumber());
//		logger.createNode("Transmission Object Number displayed in the Thin client: "
//				+ vehicledatapage.TransmissionObjectNumber());
//
//		System.out.println(vehicledatapage.FrontAxle1());
//		logger.createNode("Front Axle 1 displayed in the Thin client is: " + vehicledatapage.FrontAxle1());
//
//		System.out.println(vehicledatapage.FrontAxle1Variant());
//		logger.createNode(
//				"Front Axle 1 Variant displayed in the Thin client is: " + vehicledatapage.FrontAxle1Variant());
//
//		System.out.println(vehicledatapage.FrontAxle1ObjectNumber());
//		logger.createNode("Front Axle 1 Object Number displayed in the Thin client is: "
//				+ vehicledatapage.FrontAxle1ObjectNumber());
//
//		System.out.println(vehicledatapage.FrontAxle2());
//		logger.createNode("Front Axle 2 Number displayed in the Thin client is: " + vehicledatapage.FrontAxle2());
//
//		System.out.println(vehicledatapage.FrontAxle2Variant());
//		logger.createNode(
//				"Front Axle 2 variant Number displayed in the Thin client is: " + vehicledatapage.FrontAxle2Variant());
//
//		System.out.println(vehicledatapage.FrontAxle2ObjectNumber());
//		logger.createNode("Front Axle 2 object Number displayed in the Thin client is: "
//				+ vehicledatapage.FrontAxle2ObjectNumber());
//
//		System.out.println(vehicledatapage.FrontAxle3());
//		logger.createNode("Front Axle 3 Number displayed in the Thin client is: " + vehicledatapage.FrontAxle3());
//
//		System.out.println(vehicledatapage.FrontAxle3Variant());
//		logger.createNode(
//				"Front Axle 3 Varaint Number displayed in the Thin client is: " + vehicledatapage.FrontAxle3Variant());
//
//		System.out.println(vehicledatapage.FrontAxle3ObjectNumber());
//		logger.createNode("Front Axle 3 Object Number displayed in the Thin client is: "
//				+ vehicledatapage.FrontAxle3ObjectNumber());
//
//		System.out.println(vehicledatapage.RearAxle1());
//		logger.createNode("Rear Axle 1 Number displayed in the Thin client is: " + vehicledatapage.RearAxle1());
//
//		System.out.println(vehicledatapage.RearAxle1Variant());
//		logger.createNode(
//				"Rear Axle 1 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle1Variant());
//
//		System.out.println(vehicledatapage.RearAxle1ObjectNumber());
//		logger.createNode("Rear Axle 1 Object Number displayed in the Thin client is: "
//				+ vehicledatapage.RearAxle1ObjectNumber());
//
//		System.out.println(vehicledatapage.RearAxle2());
//		logger.createNode("Rear Axle 2 Number displayed in the Thin client is: " + vehicledatapage.RearAxle2());
//
//		System.out.println(vehicledatapage.RearAxle2Variant());
//		logger.createNode(
//				"Rear Axle 2 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle2Variant());
//
//		System.out.println(vehicledatapage.RearAxle2ObjectNumber());
//		logger.createNode("Rear Axle 2 object Number displayed in the Thin client is: "
//				+ vehicledatapage.RearAxle2ObjectNumber());
//
//		System.out.println(vehicledatapage.RearAxle3());
//		logger.createNode("Rear Axle 3 Number is displayed in the Thin client is: " + vehicledatapage.RearAxle3());
//
//		System.out.println(vehicledatapage.RearAxle3Variant());
//		logger.createNode(
//				"Rear Axle 3 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle3Variant());
//
//		System.out.println(vehicledatapage.RearAxle3ObjectNumber());
//		logger.createNode("Rear Axle 3 Variant Number displayed in the Thin client is: "
//				+ vehicledatapage.RearAxle3ObjectNumber());
//
//		System.out.println(vehicledatapage.Body());
//		logger.createNode("Body Number displayed in the Thin client is: " + vehicledatapage.Body());
//
//		System.out.println(vehicledatapage.Platform());
//		logger.createNode("Platform Number displayed in the Thin client is: " + vehicledatapage.Platform());
//
//		System.out.println(vehicledatapage.Retarder());
//		logger.createNode("Retarder Number displayed in the Thin client is: " + vehicledatapage.Retarder());
//
//		System.out.println(vehicledatapage.Steering());
//		logger.createNode("Steering Number displayed in the Thin client is: " + vehicledatapage.Steering());
//
//		System.out.println(vehicledatapage.AlternativeDrives());
//		logger.createNode("Alternative Drives contents displayed in the Thin client");
//
//		System.out.println(vehicledatapage.ThirdParty_MajorAssemblies());
//		logger.createNode("Third Party Major Assemblies contents displayed in the Thin client ");
//
//	}
//
//	@Test(enabled = false)
//	public void CodesDataTest() throws InterruptedException, IOException {
//
//		logger = extent.createTest("(AU) Check if the Codes Tab values are getting displayed");
//
//		vehicledatapage.CodesTab();
//
//		logger.createNode("Hide Designation button is clicked and only Codes are displayed on the Thin client");
//		logger.createNode(
//				"Show designation button is clicked, vehicle codes and their description appears on the Thin client");
//		logger.createNode("Filter button is clicked and the code is entered to display the relevant vehicle codes");
//
//	}
//
//	@Test(priority = 4)
//
//	public void SAANumbersTest() throws InterruptedException {
//
//		logger = extent.createTest("U-005, U-230: (AU) SAA Numbers Tab of Vehicle Data Page");
//
//		vehicledatapage.SAANumbersTab_PassengerCar();
//		logger.createNode("SAA Numbers Tab is clicked")
//				.pass("SAA Number tab is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 5)
//	public void SAANumbersTest_AddRemoveSAANumber_Button() throws InterruptedException {
//		vehicledatapage.Add_RemoveSAAButton();
//		logger.createNode("Add/remove SAA Number button is clicked")
//				.pass("Add/remove SAA Number button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 6)
//
//	public void SAANumbersTest_AddSAANumber() throws InterruptedException {
//		vehicledatapage.SAANumber_AddNumber();
//		logger.createNode("SAA Number added is - 40007074")
//				.pass("SAA number 40007074 is added successfully. Test Case Passed");
//	}
//
//	@Test(priority = 7)
//
//	public void SAANumbersTest_AddSAANumber_arrowmark() throws InterruptedException {
//		vehicledatapage.SAANumber_arrowButton();
//		logger.createNode("Arrow button is clicked").pass("Arrow button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 8)
//
//	public void SAANumbersTest_GoToAssignmentButton() throws InterruptedException {
//		vehicledatapage.GoToAssignmentButton();
//		logger.createNode("Go to Assignment button is clicked")
//				.pass("Go To Assignment button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 9)
//
//	public void Usage() throws InterruptedException {
//		vehicledatapage.Usage();
//		logger.createNode("Usage drop down is selected with the data - Engine")
//				.pass("Usage drop down is selected with the data - Engine. Test Case Passed");
//	}
//
//	@Test(priority = 10)
//
//	public void ApplyButton() throws InterruptedException {
//		vehicledatapage.ApplyButton();
//		logger.createNode("Apply Button is clicked").pass("Apply button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 11)
//
//	public void SaveButton() throws InterruptedException {
//		vehicledatapage.SaveButton();
//		logger.createNode("Save Button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(enabled = false)
//
//	public void VPDandSerialNumberTest() throws InterruptedException, IOException {
//
//		logger = extent.createTest("(AU) Check if the VPD and Serial Number Tab values are getting displayed");
//
//		vehicledatapage.VPDandSerialNumberTab();
//
//		logger.createNode(
//				"Filter button is clicked and relevant VPD ID is entered to display the relevant VPD ID appears ")
//				.pass(" VPD and Serial no. Tab in Vehicle Data module");
//
//	}
//
//	@Test(priority = 12)
//	public void ControlUnitTab() throws InterruptedException {
//		logger = extent.createTest("U-014: (AU) Control Unit Tab Test of Vehicle Data module");
//		vehicledatapage.ControlUnitTab_PassengerCar();
//		logger.createNode("Control unit Tab is clicked")
//				.pass("Control unit button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 13)
//	public void ControlUnitTab_AddControlUnitButton() throws InterruptedException {
//		vehicledatapage.AddControlUnit_button();
//		logger.createNode("Add control unit button is clicked")
//				.pass("Add control unit button is clicked is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 14)
//	public void ControlUnitTab_DiogenesName() throws InterruptedException {
//		vehicledatapage.ControlUnit_DiogenesName();
//		logger.createNode("Diogenes name field is provided with the input - ABC221")
//				.pass("Diogenes name field is provided with the input - ABC221. Test Case Passed");
//	}
//
//	@Test(priority = 15)
//	public void ControlUnitTab_model() throws InterruptedException {
//		vehicledatapage.ControlUnitModel();
//		logger.createNode("Model drop down field is selected with the data - SEAT")
//				.pass("Model drop down field is selected with the data - SEAT. Test Case Passed");
//	}
//
//	@Test(priority = 16)
//	public void ControlUnitTab_checkmarkButton() throws InterruptedException {
//		vehicledatapage.ControlUnit_CheckMarkButton();
//		logger.createNode("Checkmark button is clicked")
//				.pass("Checkmark button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 17)
//	public void ControlUnitTab_AddSoftwareButton() throws InterruptedException {
//		vehicledatapage.AddSoftwareButton();
//		logger.createNode("Add Software button is clicked")
//				.pass("Add Software button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 18)
//	public void ControlUnitTab_AddObjectNumber() throws InterruptedException {
//		vehicledatapage.AddSoftware_ObjectNumber();
//		logger.createNode("Object Number field is provided with the input - 1234")
//				.pass("Object Number field is provided with the input - 1234. Test Case Passed");
//	}
//
//	@Test(priority = 19)
//	public void ControlUnitTab_checkmarkButton_addsoftware() throws InterruptedException {
//		vehicledatapage.ControlUnit_CheckMarkButton();
//		logger.createNode("Checkmark button is clicked")
//				.pass("Checkmark button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 20)
//	public void ControlUnitTab_AddComponentButton() throws InterruptedException {
//		vehicledatapage.AddComponentButton();
//		logger.createNode("Add Component button is clicked")
//				.pass("Add Component button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 21)
//	public void ControlUnitTab_AddAlias() throws InterruptedException {
//		vehicledatapage.Alias_component();
//		logger.createNode("Alias field is provided with the input - CEID1")
//				.pass("Alias field is provided with the input - CEID1. Test Case Passed");
//	}
//
//	@Test(priority = 22)
//	public void ControlUnitTab_checkmarkButton_Alias() throws InterruptedException {
//		vehicledatapage.ControlUnit_CheckMarkButton_Alias();
//		logger.createNode("Checkmark button is clicked")
//				.pass("Checkmark button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 23)
//	public void ControlUnitTab_SaveButton() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 24)
//	public void ControlUnitTab_Filter() throws InterruptedException {
//		vehicledatapage.ControlUnitTab_FilterButton();
//		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 25)
//
//	public void ControlUnitTab_FilterText() throws InterruptedException {
//		vehicledatapage.ControlUnitTab_FilterText();
//		logger.createNode("Doigenes name is provided as input in the search field - ABC")
//				.pass("Doigenes name is provided as input in the search field - ABC. Test Case Passed");
//	}
//
//	@Test(priority = 26)
//
//	public void controlUnits_Create_FilteredResult() throws InterruptedException {
//		vehicledatapage.controlUnits_FilteredResult();
//		logger.createNode(
//				"Filtered result of created Control units is - " + vehicledatapage.controlUnits_FilteredResult())
//				.pass("Filtered result of created Control units is - " + vehicledatapage.controlUnits_FilteredResult()
//						+ ". Test Case Passed");
//	}
////      //no
////
//////               @Test(priority=27)
//////
//////               public void controlUnitsTab_Edit() throws InterruptedException{
//////                              logger = extent.createTest("U-057: (AU) Update control unit");
//////                              vehicledatapage.controlUnitsTab_Edit();
//////                              logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Test Case Passed");
//////               }
//////
//////               @Test(priority=28)
//////
//////               public void controlUnitTab_Model_Edit() throws InterruptedException{
//////                              vehicledatapage.controlUnitTab_Model_Edit();
//////                              logger.createNode("Model field is edited with the input - OBC").pass("Model field is edited with the input - OBC. Test Case Passed");
//////               }
//////
//////               @Test(priority=29)
//////
//////               public void controlUnitsTab_Version() throws InterruptedException{
//////                              vehicledatapage.controlUnitsTab_Version();
//////                              logger.createNode("Version field is edited with the input - 1").pass("Version field is edited with the input - 1. Test Case Passed");
//////               }
//////
//////               @Test(priority=30)
//////
//////               public void controlUnitsTab_HardwareObject() throws InterruptedException{
//////                              vehicledatapage.controlUnitsTab_HardwareObject();
//////                              logger.createNode("Hardware Object field is edited with the input - 100").pass("Hardware Object field is edited with the input - 1. Test Case Passed");
//////               }
//////
//////               @Test(priority=31)
//////
//////               public void controlUnitsTab_SerialNumber() throws InterruptedException{
//////                              vehicledatapage.controlUnitsTab_SerialNumber();
//////                              logger.createNode("Serial Number field is edited with the input - 1000").pass("Serial Number field is edited with the input - 1000. Test Case Passed");
//////               }
//////
//////               @Test(priority=32)
//////               public void controlUnit_Edit_CheckMarkButton() throws InterruptedException{
//////                              vehicledatapage.ControlUnit_CheckMarkButton();
//////                              logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
//////               }
//////
//////               @Test(priority=33)
//////               public void controlUnitTab_Edit_SaveButton() throws InterruptedException{
//////                              vehicledatapage.ControlUnit_SaveButton();
//////                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//////               }
//////
//////               @Test(priority=34)
//////               public void controlUnitTab_Edit_Filter() throws InterruptedException{
//////                              vehicledatapage.ControlUnitTab_FilterButton();
//////                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
//////               }
//////
//////               @Test(priority=35)
//////
//////               public void controlUnitTab_Edit_FilterText() throws InterruptedException{
//////                              vehicledatapage.ControlUnitTab_FilterText();
//////                              logger.createNode("Doigenes name is provided as input in the search field - ABC").pass("Doigenes name is provided as input in the search field - ABC. Test Case Passed");
//////               }
//////
//////               @Test(priority=36)
//////
//////               public void controlUnits_Edit_FilteredResult() throws InterruptedException{
//////                              vehicledatapage.controlUnits_FilteredResult();
//////                              logger.createNode("Filtered result of edited Control units is - " + vehicledatapage.controlUnits_FilteredResult()).pass("Filtered result of edited Control units is - "+ vehicledatapage.controlUnits_FilteredResult() +". Test Case Passed");
//////               }
////
////               // no
//
//	@Test(priority = 37)
//	public void ControlUnitTab_SaveButton_ToDeleteEntry() throws InterruptedException {
//		vehicledatapage.ControlUnit_DeleteButton();
//		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 38)
//
//	public void ControlUnitTab_Software_ToDeleteEntry() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 39)
//	public void ControlUnitTab_Filter_Delete() throws InterruptedException {
//		vehicledatapage.ControlUnitTab_FilterButton();
//		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 40)
//
//	public void ControlUnitTab_FilterText_Delete() throws InterruptedException {
//		vehicledatapage.ControlUnitTab_FilterText();
//		logger.createNode("Doigenes name is provided as input in the search field - ABC")
//				.pass("Doigenes name is provided as input in the search field - ABC. Test Case Passed");
//	}
//
//	@Test(priority = 41)
//
//	public void controlUnits_FilteredResult_DisplayedOrNot() {
//		try {
//			boolean flag = vehicledatapage.controlUnits_FilteredResult_DisplayedOrNot();
//			if (flag) {
//				logger.createNode("Deleted Control unit is displayed")
//						.fail("Deleted Control unit is displayed. Test case failed");
//			} else {
//				logger.createNode("Deleted Control unit is not displayed")
//						.pass("Deleted Control unit is displayed is not displayed. Test case passed");
//			}
//		} catch (NoSuchElementException e) {
//			logger.createNode("Deleted Control unit is not available")
//					.pass("Deleted Control unit is not available. Test case passed");
//		}
//	}

//	@Test(priority = 49)
//	public void TheftRelevantTabTest() throws InterruptedException {
//		logger = extent.createTest("U-002: (AU) Theft Relevant Data Tab of Vehicle Data module");
//		vehicledatapage.searchfin_PassengerCarWithRightAccess();
//		logger.createNode("Search field is edited with the data - WDD2040471A953090")
//				.pass("Search field is edited with the data - WDD2040471A953090 successfully. Test Case Passed");
//		vehicledatapage.TheftRelevantData_Tab();
//		logger.createNode("Theft Relevant Data Tab is clicked")
//				.pass("Theft Relevant Data Tab is clicked successfully. Test Case Passed");
//	}

	@Test(priority = 50)
	public void TheftRelevantTab_LockButton() throws InterruptedException {
		logger = extent.createTest("U-005, U-016: (AU) Edit Key lock data of Theft relevant Data tab");
		vehicledatapage.searchfin_PassengerCarWithRightAccess();
		logger.createNode("Search field is edited with the data - WDB9634272L898132")
				.pass("Search field is edited with the data - WDB9634272L898132 successfully. Test Case Passed");
		vehicledatapage.TheftRelevantData_Tab();
		warmup5();
		vehicledatapage.LockButton();
		logger.createNode("Lock button is clicked").pass("Lock button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 51)
	public void TheftRelevantTab_EditLockButton() {
		vehicledatapage.EditLock_Data();
		logger.createNode("Edit Lock button is clicked")
				.pass("Edit Lock button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 52)
	public void TheftRelevantTab_MechanicalLock() {
		vehicledatapage.editLock_Model();
		logger.createNode("Model field drop down is edited with the data - FBS2")
				.pass("Model field drop down is edited with the data - FBS2. Test Case Passed");
		vehicledatapage.Mechanical_Lock();
		logger.createNode("Mechanical lock field is edited with the data - 111111")
				.pass("Mechanical lock field is edited with the data - 111111. Test Case Passed");
	}

	@Test(priority = 53)
	public void TheftRelevantTab_ElectronicLock() {
		vehicledatapage.Electrical_Lock();
		logger.createNode("Electronic lock field is edited with the data - 111111")
				.pass("Electronic lock field is edited with the data - 111111. Test Case Passed");
	}

	@Test(priority = 54)
	public void TheftRelevantTab_Infotainment() {
		vehicledatapage.Infotainment();
		logger.createNode("Infotainment button is clicked")
				.pass("Infotainment button is clicked successfully. Test Case Passed");
	}

//	@Test(priority = 55)
//	public void TheftRelevantTab_CDChanger() {
//		vehicledatapage.CDChanger();
//		logger.createNode("CD changer device number field is edited with the data - " + RandomLabelData_DeviceNumber)
//				.pass("CD changer device number field is edited with the data - " + RandomLabelData_DeviceNumber
//						+ " . Test Case Passed");
//	}

	@Test(priority = 56)

	public void TheftRelevantTab_Save() throws InterruptedException {
		vehicledatapage.ControlUnit_SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

//	@Test(priority = 57)
//	public void TheftRelevantTab_PIN() {
//		logger = extent.createTest("U-107: (AU) Radio Code of Theft relevant Data tab");
//		vehicledatapage.Pin();
//		logger.createNode("PIN button is clicked").pass("PIN button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 58)
//	public void TheftRelevantTab_EditPIN() {
//		vehicledatapage.EditPin();
//		logger.createNode("Edit PIN button is clicked")
//				.pass("Edit PIN button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 59)
//	public void TheftRelevantTab_PINText() {
//		vehicledatapage.PinText();
//		logger.createNode("PIN field is edited with the data - EMZ0PW5VRW9FODEH89QNX77J2")
//				.pass("PIN field is edited with the data - EMZ0PW5VRW9FODEH89QNX77J2. Test Case Passed");
//	}
//
//	@Test(priority = 60)
//
//	public void TheftRelevantTab_Savedetails() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 61)
//
//	public void TheftRelevantTab_ImmobilizerCode() throws InterruptedException {
//		logger = extent.createTest("U-250: (AU) Immobalizer Code of Theft relevant Data tab");
//		vehicledatapage.ImmobilizerCode();
//		logger.createNode("Immobilizer button is clicked")
//				.pass("Immobilizer button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 62)
//
//	public void TheftRelevantTab_ImmobilizerCodeEdit() throws InterruptedException {
//		vehicledatapage.ImmobilizerCode_Edit();
//		logger.createNode("Edit Immobilizer button is clicked")
//				.pass("Edit Immobilizer button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 63)
//
//	public void TheftRelevantTab_ImmobilizerCodeText() throws InterruptedException {
//		vehicledatapage.ImmobilizerCode_text();
//		logger.createNode("Immobilizer code field is edited with the data - " + RandomRearAxle4ObjectNumber)
//				.pass("Immobilizer code field is edited with the data - " + RandomRearAxle4ObjectNumber
//						+ ". Test Case Passed");
//	}
//
//	@Test(priority = 64)
//
//	public void TheftRelevantTab_SaveButton() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 65)
//
//	public void Navigation_Tab() throws InterruptedException {
//		logger = extent.createTest("U-171: (AU) Navigation Tab of Vehicle Data module");
//		vehicledatapage.NavigationTab();
//
//		logger.createNode("Navigation Tab is clicked").pass("Navigation Tab is clicked successfully. Test Case Passed");
//
//		// Kartik
//		warmup6();
//		// boolean flag = vehicledatapage.alertBox();
//		// if (flag == true) {
//		// vehicledatapage.moveToAlertBoxCloseAndClick();
//		// }
//	}
//
//	@Test(priority = 66)
//
//	public void Navigation_Tab_ShowExpandedView() throws InterruptedException {
//		vehicledatapage.NavigationTab_ShowExpandedView();
//		logger.createNode("Show expanded view button is clicked")
//				.pass("Show expanded view button is clicked successfully. Test Case Passed");
//
//	}
//
//	@Test(priority = 67)
//	public void Navigation_Tab_EditMajorVersions() throws InterruptedException {
//		vehicledatapage.EditMajorAssembliesButton();
//		logger.createNode("Edit Major versions button is clicked")
//				.pass("Edit Major versions button is clicked successfully. Test Case Passed");
//
//	}
//
//	@Test(priority = 68)
//
//	public void Navigation_Tab_MajorAssemblyNumber() throws InterruptedException {
//		vehicledatapage.NavigationTab_MajorVersionNumber();
//		logger.createNode("Navigation Compatability identifier (Major Versions) field is edited with the data - "
//				+ RandomLabelData_MajorVersionNumber)
//				.pass("Navigation Compatability identifier (Major Versions) field is edited with the data - "
//						+ RandomLabelData_MajorVersionNumber + ". Test Case Passed");
//
//	}
//
//	@Test(priority = 69)
//	public void Navigation_Tab_AddActivationCodeInfoButton() throws InterruptedException {
//		logger = extent.createTest("U-165: (AU) Navigation Tab of Vehicle Data module");
//		vehicledatapage.NavigationTab_AddActivationCodeInfoButton();
//		logger.createNode("Add activation Code info button is clicked")
//				.pass("Add activation Code info button is clicked successfully. Test Case Passed");
//
//	}
//
//	@Test(priority = 70)
//	public void Navigation_Tab_MapVersion() throws InterruptedException {
//		vehicledatapage.NavigationTab_MapversionEStand();
//		logger.createNode("Development status field is provided with the input - DB_DCNTG45A_USA_USA_E23.0072").pass(
//				"Development status field is provided with the input - DB_DCNTG45A_USA_USA_E23.0072. Test Case Passed");
//
//	}
//
//	@Test(priority = 71)
//
//	public void Navigation_Tab_SoftwareID() throws InterruptedException {
//		vehicledatapage.NavigationTab_SoftwareID();
//		logger.createNode("Software ID field is provided with the input - 0001110B")
//				.pass("Software ID field is provided with the input - 0001110B. Test Case Passed");
//
//	}
//
//	@Test(priority = 72)
//	public void Navigation_Tab_Checkmark() throws InterruptedException {
//		vehicledatapage.NavigationTab_CheckMark();
//		logger.createNode("Checkmark button is clicked")
//				.pass("Checkmark button is clicked successfully. Test Case Passed");
//
//	}
//
//	@Test(priority = 73)
//
//	public void NavigationTab_SaveButton() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//
//		// Kartik
//		warmup6();
//		// boolean flag = vehicledatapage.alertBox();
//		// if (flag == true) {
//		// vehicledatapage.moveToAlertBoxCloseAndClick();
//		// }
//	}
//
//	@Test(priority = 74)
//	public void Navigation_Tab_FilterButton() throws InterruptedException {
//		vehicledatapage.NavigationTab_FilterButton();
//		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
//
//	}
//
//	@Test(priority = 75)
//
//	public void Navigation_Tab_FilterText() throws InterruptedException {
//		vehicledatapage.NavigationTab_FilterText();
//		logger.createNode("Search field is provided with the Development status input - DB_DCNTG45A_USA_USA_E23.0072")
//				.pass("Search field is provided with the Development status input - DB_DCNTG45A_USA_USA_E23.0072. Test Case Passed");
//
//	}
//
//	@Test(priority = 76)
//
//	public void Navigation_Tab_FilterText_Delete() throws InterruptedException {
//		vehicledatapage.NavigationTab_FilterText_Delete();
//		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
//
//	}
//
//	@Test(priority = 77)
//	public void NavigationTab_SaveButton_Thinclient() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//
//		// Kartik
//		warmup6();
//		// boolean flag = vehicledatapage.alertBox();
//		// if (flag == true) {
//		// vehicledatapage.moveToAlertBoxCloseAndClick();
//		// }
//	}
//
//	@Test(priority = 78)
//	public void FOText_Tab() throws InterruptedException {
//		vehicledatapage.FOText_Tab();
//		logger = extent.createTest("U-136: (AU) FO Text Tab of Vehicle Data module");
//		logger.createNode("FO Text Tab is clicked").pass("FO Text Tab is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 79)
//	public void FOText_Tab_AddTextButton() throws InterruptedException {
//		vehicledatapage.FOText_AddTextButton();
//		logger.createNode("Add Text button is clicked")
//				.pass("Add Text button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 80)
//	public void FOText_Tab_Designation() throws InterruptedException {
//		vehicledatapage.FOText_Designation();
//		logger.createNode("00 'arrangements (Not in EPC)' is selected under designation")
//				.pass("00 'arrangements (Not in EPC)' is selected under designation. Test Case Passed");
//	}
//
//	@Test(priority = 81)
//	public void FOText_Tab_TextContent() throws InterruptedException {
//		vehicledatapage.FOText_TextContent();
//		logger.createNode("Text content field is provided with the value - Created By MBRDI")
//				.pass("Text content field is provided with the value - Created By MBRDI. Test Case Passed");
//	}
//
//	@Test(priority = 82)
//	public void FOText_Tab_CheckmarkButton() throws InterruptedException {
//		vehicledatapage.FOText_CheckMarkButton();
//		logger.createNode("Checkmark button is clicked")
//				.pass("Checkmark button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 83)
//	public void FOText_SaveButton() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 84)
//	public void FOText_Tab_TrashButton() throws InterruptedException {
//		vehicledatapage.FOText_DeleteButton();
//		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 85)
//	public void FOText_SaveButton_ThinClient() throws InterruptedException {
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}

//	@Test(priority = 86)
//	public void SalesDataTab() throws InterruptedException {
//		logger = extent.createTest("U-002: (AU) Sales Data Tab of Vehicle Data Module");
//		vehicledatapage.SalesDataTab();
//		logger.createNode("Sales data tab is clicked").pass("Sales data tab is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 87)
//	public void SalesDataTab_EditSalesDataButton() throws InterruptedException {
//		vehicledatapage.EditSalesData();
//		logger.createNode("Edit sales data tab is clicked")
//				.pass("Edit sales data tab is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 88)
//
//	public void SalesDataTab_OrderCountry() throws InterruptedException {
//		vehicledatapage.OrderCountry();
//		logger.createNode("Sales unit field is edited with the data - 714")
//				.pass("Sales unit field is edited with the data - 714. Test Case Passed");
//	}
//
//	@Test(priority = 89)
//
//	public void SalesDataTab_ConsumerCountry() throws InterruptedException {
//		vehicledatapage.ConsumerCountry();
//		logger.createNode("Consumer country field is edited with the data - 705")
//				.pass("Consumer country field is edited with the data - 705. Test Case Passed");
//	}
//
//	@Test(priority = 90)
//
//	public void SalesDataTab_ModeOfShipment() throws InterruptedException {
//		vehicledatapage.ModeOfShopment();
//		logger.createNode("Dropdown available in Mode of Shipment is - " + vehicledatapage.ModeOfShopment()).pass(
//				"Dropdown available in Mode of Shipment is - " + vehicledatapage.ModeOfShopment() + "Test Case Passed");
//	}
//
//	@Test(priority = 91)
//	public void SalesDataTab_TechnicalDate() throws InterruptedException {
//		vehicledatapage.DateOfTechnicalState();
//		logger.createNode("Date technical state field is edited with the data - 03/08/2018")
//				.pass("Date technical state field is edited with the data - 03/08/2018. Test Case Passed");
//	}
//
//	@Test(priority = 92)
//
//	public void SaveButton_SalesData() throws InterruptedException {
//		vehicledatapage.Save_Button();
//		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(enabled = false)
//	public void TheftArrangementTab() throws InterruptedException {
//		vehicledatapage.TheftArrangementTab();
//		logger.createNode("Theft Arrangement Tab is clicked")
//				.pass("Theft Arrangement Tab is clicked successfully. Test Case Passed");
//	}
//from here needed
	@Test(priority = 93)
	public void CertificationTab() throws InterruptedException {
		logger = extent.createTest("U-002: (AU) Certification Tab of Vehicle Data module");
		vehicledatapage.CertificationTab();
		logger.createNode("Certification Tab is clicked")
				.pass("Certification Tab is clicked successfully. Test Case Passed");
	}

	@Test(priority = 94)
	public void EditVehicleTitleNumber() throws InterruptedException {
		vehicledatapage.EditVehicleOwnershipTitleNo_Button();
		logger.createNode("Edit Vehicle title number button is clicked")
				.pass("Edit Vehicle title number button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 95)

	public void VehicleTitleNumber_Text() throws InterruptedException {
		vehicledatapage.VehicleOwnershipTitleNo_Text();
		logger.createNode("Vehicle ownership title number field is edited with the data - DT111111")
				.pass("Vehicle ownership title number field is edited with the data - DT111111. Test Case Passed");
	}

//	@Test(priority = 96)
//	public void EditDocumentKey() throws InterruptedException {
//		vehicledatapage.EditDocumentKey();
//		logger.createNode("Edit document key button is clicked")
//				.pass("Edit document key button is clicked successfully. Test Case Passed");
//	}

//	@Test(priority = 97)
//	public void EditDocumentKey_Text() throws InterruptedException {
//		vehicledatapage.Documentkey_Text();
//		logger.createNode("Document Key field is edited with the data - U     204047    BAAAAAAA014")
//				.pass("Document Key field is edited with the data - U     204047    BAAAAAAA014. Test Case Passed");
//	}

//	@Test(priority = 98)
//	public void AdditionalApprovalButton() throws InterruptedException {
//		vehicledatapage.AdditionalApproval_Button();
//		logger.createNode("Additional Approval Button is clicked")
//				.pass("Additional Approval Button is clicked successfully. Test Case Passed");
//	}

//	@Test(priority = 99)
//
//	public void AdditionalApproval_EditDocumentKey() throws InterruptedException {
//		vehicledatapage.AdditionalApproval_EditDocumentKey();
//		logger.createNode("Edit document key Button is clicked")
//				.pass("Edit document key Button is clicked successfully. Test Case Passed");
//	}

//	@Test(priority = 100)
//
//	public void AdditionalApproval_DocumentText() throws InterruptedException {
//		vehicledatapage.AdditionalDocumentkey_Text();
//		logger.createNode("Document key field is edited with the data - U     204047    BAAAAAAA014")
//				.pass("Document key field is edited with the data - U     204047    BAAAAAAA014. Test Case Passed");
//	}

	@Test(priority = 101)
	public void Save_Button() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 102)
	public void ModelPlate_Tab() throws InterruptedException {
		logger = extent.createTest("U-002: (AU) Model Plate Tab of Vehicle Data Module");
		vehicledatapage.ModelPlateTab();
		logger.createNode("Model plate tab is clicked")
				.pass("Model plate tab is clicked successfully. Test Case Passed");
	}

	@Test(priority = 103)
	public void ModelPlateTab_EditDataButton() throws InterruptedException {
		vehicledatapage.ModelPlateTab_EditDataButton();
		logger.createNode("Edit data button is clicked")
				.pass("Edit data button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 104)
	public void ModelPlateTab_CombinedWeightUpdate() throws InterruptedException {
		vehicledatapage.ModelPlateTab_CombinedWeightKG();
		logger.createNode("Perm. gross comb. weight Kilograms field is edited with the data - 2021")
				.pass("Perm. gross comb. weight Kilograms field is edited with the data - 2021. Test Case Passed");
	}

	@Test(priority = 105)
	public void ModelPlateTab_Axle1WeightUpdate() throws InterruptedException {
		vehicledatapage.ModelPlateTab_AxleLoad1Update();
		logger.createNode("Permissible axle load Axle 1 Pounds field is edited with the data - 2414")
				.pass("Permissible axle load Axle 1 Pounds field is edited with the data - 2414. Test Case Passed");
	}

	@Test(priority = 106)
	public void ModelPlateTab_Axle2WeightUpdate() throws InterruptedException {
		vehicledatapage.ModelPlateTab_AxleLoad2Update();
		logger.createNode("Permissible axle load Axle 2 Pounds field is edited with the data - 2414")
				.pass("Permissible axle load Axle 2 Pounds field is edited with the data - 2414. Test Case Passed");
	}

	@Test(priority = 107)
	public void ModelPlateTab_TiresAxle1WeightUpdate() throws InterruptedException {
		vehicledatapage.ModelPlateTab_TiresAxle1Update();
		logger.createNode("Prem Axle 4 load field is edited with the data - 2145")
				.pass("Prem Axle 4 load field is edited with the data - 2145. Test Case Passed");
	}

	@Test(priority = 108)

	public void ModelPlateTab_RimssAxle1WeightUpdate() throws InterruptedException {
		vehicledatapage.ModelPlateTab_RimAxle1Update();
		logger.createNode("Prem Axle 3 load field is edited with the data - 2567")
				.pass("Prem Axle 3 load field is edited with the data - 2567. Test Case Passed");
	}

//	@Test(priority = 109)
//
//	public void ModelPlateTab_EUApprovalNumberUpdate() throws InterruptedException {
//		vehicledatapage.ModelPlateTab_EUApprovalNumber_Update();
//		logger.createNode("EU approval number field is edited with the data - 2022")
//				.pass("EU approval number field is edited with the data - 2022. Test Case Passed");
//	}
//
//	@Test(priority = 110)
//
//	public void ModelPlateTab_ProductionYearUpdate() throws InterruptedException {
//		vehicledatapage.ModelPlateTab_ProductionYear_Update();
//		logger.createNode("Production year field is edited with the data - 2020")
//				.pass("Production year field is edited with the data - 2020. Test Case Passed");
//	}
//
//	@Test(priority = 111)
//
//	public void ModelPlateTab_ProductionMonthUpdate() throws InterruptedException {
//		vehicledatapage.ModelPlateTab_ProductionMonth_Update();
//		logger.createNode("Production month field is edited with the data - 7")
//				.pass("Production month field is edited with the data - 7. Test Case Passed");
//	}
//
//	@Test(priority = 112)
//
//	public void ModelPlateTab_EngineModelDesignation() throws InterruptedException {
//		vehicledatapage.ModelPlate_EngineModelDesignation();
//		logger.createNode("Engine Model Designation field is edited with the data - 1111")
//				.pass("Engine Model Designation field is edited with the data - 1111. Test Case Passed");
//	}
//
//	@Test(priority = 113)
//
//	public void ModelPlateTab_NumberOfSeats() throws InterruptedException {
//		vehicledatapage.ModelPlate_CountSeats();
//		logger.createNode("Number of seats field is edited with the data - 5")
//				.pass("Number of seats field is edited with the data - 5. Test Case Passed");
//	}
//
//	@Test(priority = 114)
//
//	public void ModelPlateTab_ShowAdditionalModalPlate() throws InterruptedException {
//		vehicledatapage.ModelPlate_ShowAdditionalModalPlate_Button();
//		logger.createNode("Show Additional Modal plate button is clicked")
//				.pass("Show Additional Modal plate button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 115)
//	public void ModelPlateTab_EditModalPlateDataButton() throws InterruptedException {
//		vehicledatapage.ModalPlate_EditModalPlateData_Button();
//		logger.createNode("Edit data button is clicked")
//				.pass("Edit data button is clicked successfully. Test Case Passed");
//	}
//
//	@Test(priority = 116)
//	public void ModelPlateTab_EgPermitNumber() throws InterruptedException {
//		vehicledatapage.ModalPlate_EgPermitNumber();
//		logger.createNode("EU approval number field is edited with the data - 2222")
//				.pass("EU approval number field is edited with the data - 2222. Test Case Passed");
//	}
//
//	@Test(priority = 117)
//	public void ModelPlateTab_Modelyear() throws InterruptedException {
//		vehicledatapage.ModalPlate_ModelYear();
//		logger.createNode("Model Year field is edited with the data - 2020")
//				.pass("Model Year field is edited with the data - 2020. Test Case Passed");
//	}
//
//	@Test(priority = 118)
//	public void ModelPlateTab_CurbWeight() throws InterruptedException {
//		vehicledatapage.ModalPlate_CurbWeight();
//		logger.createNode("Curb Weight field is edited with the data - " + WLTP_VECTO_ID_For2ndEntry).pass(
//				"Curb Weight field is edited with the data - " + WLTP_VECTO_ID_For2ndEntry + " . Test Case Passed");
//	}

	@Test(priority = 119)
	public void Save_Button_ModelPlateTab() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 120)
	public void EquipmentTab() throws InterruptedException {
		logger = extent.createTest("U-002: (AU) Equipment Tab of Vehicle Data Module");
		vehicledatapage.EquipmentTab();
		logger.createNode("Equipment Tab is clicked").pass("Equipment Tab is clicked successfully. Test Case Passed");
	}

	@Test(priority = 121)
	public void EquipmentTab_EditScratchResistantclearvarnish_button() throws InterruptedException {
		vehicledatapage.EquipmentTab_ADDcolor_button();
		logger.createNode("Add color button is clicked")
				.pass("Add color button button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 122)
	public void EquipmentTab_EditScratchResistantclearvarnish_text() throws InterruptedException {
		vehicledatapage.EquipmentTab_colorsCode_text();
		logger.createNode("Colors code is entered as - 1234").pass(
				"Colors code is entered as - 1234 - 1234. Test Case Passed");
	}

	@Test(priority = 123)
	public void EquipmentTab_Submit() throws InterruptedException {
		vehicledatapage.EquipmentTab_submit();
		logger.createNode("Submit button is clicked").pass("Submit button is clicked. Test Case Passed");
	}

	@Test(priority = 124)
	public void EquipmentTab_Delete() throws InterruptedException {
		vehicledatapage.EquipmentTab_Deletecolor();
		logger.createNode("Color code with 1234 is deleted").pass(
				"Color code with 1234 is deleted. Test Case Passed");
	}

	@Test(priority = 125)
	public void EquipmentTab_EditOtherButton() throws InterruptedException {
		vehicledatapage.EquipmentTab_EditOtherButton();
		logger.createNode("Edit other button is clicked")
				.pass("Edit other button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 126)
	public void EquipmentTab_EditLamps() throws InterruptedException {
		vehicledatapage.EquipmentTab_Lamps();
		logger.createNode("Lamps field is edited with the data - Created By DTICI")
				.pass("Lamps field is edited with the data - Created By DTICI. Test Case Passed");
	}

	@Test(priority = 127)
	public void EquipmentTab_WindWipers() throws InterruptedException {
		vehicledatapage.EquipmentTab_WindWipers();
		logger.createNode("Wind. wipers field is edited with the data - " + RandomLabelData_MajorVersionNumber)
				.pass("Wind. wipers field is edited with the data - " + RandomLabelData_MajorVersionNumber
						+ " . Test Case Passed");
	}

	@Test(priority = 128)
	public void Save_Button_EquipmentTab() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
	}

	@Test(priority = 129)
	public void InternalTextTab() throws InterruptedException {
		// logger= extent.createTest("U-166: (AU) Internal text Tab of Vehicle Data
		// Module");
		logger = extent.createTest("U-166: (AU) Create Internal texts");
		vehicledatapage.InternalTextTab();
		logger.createNode("Internal text tab is clicked").pass("Internal text tab is clicked. Test Case Passed");
	}

	@Test(priority = 130)
	public void InternalTextTab_AddTextButton() throws InterruptedException {
		vehicledatapage.InternalTextTab_AddTextButton();
		logger.createNode("Add text button is clicked").pass("Add text button is clicked. Test Case Passed");
	}

	@Test(priority = 131)
	public void InternalTextTab_AddTextContent() throws InterruptedException {
		vehicledatapage.InternalTextTab_TextContent();
		logger.createNode("Text content field is edited with the data - DTICI Create Internal Texts")
				.pass("Text content field is edited with the data - DTICI Create Internal Texts. Test Case Passed");
	}

	@Test(priority = 132)
	public void InternalTextTab_CheckmarkButton() throws InterruptedException {
		vehicledatapage.InternalTextTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked")
				.pass("Checkmark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 133)
	public void Save_Button_InternaltextTab() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 134)
	public void InternaltextTab_FilterButton() throws InterruptedException {
		vehicledatapage.InternalText_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 135)
	public void InternaltextTab_FilterText() throws InterruptedException {
		vehicledatapage.InternalText_Create_FilterText();
		logger.createNode("Search field is provided with the data - DTICI Create Internal Texts")
				.pass("Search field is provided with the data - DTICI Create Internal Texts. Test Case Passed");
	}

	@Test(priority = 136)
	public void InternalTextTab_EditButton() throws InterruptedException {
		logger = extent.createTest("U-005,U-167 (AU): Update internal texts");
		vehicledatapage.InternalTextTab_EditButton();
		logger.createNode("Edit button is clicked for the filtered data - DTICI Create Internal Texts")
				.pass("Edit button is clicked for the filtered data - DTICI Create Internal Texts. Test Case Passed");
	}

	@Test(priority = 137)
	public void InternalTextTab_UpdateTextContent() throws InterruptedException {
		vehicledatapage.InternalTextTab_UpdateTextContent();
		logger.createNode("Text Content field is edited with the input - DTICI Edit Internal Texts")
				.pass("Text Content field is edited with the input - DTICI Edit Internal Texts. Test Case Passed");

	}

	@Test(priority = 138)
	public void InternalTextTab_Edit_CheckmarkButton() throws InterruptedException {
		vehicledatapage.InternalTextTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked")
				.pass("Checkmark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 139)
	public void Save_Button_Edit_InternaltextTab() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 140)
	public void InternaltextTab_Create_FilterButton() throws InterruptedException {
		vehicledatapage.InternalText_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 141)
	public void InternaltextTab_Create_FilterText() throws InterruptedException {
		vehicledatapage.InternalText_FilterText();
		logger.createNode("Search field is provided with the data - DTICI Edit Internal Texts")
				.pass("Search field is provided with the data - DTICI Edit Internal Texts. Test Case Passed");
	}

	@Test(priority = 142)
	public void InternaltextTab_TrashButton() throws InterruptedException {
		vehicledatapage.InternalText_TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 143)
	public void Save_Button_InternaltextTab_ToDelete() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 144)
	public void InternaltextTab_Delete_FilterButton() throws InterruptedException {
		vehicledatapage.InternalText_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
	}

//	@Test(priority = 145)
//	public void InternaltextTab_Delete_FilterText() throws InterruptedException {
//		vehicledatapage.InternalText_FilterText();
//		logger.createNode("Search field is provided with the deleted data - DTICI Edit Internal Texts")
//				.pass("Search field is provided with the deleted data - DTICI Edit Internal Texts. Test Case Passed");
//	}

	@Test(priority = 146)
	public void internalTextsTab_filteredResult() {
		try {
			boolean displayFlag = vehicledatapage.internalTextsTab_filteredResult();
			if (displayFlag)
				logger.createNode("Deleted Internal Texts - DTICI Edit Internal Texts is displayed")
						.fail("Deleted Internal Texts DTICI Edit Internal Texts is displayed");
			else
				logger.createNode("Deleted Internal Texts - DTICI Edit Internal Texts is not displayed")
						.pass("Deleted Internal Texts - DTICI Edit Internal Texts is not displayed");
		} catch (NoSuchElementException e) {
			logger.createNode("Deleted Internal Texts - DTICI Edit Internal Texts is not available")
					.pass("Deleted Internal Texts - DTICI Edit Internal Texts is not available");
		}
	}

	@Test(priority = 147)
	public void TechnicalAdviceTab() throws InterruptedException {
		logger = extent.createTest("U-172: (AU) Technical Advice texts Tab of Vehicle Data Module");
		vehicledatapage.TechnicalAdviceTest_Tab();
		logger.createNode("Technical advice texts tab is clicked")
				.pass("Technical advice texts tab is clicked successfully. Test Case Passed");
	}

	@Test(priority = 148)
	public void TechnicalAdviceTab_AddText() throws InterruptedException {
		vehicledatapage.TechnicalAdviceTest_AddTextButton();
		logger.createNode("Add Text button is clicked")
				.pass("Add Text button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 149)
	public void TechnicalAdviceTab_TextContent() throws InterruptedException {
		vehicledatapage.TechnicalAdviceTest_TextContent();
		logger.createNode("Text content field is provided with the input - Created By DTICI")
				.pass("Text content field is provided with the input - Created By DTICI. Test Case Passed");
	}

	@Test(priority = 150)
	public void TechnicalAdviceTab_CheckMarkButton() throws InterruptedException {
		vehicledatapage.TechnicalAdviceTest_CheckMarkButton();
		logger.createNode("Checkmark button is clicked")
				.pass("Checkmark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 151)
	public void Save_Button_TechnicalAdviceTextsTab() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 152)
	public void Edit_Button_TechnicalAdviceTextsTab() throws InterruptedException {
		logger = extent.createTest("U-005, U-173: (AU) Update Technical Advice texts Tab of Vehicle Data Module");
		vehicledatapage.TechnicalAdviceTest_EditButton();
		logger.createNode("Pencil button is clicked").pass("Pencil button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 153)
	public void TechnicalAdviceTab_TextContent_EditButton() throws InterruptedException {
		vehicledatapage.TechnicalAdviceTest_TextContent_Edit();
		logger.createNode("Text content field is edited with the data - Random Data")
				.pass("Text content field is edited with the data - Random Data successfully. Test Case Passed");
	}

	@Test(priority = 154)
	public void TechnicalAdviceTab_CheckMarkButton_afterEdit() throws InterruptedException {
		vehicledatapage.TechnicalAdviceTest_CheckMarkButton();
		logger.createNode("Check mark button is clicked")
				.pass("Check mark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 155)
	public void Save_Button_TechnicalAdviceTextsTab_AfterEdit() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 156)
	public void Trash_Button_TechnicalAdviceTextsTab() throws InterruptedException {
		vehicledatapage.TechnicalAdviceTest_TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 157)
	public void Save_Button_TechnicalAdviceTextsTab_TrashButton() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	// top is working

	@Test(priority = 158)
	public void InternalTab() throws InterruptedException {
		// previous
		logger = extent.createTest("U-005: (AU) Internal Tab of Vehicle Data Module");
		vehicledatapage.InternalTab();
		logger.createNode("Internal Tab is clicked").pass("Internal Tab is clicked successfully. Test Case Passed");
	}

	@Test(priority = 159)
	public void InternalTab_EditVehicleStateButton() throws InterruptedException {
		vehicledatapage.InternalTab_EdiVehicleStateButton();
		logger.createNode("Edit vehicle state button is clicked")
				.pass("Edit vehicle state button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 160)
	public void InternalTab_Status() throws InterruptedException {
		vehicledatapage.InternalTab_Status();
		logger.createNode("Status drop down is selected with the value")
				.pass("Status drop down is selected with the value. Test Case Passed");
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 161)
	public void InternalTab_EditProductIndicator() throws InterruptedException {
		vehicledatapage.InternalTab_EditProductIndicator();
		logger.createNode("Edit product indicator button is clicked")
				.pass("Edit product indicator button is clicked sucessfully. Test Case Passed");
	}
//               
////            @Test(priority=162)
////            public void InternalTab_LockIndicator() throws InterruptedException{
////                           vehicledatapage.InternalTab_LockIndicator();
////                           logger.createNode("Lock indicator checkbox is clicked in the Thinclient");               
////            }

	@Test(priority = 163)
	public void InternalTab_LiabilityComment() throws InterruptedException {
		vehicledatapage.InternalTab_LiabilityComment();
		logger.createNode("Product liability comments field is edited with the data - " + AliasID_Designation1)
				.pass("Product liability comments field is edited with the data - " + AliasID_Designation1
						+ " sucessfully. Test Case Passed");
	}

	@Test(priority = 164)
	public void InternalTab_SaveButton_EditProductIndicator() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 165)
	public void OrdersOfTheftRelevantPartsTab() throws InterruptedException {
		logger = extent.createTest("U-005, U-102: (AU) Orders of theft-relevant parts Tab of Vehicle Data Module");
//		vehicledatapage.searchfin_PassengerCarWithRightAccess();
//		logger.createNode("Search field is edited with the data - WDB9634272L898132")
//				.pass("Search field is edited with the data - WDD2040471A953090 successfully. Test Case Passed");
		vehicledatapage.OrdersOfTheftRelevantPartsTab();
		logger.createNode("Orders of theft-relevant parts tab is clicked")
				.pass("Orders of theft-relevant parts tab is clicked successfully. Test Case Passed");
	}

	@Test(priority = 166)
	public void OrdersOfTheftRelevantPartsTab_CreateOrdersManually() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_CreateOrderManuallyButton();
		logger.createNode("Create order manually button is clicked")
				.pass("Create order manually button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 167)
	public void OrdersOfTheftRelevantPartsTab_OrderNumber() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_OrderNumber();
		logger.createNode("Order Number field is provided with the input - " + RandomSpecialEquipmentCode).pass(
				"Order Number field is provided with the input - " + RandomSpecialEquipmentCode + ". Test Case Passed");
	}

	@Test(priority = 168)
	public void OrdersOfTheftRelevantPartsTab_Description() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_Description();
		logger.createNode("Description field is provided with the input - Created By DTICI")
				.pass("Description field is provided with the input - Created By DTICI. Test Case Passed");
	}

	@Test(priority = 169)
	public void OrdersOfTheftRelevantPartsTab_CheckMarkButton() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked")
				.pass("Checkmark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 170)
	public void OrdersOfTheftRelevantPartsTab_CreatePart() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_CreatePart();
		logger.createNode("Create part manually button is clicked")
				.pass("Create part manually button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 171)
	public void OrdersOfTheftRelevantParts_ObjectNumber() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_ObjectNumber();
		logger.createNode("Object number field is provided with the input -" + RandomAddVPDContent)
				.pass("Object number field is provided with the input -" + RandomAddVPDContent + ". Test Case Passed");
	}

	@Test(priority = 172)
	public void OrdersOfTheftRelevantParts_TypeOfPartOrder() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_TypeOfPartOrder();
		logger.createNode("Types of parts order drop down is provided with the input - Theft-relevant parts order")
				.pass("Types of parts order drop down is provided with the input - Theft-relevant parts order. Test Case Passed");
	}

	@Test(priority = 173)
	public void OrdersOfTheftRelevantParts_Comment() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_Comment();
		logger.createNode("Comment field is provided with the value - Created By DTICI")
				.pass("Comment field is provided with the value - Created By DTICI. Test Case Passed");
	}

	@Test(priority = 174)
	public void OrdersOfTheftRelevantParts_Checkmark() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_Checkmark();
		logger.createNode("Checkmark button is clicked")
				.pass("Checkmark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 175)
	public void OrdersOfTheftRelevantParts__SaveButton() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 176)
	public void OrdersOfTheftRelevantParts__FilterOrderButton() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_FilterOrderButton();
		logger.createNode("Filter order button is clicked")
				.pass("Filter order button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 177)
	public void OrdersOfTheftRelevantParts__FilterOrderText() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_FilterOrderText();
		logger.createNode("Search field is provided with the order number input - " + RandomSpecialEquipmentCode)
				.pass("Search field is provided with the order number input - " + RandomSpecialEquipmentCode
						+ ". Test Case Passed");
	}

//               
////            @Test(priority=153)
////            public void OrdersOfTheftRelevantParts__DeleteButtonCheck() throws InterruptedException{
////                           try {
////                                          boolean flag=               vehicledatapage.OrdersOfTheftRelevantPartsTab_DeleteButton();
////                                          if (flag =true) {
////                                                         logger.createNode("Delete button entitlement is displayed in the Thinclient for Filter order" );
////                                          } else {
////                                                         logger.createNode("Delete button entitlement is not displayed in the Thinclient" );
////                                          }
////                           } catch (NoSuchElementException e) {
////                                          logger.createNode("Delete button entitlement is not displayed in the Thinclient" );
////                           }
////            }

	@Test(priority = 178)
	public void OrdersOfTheftRelevantParts__FilterOrderEdit() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_FilterOrderEditButton();
		logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Test Case Passed");

	}

	@Test(priority = 179)
	public void OrdersOfTheftRelevantParts__FilterOrderEditObjectNumber() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_OrderNumber_AfterEdit();
		logger.createNode("Order number field is edited with the data" + givensalesareanumber)
				.pass("Order number field is edited with the data" + givensalesareanumber + ". Test Case Passed");
	}

	@Test(priority = 180)
	public void OrdersOfTheftRelevantParts_Checkmark_AfterEdit() throws InterruptedException {
		vehicledatapage.OrdersOfTheftRelevantPartsTab_Checkmark();
		logger.createNode("Checkmark button is clicked")
				.pass("Checkmark button is clicked successfully. Test Case Passed");
	}

	@Test(priority = 181)
	public void OrdersOfTheftRelevantParts__SaveButton_AfterEdit() throws InterruptedException {
		vehicledatapage.Save_Button();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");

//                              vehicledatapage.PageRefresh();
//                              logger.createNode("Browser is refreshed").pass("Browser is refreshed successfully. Test Case Passed");
//                              
//                              vehicledatapage.LogoutUser();
//                              logger.createNode("Log off/Change button is clicked").pass("Log off/Change button is clicked. Test Case Passed");                      
	}

//	@Test(priority = 182)
//	public void controlUnits_MCM() {
//		try {
//			logger = extent.createTest("U-185: (AU) Update control unit parameter data (PROFI compliant) - MCM");
//			vehicledatapage.validateVehicleDataPage();
//			vehicledatapage.searchfin_PassengerCarWithRightAccessMCM();
//			logger.createNode("For MCM : VIN Number WDB9630021L859303 is searched")
//					.pass("For MCM : VIN Number WDB9630021L859303 is searched. Test Case Passed");
//			vehicledatapage.ControlUnitTab_PassengerCar();
//			vehicledatapage.controlUnit_MCM();
//			logger.createNode("A MCM control unit is chosen").pass("A MCM control unit is chosen. Test Case Passed");
//			;
//			vehicledatapage.controlUnitTable_McmSearch();
//			logger.createNode("Show additional data for MCM is clicked")
//					.pass("Show additional data for MCM is clicked. Test Case Passed");
//			vehicledatapage.controlUnitTable_MajorAssemblyNumber();
//			logger.createNode("Major assembly number field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_MajorAssemblyNumber())
//					.pass("Major assembly number field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_MajorAssemblyNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_EcuName();
//			logger.createNode(
//					"ECU name field is displayed with the data - " + vehicledatapage.controlUnitTable_EcuName())
//					.pass("ECU name field is displayed with the data " + vehicledatapage.controlUnitTable_EcuName()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_IdCode();
//			logger.createNode("ID code field is displayed with the data - " + vehicledatapage.controlUnitTable_IdCode())
//					.pass("ID code field is displayed with the data " + vehicledatapage.controlUnitTable_IdCode()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_HardwareObjectNumber();
//			logger.createNode("Hardware object number field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_HardwareObjectNumber())
//					.pass("Hardware object number field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_HardwareObjectNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_CalibrationId();
//			logger.createNode("Calibration ID	 field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_CalibrationId())
//					.pass("Calibration ID field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CalibrationId() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_PerformanceMapProtection();
//			logger.createNode("Performance map protection field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_PerformanceMapProtection())
//					.pass("Performance map protection field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_PerformanceMapProtection() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Version();
//			logger.createNode(
//					"Version field is displayed with the data - " + vehicledatapage.controlUnitTable_Version())
//					.pass("Version field is displayed with the data " + vehicledatapage.controlUnitTable_Version()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_ServiceStatusSince();
//			logger.createNode("Service status since field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_ServiceStatusSince())
//					.pass("Service status since field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_ServiceStatusSince() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_CbfRevision();
//			logger.createNode(
//					"CBF revision field is displayed with the data - " + vehicledatapage.controlUnitTable_CbfRevision())
//					.pass("CBF revision field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CbfRevision() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_ImmobilizerStatus();
//			logger.createNode("Immobilizer status field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_ImmobilizerStatus())
//					.pass("Immobilizer status field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_ImmobilizerStatus() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Cvn();
//			logger.createNode("CVN field is displayed with the data - " + vehicledatapage.controlUnitTable_Cvn())
//					.pass("CVN field is displayed with the data " + vehicledatapage.controlUnitTable_Cvn()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_CerficateDesignation();
//			logger.createNode("Certification designation field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_CerficateDesignation())
//					.pass("Certification designation field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CerficateDesignation() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Plant();
//			logger.createNode("Plant field is displayed with the data - " + vehicledatapage.controlUnitTable_Plant())
//					.pass("Plant field is displayed with the data " + vehicledatapage.controlUnitTable_Plant()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_LastModification();
//			logger.createNode("Last modification field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_LastModification())
//					.pass("Last modification field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_LastModification() + ". Test Case Passed");
//			vehicledatapage.controlUnit_PerformanceChange();
//			logger.createNode("Performance change field is displayed with the data - "
//					+ vehicledatapage.controlUnit_PerformanceChange())
//					.pass("Performance change field is displayed with the data "
//							+ vehicledatapage.controlUnit_PerformanceChange() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_SpecialProperties();
//			logger.createNode("Special properties field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_SpecialProperties())
//					.pass("Special properties field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_SpecialProperties() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_DiagVersion();
//			logger.createNode(
//					"Diag version field is displayed with the data - " + vehicledatapage.controlUnitTable_DiagVersion())
//					.pass("Diag version field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_DiagVersion() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Used();
//			logger.createNode("Used field is displayed with the data - " + vehicledatapage.controlUnit_Used())
//					.pass("Used field is displayed with the data " + vehicledatapage.controlUnit_Used()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_DataRecordTable();
//			logger.createNode(
//					"Data Record Table is displayed with the data - " + vehicledatapage.controlUnit_DataRecordTable())
//					.pass("Data Record Table is displayed with the data "
//							+ vehicledatapage.controlUnit_DataRecordTable() + ". Test Case Passed");
//			vehicledatapage.controlUnit_VarCodingDomainTable();
//			logger.createNode("Var Coding Domain table is displayed with the data - "
//					+ vehicledatapage.controlUnit_VarCodingDomainTable())
//					.pass("Var Coding Domain table is displayed with the data "
//							+ vehicledatapage.controlUnit_VarCodingDomainTable() + ". Test Case Passed");
//			vehicledatapage.controlUnit_ParameterTable();
//			logger.createNode(
//					"Parameter table is displayed with the data - " + vehicledatapage.controlUnit_ParameterTable())
//					.pass("Parameter table is displayed with the data " + vehicledatapage.controlUnit_ParameterTable()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_Close();
//			logger.createNode("Show additional data for MCM is closed")
//					.pass("Show additional data for MCM is closed. Test Case Passed");
//			vehicledatapage.AddSoftwareButton();
//			logger.createNode("Add Software button is clicked")
//					.pass("Add Software button is clicked successfully. Test Case Passed");
//			vehicledatapage.AddSoftware_ObjectNumberMCM();
//			logger.createNode("Object Number field is provided with the input - Small letters ")
//					.pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//			vehicledatapage.ControlUnit_CheckMarkButton();
//			logger.createNode("Checkmark button is clicked")
//					.pass("Checkmark button is clicked successfully. Test Case Passed");
//			vehicledatapage.controlUnit_MCM_TrashButton();
//			logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//			vehicledatapage.ControlUnit_SaveButton();
//			logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("MCM control unit details are not displayed")
//					.fail("MCM control unit details are not displayed");
//		}
//	}
//
//	@Test(priority = 183)
//	public void controlUnits_MCM_ProductionStatus() {
//		try {
//			logger = extent.createTest("U-258: (AU) Show control unit production status");
//				vehicledatapage.controlUnitTable_ProductionStatus();
//			logger.createNode("Display production status for MCM is clicked")
//					.pass("Display production status for MCM is clicked. Test Case Passed");
//			vehicledatapage.controlUnitTable_MajorAssemblyNumber();
//			logger.createNode("Major assembly number field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_MajorAssemblyNumber())
//					.pass("Major assembly number field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_MajorAssemblyNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_EcuName();
//			logger.createNode(
//					"ECU name field is displayed with the data - " + vehicledatapage.controlUnitTable_EcuName())
//					.pass("ECU name field is displayed with the data " + vehicledatapage.controlUnitTable_EcuName()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_IdCode();
//			logger.createNode("ID code field is displayed with the data - " + vehicledatapage.controlUnitTable_IdCode())
//					.pass("ID code field is displayed with the data " + vehicledatapage.controlUnitTable_IdCode()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_HardwareObjectNumber();
//			logger.createNode("Hardware object number field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_HardwareObjectNumber())
//					.pass("Hardware object number field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_HardwareObjectNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_CalibrationId();
//			logger.createNode("Calibration ID	 field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_CalibrationId())
//					.pass("Calibration ID field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CalibrationId() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_PerformanceMapProtection();
//			logger.createNode("Performance map protection field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_PerformanceMapProtection())
//					.pass("Performance map protection field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_PerformanceMapProtection() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Version();
//			logger.createNode(
//					"Version field is displayed with the data - " + vehicledatapage.controlUnitTable_Version())
//					.pass("Version field is displayed with the data " + vehicledatapage.controlUnitTable_Version()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_ServiceStatusSince();
//			logger.createNode("Service status since field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_ServiceStatusSince())
//					.pass("Service status since field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_ServiceStatusSince()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_CbfRevision();
//			logger.createNode(
//					"CBF revision field is displayed with the data - " + vehicledatapage.controlUnitTable_CbfRevision())
//					.pass("CBF revision field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CbfRevision()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_ImmobilizerStatus();
//			logger.createNode("Immobilizer status field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_ImmobilizerStatus())
//					.pass("Immobilizer status field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_ImmobilizerStatus() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Cvn();
//			logger.createNode("CVN field is displayed with the data - " + vehicledatapage.controlUnitTable_Cvn())
//					.pass("CVN field is displayed with the data " + vehicledatapage.controlUnitTable_Cvn()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_CerficateDesignation();
//			logger.createNode("Certification designation field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_CerficateDesignation())
//					.pass("Certification designation field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CerficateDesignation() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Plant();
//			logger.createNode("Plant field is displayed with the data - " + vehicledatapage.controlUnitTable_Plant())
//					.pass("Plant field is displayed with the data " + vehicledatapage.controlUnitTable_Plant()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_LastModification();
//			logger.createNode("Last modification field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_LastModification())
//					.pass("Last modification field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_LastModification() + ". Test Case Passed");
//			vehicledatapage.controlUnit_PerformanceChange();
//			logger.createNode("Performance change field is displayed with the data - "
//					+ vehicledatapage.controlUnit_PerformanceChange())
//					.pass("Performance change field is displayed with the data "
//							+ vehicledatapage.controlUnit_PerformanceChange() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_SpecialProperties();
//			logger.createNode("Special properties field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_SpecialProperties())
//					.pass("Special properties field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_SpecialProperties() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_DiagVersion();
//			logger.createNode(
//					"Diag version field is displayed with the data - " + vehicledatapage.controlUnitTable_DiagVersion())
//					.pass("Diag version field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_DiagVersion()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnit_Used();
//			logger.createNode("Used field is displayed with the data - " + vehicledatapage.controlUnit_Used())
//					.pass("Used field is displayed with the data " + vehicledatapage.controlUnit_Used()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_DataRecordTable();
//			logger.createNode(
//					"Data Record Table is displayed with the data - " + vehicledatapage.controlUnit_DataRecordTable())
//					.pass("Data Record Table is displayed with the data "
//							+ vehicledatapage.controlUnit_DataRecordTable() + ". Test Case Passed");
//			vehicledatapage.controlUnit_VarCodingDomainTable();
//			logger.createNode("Var Coding Domain table is displayed with the data - "
//					+ vehicledatapage.controlUnit_VarCodingDomainTable())
//					.pass("Var Coding Domain table is displayed with the data "
//							+ vehicledatapage.controlUnit_VarCodingDomainTable() + ". Test Case Passed");
//			vehicledatapage.controlUnit_ParameterTable();
//			logger.createNode(
//					"Parameter table is displayed with the data - " + vehicledatapage.controlUnit_ParameterTable())
//					.pass("Parameter table is displayed with the data " + vehicledatapage.controlUnit_ParameterTable()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_Close();
//			logger.createNode("Display production status for MCM is closed")
//					.pass("Display production status for MCM is closed. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("MCM control unit details are not displayed")
//					.fail("MCM control unit details are not displayed");
//		}
//	}
//
//	@Test(priority = 184)
//	public void controlUnits_ACM_ProductionStatus() {
//		try {
//			logger = extent.createTest("U-258: (AU) Show control unit production status");
//			vehicledatapage.controlUnitTable_ProductionStatus_ACM();
//			logger.createNode("Display production status for ACM is clicked")
//					.pass("Display production status for ACM is clicked. Test Case Passed");
//			vehicledatapage.controlUnitTable_MajorAssemblyNumber();
//			logger.createNode("Major assembly number field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_MajorAssemblyNumber())
//					.pass("Major assembly number field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_MajorAssemblyNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_EcuName();
//			logger.createNode(
//					"ECU name field is displayed with the data - " + vehicledatapage.controlUnitTable_EcuName())
//					.pass("ECU name field is displayed with the data " + vehicledatapage.controlUnitTable_EcuName()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_IdCode();
//			logger.createNode("ID code field is displayed with the data - " + vehicledatapage.controlUnitTable_IdCode())
//					.pass("ID code field is displayed with the data " + vehicledatapage.controlUnitTable_IdCode()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_HardwareObjectNumber();
//			logger.createNode("Hardware object number field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_HardwareObjectNumber())
//					.pass("Hardware object number field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_HardwareObjectNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_CalibrationId();
//			logger.createNode("Calibration ID	 field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_CalibrationId())
//					.pass("Calibration ID field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CalibrationId()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_PerformanceMapProtection();
//			logger.createNode("Performance map protection field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_PerformanceMapProtection())
//					.pass("Performance map protection field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_PerformanceMapProtection() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Version();
//			logger.createNode(
//					"Version field is displayed with the data - " + vehicledatapage.controlUnitTable_Version())
//					.pass("Version field is displayed with the data " + vehicledatapage.controlUnitTable_Version()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_ServiceStatusSince();
//			logger.createNode("Service status since field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_ServiceStatusSince())
//					.pass("Service status since field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_ServiceStatusSince()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_CbfRevision();
//			logger.createNode(
//					"CBF revision field is displayed with the data - " + vehicledatapage.controlUnitTable_CbfRevision())
//					.pass("CBF revision field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CbfRevision()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_ImmobilizerStatus();
//			logger.createNode("Immobilizer status field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_ImmobilizerStatus())
//					.pass("Immobilizer status field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_ImmobilizerStatus() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Cvn();
//			logger.createNode("CVN field is displayed with the data - " + vehicledatapage.controlUnitTable_Cvn())
//					.pass("CVN field is displayed with the data " + vehicledatapage.controlUnitTable_Cvn()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnitTable_CerficateDesignation();
//			logger.createNode("Certification designation field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_CerficateDesignation())
//					.pass("Certification designation field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_CerficateDesignation() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_Plant();
//			logger.createNode("Plant field is displayed with the data - " + vehicledatapage.controlUnitTable_Plant())
//					.pass("Plant field is displayed with the data " + vehicledatapage.controlUnitTable_Plant()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnitTable_LastModification();
//			logger.createNode("Last modification field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_LastModification())
//					.pass("Last modification field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_LastModification() + ". Test Case Passed");
//			vehicledatapage.controlUnit_PerformanceChange();
//			logger.createNode("Performance change field is displayed with the data - "
//					+ vehicledatapage.controlUnit_PerformanceChange())
//					.pass("Performance change field is displayed with the data "
//							+ vehicledatapage.controlUnit_PerformanceChange() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_SpecialProperties();
//			logger.createNode("Special properties field is displayed with the data - "
//					+ vehicledatapage.controlUnitTable_SpecialProperties())
//					.pass("Special properties field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_SpecialProperties() + ". Test Case Passed");
//			vehicledatapage.controlUnitTable_DiagVersion();
//			logger.createNode(
//					"Diag version field is displayed with the data - " + vehicledatapage.controlUnitTable_DiagVersion())
//					.pass("Diag version field is displayed with the data "
//							+ vehicledatapage.controlUnitTable_DiagVersion()
//							+ "& its different from additional data. Test Case Passed");
//			vehicledatapage.controlUnit_Used();
//			logger.createNode("Used field is displayed with the data - " + vehicledatapage.controlUnit_Used())
//					.pass("Used field is displayed with the data " + vehicledatapage.controlUnit_Used()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_DataRecordTable();
//			logger.createNode(
//					"Data Record Table is displayed with the data - " + vehicledatapage.controlUnit_DataRecordTable())
//					.pass("Data Record Table is displayed with the data "
//							+ vehicledatapage.controlUnit_DataRecordTable() + ". Test Case Passed");
//			vehicledatapage.controlUnit_VarCodingDomainTable();
//			logger.createNode("Var Coding Domain table is displayed with the data - "
//					+ vehicledatapage.controlUnit_VarCodingDomainTable())
//					.pass("Var Coding Domain table is displayed with the data "
//							+ vehicledatapage.controlUnit_VarCodingDomainTable() + ". Test Case Passed");
//			vehicledatapage.controlUnit_ParameterTable();
//			logger.createNode(
//					"Parameter table is displayed with the data - " + vehicledatapage.controlUnit_ParameterTable())
//					.pass("Parameter table is displayed with the data " + vehicledatapage.controlUnit_ParameterTable()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_Close();
//			logger.createNode("Display production status for ACM is closed")
//					.pass("Display production status for ACM is closed. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("ACM control unit details are not displayed")
//					.fail("ACM control unit details are not displayed");
//		}
//	}
//
//////               @Test(priority = 185)
//////               public void controlUnits_PLD(){
//////             try {
//////                 logger = extent.createTest("U-185: (AU) Update control unit parameter data (PROFI compliant) - PLD");
//////            	 vehicledatapage.validateVehicleDataPage();
//////            	 vehicledatapage.searchfin_PassengerCarWithRightAccessPLD();
//////              	logger.createNode("For PLD : VIN Number WKK62962713115728 is searched").pass("For PLD : VIN Number WKK62962713115728 is searched. Test Case Passed");
//////            	 vehicledatapage.ControlUnitTab_PassengerCar();
//////            	 vehicledatapage.controlUnit_PLD();
//////       			 logger.createNode("A PLD control unit is chosen").pass("A PLD control unit is chosen. Test Case Passed");
//////       		  vehicledatapage.controlUnitTabe_PldSearch();
//////           	  logger.createNode("Show additional data for PLD is clicked").pass("Show additional data for PLD is clicked. Test Case Passed");
//////           	 vehicledatapage.controlUnit_EngineNo();
//////             logger.createNode("Engine no is displayed with the data - " + vehicledatapage.controlUnit_EngineNo()).pass("Engine no is displayed with the data " + vehicledatapage.controlUnit_EngineNo() +". Test Case Passed");
//////       	  vehicledatapage.controlUnitTable_IdCode();
//////          logger.createNode("ID code field is displayed with the data - " + vehicledatapage.controlUnitTable_IdCode()).pass("ID code field is displayed with the data " + vehicledatapage.controlUnitTable_IdCode() +". Test Case Passed");
//////          vehicledatapage.controlUnitTable_ImmobilizerStatus();
//////          logger.createNode("Immobilizer status field is displayed with the data - " + vehicledatapage.controlUnitTable_ImmobilizerStatus()).pass("Immobilizer status field is displayed with the data " + vehicledatapage.controlUnitTable_ImmobilizerStatus() +". Test Case Passed");
//////             vehicledatapage.controlUnitTable_LastModification();
//////             logger.createNode("Last modification field is displayed with the data - " + vehicledatapage.controlUnitTable_LastModification()).pass("Last modification field is displayed with the data " + vehicledatapage.controlUnitTable_LastModification() +". Test Case Passed");
//////             vehicledatapage.controlUnitTable_PerformanceMapProtection();
//////             logger.createNode("Performance map protection field is displayed with the data - " + vehicledatapage.controlUnitTable_PerformanceMapProtection()).pass("Performance map protection field is displayed with the data " + vehicledatapage.controlUnitTable_PerformanceMapProtection() +". Test Case Passed");
//////             vehicledatapage.controlUnit_DataRecordObjectNumber_1();
//////             logger.createNode("Data record object number field is displayed with the data - " + vehicledatapage.controlUnit_DataRecordObjectNumber_1()).pass("Data record object number field is displayed with the data " + vehicledatapage.controlUnit_DataRecordObjectNumber_1() +". Test Case Passed");
//////             vehicledatapage.controlUnit_DataRecordObjectNumber_2();
//////             logger.createNode("Data record object number field is displayed with the data - " + vehicledatapage.controlUnit_DataRecordObjectNumber_2()).pass("Data record object number field is displayed with the data " + vehicledatapage.controlUnit_DataRecordObjectNumber_2() +". Test Case Passed");
//////             vehicledatapage.controlUnit_EolFineCorrectionX();
//////             logger.createNode("EOL fine correction X field is displayed with the data - " + vehicledatapage.controlUnit_EolFineCorrectionX()).pass("EOL fine correction X field is displayed with the data " + vehicledatapage.controlUnit_EolFineCorrectionX() +". Test Case Passed");
//////             vehicledatapage.controlUnit_EolFineCorrectionY();
//////             logger.createNode("EOL fine correction Y field is displayed with the data - " + vehicledatapage.controlUnit_EolFineCorrectionY()).pass("EOL fine correction Y field is displayed with the data " + vehicledatapage.controlUnit_EolFineCorrectionY() +". Test Case Passed");
//////             vehicledatapage.controlUnit_Parameterization1();
//////             logger.createNode("Parameterization 1 field is displayed with the data - " + vehicledatapage.controlUnit_Parameterization1()).pass("Parameterization 1 field is displayed with the data " + vehicledatapage.controlUnit_Parameterization1() +". Test Case Passed");
//////             vehicledatapage.controlUnit_Parameterization2();
//////             logger.createNode("Parameterization 2 field is displayed with the data - " + vehicledatapage.controlUnit_Parameterization2()).pass("Parameterization 2 field is displayed with the data " + vehicledatapage.controlUnit_Parameterization2() +". Test Case Passed");
//////             vehicledatapage.controlUnit_Parameterization3();
//////             logger.createNode("Parameterization 3 field is displayed with the data - " + vehicledatapage.controlUnit_Parameterization3()).pass("Parameterization 3 field is displayed with the data " + vehicledatapage.controlUnit_Parameterization3() +". Test Case Passed");
//////             vehicledatapage.controlUnit_Parameterization4();
//////             logger.createNode("Parameterization 4 field is displayed with the data - " + vehicledatapage.controlUnit_Parameterization4()).pass("Parameterization 4 field is displayed with the data " + vehicledatapage.controlUnit_Parameterization4() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_Parameterization5();
//////	             logger.createNode("Parameterization 5 field is displayed with the data - " + vehicledatapage.controlUnit_Parameterization5()).pass("Parameterization 5 field is displayed with the data " + vehicledatapage.controlUnit_Parameterization5() +". Test Case Passed");
//////	             vehicledatapage.controlUnitTable_Plant();
//////	             logger.createNode("Plant field is displayed with the data - " + vehicledatapage.controlUnitTable_Plant()).pass("Plant field is displayed with the data " + vehicledatapage.controlUnitTable_Plant() +". Test Case Passed");
//////	             vehicledatapage.controlUnitTable_CerficateDesignation();
//////	             logger.createNode("Certification designation field is displayed with the data - " + vehicledatapage.controlUnitTable_CerficateDesignation()).pass("Certification designation field is displayed with the data " + vehicledatapage.controlUnitTable_CerficateDesignation() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_calId();
//////	             logger.createNode("CAL-ID	field is displayed with the data - " + vehicledatapage.controlUnit_calId()).pass("CAL-ID field is displayed with the data " + vehicledatapage.controlUnit_calId() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_PerformanceChange();
//////	             logger.createNode("Performance change field is displayed with the data - " + vehicledatapage.controlUnit_PerformanceChange()).pass("Performance change field is displayed with the data " + vehicledatapage.controlUnit_PerformanceChange() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_UnitPumpDispersion();
//////	             logger.createNode("Unit pump dispersion field is displayed with the data - " + vehicledatapage.controlUnit_UnitPumpDispersion()).pass("Unit pump dispersion field is displayed with the data " + vehicledatapage.controlUnit_UnitPumpDispersion() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_TdcCorrectionAngle();
//////	             logger.createNode("TDC correction angle field is displayed with the data - " + vehicledatapage.controlUnit_TdcCorrectionAngle()).pass("TDC correction angle field is displayed with the data " + vehicledatapage.controlUnit_TdcCorrectionAngle() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_Used();
//////	             logger.createNode("Used field is displayed with the data - " + vehicledatapage.controlUnit_Used()).pass("Used field is displayed with the data " + vehicledatapage.controlUnit_Used() +". Test Case Passed");
//////	             vehicledatapage.controlUnit_Close();
//////             	  logger.createNode("Show additional data for PLD is closed").pass("Show additional data for PLD is closed. Test Case Passed");
//////       			 vehicledatapage.AddSoftwareButton();
//////                logger.createNode("Add Software button is clicked").pass("Add Software button is clicked successfully. Test Case Passed");
//////                vehicledatapage.AddSoftware_ObjectNumberMCM();
//////                logger.createNode("Object Number field is provided with the input - Small letters ").pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//////                vehicledatapage.ControlUnit_CheckMarkButton();
//////                logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
//////                vehicledatapage.controlUnit_PLD_TrashButton();
//////                logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//////                vehicledatapage.ControlUnit_SaveButton();
//////                logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//////       		} catch (Exception e) {
//////       			logger.createNode("PLD Control unit details are not displayed").fail("PLD Control unit details are not displayed");
//////       		}
//////       	}
////
//	@Test(priority = 186)
//	public void controlUnits_Seat() {
//		try {
//			logger = extent.createTest("U-185: (AU) Update control unit parameter data (PROFI compliant) - SEAT");
//			vehicledatapage.validateVehicleDataPage();
//			vehicledatapage.searchfin_PassengerCarWithRightAccess_Seat();
//			logger.createNode("For SEAT : VIN Number WDD2043881G442534 is searched")
//					.pass("For SEAT : VIN Number WDD2043881G442534 is searched. Test Case Passed");
//			vehicledatapage.ControlUnitTab_PassengerCar();
//			vehicledatapage.controlUnit_Seat();
//			logger.createNode("A SEAT control unit is chosen").pass("A SEAT control unit is chosen. Test Case Passed");
//			vehicledatapage.controlUnit_SeatSearch();
//			logger.createNode("Show additional data for SEAT is clicked")
//					.pass("Show additional data for SEAT is clicked. Test Case Passed");
//			vehicledatapage.controlUnit_CuDesignation();
//			logger.createNode(
//					"Cu Designation field is displayed with the data - " + vehicledatapage.controlUnit_CuDesignation())
//					.pass("Cu Designation field is displayed with the data "
//							+ vehicledatapage.controlUnit_CuDesignation() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Designation();
//			logger.createNode(
//					"Designation field is displayed with the data - " + vehicledatapage.controlUnit_Designation())
//					.pass("Cu Designation field is displayed with the data " + vehicledatapage.controlUnit_Designation()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_Back();
//			logger.createNode("Show additional data for SEAT is closed")
//					.pass("Show additional data for SEAT is closed. Test Case Passed");
//			vehicledatapage.AddSoftwareButton();
//			logger.createNode("Add Software button is clicked")
//					.pass("Add Software button is clicked successfully. Test Case Passed");
//			vehicledatapage.AddSoftware_ObjectNumberMCM();
//			logger.createNode("Object Number field is provided with the input - Small letters ")
//					.pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//			vehicledatapage.ControlUnit_CheckMarkButton();
//			logger.createNode("Checkmark button is clicked")
//					.pass("Checkmark button is clicked successfully. Test Case Passed");
//			vehicledatapage.controlUnit_Seat_TrashButton();
//			logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//			vehicledatapage.ControlUnit_SaveButton();
//			logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("SEAT Control unit details are not displayed")
//					.fail("SEAT Control unit details are not displayed");
//		}
//	}
//
//	@Test(priority = 187)
//	public void controlUnits_Obc() {
//		try {
//			logger = extent.createTest(
//					"U-185: (AU) Update control unit parameter data (PROFI compliant) - OBC & U-256: (AU) Show provisioning certificate id");
//			vehicledatapage.validateVehicleDataPage();
//			vehicledatapage.searchfin_PassengerCarWithRightAccess_Obc();
//			logger.createNode("For OBC : VIN Number W1A4533911K441899 is searched")
//					.pass("For OBC : VIN Number W1A4533911K441899 is searched. Test Case Passed");
//			vehicledatapage.ControlUnitTab_PassengerCar();
//			vehicledatapage.controlUnit_Obc();
//			logger.createNode("A OBC control unit is chosen").pass("A OBC control unit is chosen. Test Case Passed");
//			vehicledatapage.controlUnit_ObcSearch();
//			logger.createNode("Show additional data for OBC is clicked")
//					.pass("Show additional data for OBC is clicked. Test Case Passed");
//			vehicledatapage.controlUnit_ProvisioningCertificateIdPaid();
//			logger.createNode("Provisioning Certificate ID - PAID field is displayed with the data - "
//					+ vehicledatapage.controlUnit_ProvisioningCertificateIdPaid())
//					.pass("Provisioning Certificate ID - PAID field is displayed with the data "
//							+ vehicledatapage.controlUnit_ProvisioningCertificateIdPaid() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Close();
//			logger.createNode("Show additional data for OBC is closed")
//					.pass("Show additional data for OBC is closed. Test Case Passed");
//			vehicledatapage.AddSoftwareButton();
//			logger.createNode("Add Software button is clicked")
//					.pass("Add Software button is clicked successfully. Test Case Passed");
//			vehicledatapage.AddSoftware_ObjectNumberMCM();
//			logger.createNode("Object Number field is provided with the input - Small letters ")
//					.pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//			vehicledatapage.ControlUnit_CheckMarkButton();
//			logger.createNode("Checkmark button is clicked")
//					.pass("Checkmark button is clicked successfully. Test Case Passed");
//			vehicledatapage.controlUnit_Obc_TrashButton();
//			logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//			vehicledatapage.ControlUnit_SaveButton();
//			logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("OBC Control unit details are not displayed")
//					.fail("OBC Control unit details are not displayed");
//		}
//	}
//
//	@Test(priority = 188)
//	public void controlUnits_ObcUpdate() {
//
//		logger = extent.createTest("U-257: (AU) Update provisioning certificate id");
//		vehicledatapage.controlUnit_ObcSearch();
//		logger.createNode("Show additional data for OBC is clicked")
//				.pass("Show additional data for OBC is clicked. Test Case Passed");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdPaid();
//		logger.createNode("Provisioning Certificate ID - PAID field is displayed with the data - "
//				+ vehicledatapage.controlUnit_ProvisioningCertificateIdPaid())
//				.pass("Provisioning Certificate ID - PAID field is displayed with the data "
//						+ vehicledatapage.controlUnit_ProvisioningCertificateIdPaid() + ". Test Case Passed");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdEdit();
//		logger.createNode("Edit PCID button is clicked").pass("Edit PCID button is clicked.Test case passed.");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdUpdate();
//		logger.createNode("PCID is updated to-0032336399163809")
//				.pass("PCID is updated to-0032336399163809.Test case passed.");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdApply();
//		logger.createNode("PCID is saved as-0032336399163809")
//				.pass("PCID is saved as-0032336399163809.Test case passed.");
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//		vehicledatapage.controlUnit_ObcSearch();
//		logger.createNode("Show additional data for OBC is clicked")
//				.pass("Show additional data for OBC is clicked. Test Case Passed");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdPaid();
//		logger.createNode("Provisioning Certificate ID - PAID field is displayed with the data - "
//				+ vehicledatapage.controlUnit_ProvisioningCertificateIdPaid())
//				.pass("Provisioning Certificate ID - PAID field is displayed with the data "
//						+ vehicledatapage.controlUnit_ProvisioningCertificateIdPaid() + ". Test Case Passed");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdEdit();
//		logger.createNode("Edit PCID button is clicked").pass("Edit PCID button is clicked.Test case passed.");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdRevert();
//		logger.createNode("PCID is updated back to-0032336399163808")
//				.pass("PCID is updated back to-0032336399163808.Test case passed.");
//		vehicledatapage.controlUnit_ProvisioningCertificateIdApply();
//		logger.createNode("Original PCID is restored to-0032336399163808")
//				.pass("Original PCID is restored to-0032336399163808.Test case passed.");
//		vehicledatapage.ControlUnit_SaveButton();
//		logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//	}
//
//////               @Test(priority = 189)
//////
//////               public void controlUnits_Vpdpar(){
//////             try {
//////                 logger = extent.createTest("U-185: (AU) Update control unit parameter data (PROFI compliant) - VPDPAR");
//////            	 vehicledatapage.validateVehicleDataPage();
//////            	 vehicledatapage.searchfin_PassengerCarWithRightAccess_Vpdpar();
//////                	logger.createNode("For VPDPAR : VIN Number W1V9077331P285142 is searched").pass("For VPDPAR : VIN Number W1V9077331P285142 is searched. Test Case Passed");
//////            	 vehicledatapage.ControlUnitTab_PassengerCar();
//////            	 vehicledatapage.controlUnit_Vpdpar();
//////       			 logger.createNode("A VPDPAR control unit is chosen").pass("A VPDPAR control unit is chosen. Test Case Passed");
//////       			 vehicledatapage.controlUnit_VpdparSearch();
//////             	  logger.createNode("Show additional data for VPDPAR is clicked").pass("Show additional data for VPDPAR is clicked. Test Case Passed");
//////             	vehicledatapage.controlUnit_Vpdpar_Description();
//////               logger.createNode("Description field is displayed with the data - " + vehicledatapage.controlUnit_Vpdpar_Description()).pass("Description field is displayed with the data " + vehicledatapage.controlUnit_Vpdpar_Description() +". Test Case Passed");
//////               vehicledatapage.controlUnit_Vpdpar_ObjectNumber();
//////               logger.createNode("Object number field is displayed with the data - " + vehicledatapage.controlUnit_Vpdpar_ObjectNumber()).pass("Object number field is displayed with the data " + vehicledatapage.controlUnit_Vpdpar_ObjectNumber() +". Test Case Passed");
//////               vehicledatapage.controlUnit_Close();
//////            	  logger.createNode("Show additional data for VPDPAR is closed").pass("Show additional data for VPDPAR is closed. Test Case Passed");
//////               vehicledatapage.AddSoftwareButton();
//////                logger.createNode("Add Software button is clicked").pass("Add Software button is clicked successfully. Test Case Passed");
//////                vehicledatapage.AddSoftware_ObjectNumberMCM();
//////                logger.createNode("Object Number field is provided with the input - Small letters ").pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//////                vehicledatapage.ControlUnit_CheckMarkButton();
//////                logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
//////                vehicledatapage.controlUnit_Vpdpar_TrashButton();
//////                logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//////                vehicledatapage.ControlUnit_SaveButton();
//////                logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//////       		} catch (Exception e) {
//////       			logger.createNode("VPDPAR Control unit details are not displayed").fail("VPDPAR Control unit details are not displayed");
//////       		}
//////       	}
////
//	@Test(priority = 190)
//
//	public void controlUnits_Par() {
//		try {
//			logger = extent.createTest("U-185: (AU) Update control unit parameter data (PROFI compliant) - PAR");
//			vehicledatapage.validateVehicleDataPage();
//			vehicledatapage.searchfin_PassengerCarWithRightAccess_Par();
//			logger.createNode("For PAR : VIN Number WDF3753031B950398 is searched")
//					.pass("For PAR : VIN Number WDF3753031B950398 is searched. Test Case Passed");
//			vehicledatapage.ControlUnitTab_PassengerCar();
//			vehicledatapage.controlUnit_Par();
//			logger.createNode("A PAR control unit is chosen").pass("A PAR control unit is chosen. Test Case Passed");
//			vehicledatapage.controlUnit_ParSearch();
//			logger.createNode("Show additional data for PAR is clicked")
//					.pass("Show additional data for PAR is clicked. Test Case Passed");
//			vehicledatapage.controlUnit_Par_Description();
//			logger.createNode(
//					"Description field is displayed with the data - " + vehicledatapage.controlUnit_Par_Description())
//					.pass("Description field is displayed with the data "
//							+ vehicledatapage.controlUnit_Par_Description() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Par_ObjectNumber();
//			logger.createNode("Object number field is displayed with the data - "
//					+ vehicledatapage.controlUnit_Par_ObjectNumber())
//					.pass("Object number field is displayed with the data "
//							+ vehicledatapage.controlUnit_Par_ObjectNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Close();
//			logger.createNode("Show additional data for VPDPAR is closed")
//					.pass("Show additional data for VPDPAR is closed. Test Case Passed");
//			vehicledatapage.AddSoftwareButton();
//			logger.createNode("Add Software button is clicked")
//					.pass("Add Software button is clicked successfully. Test Case Passed");
//			vehicledatapage.AddSoftware_ObjectNumberMCM();
//			logger.createNode("Object Number field is provided with the input - Small letters ")
//					.pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//			vehicledatapage.ControlUnit_CheckMarkButton();
//			logger.createNode("Checkmark button is clicked")
//					.pass("Checkmark button is clicked successfully. Test Case Passed");
//			vehicledatapage.controlUnit_Par_TrashButton();
//			logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//			vehicledatapage.ControlUnit_SaveButton();
//			logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("PAR Control unit details are not displayed")
//					.fail("PAR Control unit details are not displayed");
//		}
//	}
//
//	@Test(priority = 191)
//	public void controlUnits_Dia() {
//		try {
//			logger = extent.createTest("U-185: (AU) Update control unit parameter data (PROFI compliant) - DIA");
//			vehicledatapage.validateVehicleDataPage();
//			vehicledatapage.searchfin_PassengerCarWithRightAccess_Dia();
//			logger.createNode("For DIA : VIN Number WDB9303191L991052 is searched")
//					.pass("For DIA : VIN Number WDB9303191L991052 is searched. Test Case Passed");
//			vehicledatapage.ControlUnitTab_PassengerCar();
//			vehicledatapage.controlUnit_Dia();
//			logger.createNode("A DIA control unit is chosen").pass("A DIA control unit is chosen. Test Case Passed");
//			vehicledatapage.controlUnit_DiaSearch();
//			logger.createNode("Show additional data for DIA is clicked")
//					.pass("Show additional data for DIA is clicked. Test Case Passed");
//			vehicledatapage.controlUnit_Dia_Description();
//			logger.createNode(
//					"Description field is displayed with the data - " + vehicledatapage.controlUnit_Dia_Description())
//					.pass("Description field is displayed with the data "
//							+ vehicledatapage.controlUnit_Dia_Description() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Dia_HardwareObjectNumber();
//			logger.createNode("Hardware object number field is displayed with the data - "
//					+ vehicledatapage.controlUnit_Dia_HardwareObjectNumber())
//					.pass("Hardware object number field is displayed with the data "
//							+ vehicledatapage.controlUnit_Dia_HardwareObjectNumber() + ". Test Case Passed");
//			vehicledatapage.controlUnit_Dia_Table();
//			logger.createNode("DIA table is displayed with the data - " + vehicledatapage.controlUnit_Dia_Table())
//					.pass("DIA table is displayed with the data " + vehicledatapage.controlUnit_Dia_Table()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_Dia_ModelTable();
//			logger.createNode(
//					"Model table is displayed with the data - " + vehicledatapage.controlUnit_Dia_ModelTable())
//					.pass("Model table is displayed with the data " + vehicledatapage.controlUnit_Dia_ModelTable()
//							+ ". Test Case Passed");
//			vehicledatapage.controlUnit_Close();
//			logger.createNode("Show additional data for VPDPAR is closed")
//					.pass("Show additional data for VPDPAR is closed. Test Case Passed");
//			vehicledatapage.AddSoftwareButton();
//			logger.createNode("Add Software button is clicked")
//					.pass("Add Software button is clicked successfully. Test Case Passed");
//			vehicledatapage.AddSoftware_ObjectNumberMCM();
//			logger.createNode("Object Number field is provided with the input - Small letters ")
//					.pass("Object Number field is provided with the input - Small letters . Test Case Passed");
//			vehicledatapage.ControlUnit_CheckMarkButton();
//			logger.createNode("Checkmark button is clicked")
//					.pass("Checkmark button is clicked successfully. Test Case Passed");
//			vehicledatapage.controlUnit_Dia_TrashButton();
//			logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test Case Passed");
//			vehicledatapage.ControlUnit_SaveButton();
//			logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
//		} catch (Exception e) {
//			logger.createNode("DIA Control unit details are not displayed")
//					.fail("DIA Control unit details are not displayed");
//		}
//	}
//
//	@Test(priority = 192)
//	public void closeTab_AU() {
//		vehicledatapage.logout();
//		logger.createNode("Tab which is logged in using (AU) credentials is logged out")
//				.pass("Tab which is logged in using (AU) credentials is logged out successfully. Test case passed");
//	}
//
//////            @Test(priority=164)
//////            public void TabClosed() throws InterruptedException{
//////
//////                           vehicledatapage.SwitchToOldTab();
//////                           logger.createNode("Browser is closed ").pass("All the Windows are successfully closed");
//////            }

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
