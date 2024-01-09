package com.vedoc.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MajorAssemblyPage;

public class MajorAssemblyData_ReadingUser extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MajorAssemblyPage majorassemblypage;
	
	
	public MajorAssemblyData_ReadingUser() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		majorassemblypage=new MajorAssemblyPage();
		homePage = loginPage.login(prop.getProperty("stduser"), prop.getProperty("stdPassword"));
		   SystemMessageCheck();

		logger = extent.createTest("(RU): Login to User Id - C0X01237");
		majorassemblypage=homePage.MajorAssembly();
	}
	
	@Test(priority = 1)
	public void MajorAssemblyTest() {
		majorassemblypage.validateMajorAssemblyPage();
	}
	
	@Test(priority = 2)
	public void select_HighVoltageBatteryId() throws InterruptedException {
		logger = extent.createTest("U-113: (RU) Checking the tab Identification in Major Assembly tab after a search for a high voltage battery");
	      majorassemblypage.select_HighVoltageBatteryId();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 3)
	public void search_HighVoltageBatteryId() throws InterruptedException {
	      majorassemblypage.search_HighVoltageBatteryId();
    	logger.createNode("Search field is provided with the input - 790001MA000201").pass("Search field is provided with the input - 790001MA000200. Test case passed");
		}
	
	@Test(priority = 4)
	public void identification_Variant() throws InterruptedException {
	if(majorassemblypage.identification_Variant()==true) {
		logger.createNode("Variant field is displayed").pass("Variant field is displayed");
	}else {
		logger.createNode("Variant field is not displayed").fail("Variant field is not displayed");				
	}
}
	
	@Test(priority = 5)
	public void identification_Variant_Data() throws InterruptedException {
		majorassemblypage.identification_Variant_Data();
		logger.createNode("Variant field is displayed with the data - " +majorassemblypage.identification_Variant_Data()).pass("Variant field is displayed with the data - " +majorassemblypage.identification_Variant_Data()+ ". Test case passed");
}
	
	@Test(priority = 6)
	public void identification_PartNumber() throws InterruptedException {
	if(majorassemblypage.identification_PartNumber()==true) {
		logger.createNode("Part number field is displayed").pass("Part number field is displayed");
	}else {
		logger.createNode("Part number field is not displayed").fail("Part number field is not displayed");				
	}
}
	
	@Test(priority = 7)
	public void identification_PartNumber_Data() throws InterruptedException {
		majorassemblypage.identification_PartNumber_Data();
		logger.createNode("Part number field is displayed with the data - " +majorassemblypage.identification_PartNumber_Data()).pass("Part number field is displayed with the data - " +majorassemblypage.identification_PartNumber_Data()+ ". Test case passed");
}
	
	@Test(priority = 8)
	public void identification_LuNumber() throws InterruptedException {
	if(majorassemblypage.identification_LuNumber()==true) {
		logger.createNode("LU number field is displayed").pass("LU number field is displayed");
	}else {
		logger.createNode("LU number field is not displayed").fail("LU number field is not displayed");				
	}
}
	
	@Test(priority = 9)
	public void identification_LuNumber_Data() throws InterruptedException {
		majorassemblypage.identification_LuNumber_Data();
		logger.createNode("LU number field is displayed with the data - " +majorassemblypage.identification_LuNumber_Data()).pass("LU number field is displayed with the data - " +majorassemblypage.identification_LuNumber_Data()+ ". Test case passed");
}
	
	@Test(priority = 10)
	public void identification_ProductionNumber() throws InterruptedException {
	if(majorassemblypage.identification_ProductionNumber()==true) {
		logger.createNode("Production number field is displayed").pass("Production number field is displayed");
	}else {
		logger.createNode("Production number field is not displayed").fail("Production number field is not displayed");				
	}
}
	
	@Test(priority = 11)
	public void identification_ProductionNumber_Data() throws InterruptedException {
		majorassemblypage.identification_ProductionNumber_Data();
		logger.createNode("Production number field is displayed with the data - " +majorassemblypage.identification_ProductionNumber_Data()).pass("Production number field is displayed with the data - " +majorassemblypage.identification_ProductionNumber_Data()+ ". Test case passed");
}
	
	@Test(priority = 12)
	public void identification_finalAcceptanceDate() throws InterruptedException {
	if(majorassemblypage.identification_finalAcceptanceDate()==true) {
		logger.createNode("Final acceptance date field is displayed").pass("Final acceptance date field is displayed");
	}else {
		logger.createNode("Final acceptance date field is not displayed").fail("Final acceptance date field is not displayed");				
	}
}
	
	@Test(priority = 13)
	public void identification_finalAcceptanceDate_Data() throws InterruptedException {
		if(majorassemblypage.identification_finalAcceptanceDate_Data().length()>0) {
			logger.createNode("Final acceptance date field is displayed with the data" + majorassemblypage.identification_shipmentDate_Data() ).pass("Final acceptance date field is displayed with the data - " +majorassemblypage.identification_shipmentDate()+ ". Test case passed");
		}else {
			logger.createNode("Final acceptance date field is displayed as blank").pass("Final acceptance date field is blank");
		}
}
	
	@Test(priority = 14)
	public void identification_shipmentDate() throws InterruptedException {
	if(majorassemblypage.identification_shipmentDate()==true) {
		logger.createNode("Shipment date field is displayed").pass("Shipment date field is displayed");
	}else {
		logger.createNode("Shipment date field is not displayed").fail("Shipment date field is not displayed");				
	}
}
	
	@Test(priority = 15)
	public void identification_shipmentDate_Data() throws InterruptedException {
		if(majorassemblypage.identification_shipmentDate_Data().length()>0) {
			logger.createNode("Shipment date field is displayed with the data" + majorassemblypage.identification_shipmentDate_Data() ).pass("Shipment date field is displayed with the data - " +majorassemblypage.identification_shipmentDate()+ ". Test case passed");
		}else {
			logger.createNode("Shipment date field is displayed as blank").pass("Shipment date field is blank");
		}
}
	//Kartik-  To check sales data access or not
	@Test(priority = 16 )
	public void SalesDataTab_ModifyCustomerServiceData() throws InterruptedException {
		logger = extent.createTest("U-083:(RU) Sales Data Tab: Modify Customer Service Data.");
		majorassemblypage.searchCategoryNumber_withCategory("Engine no.",majorassemblypage.engineNumberInput_2);
		warmup5();
		logger.createNode("Engine number input- "+majorassemblypage.engineNumberInput_2
				+ "\t is entered and clicked on the Search button").pass(majorassemblypage.engineNumberInput_2
						+ "\t is entered and clicked on the Search button. Test Case Passed");
	 
		//to check sales data access for-RU
		warmup6();
		try {
			boolean RUflag = majorassemblypage.SalesDataButton_DesplayedOrNot_sd();
			if (RUflag==true) {
				logger.createNode("Sales data button is displayed for user- (RU) reading user").fail("Reading user has the access to see sales data. Test case passed.");			
		
			} else {
				logger.createNode("Sales data button is not displayed for user- (RU) reading user").pass("Reading user do not have access to see & modify sales data. Test case passed.");
				System.out.println("Reading user do not have access to see & modify sales data");
			}
		} catch (NoSuchElementException e) {
			logger.createNode("Sales data button is not displayed for user- (RU) reading user")
					.pass("Reading user do not have access to see & modify sales data. Test case passed");
			System.out.println("Reading user do not have access to see & modify sales data");
		}
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	
}
