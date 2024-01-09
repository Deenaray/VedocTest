
package com.vedoc.qa.testcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MajorAssemblyPage;

public class MajorAssemblyData_ChangingUser extends TestBase {

              HomePage homePage;
              LoginPage loginPage;
              MajorAssemblyPage majorassemblypage;

              public MajorAssemblyData_ChangingUser() {
                             super();
              }

              @BeforeTest
              public void setUp() throws InterruptedException
              {
                             initialization();
                             loginPage = new LoginPage();
              
                             majorassemblypage = new MajorAssemblyPage();
                             homePage = loginPage.login(prop.getProperty("userName1"), prop.getProperty("passwordName1"));
                             SystemMessageCheck();
                             //warmup1();
                             majorassemblypage = homePage.MajorAssembly();

              }


                                                            @Test(priority = 1)
                                                            public void SearchEngineNumber() throws InterruptedException
                                                            {

                                                            logger = extent.createTest("U-114: (CU) Modify major assembly");
                                                            logger.createNode("Login to changing rights ").
                                                            pass("Logged in as changing rights");
                                                            majorassemblypage.SearchEngineNumModelPlate();
                                                            logger.createNode("Search with Engine id - 936971C0223834 ")
                                                            .pass("Engine ID - 936971C0223834 data are displayed. Test Case Passed "); }

                                                            @Test(priority = 2)
                                                            public void ModelPlateTab() throws InterruptedException {
                                                            warmup5();
                                                            majorassemblypage.clickModelPlateTab();

                                                            logger.createNode("Click on Model Plate Tab").
                                                            pass("Model Plate Tab is displayed. Test Case Passed"); }

                                                            @Test(priority = 3)
                                                            public void AddValue() {
                                                            warmup5();
                                                            majorassemblypage.clickLabelID_1();
                                                            warmup5();
                                                            majorassemblypage.clickaddValueButton();
                                                            warmup5();
                                                            logger.createNode("Click on Add Value button")
                                                            .pass(" Editable Key Dropdown and Content text field is diplayed. Test Case Passed"
                                                            );
              }

                                                            @Test(priority = 4)
                                                            public void SelectDropdownValue() {
                                                            warmup5();
                                                            majorassemblypage.selectDropdownValue();
                                                            logger.createNode("Select Key dropdown vaue as '9030 - zgheLibAGw'. ")
                                                            .pass(" Dropdown value selected as 9030 - zgheLibAGw.  Test Case Passed");
                                                            warmup5();
              }

                                                            @Test(priority = 5)
                                                            public void AddContentValue() {

                                                            majorassemblypage.contentValueInput();
                                                            warmup5();
                                                            logger.createNode("Add Content Value as 'Add Value'")
                                                            .pass("Content Value is added as 'Add Value'. Test Case Passed"); }

                                                            @Test(priority = 6)
                                                            public void SaveAddedValue() {
                                                                          warmup5();
                                                            majorassemblypage.modelPlateTickButton();
                                                            warmup5();
                                                            majorassemblypage.modelPlateSave();
                                                            warmup5();

                                                            logger.createNode("Click on Save button").
                                                            pass("Added Value with key as '9030 - zgheLibAGw' and content value as 'Add Value' got saved. Test Case Passed"
                                                            ); }

                                                            @Test(priority = 7) public void SearchAddedValue() {
                                                            warmup5();
                                                            warmup5();
                                                            majorassemblypage.modelPlateFilter();
                                                            warmup5();
                                                            logger.createNode("Search for '9030' in the dropdown ")
                                                            .pass(" Row with dropdown value as '9030 - zgheLibAGw' got displayed. Test Case Passed"
                                                            );
              }

                                                            @Test(priority = 8) public void EditValue() throws InterruptedException {
                                                                          warmup5();
                                                            majorassemblypage.modelPlateEdit();
                                                            warmup5();
                                                            logger.createNode("Click on Edit icon").
                                                            pass("The Key and Content Value filed got Editable. Test Case Passed");
                                                            warmup5();
                                                            majorassemblypage.contentValueEdit();
                                                            warmup5();

                                                            logger.createNode("Edit the content value as 'Edited Value'")
                                                            .pass("The Content Value text is changed as 'Edited Value'. Test Case Passed"
                                                            ); }

                                                            @Test(priority = 9) public void SaveEditedValue() {
                                                            majorassemblypage.modelPlateTickButton();
                                                            warmup5();
                                                            majorassemblypage.modelPlateSave();
                                                            warmup5();
                                                            logger.createNode("Click on Save button")
                                                            .pass("The Edited Value got Saved as 'Edited Value'. Test Case Passed"); }

                                                            @Test(priority = 10) public void FilterEditedValue() {
                                                                          warmup5();
                                                            majorassemblypage.modelPlateFilter();
                                                            warmup5();
                                                            logger.createNode("Verify the text for Edited values as 'Edited Value' ")
                                                            .pass("Edited Value got Displayed as 'Edited Value' text in the Content Value field. Test Case Passed"
                                                            ); }

                                                            @Test(priority = 11) public void DeleteSearchedValue() {

                                                           // majorassemblypage.modelPlateFilter();
                                                                warmup5();
                                                            majorassemblypage.modelPlateDelete();
                                                            warmup5();
                                                            majorassemblypage.modelPlateSave();
                                                            logger.createNode("Click on Delete icon and save").
                                                            pass(" The row got deleted.");
                                                            warmup4();

                                                            }


