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
import com.vedoc.qa.testcases.VehicleDataPageTest;
import com.vedoc.qa.testdata.json;

public class SpecialTruck_ControlUnit extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledatapage;
	ITestResult result;
	public static String cook4;
	
	public SpecialTruck_ControlUnit() {
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

//	@Test(priority = 2)
//	public void CheckForTheIdentificationTabDetails() throws InterruptedException, IOException {
//		String cook=driver.manage().getCookies().toString();
//        String cook1 = cook.replaceAll(" path=/; domain=vedoc-test1-em1.i.daimler.com,", "");
//        String cook2 = cook1.replaceAll(" path=/; domain=vedoc-test1-em1.i.daimler.com;secure;,", "");
//        String cook3 = cook2.replaceAll("path=/; domain=vedoc-test1-em1.i.daimler.com;secure;]", "");
//        String cooki3=cook3.replaceAll("expires=.+;", "");
//         cook4 = cook3.replaceAll("\\[", "");
////
//
//
//
//        json.json(cook4);
//		vehicledatapage.searchfin();
//        logger = extent.createTest("U-008 : Check for the 'Search' text field functionality");
//        logger.createNode("Fin Number is entered and clicked on the Search button");
//		logger.log(Status.INFO, "TestCaseID : TC-003");
//
//
//
//        logger = extent.createTest("U-002 : Identification Tab of Vehicle Data Module");
//        logger.log(Status.INFO, "TestCaseID : TC-004");
//
//
//        vehicledatapage.fin();
//		logger.createNode("Fin Number displayed on the ThinClient is:  " + vehicledatapage.fin());
//
//		vehicledatapage.OrderNumber();
//		logger.createNode("Order Number displayed on the ThinClient is:  " + vehicledatapage.OrderNumber());
//
//		vehicledatapage.brand();
//		logger.createNode("Brand Name displayed on the ThinClient is:  " + vehicledatapage.brand());
//
//		vehicledatapage.ProductionNumber();
//		logger.createNode("Production Number displayed on the ThinClient is:  " + vehicledatapage.ProductionNumber());
//
//		vehicledatapage.category();
//		logger.createNode("Category displayed on the ThinClient is:  " + vehicledatapage.category());
//
//		vehicledatapage.ProductionPlant();
//		logger.createNode("Production Plant displayed on the ThinClient is:  " + vehicledatapage.ProductionPlant());
//
//		vehicledatapage.VehicleModel();
//		logger.createNode("Vehicle Model displayed on the ThinClient is:  " + vehicledatapage.VehicleModel());
//
//		vehicledatapage.Status();
//		logger.createNode("Status displayed on the ThinClient is:  " + vehicledatapage.Status());
//
//
//	}

	@Test(priority=7)
	public void CheckForTheMajorAssembliesTabFunctionality() throws InterruptedException, IOException{
		logger = extent.createTest("U-234 - Check if the Major Assemblies Tab values are getting displayed");
		logger.log(Status.INFO, "TestCaseID : TC-005");

		vehicledatapage.MajorAssembliesTab();
		
		String EngineNumber=vehicledatapage.EngineNumber();
		
		if(EngineNumber.isEmpty()){
			
			logger.createNode("Engine Number is not displayed in the Thin client for this vehicle ");
		}
		else{
			
			logger.createNode("Engine Number is not displayed in the Thin client for this vehicle " + EngineNumber );	

		}
		
		System.out.println(vehicledatapage.EngineNumber());
		
		String EngineVariantNumber=vehicledatapage.EngineVariantNumber();
		
		if(EngineVariantNumber.isEmpty()){
			
			logger.createNode("Engine Variant Number is not displayed in the Thin client for this vehicle ");
			
		}
		else{
			
			logger.createNode("Engine Variant Number displayed in the Thin client is: " + EngineVariantNumber);

			
		}
				
		System.out.println(vehicledatapage.EngineVariantNumber());
		
		String ObjectNumber=vehicledatapage.ObjectNumber();
		
		if(ObjectNumber.isEmpty()){
			
			logger.createNode("Object Number is not displayed in the Thin client for this vehicle ");
			
		}else{
			
			logger.createNode("Object Number displayed in the Thin client is: " + ObjectNumber);

		}
		
		System.out.println(vehicledatapage.ObjectNumber());
		
		String ExhaustAfterTreatment=vehicledatapage.ExhaustAfterTreatment();
		
		if(ExhaustAfterTreatment.isEmpty()){
			
			logger.createNode("Exhaust After Treatment is not displayed in the Thin client for this vehicle ");

		}else{
			
			logger.createNode("Exhaust After Treatment displayed in the Thin client is: " + ExhaustAfterTreatment);

		}
		
		System.out.println(vehicledatapage.ExhaustAfterTreatment());
		
		String ExhaustAfterTreatment_Variant=vehicledatapage.ExhaustAfterTreatment_Variant();
		
		if(ExhaustAfterTreatment_Variant.isEmpty()){
			
			logger.createNode("Exhaust After Treatment Variant is not displayed in the Thin client for this vehicle ");

		}else{
			
			logger.createNode("Exhaust After Treatment Variant displayed in the Thin client is: " + ExhaustAfterTreatment_Variant);

		}
		
		System.out.println(vehicledatapage.ExhaustAfterTreatment_Variant());
		
		String ExhaustAfterTreatment_ObjectNumber=vehicledatapage.ExhaustAfterTreatment_ObjectNumber();
		if(ExhaustAfterTreatment_ObjectNumber.isEmpty()){
			
			logger.createNode("Exhaust After Treatment object number is not displayed in the Thin client for this vehicle ");

			
		}
		else{
			
			logger.createNode("Exhaust After Treatment Object Number displayed in the Thin client is: " + ExhaustAfterTreatment_ObjectNumber);

			
		}
		
		System.out.println(vehicledatapage.ExhaustAfterTreatment_ObjectNumber());
		
		System.out.println(vehicledatapage.Transmission());
		
		String Transmission=vehicledatapage.Transmission();
		if(Transmission.isEmpty()){
			logger.createNode("Transmission number is not displayed in the Thin client for this vehicle ");
			
		}
		else{
			logger.createNode("Transmission Number displayed in the Thin client is: " + Transmission);

		}
		
		System.out.println(vehicledatapage.TransmissionVariant());
		
		String TransmissionVariant=vehicledatapage.TransmissionVariant();
		
		if(TransmissionVariant.isEmpty() ){
			logger.createNode("Transmission Variant is not displayed in the Thin client for this vehicle ");

			
		}else{
			
			logger.createNode("Transmission Variant displayed in the Thin client is: " + TransmissionVariant);


		}
		
		System.out.println(vehicledatapage.TransmissionObjectNumber());
		
		String TransmissionObjectNumber=vehicledatapage.TransmissionObjectNumber();
		
		if(TransmissionObjectNumber.isEmpty()){
			logger.createNode("Transmission Object Number is not displayed in the Thin client for this vehicle ");

			
		}else{
		logger.createNode("Transmission Object Number displayed in the Thin client: " + TransmissionObjectNumber);
		}
		
		System.out.println(vehicledatapage.FrontAxle1());
		logger.createNode("Front Axle 1 displayed in the Thin client is: " + vehicledatapage.FrontAxle1());
		
		System.out.println(vehicledatapage.FrontAxle1Variant());
		logger.createNode("Front Axle 1 Variant displayed in the Thin client is: " + vehicledatapage.FrontAxle1Variant());
		
		System.out.println(vehicledatapage.FrontAxle1ObjectNumber());
		logger.createNode("Front Axle 1 Object Number displayed in the Thin client is: " + vehicledatapage.FrontAxle1ObjectNumber());
		
		System.out.println(vehicledatapage.FrontAxle2());
		
		String FrontAxle2=vehicledatapage.FrontAxle2();
		
		if(FrontAxle2.isEmpty()){
			
			logger.createNode("Front Axle2 is not displayed in the Thin client for this vehicle ");

			
		}else{
		logger.createNode("Front Axle 2 Number displayed in the Thin client is: " + FrontAxle2);
		}
		
		System.out.println(vehicledatapage.FrontAxle2Variant());
		
		String FrontAxle2Variant=vehicledatapage.FrontAxle2Variant();
		if(FrontAxle2Variant.isEmpty()){
			logger.createNode("Front Axle2 Variant is not displayed in the Thin client for this vehicle ");

			
		}else{
		logger.createNode("Front Axle 2 variant Number displayed in the Thin client is: " + FrontAxle2Variant);
		
		}
		System.out.println(vehicledatapage.FrontAxle2ObjectNumber());
		logger.createNode("Front Axle 2 object Number displayed in the Thin client is: " + vehicledatapage.FrontAxle2ObjectNumber());
		
		System.out.println(vehicledatapage.FrontAxle3());
		logger.createNode("Front Axle 3 Number displayed in the Thin client is: " + vehicledatapage.FrontAxle3());
		
		System.out.println(vehicledatapage.FrontAxle3Variant());
		logger.createNode("Front Axle 3 Varaint Number displayed in the Thin client is: " + vehicledatapage.FrontAxle3Variant());
		
		System.out.println(vehicledatapage.FrontAxle3ObjectNumber());
		logger.createNode("Front Axle 3 Object Number displayed in the Thin client is: " + vehicledatapage.FrontAxle3ObjectNumber());
		
		System.out.println(vehicledatapage.RearAxle1());
		logger.createNode("Rear Axle 1 Number displayed in the Thin client is: " + vehicledatapage.RearAxle1());
		
		System.out.println(vehicledatapage.RearAxle1Variant());
		logger.createNode("Rear Axle 1 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle1Variant());
		
		System.out.println(vehicledatapage.RearAxle1ObjectNumber());
		logger.createNode("Rear Axle 1 Object Number displayed in the Thin client is: " + vehicledatapage.RearAxle1ObjectNumber());
		
		System.out.println(vehicledatapage.RearAxle2());
		logger.createNode("Rear Axle 2 Number displayed in the Thin client is: " + vehicledatapage.RearAxle2());
		
		System.out.println(vehicledatapage.RearAxle2Variant());
		logger.createNode("Rear Axle 2 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle2Variant());
		
		System.out.println(vehicledatapage.RearAxle2ObjectNumber());
		logger.createNode("Rear Axle 2 object Number displayed in the Thin client is: " + vehicledatapage.RearAxle2ObjectNumber());
		
		System.out.println(vehicledatapage.RearAxle3());
		logger.createNode("Rear Axle 3 Number is displayed in the Thin client is: " + vehicledatapage.RearAxle3());
		
		System.out.println(vehicledatapage.RearAxle3Variant());
		logger.createNode("Rear Axle 3 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle3Variant());
		
		System.out.println(vehicledatapage.RearAxle3ObjectNumber());
		logger.createNode("Rear Axle 3 Variant Number displayed in the Thin client is: " + vehicledatapage.RearAxle3ObjectNumber());

		System.out.println(vehicledatapage.Body());
		logger.createNode("Body Number displayed in the Thin client is: " + vehicledatapage.Body());
		
		System.out.println(vehicledatapage.Platform());
		logger.createNode("Platform Number displayed in the Thin client is: " + vehicledatapage.Platform());
		
		System.out.println(vehicledatapage.Retarder());
		logger.createNode("Retarder Number displayed in the Thin client is: " + vehicledatapage.Retarder());
		
		System.out.println(vehicledatapage.Steering());
		logger.createNode("Steering Number displayed in the Thin client is: " + vehicledatapage.Steering());
		
		System.out.println(vehicledatapage.AlternativeDrives());
		logger.createNode("Alternative Drives contents displayed in the Thin client");
		
		System.out.println(vehicledatapage.ThirdParty_MajorAssemblies());
		logger.createNode("Third Party Major Assemblies contents displayed in the Thin client ");
		
	}

	@Test(priority=8)
	public void CheckForTheCodesTabFunctionality() throws InterruptedException, IOException{
		
		logger = extent.createTest("U-002 : Check if the Codes Tab values are getting displayed");
		logger.log(Status.INFO, "TestCaseID : TC-006");

		vehicledatapage.CodesTab();
		
		logger.createNode("Hide Designation button is clicked and only Codes are displayed on the Thin client");
		logger.createNode("Show designation button is clicked, vehicle codes and their description appears on the Thin client");
		logger.createNode("Filter button is clicked and the code is entered to display the relevant vehicle codes");

	}
	
	
	@Test(priority=9)
	
	public void CheckForTheSAANumbersTabFunctionality() throws InterruptedException{
		
		logger = extent.createTest("U-002 : Check if the SAA Numbers Tab values are getting displayed");
		logger.log(Status.INFO, "TestCaseID : TC-007");

		vehicledatapage.SAANumbers_Tab();
		
		logger.createNode("First design label ID (Engine Case) is clicked and relevant SAA Numbers is displayed in SAA Table");
		logger.createNode("All the design label ID is selected and SAA Table displays all the consolidated SAA Numbers");
		logger.createNode("Scrolled successfully to the 150th element in the SAA Numbers table");
		
	}
	

	@Test(priority=10)
	
	public void CheckForTheVPDandSerialnoTabFunctionality() throws InterruptedException, IOException{
		
		logger = extent.createTest("U-002 : Check if the VPD and Serial Number Tab values are getting displayed");
		logger.log(Status.INFO, "TestCaseID : TC-008");

		vehicledatapage.VPDandSerialNumberTab();
		
		logger.createNode("Filter button is clicked and relevant VPD ID is entered to display the relevant VPD ID appears ").pass(" VPD and Serial no. Tab in Vehicle Data module");
		
		
	}
	

	@Test(priority=11)
	
	public void CheckForTheControlUnitTab() throws InterruptedException{
		
		logger = extent.createTest("U-002 : Control Unit Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-015");

		vehicledatapage.ControlUnitTab();
		logger.createNode("Control Unit table is sorted on clicking the Model button").pass(" Control Unit Table is sorted on clicking the Model button in the table");
		logger.createNode("Control Unit table is reset on clicking the Reset button").pass(" Control Unit Table is rearranged on clicking the reset button");
	
		
	}
	
	@Test(priority=12)
	public void ControlUnitTabTest_ClickOnArrowLink(){
		
		vehicledatapage.ControlUnitTab_CheckForArrowLink();
		logger.createNode(" Arrow link in the 'Protected control units for after treatment system' control unit is clicked");
		logger.createNode(" ID Code displayed for the link out variant in the Thinclient is  - 01A2CF1F");
		
		logger.createNode(" First Arrow link in the 'ID code ' Tracable Parts and navigated to the Major Assembly Data");

		logger.createNode("EAT Number displayed in the Thinclient is - 930731 10 335292");
		
	}

	

	@Test(priority=13)
	public void CheckForTheTheftRelevantDataTab(){
		
		vehicledatapage.TheftRelevantDataTab();
		logger = extent.createTest("U-002 : Theft Relevant Data Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-017");
		logger.createNode("Lock Type displayed in the Thin client is: " + vehicledatapage.TheftRelevantTab_LockType());
		logger.createNode("Radio Number displayed in the Thin client is: " + vehicledatapage.TheftRelevantTab_RadioNumber());
		
	}
	

	@Test(priority=14)
	public void HistoryTab(){
		
		vehicledatapage.HistoryTab();
		logger = extent.createTest("U-002 : History Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-019");
		
		logger.createNode("Validate clicking on the Technical entry button");
		logger.createNode("Validate clicking on the History of Dependent Object button");


		
	}
	

	@Test(priority=15)
	public void HistoryTab_CurrentState(){
		
		vehicledatapage.HistoryTab_CurrentState();
		
	}

	
	@Test(priority=16)
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
	
	@Test(priority=17)
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

	
	@Test(priority=18)
	public void Certification_TiresTab(){
		
		vehicledatapage.CertificationTab_TiresTab();
	}
	
    @Test(priority=19)
	public void CheckForModelPlateTab(){
		
		vehicledatapage.ModelPlateTab();
		logger = extent.createTest("U-002 : Model Plate Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-014");
		
//		logger.createNode("Perm Gross Vehicle Weight displayed in the Thin client is: " + vehicledatapage.ModelPlateTab());
		
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
	
    @Test(priority=3)
	public void CheckForTheEquipmentTab(){
		
		vehicledatapage.EquipmentTab_PaintsTable();
		logger = extent.createTest("U-002 : Equipment Tab Test of Vehicle Data module");
		logger.log(Status.INFO, "TestCaseID : TC-013");
		logger.createNode("Paint table is rearranged in descending order");
	
	}
	
	
    @Test(priority=4)
	public void EquipmentTabTiresTable(){
		
		vehicledatapage.EquipmentsTab_TiresTable();
		logger.createNode("Tires table is rearranged in descending order");

		
	}
	
	

	@Test(priority=5)
	public void ElectricalVariantsTab(){
		
		vehicledatapage.ElectricalVariantsTab();
		logger = extent.createTest("U-002 : Electrical Variants Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-009");
		
		logger.createNode("Electrical Variants Designation is displayed from 1-9 on the Thin Client");


	}

	@Test(priority=6)
	public void TechnicalDataTab(){
		
		vehicledatapage.TechnicalDataTab();
		logger = extent.createTest("U-002 : Techical Data Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-010");
		
		vehicledatapage.TechnicalData_Tab_SpeedometerCorrectionValue();
		logger.createNode("Speedometer correction value displayed in Thin client is:  " + vehicledatapage.TechnicalData_Tab_SpeedometerCorrectionValue());
		
		
		vehicledatapage.TechnicalData_Tab_PulseValue();
		logger.createNode("Pulse value displayed in Thin client is:  " + vehicledatapage.TechnicalData_Tab_PulseValue());
		
		
	}
	

	@Test(priority=20)
	
	public void PlantTextTab(){
		
		vehicledatapage.PlantTextTab();
		logger = extent.createTest("U-002 : Plant Text Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-016");
		logger.createNode("Plants Table is rearranged in descending order ");

		
	}

	@Test(priority=21)
	
	public void InternalTextTab(){
		
		vehicledatapage.InternalTextTab();
		logger = extent.createTest("U-166 : Internal Text Tab of Vehicle Data Module");
		logger.createNode("Internal Text Table is rearranged in descending order ");

		
	}

	@Test(priority=22)
	
	public void FactoryAdditionTab(){
		
		vehicledatapage.FactoryAdditionTab_SpecialTruckVehicle();
		logger = extent.createTest("U-002 : Factory Addition tab of Vehicle Data Module");
		logger.createNode("Factory Addition Table is rearranged in descending order ");

		
	}

	@Test(priority=23)
	
	public void LoggingTab(){
		
		vehicledatapage.LoggingTab();
		
		logger = extent.createTest("U-086 : Logging tab of Vehicle Data Module");
		
		logger.createNode("Logging Table is rearranged in descending order ");

		
	}
	
	@Test(priority=24)
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
