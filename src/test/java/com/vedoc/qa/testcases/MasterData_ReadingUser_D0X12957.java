package com.vedoc.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MajorAssemblyPage;
import com.vedoc.qa.pages.MasterDataPage;

public class MasterData_ReadingUser_D0X12957 extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	MasterDataPage masterdatapage;

	public MasterData_ReadingUser_D0X12957() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		masterdatapage = new MasterDataPage();
		homePage = loginPage.login(prop.getProperty("userNameOfD0X17776"), prop.getProperty("passwordOfD0X17776"));
		SystemMessageCheck();
		 warmup1();
		masterdatapage = homePage.MasterData();

	}

	@Test(priority = 1)
	public void navigateBatteryFlexibleData() {
		logger = extent.createTest("U-288: (RU) Update and add of master data (flexible battery data)");
		logger.createNode("Login the Application as the user 'D0X12957'").pass("Logged in as D0X12957");

		masterdatapage.batteryFlexibleTab();

		logger.createNode("Click on Batter-Flexible Data tab")
				.pass(" Battery Flexible Data Tab is displayed. Test Case Passed");

	}

	@Test(priority = 2)
	public void addBatteryFlexibleData() {

		masterdatapage.addEntryClickBatteryFlexible();
		logger.createNode("Click on Add Entry button on Battery Flexible Data Plan tab")
				.pass("Add button is clicked . Test Case Passed");
		masterdatapage.enterKeyBatteryFlexible();
		masterdatapage.enterDesignationBatteryFlexible();
		masterdatapage.checkButtonBatteryFlexible();
		masterdatapage.saveButtonBatteryFlexible();
		logger.createNode("Enter Key as 1").pass("Key got entered as 1 . Test Case Passed");
		logger.createNode("Edit the Designation field and enter the Designation for Englisch as 'English'")
				.pass("The Designation for Englisch enetered as English. Test Case Passed");
		logger.createNode("Click on Apply button")
				.pass("User came back to Battery Flexible Data plan page. Test Case Passed");
		logger.createNode("Click on Save button").pass("The entry got added. Test Case Passed");

	}

	@Test(priority = 3)
	public void editBatteryFlexibleData() {

		logger.createNode("Click on Edit button and update the Designation corresponding to the language 'Deutsch' as German ").pass("The Designation is updated to 'German' for the corresponding language 'Deutsch'");
		masterdatapage.updateDesignation();
		masterdatapage.checkButtonBatteryFlexible();
		masterdatapage.saveButtonBatteryFlexible();
		logger.createNode("Save the updated Designation").pass("Edited values got saved. Test case Passed");

	//	logger.createNode("Delete the newly created entry in Battery Flexible ").pass("The new entry got deleted. Test case Passed ");
	}

	@Test(priority = 4)
	public void changeLanguageBatteryFlexibleData()
	{
		masterdatapage.changeLanguageToGerman();
		logger.createNode("Change the language to Deutsch").
		  pass("Language changed  to Deutsch. Test case Passed");
		masterdatapage.batteryFlexibleTab();
		String text = masterdatapage.confirmDesignationChangeBatteryFlexible();
		if(text.equalsIgnoreCase("German"))
		{
			logger.createNode("Check Designation is changed to German as language changed to Deutsch").pass("Designation is changed to German as language changed to Deutsch");
		}
		else
		{
			logger.createNode("Check Designation is changed to German as language changed to Deutsch").pass("Designation is not changed to German as language changed to Deutsch");
		}
	}
		@Test(priority = 5)
		  public void deleteBatteryFlexibleData() {


			  logger.createNode("Delete the newly created entry in Battery Flexible ").
			  pass("The new entry got deleted. Test case Passed ");
			  warmup5();
			  masterdatapage.deleteEntryBatteryFlexible();

			   masterdatapage.saveGermanButtonBatteryFlexible();
			   warmup1();}

		@Test(priority = 6)
		public void changeLanguageToEnglish()
		{
			masterdatapage.changeLanguageToEnglish();
			  logger.createNode("Language change back to English").
			  pass("Language change back to English. Test case Passed");
		}

        @AfterMethod
        public void teardown1(ITestResult result) throws IOException{

                       if(result.getStatus()== ITestResult.SUCCESS){
                                      logger.log(Status.PASS, "Test Case passed is " + result.getName() );
                                      String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
                                      logger.addScreenCaptureFromPath(screenshotPath);
                       }

                       else if(result.getStatus()== ITestResult.FAILURE){
                                      //logger.log(Status.FAIL, "Test Case Failed is " + result.getName() );
                                      logger.log(Status.FAIL, result.getThrowable());
                                      String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
                                      logger.addScreenCaptureFromPath(screenshotPath);
                       }
        }
//}

@AfterSuite
public void teardown() throws IOException {
     driver.quit();
}








}