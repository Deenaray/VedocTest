// Trucks out of scope

package com.vedoc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage_S;
import com.vedoc.qa.testdata.json;

public class Truck_WriteAccess  extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;
	ITestResult result;
	public static String cook4;
	
	public Truck_WriteAccess() {
		super();
	}
	
	 

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		vehicledatapage = new VehicleDataPage_S();		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		vehicledatapage = homePage.VehicleData1();
		

	}

	@Test(priority = 0)
	public void VehiclePageTest() {

		
		logger = extent.createTest("Check if the vehicle data page is getting loaded");
		logger.log(Status.INFO, "TestCaseID : TC-001");

		try {
			boolean flag = vehicledatapage.validateVehicleDataPage();
			if (flag = true) {
				logger.log(Status.INFO, "Check if vehicle data page is getting loaded");
				logger.log(Status.PASS, "vehicle data page is getting loaded. Testcase Passed");
			} else {
				logger.log(Status.INFO, "Check if vehicle data page is getting loaded");
				logger.log(Status.FAIL, "Vehicle data page Not working. Testcase failed.");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
		

	}
	
	
	@Test(priority = 1)
	public void CheckTheVehicleSearchDropdownFunctionality(){
		
		vehicledatapage.dropdowncheck();
		logger=extent.createTest("U-008 : Dropdown test of Vehicle data module");
		logger.log(Status.INFO, "TestCaseID : TC-002");
		logger.createNode("Dropdown size and text matches with Vedoc documentation");
		
		
	}

	@Test(priority=2)
	public void CookiesDetails() throws InterruptedException, IOException {
//		String cook=driver.manage().getCookies().toString();
//        String cook1 = cook.replaceAll(" path=/; domain=vedoc-test1-em1.i.daimler.com,", "");
//        String cook2 = cook1.replaceAll(" path=/; domain=vedoc-test1-em1.i.daimler.com;secure;,", "");
//        String cook3 = cook2.replaceAll("path=/; domain=vedoc-test1-em1.i.daimler.com;secure;]", "");
//        String cooki3=cook3.replaceAll("expires=.+;", "");
//         cook4 = cook3.replaceAll("\\[", "");
//
//         json.json(cook4);

 		vehicledatapage.searchfin_TruckWithRightAccess();
        logger = extent.createTest("U-008 : Check for the 'Search' text field functionality");
        logger.createNode("Fin Number is entered and clicked on the Search button");
		logger.log(Status.INFO, "TestCaseID : TC-003");
	}


	@Test(priority=3)
    public void CheckForTheIdentificationTabDetails() throws InterruptedException{

		
        logger = extent.createTest("U-005 : Identification Tab of Vehicle Data Module");
        logger.log(Status.INFO, "TestCaseID : TC-065");
        
        vehicledatapage.Edit_Basic_Data();
        
        vehicledatapage.VINNumber_Edit();
        
		logger.createNode("VIN Number entered in the Thin client is - " + RandomVINNumber);

        vehicledatapage.OrderNumber_Edit();
		logger.createNode("Order Number entered in the Thin client is - 1111111120 ");

        
        vehicledatapage.ProductionNumber_Edit();
		logger.createNode("Production Number entered in the Thin client is - 1111121 ");

        
        vehicledatapage.EditCustomizedVehicleType();
		logger.createNode("Customized vehicle type displayed on the Thinclient is is - Truck Created from Postman tool");
		
		vehicledatapage.Edit_ProductionPlant();
		
		logger.createNode("Production plant selected from the dropdown is - 6010 AMG");

        
        vehicledatapage.CancelChanges();
		
		
        vehicledatapage.fin();
		logger.createNode("Fin Number displayed on the ThinClient is:  " + vehicledatapage.fin());
		
		vehicledatapage.vin();
		logger.createNode("Vin Number displayed on the ThinClient after editing is:  " + vehicledatapage.vin());

		
		vehicledatapage.OrderNumber();
		logger.createNode("Order Number displayed on the ThinClient after editing is:  " + vehicledatapage.OrderNumber());

		vehicledatapage.brand();
		logger.createNode("Brand Name displayed on the ThinClient is:  " + vehicledatapage.brand());
		
		vehicledatapage.ProductionNumber();
		logger.createNode("Production Number displayed on the ThinClient after editing is:  " + vehicledatapage.ProductionNumber());

		vehicledatapage.category();
		logger.createNode("Category displayed on the ThinClient is:  " + vehicledatapage.category());
		
		vehicledatapage.ProductionPlant();
		logger.createNode("Production Plant displayed on the ThinClient after editing is:  " + vehicledatapage.ProductionPlant());

		vehicledatapage.VehicleModel();
		logger.createNode("Vehicle Model displayed on the ThinClient is:  " + vehicledatapage.VehicleModel());

		vehicledatapage.Status();
		logger.createNode("Status displayed on the ThinClient is:  " + vehicledatapage.Status());


	}

	@Test(priority=4)
	public void CheckForTheMajorAssembliesTabFunctionality() throws InterruptedException, IOException{
		logger = extent.createTest("U-236 : Major Assemblies Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-066");

		vehicledatapage.MajorAssembliesTab();
		vehicledatapage.RepositionMajorAssembly_button();
		vehicledatapage.EngineID_Edit();
		logger.createNode("Engine ID entered in the Thin client is - " + RandomEngineNumber);
		vehicledatapage.Save_Changes_MajorAssemblies();
		vehicledatapage.RepositionMajorAssembly_button();

		vehicledatapage.Exhaust_Aftertreatment_EditButton();
		logger.createNode("Exhaust_Aftertreatment entered in the Thin client is - " + RandomExhaustAftertreatmentNumber);

		vehicledatapage.Save_Changes_MajorAssemblies();


		vehicledatapage.TransmissionEdit_button();
		logger.createNode("Transmission Number entered in the Thin client is - " + RandomTransmissionNumber);
		logger.createNode("Transmission Variant Number entered in the Thin client is - " + RandomTransmissionVariantNumber_Length);


		vehicledatapage.Save_Changes_MajorAssemblies();

		vehicledatapage.FrontAxle2_Edit();
		logger.createNode("Front Axle2 Number entered in the Thin client is - " + RandomFrontAxle2Number);
		logger.createNode("Front Axle2 Object Number entered in the Thin client is - " + RandomFrontAxle2ObjectNumber);

		vehicledatapage.onlySave();

		vehicledatapage.RearAxle3_Edit();
		logger.createNode("Rear Axle3 Number entered in the Thin client is - " + RandomRearAxle3Number);
		logger.createNode("Rear Axle3 Object Number entered in the Thin client is - " + RandomRearAxle3ObjectNumber);

		vehicledatapage.onlySave();

		vehicledatapage.RearAxle3_Delete();
		logger.createNode("Rear Axle3 Number created in the Thin client is deleted");
		logger.createNode("Rear Axle3 Object Number created in the Thin client is deleted");

		vehicledatapage.onlySave();

		vehicledatapage.RearAxle4_Edit();
		logger.createNode("Rear Axle4 Number entered in the Thin client is - " + RandomRearAxle4Number);
		logger.createNode("Rear Axle4 Object Number entered in the Thin client is - " + RandomRearAxle4ObjectNumber);

		vehicledatapage.onlySave();

		vehicledatapage.RearAxle4_Delete();
		logger.createNode("Rear Axle4 Number created in the Thin client is deleted");
		logger.createNode("Rear Axle4 Object Number created in the Thin client is deleted");

		vehicledatapage.onlySave();

		vehicledatapage.PlantMajorAssemblies_Tab();
		logger.createNode("Content present on PlantMajor assembly are fetched");
//		logger.createNode("Exhaust_Aftertreatment of Plants Major Assemblies entered in the Thin client is - " + RandomExhaustAftertreatmentNumber);
//		logger.createNode("Rear Axle4 Number of Plants Major Assemblies entered in the Thin client is - " + RandomRearAxle4Number);
//		logger.createNode("Rear Axle4 Object Number of Plants Major Assemblies entered in the Thin client is - " + RandomRearAxle4ObjectNumber);
//
//		vehicledatapage.onlySave();
//
//		vehicledatapage.AlternativeDriveTab();
//		logger.createNode("Electric Motor 1 Number entered in the Thin client is - " + RandomElectricMotor1Number);
//		logger.createNode("Electric Motor 2 Number entered in the Thin client is - " + RandomElectricMotor2Number);
//
//		vehicledatapage.Save_Changes_MajorAssemblies();
//
//

	}

	@Test(priority=5)
	public void CheckForTheCodesTabFunctionality() throws InterruptedException, IOException{
		//vehicledatapage.searchCategoryNumber(vehicledatapage.FinTruckwriteAccessInput);
		logger = extent.createTest("U-005 : Codes Tab in Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-069");

		vehicledatapage.CodesTab();

		logger.createNode("Vehicle Code added on the Thin client is - " + RandomAddCodeNumber);
		logger.createNode("Show designation button is clicked, vehicle codes and their description appears on the Thin client");
		logger.createNode("Filter button is clicked and the code is entered to display the relevant vehicle codes");

	}


	@Test(priority=6)

	public void CheckForTheSAANumbersTabFunctionality() throws InterruptedException{

		logger = extent.createTest("U-002 : Check if the SAA Numbers Tab values are getting displayed");
		logger.log(Status.INFO, "TestCaseID : TC-007");

		vehicledatapage.SAANumbers_Tab();

		logger.createNode("First design label ID (Engine Case) is clicked and relevant SAA Numbers is displayed in SAA Table");
		logger.createNode("All the design label ID is selected and SAA Table displays all the consolidated SAA Numbers");
		logger.createNode("Scrolled successfully to the 150th element in the SAA Numbers table");

	}

	@Test(priority=7)

	public void VPDIDs_MasterDataModule(){

		vehicledatapage.MasterDataModule();
		logger = extent.createTest("U-042 : Executing VPD IDs tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID : TC-081");

		logger.createNode("VPD Ident added to the Thinclient is - " + RandomAddVPDCode);
		logger.createNode("VPD Ident content to the Thinclient is - " + RandomAddVPDContent);

	}

	@Test(priority=8)

	public void CheckForTheVPDandSerialnoTabFunctionality() throws InterruptedException, IOException{


		logger = extent.createTest("U-002 : Check if the VPD and Serial Number Tab values are getting displayed");
		logger.log(Status.INFO, "TestCaseID : TC-068");

		vehicledatapage.VPDandSerialNumberTab_WriteAccess();

		logger.createNode("VPD Ident added to the Thinclient is - " + RandomAddVPDCode);
		logger.createNode("VPD Ident content to the Thinclient is - " + RandomAddVPDContent);

		vehicledatapage.onlySave();
	}
//	@Test(priority=9)
//
//	public void CheckForTheControlUnitTab() throws InterruptedException{
//
//		logger = extent.createTest("U-002 : Control Unit Tab Test of Vehicle Data module");
//		logger.log(Status.INFO, "TestCaseID : TC-015");
//
//		vehicledatapage.ControlUnitTab();
//		logger.createNode("Control Unit table is sorted on clicking the Model button").pass(" Control Unit Table is sorted on clicking the Model button in the table");
//		logger.createNode("Control Unit table is reset on clicking the Reset button").pass(" Control Unit Table is rearranged on clicking the reset button");
//
//
//	}

	@Test(priority=10)
	public void ControlUnitTabTest_ClickOnArrowLink(){

		vehicledatapage.ControlUnitTab_CheckForArrowLink();

	}



	@Test(priority=12)
	public void CheckForTheTheftRelevantDataTab(){

		vehicledatapage.TheftRelevantDataTab();
		logger = extent.createTest("U-002 : Theft Relevant Data Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-017");
		logger.createNode("Lock Type displayed in the Thin client is: " + vehicledatapage.TheftRelevantTab_LockType());
		logger.createNode("Radio Number displayed in the Thin client is: " + vehicledatapage.TheftRelevantTab_RadioNumber());

	}


	@Test(priority=13)
	public void HistoryTab(){

		vehicledatapage.HistoryTab();
		logger = extent.createTest("U-002 : History Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-019");

		logger.createNode("Validate clicking on the Technical entry button");
		logger.createNode("Validate clicking on the History of Dependent Object button");



	}


	@Test(priority=14)
	public void HistoryTab_CurrentState(){

		vehicledatapage.HistoryTab_CurrentState();

	}


	@Test(priority=15)
	public void CheckForTheSalesDataTab(){

		vehicledatapage.SalesDataTab_OrderNumber();

		vehicledatapage.SalesDataTab_TechnicalDate();

		vehicledatapage.SalesDataTab_InitialState();

		logger = extent.createTest("U-002 : Sales Data Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-012");

		logger.createNode("Order Number displayed in the Thin client is: " + vehicledatapage.SalesDataTab_OrderNumber());

		logger.createNode("Technical Date displayed in the Thin client is: " + vehicledatapage.SalesDataTab_TechnicalDate());

		logger.createNode("Initial Date displayed in the Thin client is: " + vehicledatapage.SalesDataTab_InitialState());


	}

	@Test(priority=16)
	public void CheckForTheCertificationTab() throws InterruptedException{

		vehicledatapage.CertificationTab_DocumentKey();
		logger = extent.createTest("U-034: Show COC Master Data");
		logger.log(Status.INFO, "TestCaseID : TC-011");
		logger.createNode("Document Key displayed in the Thin client is: " + vehicledatapage.CertificationTab_DocumentKey());


		vehicledatapage.CertificationTab_Brand();
		logger.createNode("Brand Name displayed in the Thin client is: " + vehicledatapage.CertificationTab_Brand());


		vehicledatapage.CertificationTab_Fuel();
		logger.createNode("Fuel Type displayed in the Thin client is: " + vehicledatapage.CertificationTab_Fuel());


		vehicledatapage.CertificationTab_Version();
		logger.createNode("Version Number displayed in the Thin client is: " + vehicledatapage.CertificationTab_Version());

		vehicledatapage.CertificationTab_SalesDesignation();
		logger.createNode("Sales Designation displayed in the Thin client is: " + vehicledatapage.CertificationTab_SalesDesignation());

		vehicledatapage.CertificationTab_Displayment();
		logger.createNode("Certification Displayment displayed in the Thin client is: " + vehicledatapage.CertificationTab_Displayment());


		vehicledatapage.CertificationTab_Version();
		logger.createNode("Certification Version displayed in the Thin client is: " + vehicledatapage.CertificationTab_Version());

		vehicledatapage.CertificationTab_ManufacturerCode();
		logger.createNode("Manufacturer Code displayed in the Thin client is: " + vehicledatapage.CertificationTab_ManufacturerCode());


		vehicledatapage.CertificationTab_OutputKW();
		logger.createNode("Manufacturer Code displayed in the Thin client is: " + vehicledatapage.CertificationTab_OutputKW());

		vehicledatapage.CertificationTab_EUapprovalNumber();
		logger.createNode("EU Approval Number displayed in the Thin client is: " + vehicledatapage.CertificationTab_EUapprovalNumber());


		vehicledatapage.CertificationTab_IndexOfModelCodes();
		logger.createNode("Index Of Model Codes displayed in the Thin client is: " + vehicledatapage.CertificationTab_IndexOfModelCodes());


		vehicledatapage.CertificationTab_EUaprovalDate();
		logger.createNode("EU aproval Date displayed in the Thin client is: " + vehicledatapage.CertificationTab_EUaprovalDate());


		vehicledatapage.CertificationTab_ExhaustGuidelines();
		logger.createNode("Exhaust Guidelines displayed in the Thin client is: " + vehicledatapage.CertificationTab_ExhaustGuidelines());


		vehicledatapage.CertificationTab_EmissionsStandards();
		logger.createNode("Emissions Standards displayed in the Thin client is: " + vehicledatapage.CertificationTab_EmissionsStandards());



	}


	@Test(priority=17)
	public void Certification_TiresTab(){

		vehicledatapage.CertificationTab_TiresTab();
	}

    @Test(priority=18)
	public void CheckForModelPlateTab(){

		vehicledatapage.ModelPlateTab();
		logger = extent.createTest("U-002 : Model Plate Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-014");

//		logger.createNode("Perm Gross Vehicle Weight displayed in the Thin client is: " +vehicledatapage.ModelPlateTab());

		vehicledatapage.ModelPlateTab_PermGrossCombWeight();
		logger.createNode("Perm Gross Comb Weight displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_PermGrossCombWeight());


		vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle1();
		logger.createNode("Permissible axle loadAxle 1 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle1());



		vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle2();
		logger.createNode("Permissible axle loadAxle 2 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle2());



		vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle3();
		logger.createNode("Permissible axle loadAxle 3 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle3());


		vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle4();
		logger.createNode("Permissible axle load Axle4  displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle4());


		vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle5();
		logger.createNode("Permissible axle loadAxle5 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle5());


		vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle6();
		logger.createNode("Permissible axle loadAxle6 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_axle_loadAxle6());


		vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup1();
		logger.createNode("Permissible load of Axlegroup1 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup1());


		vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup2();
		logger.createNode("Permissible load of Axlegroup2 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup2());


		vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup3();
		logger.createNode("Permissible load of Axlegroup3 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup3());


		vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup4();
		logger.createNode("Permissible load of Axlegroup4 displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Permissible_loadof_Axlegroup4());



		vehicledatapage.ModelPlateTab_Object_no_modelplate();
		logger.createNode("Object no modelplate displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_Object_no_modelplate());


		vehicledatapage.ModelPlateTab_EUapprovalnumber();
		logger.createNode("EU  approvalnumber displayed in the Thin client is: " + vehicledatapage.ModelPlateTab_EUapprovalnumber());


	}

    @Test(priority=19)
	public void CheckForTheEquipmentTab(){

		vehicledatapage.EquipmentTab_PaintsTable();
		logger = extent.createTest("U-002 : Equipment Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-013");
		logger.createNode("Paint table is rearranged in descending order");

	}


    @Test(priority=20)
	public void EquipmentTabTiresTable(){

		vehicledatapage.EquipmentsTab_TiresTable();
		logger.createNode("Tires table is rearranged in descending order");


	}



	@Test(priority=21)
	public void ElectricalVariantsTab(){

		vehicledatapage.ElectricalVariantsTab();
		logger = extent.createTest("U-002 : Electrical Variants Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-009");

		logger.createNode("Electrical Variants Designation is displayed from 1-9 on the Thin Client");


	}

	@Test(priority=22)
	public void TechnicalDataTab(){

		vehicledatapage.TechnicalDataTab();
		logger = extent.createTest("U-002 : Techical Data Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-010");

		vehicledatapage.TechnicalData_Tab_SpeedometerCorrectionValue();
		logger.createNode("Speedometer correction value displayed in Thin client is:  " + vehicledatapage.TechnicalData_Tab_SpeedometerCorrectionValue());


		vehicledatapage.TechnicalData_Tab_PulseValue();
		logger.createNode("Pulse value displayed in Thin client is:  " + vehicledatapage.TechnicalData_Tab_PulseValue());


	}


	@Test(priority=23)

	public void PlantTextTab(){

		vehicledatapage.PlantTextTab();
		logger = extent.createTest("U-002 : Plant Text Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-016");
		logger.createNode("Plants Table is rearranged in descending order ");


	}

	@Test(priority=24)

	public void InternalTextTab(){

		vehicledatapage.InternalTextTab();
		logger = extent.createTest("U-166 : Internal Text Tab of Vehicle Data Module");
		logger.createNode("Internal Text Table is rearranged in descending order ");


	}

	@Test(priority=25)

	public void FactoryAdditionTab(){

		vehicledatapage.FactoryAdditionTab_SpecialTruckVehicle();
		logger = extent.createTest("U-002 : Factory Addition tab of Vehicle Data Module");
		logger.createNode("Factory Addition Table is rearranged in descending order ");


	}

	@Test(priority=26)

	public void LoggingTab(){

		vehicledatapage.LoggingTab();

		logger = extent.createTest("U-086 : Logging tab of Vehicle Data Module");

		logger.createNode("Logging Table is rearranged in descending order ");


	}

	@Test(priority=27)
	public void CheckForPDFOfVehicleDataModule() throws InterruptedException{

		ClickingOnURLButtons();
		logger = extent.createTest("U-115 : PDF of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-018");


		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog");
	}



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
