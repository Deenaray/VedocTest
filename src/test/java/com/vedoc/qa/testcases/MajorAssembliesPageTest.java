package com.vedoc.qa.testcases;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MajorAssemblyPage;

public class MajorAssembliesPageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MajorAssemblyPage majorassemblypage;
	
	
	public MajorAssembliesPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		majorassemblypage=new MajorAssemblyPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		   SystemMessageCheck();

		majorassemblypage=homePage.MajorAssembly();
	}
	
	@Test(priority = 1)
	public void MajorAssemblyTest() {
		logger = extent.createTest("U-113: Check if the Major Assembly page is getting loaded");
		try {
			boolean flag = majorassemblypage.validateMajorAssemblyPage();
			if (flag = true) {
				logger.log(Status.INFO, "TC-005-Check if Major Assembly page is getting loaded");
				logger.log(Status.PASS, "Major Assembly page is getting loaded. Testcase Passed");
			} else {
				logger.log(Status.INFO, "Check if Major Assembly page is getting loaded");
				logger.log(Status.FAIL, "Major Assembly page Not working. Testcase failed.");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}

	@Test(priority = 2)
	public void MAIdentification() throws InterruptedException {
		logger = extent.createTest("U-113: Major Assembly Page Identification Tab Test");
		logger.log(Status.INFO, "TC-021");
		try {

			majorassemblypage.SearchEngineNum();

			//Test Engine Number
			if(majorassemblypage.EngineNumber().length()>0) {
				logger.createNode("Engine Number").pass(majorassemblypage.EngineNumber()+" is the displayed Engine number");
			}else {
				logger.createNode("Engine Number").warning("Engine number space is blank");
			}

			//Test Variant
			if(majorassemblypage.Variant().length()>0) {
				logger.createNode("Variant").pass(majorassemblypage.Variant()+" is the displayed Variant");
			}else {
				logger.createNode("Variant").warning("Variant space is blank");
			}

			//Test PartNumber
			if(majorassemblypage.PartNumber().length()>0) {
				logger.createNode("PartNumber").pass(majorassemblypage.PartNumber()+" is the displayed PartNumber");
			}else {
				logger.createNode("PartNumber").warning("PartNumber space is blank");
			}

			//Test VIN
			if(majorassemblypage.VIN().length()>0) {
				logger.createNode("VIN").pass(majorassemblypage.VIN()+" is the displayed VIN");
			}else {
				logger.createNode("VIN").warning("VIN space is blank");
			}

			//Test MotorIdBefore
			if(majorassemblypage.MotorIdBefore().length()>0) {
				logger.createNode("MotorIdBefore").pass(majorassemblypage.MotorIdBefore()+" is the displayed MotorIdBefore");
			}else {
				logger.createNode("MotorIdBefore").warning("MotorIdBefore space is blank");
			}

			//Test OrderNumber
			if(majorassemblypage.OrderNumber().length()>0) {
				logger.createNode("OrderNumber").pass(majorassemblypage.OrderNumber()+" is the displayed OrderNumber");
			}else {
				logger.createNode("OrderNumber").warning("OrderNumber space is blank");
			}

			//Test ProductionNumber
			if(majorassemblypage.ProductionNumber().length()>0) {
				logger.createNode("ProductionNumber").pass(majorassemblypage.ProductionNumber()+" is the displayed ProductionNumber");
			}else {
				logger.createNode("ProductionNumber").warning("ProductionNumber space is blank");
			}

			//Test ProductionPlant
			if(majorassemblypage.ProductionPlant().length()>0) {
				logger.createNode("ProductionPlant").pass(majorassemblypage.ProductionPlant()+" is the displayed ProductionPlant");
			}else {
				logger.createNode("ProductionPlant").warning("ProductionPlant space is blank");
			}

			//Test FinalAcceptate
			if(majorassemblypage.FinalAcceptate().length()>0) {
				logger.createNode("FinalAcceptate").pass(majorassemblypage.FinalAcceptate()+" is the displayed FinalAcceptate");
			}else {
				logger.createNode("FinalAcceptate").warning("FinalAcceptate space is blank");
			}

			//Test ShipmentDate
			if(majorassemblypage.ShipmentDate().length()>0) {
				logger.createNode("ShipmentDate").pass(majorassemblypage.ShipmentDate()+" is the displayed ShipmentDate");
			}else {
				logger.createNode("ShipmentDate").warning("ShipmentDate space is blank");
			}

			//Test MotorIdAfter
			if(majorassemblypage.MotorIdAfter().length()>0) {
				logger.createNode("MotorIdAfter").pass(majorassemblypage.MotorIdAfter()+" is the displayed MotorIdAfter");
			}else {
				logger.createNode("MotorIdAfter").pass("MotorIdAfter space is blank");
			}

			//Test Status
			if(majorassemblypage.Status().length()>0) {
				logger.createNode("Status").pass(majorassemblypage.Status()+" is the displayed Status");
			}else {
				logger.createNode("Status").warning("Status space is blank");
			}

			//Test RecondEngine
			if(majorassemblypage.RecondEngine().length()>0) {
				logger.createNode("RecondEngine").pass(majorassemblypage.RecondEngine()+" is the displayed RecondEngine");
			}else {
				logger.createNode("RecondEngine").warning("RecondEngine space is blank");
			}

			//Test LUNumber
			if(majorassemblypage.LUNumber().length()>0) {
				logger.createNode("LUNumber").pass(majorassemblypage.LUNumber()+" is the displayed LUNumber");
			}else {
				logger.createNode("LUNumber").warning("LUNumber space is blank");
			}

			//Test OneEEC
			if(majorassemblypage.OneEEC().length()>0) {
				logger.createNode("OneEEC").pass(majorassemblypage.OneEEC()+" is the displayed OneEEC");
			}else {
				logger.createNode("OneEEC").warning("OneEEC space is blank");
			}

			//Test TwoEEC
			if(majorassemblypage.TwoEEC().length()>0) {
				logger.createNode("TwoEEC").pass(majorassemblypage.TwoEEC()+" is the displayed TwoEEC");
			}else {
				logger.createNode("TwoEEC").warning("TwoEEC space is blank");
			}

			//Test ECE
			if(majorassemblypage.ECE().length()>0) {
				logger.createNode("ECE").pass(majorassemblypage.ECE()+" is the displayed ECE");
			}else {
				logger.createNode("ECE").warning("ECE space is blank");
			}

			//Test BasicSetting
			if(majorassemblypage.BasicSetting().length()>0) {
				logger.createNode("BasicSetting").pass(majorassemblypage.BasicSetting()+" is the displayed BasicSetting");
			}else {
				logger.createNode("BasicSetting").warning("BasicSetting space is blank");
			}

			//Test CertificationDesignation
			if(majorassemblypage.CertificationDesignation().length()>0) {
				logger.createNode("CertificationDesignation").pass(majorassemblypage.CertificationDesignation()+" is the displayed CertificationDesignation");
			}else {
				logger.createNode("CertificationDesignation").pass("CertificationDesignation space is blank");
			}

			//Test DIN
			if(majorassemblypage.DIN().length()>0) {
				logger.createNode("DIN").pass(majorassemblypage.DIN()+" is the displayed DIN");
			}else {
				logger.createNode("DIN").warning("DIN space is blank");
			}

			//Test DINStandardPower
			if(majorassemblypage.DINStandardPower().length()>0) {
				logger.createNode("DINStandardPower").pass(majorassemblypage.DINStandardPower()+" is the displayed DINStandardPower");
			}else {
				logger.createNode("DINStandardPower").warning("DINStandardPower space is blank");
			}

			//Test DINOverloadPower
			if(majorassemblypage.DINOverloadPower().length()>0) {
				logger.createNode("DINOverloadPower").pass(majorassemblypage.DINOverloadPower()+" is the displayed DINOverloadPower");
			}else {
				logger.createNode("DINOverloadPower").warning("DINOverloadPower space is blank");
			}

			//Test DINTwo
			if(majorassemblypage.DINTwo().length()>0) {
				logger.createNode("DINTwo").pass(majorassemblypage.DINTwo()+" is the displayed DINTwo");
			}else {
				logger.createNode("DINTwo").warning("DINTwo space is blank");
			}

			//Test EngineNumberStamping
			if(majorassemblypage.EngineNumberStamping().length()>0) {
				logger.createNode("EngineNumberStamping").pass(majorassemblypage.EngineNumberStamping()+" is the displayed EngineNumberStamping");
			}else {
				logger.createNode("EngineNumberStamping").warning("EngineNumberStamping space is blank");
			}

			//Test LastModification
			if(majorassemblypage.LastModification().length()>0) {
				logger.createNode("LastModification").pass(majorassemblypage.LastModification()+" is the displayed LastModification");
			}else {
				logger.createNode("LastModification").warning("LastModification space is blank");
			}

			//Test InstanceVersion
			if(majorassemblypage.InstanceVersion().length()>0) {
				logger.createNode("InstanceVersion").pass(majorassemblypage.InstanceVersion()+" is the displayed InstanceVersion");
			}else {
				logger.createNode("InstanceVersion").warning("InstanceVersion space is blank");
			}

			//Test LastOutputSupply
			if(majorassemblypage.LastOutputSupply().length()>0) {
				logger.createNode("LastOutputSupply").pass(majorassemblypage.LastOutputSupply()+" is the displayed LastOutputSupply");
			}else {
				logger.createNode("LastOutputSupply").warning("LastOutputSupply space is blank");
			}

			//Test RestrictedSupply
			if(majorassemblypage.RestrictedSupply().length()>0) {
				logger.createNode("RestrictedSupply").pass(majorassemblypage.RestrictedSupply()+" is the displayed RestrictedSupply");
			}else {
				logger.createNode("RestrictedSupply").warning("RestrictedSupply space is blank");
			}


		}catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement."+e);
		}

	}

	@Test(priority = 3)
	public void MAIdentification_ObjectNoEngine() throws InterruptedException {
		logger = extent.createTest("U-245:(AU) Update major assembly object numbers: Engine Number");
		majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_2);
		Thread.sleep(3000);
		majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
	    majorassemblypage.EditVariantEngine();
	    logger.createNode("Variant value is updated to-X123456789").pass("Variant value is updated to-X123456789.Test case passed.");
		Thread.sleep(3000);
	    majorassemblypage.EditPartNumberEngine();
	    logger.createNode("Part number value is updated to-X123456789").pass("Part number value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is saved.").pass("Variant & Part number is saved.Test case passed.");
	    warmup5();
	    majorassemblypage.edit_ObjectNoButton();
		warmup5();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
	    majorassemblypage.EditVariantOriginalEngine();
	    logger.createNode("Variant value is reverted back to-X110389468").pass("Variant value is reverted back to-X110389468.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberOriginalEngine();
	    logger.createNode("Part number value is reverted back to-X069630919").pass("Part number value is reverted back to-X069630919.Test case passed.");
		warmup5();
		Thread.sleep(4000);
	    majorassemblypage.clickOn_save();
		logger.createNode("Variant & Part number is reverted back to original.").pass("Variant & Part number is reverted back to original.Test case passed.");

	}
	@Test(priority = 4)
	public void MAIdentification_ObjectNoAxle() throws InterruptedException {
		logger = extent.createTest("U-245:(AU) Update major assembly object numbers: Axle Number");
		majorassemblypage.searchCategoryNumber_withCategory("Axle number",majorassemblypage.axleNumberInput);
		warmup5();
		majorassemblypage.edit_ObjectNoButton();
		warmup5();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
	    majorassemblypage.EditVariantAxle();
	    logger.createNode("Variant value is updated to-X123456789").pass("Variant value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberEngine();
	    logger.createNode("Part number value is updated to-X123456789").pass("Part number value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is saved.").pass("Variant & Part number is saved.Test case passed.");
	    warmup5();
	    majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
	    majorassemblypage.EditVariantOriginalAxle();
	    logger.createNode("Variant value is reverted back").pass("Variant value is reverted.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberOriginalAxle();
	    logger.createNode("Part number value is reverted back").pass("Part number value is reverted.Test case passed.");
		warmup5();
		Thread.sleep(3000);
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is reverted back to original.").pass("Variant & Part number is reverted back to original.Test case passed.");
		}
	@Test(priority = 5)
	public void MAIdentification_ObjectNoCabNo() throws InterruptedException {
		logger = extent.createTest("U-245:(AU) Update major assembly object numbers: Cab Number");
		majorassemblypage.searchCategoryNumber_withCategory("Cab number",majorassemblypage.CabNumberInput_2);
		warmup5();
		majorassemblypage.edit_ObjectNoButton();
		Thread.sleep(3000);
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
	    majorassemblypage.EditVariantCabNo();
	    logger.createNode("Variant value is updated to-X123456789").pass("Variant value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberEngine();
	    logger.createNode("Part number value is updated to-X123456789").pass("Part number value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is saved.").pass("Variant & Part number is saved.Test case passed.");
	    warmup5();
	    majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
	    majorassemblypage.EditVariantOriginalCabNo();
	    logger.createNode("Variant value is reverted back").pass("Variant value is reverted.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberOriginalAxle();
	    logger.createNode("Part number value is reverted back").pass("Part number value is reverted.Test case passed.");
		warmup5();
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is reverted back to original.").pass("Variant & Part number is reverted back to original.Test case passed.");
		}
	@Test(priority = 6)
	public void MAIdentification_ObjectNoTransmissionNo() throws InterruptedException {
		logger = extent.createTest("U-245:(AU) Update major assembly object numbers: Transmission Number");
		majorassemblypage.searchCategoryNumber_withCategory("Transmission no.",majorassemblypage.TransmissionNumberInput_2);
		Thread.sleep(3000);
		majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
		Thread.sleep(3000);
	    majorassemblypage.EditVariantTransmission();
	    logger.createNode("Variant value is updated to-X123456789").pass("Variant value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberEngine();
	    logger.createNode("Part number value is updated to-X123456789").pass("Part number value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is saved.").pass("Variant & Part number is saved.Test case passed.");
	    warmup5();
	    majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
		Thread.sleep(3000);
	    majorassemblypage.EditVariantOriginalTransmission();
	    logger.createNode("Variant value is reverted back to-X210046688").pass("Variant value is reverted back to-X210198249.Test case passed.");
		warmup5();
		Thread.sleep(3000);
	    majorassemblypage.EditPartNumberOriginalTransmission();
	    logger.createNode("Part number value is reverted back to-X062514865").pass("Part number value is reverted back to-X062545617.Test case passed.");
		warmup5();
		Thread.sleep(3000);
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is reverted back to original.").pass("Variant & Part number is reverted back to original.Test case passed.");
		}
	@Test(priority =7)
	public void MAIdentification_ObjectNoEATNo() throws InterruptedException {
		logger = extent.createTest("U-245:(AU) Update major assembly object numbers: EAT Number");
		majorassemblypage.searchCategoryNumber_withCategory("EAT number",majorassemblypage.AfterTreatmentNumberInput_2);
		Thread.sleep(3000);
		majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
	    majorassemblypage.EditVariantEATNo();
	    logger.createNode("Variant value is updated to-X123456789").pass("Variant value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberEngine();
	    logger.createNode("Part number value is updated to-X123456789").pass("Part number value is updated to-X123456789.Test case passed.");
		warmup5();
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is saved.").pass("Variant & Part number is saved.Test case passed.");
	    warmup5();
	    majorassemblypage.edit_ObjectNoButton();
	    logger.createNode("Edit Object no button is clicked").pass("Edit Object no button is clicked.Test case passed.");
		warmup5();
	    majorassemblypage.EditVariantOriginalEATNO();
	    logger.createNode("Variant value is reverted back").pass("Variant value is reverted back.Test case passed.");
		warmup5();
	    majorassemblypage.EditPartNumberOriginalAxle();
	    logger.createNode("Part number value is reverted back.").pass("Part number value is reverted back.Test case passed.");
		warmup5();
		Thread.sleep(3000);
	    majorassemblypage.clickOn_save();
	    logger.createNode("Variant & Part number is reverted back to original.").pass("Variant & Part number is reverted back to original.Test case passed.");
		}
	@Test(priority = 8)
	public void MACodes() throws InterruptedException {
		logger = extent.createTest("U-113:(AU) Major Assembly Page Codes Tab Test");
		logger.log(Status.INFO, "TC-023");
		warmup5();
		try {
			majorassemblypage.SearchEngineNum2();
			Thread.sleep(5000);
			majorassemblypage.clickMACodesTab();
			if(majorassemblypage.codestablecontent()==true) {
				logger.createNode("Codes table Content").pass("Codes table content is displayed .");
			}else {
				logger.createNode("Codes table Content").fail("Codes table is not displayed");
			}

			if(majorassemblypage.CodesDownloadDocument()==true) {
				logger.createNode("Codes Download Document").pass("Codes Download Document is displayed ");
			}else {
				logger.createNode("Codes Download Document").fail("Codes Download Document is not displayed");
			}

			if(majorassemblypage.CodesFilter()==true) {
				logger.createNode("Codes Filter").pass("Codes Filter is displayed ");
			}else {
				logger.createNode("Codes Filter").fail("Codes Filter is not displayed");
			}

			if(majorassemblypage.CodesHideDesignation()==true) {
				logger.createNode("Codes Hide Designation").pass("CodesHideDesignation is displayed ");
			}else {
				logger.createNode("Codes Hide Designation").fail("CodesHideDesignation is not displayed");
			}
		}catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement."+e);
		}
	}

	@Test(priority = 9)
	public void MASAANum() throws InterruptedException {
		logger = extent.createTest("U-113:(AU) Major Assembly SAA Number Tab Test");
		logger.log(Status.INFO, "TC-024");
		Thread.sleep(4000);
		try {
			majorassemblypage.clickMASAATab();

			if(majorassemblypage.SAATableBodyLeft()==true) {
				logger.createNode("SAA Number LeftTable").pass("SAA Number LeftTable is displayed.");
			}else {
				logger.createNode("SAA Number LeftTable").fail("SAA Number LeftTable is not displayed");
			}

			if(majorassemblypage.SAATableBodyRight()==true ) {
				logger.createNode("SAA Number RightTable").pass("SAATableBodyRightString  is displayed ");

			}else {
				logger.createNode("SAA Number RightTable").fail("SAA Number RightTable is not displayed");
			}

			if(majorassemblypage.SAADownloadDocument()==true) {
				logger.createNode("SAA Download Document").pass("SAADownloadDocument is displayed ");
			}else {
				logger.createNode("SAA Download Document").fail("SAADownloadDocumentis not displayed");
			}

		}catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement."+e);
		}
	}


	//*****************Sales Tab********************************
	//KELKARK for U-139

	@Test(priority = 10)
	public void SalesDataTab_ShowCustomerData_EngineNumber() throws InterruptedException {
		logger = extent.createTest("U-139:(AU) Sales Data Tab: Show customer data Using Engine Number.");

		//majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_2);

		warmup5();
		logger.createNode("Engine Number Input- "+majorassemblypage.engineNumberInput_2
				+ "\t is entered and clicked on the Search button").pass("Engine number input- "+majorassemblypage.engineNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		Thread.sleep(3000);

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales data tab is displayed").pass("Sales data tab is displayed and clicked. Test case passed.");

		String CustomerNo=majorassemblypage.FatchCustomerNumber_SalesTab();
		if(CustomerNo.equals("")) {
			logger.createNode("Customer number is not given").pass("For engine no.- "+majorassemblypage.engineNumberInput_2+" the customer no. field is blank. Test case passed.");
			System.out.println("Customer is not given");
		}else {
			logger.createNode("Customer number is displayed").pass("For engine no.- "+majorassemblypage.engineNumberInput_2+" the customer no. is-"+CustomerNo+". Test case passed.");
			System.out.println("Customer no is-"+CustomerNo);
		}

		String flow=majorassemblypage.FatchFlowOfMaterial_SalesTab();
		if(flow.equals("")) {
			logger.createNode("The flow of material is not given").pass("For engine no.- "+majorassemblypage.engineNumberInput_2+" the flow of material field is blank. Test case passed.");
			System.out.println("The flow of material is not given");
		}else {
			logger.createNode("The flow of material is displayed").pass("For engine no.- "+majorassemblypage.engineNumberInput_2+" The flow of material is-"+flow+". Test case passed.");
			System.out.println("The flow of material is- "+flow);
		}
	}


	@Test(priority = 11)
	public void SalesDataTab_ShowCustomerData_TransmissionNumber() throws InterruptedException {
		logger = extent.createTest("U-139:(AU) Sales Data Tab: Show customer data Using Transmission Number.");

		majorassemblypage.searchCategoryNumber_withCategory("Transmission no.",majorassemblypage.TransmissionNumberInput_3);

		warmup5();
		logger.createNode("Transmission number input- "+majorassemblypage.TransmissionNumberInput_2
				+ "\t is entered and clicked on the Search button").pass("Transmission number input- "+majorassemblypage.TransmissionNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales data tab is displayed").pass("Sales data tab is displayed and clicked. Test case passed.");

		String CustomerNo=majorassemblypage.FatchCustomerNumber_SalesTab();
		if(CustomerNo.equals("")) {
			logger.createNode("Customer number is not given").pass("For transmission number.- "+majorassemblypage.TransmissionNumberInput_2+" the customer no. field is blank. Test case passed.");
			System.out.println("Customer is not given");
		}else {
			logger.createNode("Customer number is displayed").pass("For transmission number.- "+majorassemblypage.TransmissionNumberInput_2+" the customer no. is-"+CustomerNo+". Test case passed.");
			System.out.println("Customer no is-"+CustomerNo);
		}

		String flow=majorassemblypage.FatchFlowOfMaterial_SalesTab();
		if(flow.equals("")) {
			logger.createNode("The flow of material is not given").pass("For transmission number.- "+majorassemblypage.TransmissionNumberInput_2+" the flow of material field is blank. Test case passed.");
			System.out.println("The flow of material is not given");
		}else {
			logger.createNode("The flow of material is displayed").pass("For transmission number.- "+majorassemblypage.TransmissionNumberInput_2+" The flow of material is-"+flow+". Test case passed.");
			System.out.println("The flow of material is- "+flow);
		}
	}


	@Test(priority = 12)
	public void SalesDataTab_ShowCustomerData_CabNumber() throws InterruptedException {
		logger = extent.createTest("U-139:(AU) Sales Data Tab: Show customer data Using Cab Number.");

		majorassemblypage.searchCategoryNumber_withCategory("Cab number",majorassemblypage.CabNumberInput_2);

		warmup5();
		logger.createNode("Cab number input- "+majorassemblypage.CabNumberInput_2
				+ "\t is entered and clicked on the Search button").pass("Cab number input- "+majorassemblypage.CabNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales data tab is displayed").pass("Sales data tab is displayed and clicked. Test case passed.");

		String CustomerNo=majorassemblypage.FatchCustomerNumber_SalesTab();
		if(CustomerNo.equals("")) {
			logger.createNode("Customer number is not given").pass("For cab number.- "+majorassemblypage.CabNumberInput_2+" the customer no. field is blank. Test case passed.");
			System.out.println("Customer is not given");
		}else {
			logger.createNode("Customer number is displayed").pass("For cab number.- "+majorassemblypage.CabNumberInput_2+" the customer no. is-"+CustomerNo+". Test case passed.");
			System.out.println("Customer no is-"+CustomerNo);
		}

		String flow=majorassemblypage.FatchFlowOfMaterial_SalesTab();
		if(flow.equals("")) {
			logger.createNode("The flow of material is not given").pass("For cab number.- "+majorassemblypage.CabNumberInput_2+" the flow of material field is blank. Test case passed.");
			System.out.println("The flow of material is not given");
		}else {
			logger.createNode("The flow of material is displayed").pass("For cab number.- "+majorassemblypage.CabNumberInput_2+" The flow of material is-"+flow+". Test case passed.");
			System.out.println("The flow of material is- "+flow);
		}
	}

	@Test(priority = 13)
	public void SalesDataTab_ShowCustomerData_AfterTreatmentNumber() throws InterruptedException {
		logger = extent.createTest("U-139:(AU) Sales Data Tab: Show customer data Using After_Treatment Number.");

		majorassemblypage.searchCategoryNumber_withCategory("EAT number",majorassemblypage.AfterTreatmentNumberInput_2);

		warmup5();
		logger.createNode("After treatment number input- "+majorassemblypage.AfterTreatmentNumberInput_2
				+ "\t is entered and clicked on the Search button").pass("After treatment number input- "+majorassemblypage.AfterTreatmentNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales data tab is displayed").pass("Sales data tab is displayed and clicked. Test case passed.");

		String CustomerNo=majorassemblypage.FatchCustomerNumber_SalesTab();
		if(CustomerNo.equals("")) {
			logger.createNode("Customer number is not given").pass("For after treatment number.- "+majorassemblypage.AfterTreatmentNumberInput_2+" the customer no. field is blank. Test case passed.");
			System.out.println("Customer is not given");
		}else {
			logger.createNode("Customer number is displayed").pass("For after treatment number.- "+majorassemblypage.AfterTreatmentNumberInput_2+" the customer no. is-"+CustomerNo+". Test case passed.");
			System.out.println("Customer no is-"+CustomerNo);
		}

		String flow=majorassemblypage.FatchFlowOfMaterial_SalesTab();
		if(flow.equals("")) {
			logger.createNode("The flow of material is not given").pass("For after treatment number.- "+majorassemblypage.AfterTreatmentNumberInput_2+" the flow of material field is blank. Test case passed.");
			System.out.println("The flow of material is not given");
		}else {
			logger.createNode("The flow of material is displayed").pass("For after treatment number.- "+majorassemblypage.AfterTreatmentNumberInput_2+" The flow of material is-"+flow+". Test case passed.");
			System.out.println("The flow of material is- "+flow);
		}
	}

	@Test(priority = 14)
	public void SalesDataTab_ShowCustomerData_AxleNumber() throws InterruptedException {
		logger = extent.createTest("U-139:(AU) Sales Data Tab: Show customer data Using Axle Number.");

		majorassemblypage.searchCategoryNumber_withCategory("Axle number",majorassemblypage.axleNumberInput);

		warmup5();
		logger.createNode("Axle number input- "+majorassemblypage.axleNumberInput
				+ "\t is entered and clicked on the Search button").pass("Axle number input- "+majorassemblypage.axleNumberInput
						+ "\t is entered and clicked on the Search button. Test Case Passed");

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales data tab is displayed").pass("Sales data tab is displayed and clicked. Test case passed.");

		String CustomerNo=majorassemblypage.FatchCustomerNumber_SalesTab();
		if(CustomerNo.equals("")) {
			logger.createNode("Customer number is not given").pass("For axle number.- "+majorassemblypage.axleNumberInput+" the customer no. field is blank. Test case passed.");
			System.out.println("Customer is not given");
		}else {
			logger.createNode("Customer number is displayed").pass("For axle number.- "+majorassemblypage.axleNumberInput+" the customer no. is-"+CustomerNo+". Test case passed.");
			System.out.println("Customer no is-"+CustomerNo);
		}

		String flow=majorassemblypage.FatchFlowOfMaterial_SalesTab();
		if(flow.equals("")) {
			logger.createNode("The flow of material is not given").pass("For axle number.- "+majorassemblypage.axleNumberInput+" the flow of material field is blank. Test case passed.");
			System.out.println("The flow of material is not given");
		}else {
			logger.createNode("The flow of material is displayed").pass("For axle number.- "+majorassemblypage.axleNumberInput+" The flow of material is-"+flow+". Test case passed.");
			System.out.println("The flow of material is- "+flow);
		}
	}

	// ********** Sales Data Tab **************
		//KELKARK
		@Test(priority = 15)
		public void SalesDataTab_ModifyCustomerServiceData_AxleNumber() throws InterruptedException {
			logger = extent.createTest("U-083:(AU) Sales Data Tab: Modify Customer Service Data Using Axle Number.");
			majorassemblypage.searchCategoryNumber_withCategory("Axle number",majorassemblypage.axleNumberInput);
			warmup5();
			logger.createNode("Axle number input- "+majorassemblypage.axleNumberInput
					+ "\t is entered and clicked on the Search button").pass(majorassemblypage.axleNumberInput
							+ "\t is entered and clicked on the Search button. Test Case Passed");
			warmup6();

			majorassemblypage.SalesData_Tab();
			logger.createNode("Sales tab is displayed").pass("Sales tab is displayed and clicked. Test case passed.");

			//to check edit access for-AU
			boolean AUflag = majorassemblypage.editSalesDataButton_DesplayedOrNot_sd();
			if (AUflag) {
				logger.createNode("Edit sales data button is displayed for user- AU").pass("Admin user has the access to modify sales data. Test case passed.");
					Thread.sleep(4000);
					majorassemblypage.EditSalseData_Button_sd();
					ExtentTest editSalesData=logger.createNode("Edit Sales data button is clicked & values are updated")
							.pass("Edit Sales data button is clicked & values are updated. Test case passed.");
					warmup1();
					majorassemblypage.Send_CustomerNo("82964969");
					editSalesData.pass("Pass new value for customer number is- 82964969. Test case passed.");
					majorassemblypage.SaveButton_salesTab();
					editSalesData.pass("Save button is clicked & values are saved successfully. Test case passed.");
					warmup6();
					Thread.sleep(5000);
					/*-back to original value-sales data */
					majorassemblypage.EditSalseData_Button_sd();
					ExtentTest editSalesData1=logger.createNode("Edit Sales tab button is clicked & values are reverted back to original")
							.pass("Edit Sales tab button is clicked & values are reverted back to original. Test case passed.");
					majorassemblypage.Send_CustomerNo("");
					editSalesData1.pass("Pass original value for customer number is- . Test case passed.");
					Thread.sleep(4000);
					majorassemblypage.SaveButton_salesTab();
					editSalesData1.pass("Save button is clicked & original values are restored successfully. Test case passed.");
			} else {
				logger.createNode("Edit sales data button is not displayed for user- AU").fail("Admin user do not have access to modify sales data. Test case passed.");
			}
		}

	@Test(priority = 16)
	public void SalesDataTab_ModifyCustomerServiceData_TransmissionNumber() throws InterruptedException {
		logger = extent.createTest("U-083:(AU) Sales Data Tab: Modify Customer Service Data Using Transmission Number.");
		majorassemblypage.searchCategoryNumber_withCategory("Transmission no.",majorassemblypage.TransmissionNumberInput_2);
		warmup5();
		logger.createNode("Transmission number input- "+majorassemblypage.TransmissionNumberInput_2
				+ "\t is entered and clicked on the Search button").pass(majorassemblypage.TransmissionNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		warmup5();

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales tab is displayed").pass("Sales tab is displayed and clicked. Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData=logger.createNode("Edit Sales data button is clicked & values are updated")
				.pass("Edit Sales data button is clicked & values are updated. Test case passed.");
		majorassemblypage.Send_CustomerNo("12345678");
		editSalesData.pass("Pass new value for customer number is- 12345678. Test case passed.");
		majorassemblypage.SaveButton_salesTab();
		editSalesData.pass("Save button is clicked & values are saved successfully. Test case passed.");
		warmup6();

		/*-back to original value-sales data */
		Thread.sleep(4000);
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData1=logger.createNode("Edit Sales tab button is clicked & values are reverted back to original")
				.pass("Edit Sales tab button is clicked & values are reverted back to original. Test case passed.");
		majorassemblypage.Send_CustomerNo("W3930259");
		editSalesData1.pass("Pass original value for customer number is- W3930259. Test case passed.");
		Thread.sleep(4000);

		majorassemblypage.SaveButton_salesTab();
		editSalesData1.pass("Save button is clicked & original values are restored successfully. Test case passed.");
	}

	@Test(priority = 17)
	public void SalesDataTab_ModifyCustomerServiceData_CabNumber() throws InterruptedException {
		logger = extent.createTest("U-083:(AU) Sales Data Tab: Modify Customer Service Data Using Cab Number.");
		majorassemblypage.searchCategoryNumber_withCategory("Cab number",majorassemblypage.CabNumberInput_2);
		warmup5();
		logger.createNode("Cab number input- "+majorassemblypage.CabNumberInput_2
				+ "\t is entered and clicked on the Search button").pass(majorassemblypage.CabNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		warmup6();

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales tab is displayed").pass("Sales tab is displayed and clicked. Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData=logger.createNode("Edit Sales data button is clicked & values are updated")
				.pass("Edit Sales data button is clicked & values are updated. Test case passed.");
		warmup4();
		majorassemblypage.Send_CustomerNo("12345678");
		editSalesData.pass("Pass new value for customer number is- 12345678. Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.SaveButton_salesTab();
		editSalesData.pass("Save button is clicked & values are saved successfully. Test case passed.");
		warmup6();

		/*-back to original value-sales data */
		Thread.sleep(4000);
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData1=logger.createNode("Edit Sales tab button is clicked & values are reverted back to original")
				.pass("Edit Sales tab button is clicked & values are reverted back to original. Test case passed.");
		majorassemblypage.Send_CustomerNo("");
		editSalesData1.pass("Pass original value for customer number is- . Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.SaveButton_salesTab();
		editSalesData1.pass("Save button is clicked & original values are restored successfully. Test case passed.");
	}

	@Test(priority = 18)
	public void SalesDataTab_ModifyCustomerServiceData_AfterTreatmentNumber() throws InterruptedException {
		logger = extent.createTest("U-083:(AU) Sales Data Tab: Modify Customer Service Data Using After Treatment Number.");
		majorassemblypage.searchCategoryNumber_withCategory("EAT number",majorassemblypage.AfterTreatmentNumberInput_2);
		warmup5();
		logger.createNode("After treatment number input- "+majorassemblypage.AfterTreatmentNumberInput_2
				+ "\t is entered and clicked on the Search button").pass(majorassemblypage.AfterTreatmentNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		warmup6();

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales tab is displayed").pass("Sales tab is displayed and clicked. Test case passed.");
		Thread.sleep(3000);
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData=logger.createNode("Edit Sales data button is clicked & values are updated")
				.pass("Edit Sales data button is clicked & values are updated. Test case passed.");
		majorassemblypage.Send_CustomerNo("12345678");
		editSalesData.pass("Pass new value for customer number is- 12345678. Test case passed.");
		majorassemblypage.SaveButton_salesTab();
		editSalesData.pass("Save button is clicked & values are saved successfully. Test case passed.");
		warmup5();

		/*-back to original value-sales data */
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData1=logger.createNode("Edit Sales tab button is clicked & values are reverted back to original")
				.pass("Edit Sales tab button is clicked & values are reverted back to original. Test case passed.");
		majorassemblypage.Send_CustomerNo("");
		editSalesData1.pass("Pass original value for customer number is- . Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.SaveButton_salesTab();
		editSalesData1.pass("Save button is clicked & original values are restored successfully. Test case passed.");
	}
	@Test(priority = 19)
	public void SalesDataTab_ModifyCustomerServiceData_EngineNumber() throws InterruptedException {
		logger = extent.createTest("U-083:(AU) Sales Data Tab: Modify Customer Service Data Using Engine Number.");
		majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_2);
		warmup5();
		logger.createNode("Engine number input- "+majorassemblypage.engineNumberInput_2
				+ "\t is entered and clicked on the Search button").pass(majorassemblypage.engineNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		warmup6();

		majorassemblypage.SalesData_Tab();
		logger.createNode("Sales tab is displayed").pass("Sales tab is displayed and clicked. Test case passed.");

		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData=logger.createNode("Edit Sales data button is clicked & values are updated")
				.pass("Edit Sales data button is clicked & values are updated. Test case passed.");
		majorassemblypage.Send_CustomerNo("12345678");
		editSalesData.pass("Pass new value for customer number is- 12345678. Test case passed.");
		majorassemblypage.SaveButton_salesTab();
		editSalesData.pass("Save button is clicked & values are saved successfully. Test case passed.");
		warmup5();

		/*-back to original value-sales data */
		majorassemblypage.EditSalseData_Button_sd();
		ExtentTest editSalesData1=logger.createNode("Edit sales data button is clicked & values are reverted back to original")
				.pass("Edit sales data button is clicked & values are reverted back to original. Test case passed.");
		majorassemblypage.Send_CustomerNo("49295874");
		editSalesData1.pass("Pass original value for customer number is- 49295874. Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.SaveButton_salesTab();
		editSalesData1.pass("Save button is clicked & original values are restored successfully. Test case passed.");
	}
	//Fo Text Tab
		@Test(priority = 20)
		public void MAFOText() throws InterruptedException {
		logger = extent.createTest("U-113:(AU) Major Assembly FO Text Tab Test");
			majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_6);
			warmup5();
			logger.createNode("Engine number input- "+majorassemblypage.engineNumberInput_6
					+ "\t is entered and clicked on the Search button").pass(majorassemblypage.engineNumberInput_6
					+ "\t is entered and clicked on the Search button. Test Case Passed");
		Thread.sleep(5000);
		try {
			majorassemblypage.clickMAFOTextTab();
			Thread.sleep(5000);
			if(majorassemblypage.FOTableLeft()==true ) {
				logger.createNode("FOTableLeft").pass("FOTableLeftString is displayed ");
			}else {
				logger.createNode("FOTableLeft").fail("FOTableLeft is not displayed");
			}

			if(majorassemblypage.FOTableRight()==true) {
				logger.createNode("FOTableRight").pass("FOTableRightString is displayed ");
			}else {
				logger.createNode("FOTableRight").fail("FOTableRight is not displayed");
			}

			if(majorassemblypage.FODownloadDocument()==true) {
				logger.createNode("FO Download Document").pass("FODownloadDocument is displayed ");
			}else {
				logger.createNode("FO Download Document").fail("FODownloadDocument is not displayed");
			}

		}catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement."+e);
		}
	}

		//KELKARK
		@Test(priority = 21)
		public void FOText_Update_moreThan10DG() throws InterruptedException {
			logger = extent.createTest("U-177:(AU) FO Text Tab: Update FO texts (major assembly)");

			Thread.sleep(4000);
			majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_4);
			warmup5();
			logger.createNode("Engine Number Input- "+majorassemblypage.engineNumberInput_4
					+ "\t is entered and clicked on the Search button").pass("Engine number input- "+majorassemblypage.engineNumberInput_4
							+ "\t is entered and clicked on the Search button. Test Case Passed");
			Thread.sleep(4000);
			majorassemblypage.clickMAFOTextTab();
			logger.createNode("FO text tab is displayed").pass("FO text tab is clicked. Test case passed.");
			Thread.sleep(3000);
			majorassemblypage.AddText_button();
			logger.createNode("Add text button is displayed").pass("Add text tab is clicked. Test case passed.");

			majorassemblypage.PassTextContent("MBRDI-add text");
			logger.createNode("Pass text to text content").pass("Pass text to text content is- MBRDI-add text. Test case passed.");
			Thread.sleep(4000);
			majorassemblypage.selectDGDesignation(1);
			majorassemblypage.selectDGDesignation(2);
			majorassemblypage.selectDGDesignation(3);
			majorassemblypage.selectDGDesignation(4);
			majorassemblypage.selectDGDesignation(5);
			majorassemblypage.selectDGDesignation(6);
			majorassemblypage.selectDGDesignation(7);
			majorassemblypage.selectDGDesignation(8);
			majorassemblypage.selectDGDesignation(9);
			majorassemblypage.selectDGDesignation(10);
			majorassemblypage.selectDGDesignation(11);
			logger.createNode("Select designation from given list")
			.pass("Selected designation are- 00, 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11. Test case passed.");
			Thread.sleep(4000);
			majorassemblypage.ClickOn_Submit();
			logger.createNode("Submit button is clickable").pass("Submit button clicked to save the information. Test case passed.");
			Thread.sleep(4000);
			majorassemblypage.clickOn_save();
			logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");
			Thread.sleep(4000);
			String SMG=majorassemblypage.GetText_AlertBox();
			logger.createNode("Error message is displayed").pass("The error message is- "+SMG+". Test case passed.");
		}

			@Test(priority = 22)
			public void FOText_Update_WithoutDG() throws InterruptedException {
			Thread.sleep(3000);
			majorassemblypage.ErroralertBox_close();
			Thread.sleep(3000);
			majorassemblypage.clickOn_editIcon();
			logger.createNode("Edit button is displayed").pass("Edit button is clicked. Test case passed.");
			warmup6();
			majorassemblypage.PassTextContent("MBRDI-edited text");
			logger.createNode("Edit text in text content").pass("Pass text in text content is- MBRDI-edited text. Test case passed.");
			Thread.sleep(5000);
			majorassemblypage.De_selectDGDesignation();
			logger.createNode("Deselect all designation from given list")
			.pass("Deselect all designation from list. Test case passed.");
			Thread.sleep(5000);
			if(majorassemblypage.CheckSubmit_IsEnableOrNot()==false) {
				logger.createNode("Submit button is not clickable")
				.pass("Submit button is not clickable. Empty designation is not allowed to save the information, at least one designation is need to selected. Test case passed.");
				Thread.sleep(4000);
				majorassemblypage.selectDGDesignation(1);
				logger.createNode("Select designation from given list").pass("Selected designation is- 03. Test case passed.");
			}else {
				logger.createNode("Submit button is clickable")
				.fail("Submit button is clickable. Test case passed.");
			}
			warmup5();
			majorassemblypage.ClickOn_Submit();
			logger.createNode("Submit button is clickable").pass("Submit button clicked to save the information. Test case passed.");
			Thread.sleep(5000);
			majorassemblypage.clickOn_save();
			logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

			String smg=majorassemblypage.GetText_BlueAlertBox();
			logger.createNode("Information alert message is displayed")
			.pass("Information alert message is- "+smg+". Test case passed.")
			.pass("Edited information save successfuly. Test case passed.");

		}

			@Test(priority = 23)
			public void FOText_Update_cancel() throws InterruptedException, AWTException {
				Thread.sleep(3000);
				majorassemblypage.clickOn_editIcon();
				logger.createNode("Edit button is displayed").pass("Edit button is clicked. Test case passed.");
				warmup6();
				majorassemblypage.PassTextContent("DTICI-edited text again");
				logger.createNode("Edit text in text content").pass("Pass text in text content is- MBRDI-edited text again. Test case passed.");

				majorassemblypage.ClickOn_Submit();
				logger.createNode("Submit button is clickable").pass("Submit button clicked to save the information. Test case passed.");

				majorassemblypage.clickOn_cancel();
				logger.createNode("Cancel button is displayed").pass("Cancel button is clicked. Test case passed.");
				warmup6();
				majorassemblypage.clickOn_Enter();

				warmup6();
			majorassemblypage.clickOn_DeleteIcon();
			logger.createNode("Delete icon is displayed").pass("Delete icon is clicked. Test case passed.");

			majorassemblypage.clickOn_save();
			logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

			String smg1=majorassemblypage.GetText_BlueAlertBox();
			logger.createNode("Information alert message is displayed")
			.pass("Information alert message is- "+smg1+". Test case passed.")
			.pass("Data from Fo text table is deleted successfuly. Test case passed.");
		   warmup4();
		}
		//KELKARK end

	@Test(priority = 24)
	public void MAControlUnitTab() throws InterruptedException {
		logger = extent.createTest("U-113: Major Assembly Control Unit Tab Test");
		logger.log(Status.INFO, "TC-025");
		try {
			Thread.sleep(3000);
			majorassemblypage.clickMAControlUnitsTab();

				warmup5();
			if(majorassemblypage.ControlUnitTable()==true) {
				logger.createNode("ControlUnitTable").pass("ControlUnitTable is displayed ");
			}else {
				logger.createNode("ControlUnitTable").fail("ControlUnitTable is not displayed");
			}

			if(majorassemblypage.ControlUnitTableSearch()==true) {
				logger.createNode("Control Unit Table Search").pass("ControlUnitTableSearch is displayed ");
			}else {
				logger.createNode("Control Unit Table Search").fail("ControlUnitTableSearch is not displayed");
			}

			if(majorassemblypage.ControlUnitTableIndustry()==true) {
				logger.createNode("Control Unit Table Industry").pass("ControlUnitTableIndustry is displayed ");
			}else {
				logger.createNode("Control Unit Table Industry").fail("ControlUnitTableIndustry is not displayed");
			}

		}catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement."+e);
		}
	}

	@Test(priority = 25)
	public void MADesignGroupTab() throws InterruptedException {
		logger = extent.createTest("U-113: Major Assembly Design Group Tab Test");
		warmup5();
		try {
			majorassemblypage.clickMADesignGroups();
			warmup5();

			if (majorassemblypage.DesignGroupTableLeft() == true ) {
				logger.createNode("Design Group Table Left").pass("DesignGroupTableLeftString is displayed ");
			} else {
				logger.createNode("Design Group Table Left").fail("DesignGroupTableLeft is not displayed");
			}


			if (majorassemblypage.DesignGroupTableRight() == true) {
				logger.createNode("Design Group Table Right").pass("DesignGroupTableRightString is displayed ");
			} else {
				logger.createNode("Design Group Table Right").fail("DesignGroupTableRight is not displayed");
			}


		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement." + e);
		}
	}

	@Test(priority = 26)
	public void MAHistoryTab() throws InterruptedException {
		logger = extent.createTest("U-113: Major Assembly History Tab Test");
		logger.log(Status.INFO, "TC-019");
		majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_2);

		warmup5();
		logger.createNode("Engine Number Input- "+majorassemblypage.engineNumberInput_2
				+ "\t is entered and clicked on the Search button").pass("Engine number input- "+majorassemblypage.engineNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
		try {
			majorassemblypage.clickMAHistoryTab();

			if(majorassemblypage.HistoryOfDependentObjButton()==true) {
				logger.createNode("History Of Dependent Obj Button").pass("HistoryOfDependentObjButton is displayed ");
			}else {
				logger.createNode("History Of Dependent Obj Button").fail("HistoryOfDependentObjButton is not displayed");
			}

			if(majorassemblypage.HistoricalStateButton()==true) {
				logger.createNode("Historical State Button").pass("HistoricalStateButton is displayed ");
			}else {
				logger.createNode("Historical State Button").fail("HistoricalStateButton is not displayed");
			}


			if(majorassemblypage.InitialStateButton()==true) {
				logger.createNode("Initial State Button").pass("InitialStateButton is displayed ");
			}else {
				logger.createNode("Initial State Button").fail("InitialStateButton is not displayed");
			}


			if(majorassemblypage.CurrentStateButton()==true) {
				logger.createNode("Current State Button").pass("CurrentStateButton is displayed ");
			}else {
				logger.createNode("Current State Button").fail("CurrentStateButton is not displayed");
			}

			if(majorassemblypage.TechnicalEnteriesButton()==true) {
				logger.createNode("Technical Enteries Button").pass("TechnicalEnteriesButton is displayed ");
			}else {
				logger.createNode("Technical Enteries Button").fail("TechnicalEnteriesButton is not displayed");
			}

			if(majorassemblypage.FilterButton()==true) {
				logger.createNode("Filter Button").pass("FilterButton is displayed ");
			}else {
				logger.createNode("Filter Button").fail("FilterButton is not displayed");
			}

			if(majorassemblypage.HistoryTable()==true) {
				logger.createNode("History Table").pass("HistoryTable is displayed ");
			}else {
				logger.createNode("History Table").fail("HistoryTable is not displayed");
			}


		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement." + e);
		}
	}


	//KELKARK
		@Test(priority = 27)
		public void InternalTab_UpdateMajorAssembly_Status() throws InterruptedException {
			logger = extent.createTest("U-244:(AU) Internal tab: Update major assembly status");

			majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_3);
			warmup5();
			logger.createNode("Engine Number Input- "+majorassemblypage.engineNumberInput_3
					+ "\t is entered and clicked on the Search button").pass("Engine number input- "+majorassemblypage.engineNumberInput_3
							+ "\t is entered and clicked on the Search button. Test Case Passed");

			majorassemblypage.InternalTab();
			logger.createNode("Internal tab is displayed").pass("Internal tab is clicked. Test case passed.");
			Thread.sleep(3000);
			majorassemblypage.EditMajorAssemblyStatus_InternalTab();
			logger.createNode("Edit major assembly button is displayed").pass("Edit major assembly button is clicked. Test case passed.");

			majorassemblypage.SelectMajorAssemblyStatus_InternalTab("Has no final acceptance yet");
			logger.createNode("Select status dropdown is displayed").pass("Selected product status from dropdown is- Has no final acceptance yet. Test case passed.");
			Thread.sleep(3000);
			majorassemblypage.SaveButton_internalTab();
			logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

	        String StatusSMG=majorassemblypage.GetText_AlertBox();
	        logger.createNode("Information message is displayed").pass("The Information message is- "+StatusSMG+". Test case passed.");
		}
	        @Test(priority = 28)
			public void InternalTab_UpdateMajorAssembly_StatusRevert() throws InterruptedException {
	        //revert back to original
				warmup5();
			majorassemblypage.EditMajorAssemblyStatus_InternalTab();
			logger.createNode("Edit major assembly button is displayed").pass("Edit major assembly button is clicked. Test case passed.");

			majorassemblypage.SelectMajorAssemblyStatus_InternalTab("Delivered");
			logger.createNode("Select status dropdown is displayed").pass("Product status revert back to- Delivered. Test case passed.");

			majorassemblypage.SaveButton_internalTab();
			logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

	        String Status2SMG=majorassemblypage.GetText_AlertBox();
	        logger.createNode("Information message is displayed").pass("The Information message is- "+Status2SMG+". Test case passed.")
	        .pass("Product status revert back to- Delivered successfully. Test case passed.");
		}
		@Test(priority = 29)
			public void InternalTab_UpdateMajorAssembly_EditIndicator() throws InterruptedException {

	        majorassemblypage.EditProductIndicatorButton_InternalTab();
	        logger.createNode("Edit product indicator button is displayed").pass("Edit product indicator button is clicked. Test case passed.");
	    	Thread.sleep(3000);
	        majorassemblypage.lockIndicator_ckeckBox();
	        logger.createNode("Lock indicator check box is displayed").pass("Lock indicator check box ckecked. Test case passed.");

	        majorassemblypage.SaveButton_internalTab();
	        logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

	        warmup6();
	        String IndicatorSMG=majorassemblypage.GetText_AlertBox();
	        logger.createNode("Information message is displayed").pass("The Information message is- "+IndicatorSMG+". Test case passed.");
	        //continue in-priority 27
	        }
	        @Test(priority = 30)
			public void InternalTab_UpdateMajorAssembly_EditIndicatorRevert() throws InterruptedException {
	        	 //revert back
	        	warmup6();
	            majorassemblypage.EditProductIndicatorButton_InternalTab();
	            logger.createNode("Edit product indicator button is displayed").pass("Edit product indicator button is clicked. Test case passed.");
		    	Thread.sleep(3000);
		        majorassemblypage.lockIndicator_ckeckBox();
		        logger.createNode("Lock indicator check box is displayed").pass("Lock indicator check box unckecked. Test case passed.");

		        majorassemblypage.SaveButton_internalTab();
		        logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

		        warmup6();
		        String Indicator2SMG=majorassemblypage.GetText_AlertBox();
		        logger.createNode("Information message is displayed").pass("The Information message is- "+Indicator2SMG+". Test case passed.");
	        }


	        @Test(priority = 31)
			public void InternalTab_UpdateMajorAssembly_Scrap() throws InterruptedException {

	        warmup6();
	        majorassemblypage.ScrapMajorAssemblyButton_InternalTab();
	        logger.createNode("Scrap major assembly button is displayed").pass("Scrap major assembly button is clicked. Test case passed.");
	        Thread.sleep(3000);
	        majorassemblypage.SelectScrapDate("10/13/2021");
	        logger.createNode("Scrap date bar is editable").pass("Pass new scrap date is- 10/13/2021. Test case passed.");

	        majorassemblypage.SaveButton_internalTab();
	        logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");
	       //continue in-priority 25
	        }
	        @Test(priority = 32)
			public void InternalTab_UpdateMajorAssembly_ScrapRevert() throws InterruptedException, AWTException {
	        	 warmup6();
		 			boolean flag = majorassemblypage.alertBox();
		 			if (flag==true) {
		 				logger.createNode("Check if error message is shown").pass(" Error message seen- "+majorassemblypage.GetText_AlertBox()+". Testcase Passed");
		 				majorassemblypage.moveToAlertBoxCloseAndClick();
		 			} else {
		 				logger.createNode("Error message is not displayed for edit scrap date").fail("Error message should be displayed for edit scrap date. Test case failed.");
		 				}
		 			majorassemblypage.clickOn_cancel();
		 			logger.createNode("Cancel button is displayed").pass("Cancel button is clicked. Test case passed.");
		 			warmup6();
		 			driver.switchTo().alert().accept();
		 			//majorassemblypage.clickOn_Enter();
		 			warmup6();
	        }
	        @Test(priority = 33)
			public void InternalTab_UpdateMajorAssembly_DeleteMA() throws AWTException {
	    	  logger = extent.createTest("U-055 :(AU) Internal tab: Delete Product (Major Assembly)");

	        majorassemblypage.DeleteMajorAssemblyButton_InternalTab();
	        logger.createNode("Delete major assembly button is displayed").pass("Delete major assembly button is clicked. Test case passed.");
	        warmup6();
	        //Thread.sleep(3000);
			majorassemblypage.clickOn_Enter();
			warmup4();
			//Continue priority = 29
	        }
			 @Test(priority = 34)
				public void InternalTab_UpdateMajorAssembly_DeleteMA_Cancel() throws InterruptedException {
					Thread.sleep(3000);
					boolean flag1 = majorassemblypage.alertBox();
					if (flag1) {
						logger.createNode("Check if error message is shown").pass(" Error message seen- "+majorassemblypage.GetText_AlertBox()+"\t Testcase Passed");
						majorassemblypage.moveToAlertBoxCloseAndClick();
					} else {
						logger.createNode("Error message is not displayed for delete major assembly").fail("Error message should be displayed for delete major assembly. Test case failed.");
						}
		      }
			 @Test(priority = 34)
				public void InternalTab_UpdateMajorAssembly_DeleteMA_Cancel_1() throws InterruptedException {


				    majorassemblypage.EditProductIndicatorButton_InternalTab();
			        logger.createNode("Edit product indicator button is displayed").pass("Edit product indicator button is clicked. Test case passed.");
			    	Thread.sleep(3000);
			        majorassemblypage.ProductLiabilityIndicator_ckeckBox();
			        logger.createNode("Product Liability indicator check box is displayed").pass("Product Liability indicator check box ckecked. Test case passed.");

			        majorassemblypage.SaveButton_internalTab();
			        logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

			        warmup6();
			        String IndicatorSMG=majorassemblypage.GetText_AlertBox();
			        logger.createNode("Information message is displayed").pass("The Information message is- "+IndicatorSMG+". Test case passed.");

			        if(majorassemblypage.DeleteMajorAssemblyButton_Disable()==false) {
			        	logger.createNode("Delete major assembly button is disable").pass("Delete major assembly button is disable. Test case passed.");
			        }else {
			        	logger.createNode("Delete major assembly button is enable").fail("Delete major assembly button is enable. Test case passed.");
			        }
		      }
			 @Test(priority = 34)
				public void InternalTab_UpdateMajorAssembly_DeleteMA_Cancel_2() throws InterruptedException {


				    majorassemblypage.EditProductIndicatorButton_InternalTab();
			        logger.createNode("Edit product indicator button is displayed").pass("Edit product indicator button is clicked. Test case passed.");
			    	Thread.sleep(3000);
			        majorassemblypage.ProductLiabilityIndicator_ckeckBox();
			        logger.createNode("Product Liability indicator check box is revert back to original").pass("Product Liability indicator check box is unchecked. Test case passed.");

			        majorassemblypage.SaveButton_internalTab();
			        logger.createNode("Save button is displayed").pass("Save button is clicked. Test case passed.");

			        warmup6();
			        String IndicatorSMG=majorassemblypage.GetText_AlertBox();
			        logger.createNode("Information message is displayed").pass("The Information message is- "+IndicatorSMG+". Test case passed.");

			        if(majorassemblypage.DeleteMajorAssemblyButton_Disable()==false) {
			        	logger.createNode("Delete major assembly button is disable").fail("Delete major assembly button is disable. Test case passed.");
			        }else {
			        	logger.createNode("Delete major assembly button is enable").pass("Delete major assembly button is enable. Test case passed.");
			        }
		      }
	//KELKARK
	@Test(priority = 35)
	public void History_Tab_ShowMajorAssemblySnapshot() throws InterruptedException, AWTException {
		logger = extent.createTest("U-207:(AU) History tab: Show major assembly snapshot");

		majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_5);
		warmup5();
		logger.createNode("Engine Number Input- "+majorassemblypage.engineNumberInput_5
				+ "\t is entered and clicked on the Search button").pass("Engine number input- "+majorassemblypage.engineNumberInput_5
						+ "\t is entered and clicked on the Search button. Test Case Passed");

		majorassemblypage.clickMAHistoryTab();
		warmup5();
		logger.createNode("History tab is displayed").pass("History tab is clicked. Test case passed.");
		warmup5();
		majorassemblypage.TechnicalEntry_Button();
		warmup5();
		majorassemblypage.ClickOnDataCountLink();
		warmup5();
		Thread.sleep(3000);
		majorassemblypage.clickOn_Enter();
		logger.createNode("Technical entry button is displayed").pass("Technical entry button is clicked. Test case passed.")
		.pass("Number of logs displayed is- "+majorassemblypage.Fetch_RoWCount_HistoryTable()+". Test case passed.");
		warmup5();
		majorassemblypage.FilterButton_Historytab();
		warmup5();
		majorassemblypage.Pass_FilterText_HistoryTab("X069628");
		warmup5();
		majorassemblypage.ClickOnDataCountLink();
		warmup5();
		logger.createNode("Filter button is displayed").pass("Filter button is clicked. Test case passed.")
		.pass("Pass filter text- X069628. Test case passed.")
		.pass("For given filter criteria logs matched found is- "+majorassemblypage.Fetch_RoWCount_HistoryTable()+". Test case passed.");
	}
	@Test(priority = 36)
		public void History_Tab_ShowMajorAssemblySnapshot_HistoricalState() throws InterruptedException {
		Thread.sleep(4000);
		int historytableRowCount= majorassemblypage.Fetch_RoWCount_HistoryTable();
		warmup6();
		if(historytableRowCount>=1) {
			//activate historical states button and click
			int RowNohistoricatActivate=majorassemblypage.ClickOnRoW_ToAtivateHistoricalButton(historytableRowCount);
			ExtentTest historicalLogger=logger.createNode("Historical state button is enable for log row no.-"+RowNohistoricatActivate).pass("Historical state tab is clicked. Test case passed.");

				int elementSizeInRow = majorassemblypage.Fetch_ElementCountInRow_historyTabale(RowNohistoricatActivate);
				String ar[]=new String[elementSizeInRow];

				for(int c=1; c<=elementSizeInRow-1; c++) {
					if(c!=4) {
						String value= majorassemblypage.Fetch_DataFromHistoryTable(RowNohistoricatActivate,c);
						ar[c]=value;}
				}
				historicalLogger.pass("Fetch log entries from row no.- "+RowNohistoricatActivate);
				historicalLogger.pass("Modification time is - "+ar[1]+". Test case passed.");
				historicalLogger.pass("User ID is - "+ar[2]+". Test case passed.");
				historicalLogger.pass("Modification source is - "+ar[3]+". Test case passed.");
				//.pass("is-"+ar[4]+". Test case passed.");
				historicalLogger.pass("Tab is - "+ar[5]+". Test case passed.");
				historicalLogger.pass("Attribute name is - "+ar[6]+". Test case passed.");
				historicalLogger.pass("Object is - "+ar[7]+". Test case passed.");
				historicalLogger.pass("Path is - "+ar[8]+". Test case passed.");
				historicalLogger.pass("Old value is - "+ar[9]+". Test case passed.");
				historicalLogger.pass("New value is - "+ar[10]+". Test case passed.");

			warmup5();
			majorassemblypage.Click_HistoricalButton();
			logger.createNode("Historical state button is displayed").pass("Historical state button is clicked. Test case passed.");
			Thread.sleep(3000);
			majorassemblypage.clickIdentificationTab();
			ExtentTest verifyLUnumber=logger.createNode("Go to identification tab to virify historical state value for row no.-"+RowNohistoricatActivate).pass("Identification tab is clicked. Test case passed.");
			warmup5();
			warmup5();
			warmup5();
			String LUNumber= majorassemblypage.fetch_LuNumber();
			Assert.assertEquals(ar[10], LUNumber);
			verifyLUnumber.pass("LU Number- "+LUNumber+" is matched with historical state. Test case passed.");

		}else {
			logger.createNode("No log displayed").fail("The total count of log is- "+historytableRowCount+". Test case passed.");
		}
	}

	@Test(priority = 37)
	public void History_Tab_ShowMajorAssemblySnapshot_InitialState() throws InterruptedException {
		Thread.sleep(4000);
		majorassemblypage.clickMAHistoryTab();
		logger.createNode("Go back to history tab to verify initial state").pass("History tab is clicked. Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.FilterButton_Historytab();
		Thread.sleep(4000);
		majorassemblypage.Pass_FilterText_HistoryTab("X069628");
		Thread.sleep(4000);
		majorassemblypage.ClickOnDataCountLink();
		logger.createNode("Filter button is displayed").pass("Filter button is clicked. Test case passed.")
		.pass("Pass filter text- X069628. Test case passed.")
		.pass("For given filter criteria logs matched found is- "+majorassemblypage.Fetch_RoWCount_HistoryTable()+". Test case passed.");
		Thread.sleep(4000);
		int historytableRowCount= majorassemblypage.Fetch_RoWCount_HistoryTable();
		warmup6();
		if(historytableRowCount>=1) {


		     ExtentTest InitialLogger=logger.createNode("Initial state button is enable for log row no.-1");


				int elementSizeInRow = majorassemblypage.Fetch_ElementCountInRow_historyTabale(1);
				String ar[]=new String[elementSizeInRow];

				for(int c=1; c<=elementSizeInRow-1; c++) {
					if(c!=4) {
						String value= majorassemblypage.Fetch_DataFromHistoryTable(1,c);
						ar[c]=value;}
				}
				InitialLogger.pass("Fetch log entries from row no.- "+1);
				InitialLogger.pass("Modification time is - "+ar[1]+". Test case passed.");
				InitialLogger.pass("User ID is - "+ar[2]+". Test case passed.");
				InitialLogger.pass("Modification source is - "+ar[3]+". Test case passed.");
				//.pass("is-"+ar[4]+". Test case passed.");
				InitialLogger.pass("Tab is - "+ar[5]+". Test case passed.");
				InitialLogger.pass("Attribute name is - "+ar[6]+". Test case passed.");
				InitialLogger.pass("Object is - "+ar[7]+". Test case passed.");
				InitialLogger.pass("Path is - "+ar[8]+". Test case passed.");
				InitialLogger.pass("Old value is - "+ar[9]+". Test case passed.");
				InitialLogger.pass("New value is - "+ar[10]+". Test case passed.");


		    majorassemblypage.InitialState_Button();
		    logger.createNode("Initial state button is displayed").pass("Initial state button is clicked. Test case passed.");
			Thread.sleep(3000);
			warmup5();
			majorassemblypage.clickIdentificationTab();
			ExtentTest verifyLUnumber=logger.createNode("Go to identification tab to virify initial state value for row no.-"+1).pass("Identification tab is clicked. Test case passed.");
			warmup5();
			warmup5();
			warmup5();
			String LUNumber= majorassemblypage.fetch_LuNumber();
			Assert.assertEquals(ar[9], LUNumber);
			verifyLUnumber.pass("LU Number- "+LUNumber+" is matched with initial state. Test case passed.");

		}else {
			logger.createNode("No log displayed").fail("The total count of log is- "+historytableRowCount+". Test case passed.");
		}
	}

	@Test(priority = 38)
	public void History_Tab_ShowMajorAssemblySnapshot_CurrentState() throws InterruptedException {
		Thread.sleep(4000);
		majorassemblypage.clickMAHistoryTab();
		logger.createNode("Go back to history tab to verify Current state").pass("History tab is clicked. Test case passed.");
		Thread.sleep(4000);
		majorassemblypage.FilterButton_Historytab();
		Thread.sleep(4000);
		majorassemblypage.Pass_FilterText_HistoryTab("X069628");
		Thread.sleep(4000);
		majorassemblypage.ClickOnDataCountLink();
		logger.createNode("Filter button is displayed").pass("Filter button is clicked. Test case passed.")
		.pass("Pass filter text- X069628. Test case passed.")
		.pass("For given filter criteria logs matched found is- "+majorassemblypage.Fetch_RoWCount_HistoryTable()+". Test case passed.");

		int historytableRowCount= majorassemblypage.Fetch_RoWCount_HistoryTable();
		warmup6();
		if(historytableRowCount>=1) {


				int elementSizeInRow = majorassemblypage.Fetch_ElementCountInRow_historyTabale(1);
				String ar[]=new String[elementSizeInRow];

				for(int c=1; c<=elementSizeInRow-1; c++) {
					if(c!=4) {
						String value= majorassemblypage.Fetch_DataFromHistoryTable(1,c);
						ar[c]=value;}
				}
				System.out.println("New value is -"+ar[10]);


		    majorassemblypage.CurrentState_button();
		    logger.createNode("Current state button is displayed").pass("Current state button is clicked. Test case passed.");
			Thread.sleep(3000);
			warmup5();
			majorassemblypage.clickIdentificationTab();
			ExtentTest verifyLUnumber=logger.createNode("Go to identification tab to virify current state value for row no.-"+1).pass("Identification tab is clicked. Test case passed.");
			warmup5();
			warmup5();
			warmup5();
			String LUNumber= majorassemblypage.fetch_LuNumber();
			Assert.assertEquals(ar[10], LUNumber);
			verifyLUnumber.pass("LU Number- "+LUNumber+" is matched with Current state. Test case passed.");

		}else {
			logger.createNode("No log displayed").fail("The total count of log is- "+historytableRowCount+". Test case passed.");
		}
	}
    @Test(priority = 39)
	public void MAIdentificationTabEditSave() throws InterruptedException {
		logger = extent.createTest("U-114: Edit Identification Tab data and test the Edit/save functionality");
		try {
			majorassemblypage.SearchEngineNum();
			Thread.sleep(3000);
			majorassemblypage.clickEditEngineData();
			Thread.sleep(3000);
			majorassemblypage.clickEditObjNum();
			Thread.sleep(3000);
			majorassemblypage.clickEditAdditionalData();
			majorassemblypage.clickEditStamping();
		//	majorassemblypage.clickEditCarryOutMod();

			String Variant =RandomString(4);
			String PartNum =RandomString(4);
			String PrductionNum =RandomString(4);
			String OrderNum =RandomString(4);
			String RecondEngine =RandomString(4);
			String LUNum =RandomString(4);
			String EEC1269 =RandomString(4);
			String EEC195 =RandomString(4);
			String ECE24 =RandomString(4);
			String BasicSetting =RandomString(4);
			String din70020 =RandomString(4);
			String StandardPower= RandomString(4);
			String OverloadPower= RandomString(4);
			String din3046 =RandomString(4);
			Thread.sleep(1000);
			majorassemblypage.EnterVariant();
			Thread.sleep(1000);
			majorassemblypage.EnterPartNum();
			Thread.sleep(1000);
			majorassemblypage.EnterOrderNum();
			Thread.sleep(1000);
			majorassemblypage.EnterPartNum();
			Thread.sleep(1000);
			majorassemblypage.EnterPrductionNum();
			Thread.sleep(1000);
			majorassemblypage.EnterRecondEngine();
			Thread.sleep(1000);
			majorassemblypage.EnterLUNum();
			Thread.sleep(1000);
			majorassemblypage.EnterEEC1269();
			Thread.sleep(1000);
			majorassemblypage.EnterEEC195();
			Thread.sleep(1000);
			majorassemblypage.EnterECE24();
			Thread.sleep(1000);
			majorassemblypage.EnterBasicSetting();
			Thread.sleep(1000);
			majorassemblypage.Enterdin70020();
			Thread.sleep(1000);
			majorassemblypage.EnterStandardPower();
			Thread.sleep(1000);
			majorassemblypage.EnterOverloadPower();
			Thread.sleep(1000);
			majorassemblypage.Enterdin3046();
			warmup5();
			//majorassemblypage.EnterSaveButton();
			Thread.sleep(3000);
			majorassemblypage.codesSave();
			String Alert_message=majorassemblypage.alertText();
			logger.createNode("The alert message pop-up. alert is "+Alert_message).pass("Alert handled successfully. Testcase Passed");
			warmup5();
			majorassemblypage.alerttextClick();
			warmup5();
			majorassemblypage.codesCancel();
			majorassemblypage.clickOn_Enter();
			warmup5();

//			String savedVariant=majorassemblypage.Variant();
//			String savedPartNumber=majorassemblypage.PartNumber();
//			String savedVIN=majorassemblypage.VIN();
//			String savedMotorIdBefore=majorassemblypage.MotorIdBefore();
//			String savedOrderNumber=majorassemblypage.OrderNumber().replaceAll("\\s+","");
//			String savedProductionNumber=majorassemblypage.ProductionNumber();
//			String savedProductionPlant=majorassemblypage.ProductionPlant();
//			String savedFinalAcceptate=majorassemblypage.FinalAcceptate();
//			String savedShipmentDate=majorassemblypage.ShipmentDate();
//			String savedMotorIdAfter=majorassemblypage.MotorIdAfter();
//			String savedStatus=majorassemblypage.Status();
//			String savedRecondEngine=majorassemblypage.RecondEngine();
//			String savedLUNumber=majorassemblypage.LUNumber();
//			String savedOneEEC=majorassemblypage.OneEEC();
//			String savedTwoEEC=majorassemblypage.TwoEEC();
//			String savedECE=majorassemblypage.ECE();
//			String savedBasicSetting=majorassemblypage.BasicSetting();
//			String savedCertificationDesignation=majorassemblypage.CertificationDesignation();
//			String savedDIN=majorassemblypage.DIN();
//			String savedDINStandardPower=majorassemblypage.DINStandardPower();
//			String savedDINOverloadPower=majorassemblypage.DINOverloadPower();
//			String savedDINTwo=majorassemblypage.DINTwo();
//
//			if (givenvariant.equalsIgnoreCase(savedVariant)) {
//				logger.createNode("Variant Data Edit/Save functionality")
//						.pass("Variant has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("Variant Data Edit/Save functionality")
//						.fail("Variant has been not been saved. Testcase failed");
//			}
//			if (givenPartNum.equalsIgnoreCase(savedPartNumber)) {
//				logger.createNode("PartNumber Data Edit/Save functionality")
//						.pass("PartNumber has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("PartNumber Data Edit/Save functionality")
//						.fail("PartNumber has been not been saved. Testcase failed");
//			}
//			System.out.println(givenOrderNum+"  and   "+savedOrderNumber);
//			if (givenOrderNum.equalsIgnoreCase(savedOrderNumber)) {
//				logger.createNode("OrderNumber Data Edit/Save functionality")
//						.pass("OrderNumber has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("OrderNumber Data Edit/Save functionality")
//						.fail("OrderNumber has been not been saved. Testcase failed");
//			}
//			if (givenPrductionNum.equalsIgnoreCase(savedProductionNumber)) {
//				logger.createNode("PrductionNumber Data Edit/Save functionality")
//						.pass("PrductionNumber has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("PrductionNumber Data Edit/Save functionality")
//						.fail("PrductionNumber has been not been saved. Testcase failed");
//			}
//			if (givenLUNum.equalsIgnoreCase(savedLUNumber)) {
//				logger.createNode("LUNumber Data Edit/Save functionality")
//						.pass("LUNumber has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("LUNumber Data Edit/Save functionality")
//						.fail("LUNumber has been not been saved. Testcase failed");
//			}
//			if (givenEEC1269.equalsIgnoreCase(savedOneEEC)) {
//				logger.createNode("EEC1269 Data Edit/Save functionality")
//						.pass("EEC1269 has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("EEC1269 Data Edit/Save functionality")
//						.fail("EEC1269 has been not been saved. Testcase failed");
//			}
//			if (givenEEC195.equalsIgnoreCase(savedTwoEEC)) {
//				logger.createNode("EEC195 Data Edit/Save functionality")
//						.pass("EEC195 has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("EEC195 Data Edit/Save functionality")
//						.fail("EEC195 has been not been saved. Testcase failed");
//			}
//			if (givenECE24.equalsIgnoreCase(savedECE)) {
//				logger.createNode("ECE24 Data Edit/Save functionality")
//						.pass("ECE24 has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("ECE24 Data Edit/Save functionality")
//						.fail("ECE24 has been not been saved. Testcase failed");
//			}
//			if (givenRecondEngine.equalsIgnoreCase(savedRecondEngine)) {
//				logger.createNode("RecondEngine Data Edit/Save functionality")
//						.pass("RecondEngine has been saved successfully. Testcase Passed");
//			} else {
//				logger.createNode("RecondEngine Data Edit/Save functionality")
//						.fail("RecondEngine has been not been saved. Testcase failed");
//			}
//			 if(givenBasicSetting.equalsIgnoreCase(savedBasicSetting)) {
//	        	logger.createNode("BasicSetting Data Edit/Save functionality").pass("BasicSetting has been saved successfully. Testcase Passed");
//			}else {
//				logger.createNode("BasicSetting Data Edit/Save functionality").fail("BasicSetting has been not been saved. Testcase failed");
//			}
//		    if(givendin70020.equalsIgnoreCase(savedDIN)) {
//	        	logger.createNode("din70020 Data Edit/Save functionality").pass("din70020 has been saved successfully. Testcase Passed");
//			}else {
//				logger.createNode("din70020 Data Edit/Save functionality").fail("din70020 has been not been saved. Testcase failed");
//			}
//			if(givenStandardPower.equalsIgnoreCase(savedDINStandardPower)) {
//	        	logger.createNode("StandardPower Data Edit/Save functionality").pass("StandardPower has been saved successfully. Testcase Passed");
//			}else {
//				logger.createNode("StandardPower Data Edit/Save functionality").fail("StandardPower has been not been saved. Testcase failed");
//			}
//			if(givenOverloadPower.equalsIgnoreCase(savedDINOverloadPower)) {
//	        	logger.createNode("OverloadPower Data Edit/Save functionality").pass("OverloadPower has been saved successfully. Testcase Passed");
//			}else {
//				logger.createNode("OverloadPower Data Edit/Save functionality").fail("OverloadPower has been not been saved. Testcase failed");
//			}
//			if(givendin3046.equalsIgnoreCase(savedDINTwo)) {
//	        	logger.createNode("din3046 Data Edit/Save functionality").pass("din3046 has been saved successfully. Testcase Passed");
//			}else {
//				logger.createNode("din3046 Data Edit/Save functionality").fail("din3046 has been not been saved. Testcase failed");
//			}

		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement." + e);
		} catch (AWTException e) {
			throw new RuntimeException(e);
		}
	}

	@Test(priority = 40)
	public void MACodesTabEditSave() throws InterruptedException {
		logger = extent.createTest("U-114: Edit Codes Tab data and test the Edit/Add/save/Delete functionality");
		try {
		  warmup5();
	      majorassemblypage.clickMACodesTab();
		  Thread.sleep(3000);
	      majorassemblypage.addcode();
		  Thread.sleep(3000);
	      majorassemblypage.entercode();
	      majorassemblypage.clickcheck();
	      warmup5();
			majorassemblypage.codesSave();
			warmup5();
			String Alert_message=majorassemblypage.alertText();
			logger.createNode("The alert message pop-up. alert is."+Alert_message).pass("Alert closed successfully. Testcase Passed");
			warmup5();
			majorassemblypage.alerttextClick();
//	      majorassemblypage.codesSave();
//	      warmup();
		//  majorassemblypage.clickOn_Enter();
	     // majorassemblypage.CodesSaveAnyHow();
	      warmup5();
//	      String tabletext=majorassemblypage.tabletext();
//	  	if(tabletext.equalsIgnoreCase("GL"+givencode)) {
//        	logger.createNode("Codes can be added and edited. The added code is "+tabletext).pass("code has been saved successfully. Testcase Passed");
//		}else {
//			logger.createNode("Codes cannot be added").fail("code has been not been saved. Testcase failed");
//		}
	    warmup5();
	      majorassemblypage.DeleteCode();
	      warmup();
	      majorassemblypage.codesCancel();
	      warmup5();
		  majorassemblypage.clickOn_Enter();
	     // majorassemblypage.CodesSaveAnyHow();
//	      System.out.println(tabletext+"  and  GL"+givencode);
//	    if(tabletext.equalsIgnoreCase("GL"+givencode)) {
//	        	logger.createNode("Codes is deleted.").pass("code has been deleted successfully. Testcase Passed");
//		}else {
//				logger.createNode("Codes cannot be added").fail("code has been not been deleted. Testcase failed");
//		}
//
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement." + e);
		} catch (AWTException e) {
			throw new RuntimeException(e);
		}
	}

	@Test(priority = 41)
	public void SAAEditSave() throws InterruptedException {
		logger = extent.createTest("U-114: Edit SAA Tab data and test the Edit/Delete functionality");
		try {
		  warmup5();
	      majorassemblypage.clickMASAATab();
		  Thread.sleep(3000);
		  warmup5();
	      majorassemblypage.addsaa();
		  Thread.sleep(3000);
	      majorassemblypage.SAATextField();
	      majorassemblypage.SaveCheckMarkSAA();
	      warmup5();
	      majorassemblypage.SAASaveButton();
	      warmup5();
			String Alert_message=majorassemblypage.alertText();
			logger.createNode("The alert message pop-up. alert is "+Alert_message).pass("Alert closed successfully. Testcase Passed");
			warmup5();
			majorassemblypage.alerttextClick();
			warmup5();
			majorassemblypage.codesCancel();
		  	majorassemblypage.clickOn_Enter();
//	      String SAAtabletext=majorassemblypage.saatabletext();
//	      if(SAAtabletext.equalsIgnoreCase("53700010")) {
//	        	logger.createNode("SAA can be added and edited. The added SAA is "+SAAtabletext).pass("code has been saved successfully. Testcase Passed");
//		  }else {
//				logger.createNode("SAA cannot be added").fail("SAA has been not been saved. Testcase failed");
//		  }
//	      warmup5();
//	      warmup5();
//	      majorassemblypage.saaDel();
//	      warmup();
//	      majorassemblypage.SAASaveButton();
//	      warmup5();
//	      warmup5();
//	      String SAAtabletext1=majorassemblypage.saatabletext();
//	      if(SAAtabletext1.equalsIgnoreCase("53700010")) {
//	        	logger.createNode("SAA is not deleted.").fail("SAA is not deleted. Testcase failed");
//		  }else {
//				logger.createNode("SAA is deleted").pass("SAA has been deleted. Testcase passed");
//		  }
//
		}
   		catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement." + e);
		} catch (AWTException e) {
			throw new RuntimeException(e);
		}
	}
		@Test(priority = 42)
	public void SalesDataEditSave() throws InterruptedException {
		logger = extent.createTest("U-114: Edit SalesData Tab data and test the Edit functionality");
		try {
		  warmup5();
		  Thread.sleep(3000);
	      majorassemblypage.clickMASalesdataTab();
	      warmup5();
	      majorassemblypage.EditSales();
	      warmup();
	      majorassemblypage.salesTextField();
		  majorassemblypage.SalesDataSaveButton();
	      warmup5();
		  String Alert_message=majorassemblypage.alertText();
			logger.createNode("SAA can be added and edited. The added SAA is "+Alert_message).pass("code has been saved successfully. Testcase Passed");
			warmup5();
			majorassemblypage.alerttextClick();
			warmup5();
			majorassemblypage.codesCancel();
			warmup5();
			majorassemblypage.clickOn_Enter();
		}
		catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement." + e);
		} catch (AWTException e) {
			throw new RuntimeException(e);
		}
		}
	@Test(priority = 43)
    public void SearchEngineNoFeedback() throws InterruptedException {
          logger = extent.createTest("U-228: (AU) Request Support And Feedback");
          majorassemblypage.SearchEngineNumFeedback();
          logger.createNode("Engine no is entered and clicked on the Search button").pass("Engine no is entered and clicked on the Search button. Test Case Passed");
         }
    @Test(priority = 44)
    public void SupportAndFeedback() throws InterruptedException {
        majorassemblypage.supportAndFeedback();
        logger.createNode("Feedback link clicked").pass("Feedback link clicked. Test case passed");
        logger.createNode("Feedback page loaded").pass("Feedback page loaded. Test case passed");
        }
    @Test(priority = 45)
	public void DataError() throws InterruptedException {
		          logger = extent.createTest("U-188: (AU) Show product validation error log");
		          majorassemblypage.revert();
		          majorassemblypage.SearchEngineNumDataError(majorassemblypage.engineNumberInput_2);
		          logger.createNode("Engine no is entered and clicked on the Search button").pass("Engine no is entered and clicked on the Search button. Test Case Passed");
		          majorassemblypage.DataErrorTab();
		          logger.createNode("Data Error tab is clicked").pass("Data Error tab is clicked. Test Case Passed");
		          majorassemblypage.dataErrorTab_ShowAllError();
		          logger.createNode("Show All error button is clicked").pass("Show All error button is clicked. Test Case Passed");
		          majorassemblypage.dataErrorTab_Export();
		          logger.createNode("Export button is clicked & count of records is matched").pass("Export button is clicked & count of records is matched. Test Case Passed");
		          majorassemblypage.dataErrorTab_Navigate();
		          logger.createNode("Navigated to History Tab to show the changes").pass("Navigated to History Tab to show the changes. Test Case Passed");
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
