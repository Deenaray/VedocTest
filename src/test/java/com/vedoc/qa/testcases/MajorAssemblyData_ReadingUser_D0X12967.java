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

public class MajorAssemblyData_ReadingUser_D0X12967 extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MajorAssemblyPage majorassemblypage;
	
	
	public MajorAssemblyData_ReadingUser_D0X12967() {
		super();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		majorassemblypage=new MajorAssemblyPage();
		homePage = loginPage.login(prop.getProperty("userNameOfD0X12967"), prop.getProperty("passwordOfD0X12967"));
		   SystemMessageCheck();
           Thread.sleep(30000);
		logger = extent.createTest("(RU): Login to User Id - D0X12967");
		majorassemblypage=homePage.MajorAssembly();
	}
	
	@Test(priority = 1)
	public void MajorAssemblyTest() {
		majorassemblypage.validateMajorAssemblyPage();
	}
	
	@Test(priority = 2)
	public void select_HighVoltageBatteryId() throws InterruptedException {
		logger = extent.createTest("U-113: (RU) Show major assembly - Checking the entitlements");
	      majorassemblypage.select_HighVoltageBatteryId();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 3)
	public void search_HighVoltageBatteryId() throws InterruptedException {
	      majorassemblypage.search_HighVoltageBatteryId();
    	logger.createNode("Search field is provided with the input - 790001MA000200").pass("Search field is provided with the input - 790001MA000200. Test case passed");	
		}
	
	@Test(priority = 4)
	public void identification_Variant_Data() throws InterruptedException {
	if(majorassemblypage.identification_Variant_Data().length()>0) {
		logger.createNode("Variant field is displayed with the data - " + majorassemblypage.identification_Variant_Data()).pass("Variant field is displayed with the data - " + majorassemblypage.identification_Variant_Data() + ". Test case passed");
	}else {
		logger.createNode("Variant field is displayed as blank").warning("Variant field is displayed as blank");
	}
	}
	
	@Test(priority = 5)
	public void identification_PartNumber_Data() throws InterruptedException {
	if(majorassemblypage.identification_PartNumber_Data().length()>0) {
		logger.createNode("Part Number field is displayed with the data - " + majorassemblypage.identification_PartNumber_Data()).pass("Part Number field is displayed with the data - " + majorassemblypage.identification_PartNumber_Data() + ". Test case passed");
	}else {
		logger.createNode("Part Number field is displayed as blank").warning("Part Number field is displayed as blank");
	}
	}
	
	@Test(priority = 6)
	public void identification_LuNumber_Data() throws InterruptedException {
	if(majorassemblypage.identification_LuNumber_Data().length()>0) {
		logger.createNode("LU Number field is displayed with the data - " + majorassemblypage.identification_LuNumber_Data()).pass("LU Number field is displayed with the data - " + majorassemblypage.identification_LuNumber_Data() + ". Test case passed");
	}else {
		logger.createNode("LU Number field is displayed as blank").warning("LU Number field is displayed as blank");
	}
	}
	
	
	@Test(priority = 7)
	public void identification_ProductionNumber_Data() throws InterruptedException {
	if(majorassemblypage.identification_ProductionNumber_Data().length()>0) {
		logger.createNode("Production Number field is displayed with the data - " + majorassemblypage.identification_ProductionNumber_Data()).pass("Production Number field is displayed with the data - " + majorassemblypage.identification_ProductionNumber_Data() + ". Test case passed");
	}else {
		logger.createNode("Production Number field is displayed as blank").warning("Production Number field is displayed as blank");
	}
	}

	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}	