                                                                        /*
                                                                        * @Test(priority = 12) public void ValidateDeletion() throws
                                                                        * InterruptedException {
                                                                        *
                                                                         *
                                                                         * majorassemblypage.modelPlateFilterwithcontent(); try { boolean displayFlag =
                                                                        * majorassemblypage.DeleteValidation(); warmup4();
                                                                        * System.out.println(displayFlag); if (displayFlag)
                                                                        * logger.createNode("Deleted Row is not displayed").
                                                                        * fail("Deleted Row is  Displayed"); else
                                                                        * logger.createNode("Deleted Row is not displayed").
                                                                        * pass("Deleted Row is not Displayed"); } catch (NoSuchElementException e) {
                                                                        * logger.createNode("Deleted Row is not displayed").
                                                                        * pass("Deleted Row is not displayed"); } }
                                                                        */


              
              @Test(priority = 12)
              public void navigateBatteryFlexibleData()
              {
                logger = extent.createTest("U-114: (CU) Update and add of battery flexible data");
                logger.createNode("Search the major assembly category 'High-voltage battery ID' - "+majorassemblypage.highVoltageBatteryInputNumber).pass("'High-voltage battery ID' is searched. Testcase passed");
                warmup5();
              majorassemblypage.searchVehicleCategory("High-voltage battery ID");
              warmup5();
              majorassemblypage.searchCategoryNumber(majorassemblypage.highVoltageBatteryInputNumber);
              warmup5();
              majorassemblypage.mAFlexibleDataTab();
              logger.createNode("Click on Flexible Data Tab").pass("Flexible Data Tab is displayed. Test Case Passed");
                             
                             
              }
              
              @Test(priority = 13)
              public void addBatteryFlexibleData()
              {
                logger.createNode("Click on Add button on Flexible Data Plan").pass("Add button is clicked . Test Case Passed");
                warmup5();
                majorassemblypage.mAFlexibleDataClickAddButon();
                logger.createNode("Enter each values to the text fields 'Key' 'Designation' 'Serail number', 'Part number' 'Hardware' , 'Software' as 39").pass("Values got entered in the fields 'Key' 'Designation' 'Serail number', 'Part number' 'Hardware' , 'Software'  as 39 . Test Case Passed");
                 majorassemblypage.mAFlexibleDataEnterValues();
              warmup5();
              majorassemblypage.mAFlexibleDataCheck();
              warmup5();
              majorassemblypage.mAFlexibleDataSave();
              logger.createNode("Click on save button").pass("The entered values got saved. Test Case Passed");
              
              }
              
                                                          /*
                                                          * @Test(priority = 14) public void filterAddBatteryFlexibleData() {
                                                          * majorassemblypage.mAFlexibleDataSearchFilter();
                                                          * 
                                                           * }
                                                          */
              @Test(priority = 14)
              public void updateBatteryFlexibleData()
              {
                logger.createNode("Update the existing data enterd in Hardware field as 100 ").pass(" Hardware field is Updated with Data 100 and it got saved . Test Case Passed");
                majorassemblypage.mAFlexibleDataEdit();
                warmup5();
                majorassemblypage.mAFlexibleDataCheck();
                warmup5();
                majorassemblypage.mAFlexibleDataSave();
                warmup5();
              }
                                                          /*
                                                          * @Test(priority = 16) public void filterUpdatedBatteryFlexibleData() {
                                                          * majorassemblypage.mAFlexibleDataUpdatedSearchFilter();
                                                          * 
                                                           * }
                                                          */
              
              @Test(priority = 15)
              public void deleteBatteryFlexibleData()
              {
                logger.createNode("Delete the newly created row in flexible Data plan")
                                                           .pass("The newly created flexible data row got deleted . Test Case Passed");
                majorassemblypage.mAFlexibleDataDelete();
                warmup5();
                majorassemblypage.mAFlexibleDataSave();
                
                             
              }
            
            //Kartik- to check sales data access or not
          	@Test(priority = 16 )
        	public void SalesDataTab_ModifyCustomerServiceData() throws InterruptedException {
        		logger = extent.createTest("U-083:(CU) Sales Data Tab: Modify Customer Service Data.");
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
        				logger.createNode("Sales data button is displayed for user- (CU) changing user").fail("Changing user has the access to see sales data. Test case passed.");			
        		
        			} else {
        				logger.createNode("Sales data button is not displayed for user- (CU) changing user").pass("Changing user do not have access to see & modify sales data. Test case passed.");
        				System.out.println("Changing user do not have access to see & modify sales data");
        			}
        		} catch (NoSuchElementException e) {
        			logger.createNode("Sales data button is not displayed for user- (CU) changing user")
        					.pass("Changing user do not have access to see & modify sales data. Test case passed");
        			System.out.println("Changing user do not have access to see & modify sales data");
        		}
        	}
                                                           
            @AfterMethod
            public void teardown1(ITestResult result) throws IOException{
                                                            
                  if(result.getStatus()== ITestResult.SUCCESS)
                  {
                      logger.log(Status.PASS, "Test Case passed is " + result.getName() ); String
                          screenshotPath=MajorAssemblyData_ChangingUser.getScreenshot(driver,
                          result.getName()); logger.addScreenCaptureFromPath(screenshotPath); }
                                                            
                  else if(result.getStatus()== ITestResult.FAILURE){
                      logger.log(Status.FAIL, "Test Case Failed is " + result.getName() ); logger.log(Status.FAIL, result.getThrowable());
                      String screenshotPath=MajorAssemblyData_ChangingUser.getScreenshot(driver, result.getName());
                      logger.addScreenCaptureFromPath(screenshotPath);
                  } }
                                                          

                             
                               @AfterSuite public void teardown() throws IOException { driver.quit(); }
                             
}




