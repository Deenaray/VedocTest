    // Successfully running - 27/2/2022
// Went through - no doubt
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
import com.vedoc.qa.pages.MasterDataPage;

public class MasterDataPageTest_C0X01477 extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	MasterDataPage masterdatapage;
	public static String cook4;

	public MasterDataPageTest_C0X01477(){
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		masterdatapage = new MasterDataPage();
		Thread.sleep(10000);
		homePage = loginPage.login(prop.getProperty("userName1"), prop.getProperty("passwordName1"));
		SystemMessageCheck();
		logger = extent.createTest("(CU) Login to application using Changing User credentials");
		masterdatapage = homePage.MasterData();
		logger.createNode("Master data page is clicked").pass("Master data page is clicked successfully. Testcase is passed");
	}
	
    @Test(priority=1)
  public void codesTab(){
  	masterdatapage.codesTab();
  }
    
    @Test(priority=2)
  public void countryDesignation(){
  	logger=extent.createTest("U-135: (CU) Update Sales Area Master Data");    	
  	masterdatapage.countryDesignation();
  	logger.createNode("Country Designation tab is clicked").pass("Country Designation tab is clicked successfully. Test case is passed");
  }
  
  @Test(priority=3)
  public void countryDesignation_Edit_Filter(){
  	masterdatapage.countryDesignation_Filter();
  	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
  }
  
  @Test(priority=4)
public void countryDesignation_Edit_SearchTheTable(){
	masterdatapage.countryDesignation_SearchTheTable();
	logger.createNode("Search the table field is provided with the input - 22222").pass("Search the table field is provided with the input - 22222. Test case is passed");
}
  
	@Test(priority = 5)
	public void countryDesignation_Edit() {
		try {
			boolean displayFlag = masterdatapage.countryDesignation_EditDisplayed();
			if (displayFlag)
				logger.createNode("Edit icon is displayed under the Country designations tab").fail("Edit icon is displayed under the Country designations tab");
			else
				logger.createNode("Edit icon is not displayed under the Country designations tab").pass("Edit icon is not displayed under the Country designations tab");
		} catch (NoSuchElementException e) {
			logger.createNode("Edit icon is not available under the Country designations tab").pass("Edit icon is not available under the Country designations tab");
		}
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
